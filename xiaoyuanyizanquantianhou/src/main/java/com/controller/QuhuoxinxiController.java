
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 货物信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/quhuoxinxi")
public class QuhuoxinxiController {
    private static final Logger logger = LoggerFactory.getLogger(QuhuoxinxiController.class);

    @Autowired
    private QuhuoxinxiService quhuoxinxiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = quhuoxinxiService.queryPage(params);

        //字典表数据转换
        List<QuhuoxinxiView> list =(List<QuhuoxinxiView>)page.getList();
        for(QuhuoxinxiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        QuhuoxinxiEntity quhuoxinxi = quhuoxinxiService.selectById(id);
        if(quhuoxinxi !=null){
            //entity转view
            QuhuoxinxiView view = new QuhuoxinxiView();
            BeanUtils.copyProperties( quhuoxinxi , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody QuhuoxinxiEntity quhuoxinxi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,quhuoxinxi:{}",this.getClass().getName(),quhuoxinxi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<QuhuoxinxiEntity> queryWrapper = new EntityWrapper<QuhuoxinxiEntity>()
            .eq("quhuoxinxi_uuid_number", quhuoxinxi.getQuhuoxinxiUuidNumber())
            .eq("quhuoxinxi_name", quhuoxinxi.getQuhuoxinxiName())
            .eq("quhuoxinxi_address", quhuoxinxi.getQuhuoxinxiAddress())
            .eq("quhuoxinxi_phone", quhuoxinxi.getQuhuoxinxiPhone())
            .eq("shou_name", quhuoxinxi.getShouName())
            .eq("shou_phone", quhuoxinxi.getShouPhone())
            .eq("quhuoxinxi_types", quhuoxinxi.getQuhuoxinxiTypes())
            .eq("quhuoxinxi_status_types", quhuoxinxi.getQuhuoxinxiStatusTypes())
            .eq("wupin_types", quhuoxinxi.getWupinTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QuhuoxinxiEntity quhuoxinxiEntity = quhuoxinxiService.selectOne(queryWrapper);
        if(quhuoxinxiEntity==null){
            quhuoxinxi.setInsertTime(new Date());
            quhuoxinxi.setCreateTime(new Date());
            quhuoxinxiService.insert(quhuoxinxi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody QuhuoxinxiEntity quhuoxinxi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,quhuoxinxi:{}",this.getClass().getName(),quhuoxinxi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<QuhuoxinxiEntity> queryWrapper = new EntityWrapper<QuhuoxinxiEntity>()
            .notIn("id",quhuoxinxi.getId())
            .andNew()
            .eq("quhuoxinxi_uuid_number", quhuoxinxi.getQuhuoxinxiUuidNumber())
            .eq("quhuoxinxi_name", quhuoxinxi.getQuhuoxinxiName())
            .eq("quhuoxinxi_address", quhuoxinxi.getQuhuoxinxiAddress())
            .eq("quhuoxinxi_phone", quhuoxinxi.getQuhuoxinxiPhone())
            .eq("shou_name", quhuoxinxi.getShouName())
            .eq("shou_phone", quhuoxinxi.getShouPhone())
            .eq("quhuoxinxi_types", quhuoxinxi.getQuhuoxinxiTypes())
            .eq("quhuoxinxi_status_types", quhuoxinxi.getQuhuoxinxiStatusTypes())
            .eq("wupin_types", quhuoxinxi.getWupinTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        QuhuoxinxiEntity quhuoxinxiEntity = quhuoxinxiService.selectOne(queryWrapper);
        if(quhuoxinxiEntity==null){
            quhuoxinxiService.updateById(quhuoxinxi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        quhuoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<QuhuoxinxiEntity> quhuoxinxiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            QuhuoxinxiEntity quhuoxinxiEntity = new QuhuoxinxiEntity();
//                            quhuoxinxiEntity.setQuhuoxinxiUuidNumber(data.get(0));                    //货品编号 要改的
//                            quhuoxinxiEntity.setQuhuoxinxiName(data.get(0));                    //发货人 要改的
//                            quhuoxinxiEntity.setQuhuoxinxiAddress(data.get(0));                    //发货地址 要改的
//                            quhuoxinxiEntity.setQuhuoxinxiPhone(data.get(0));                    //发货人联系方式 要改的
//                            quhuoxinxiEntity.setShouName(data.get(0));                    //收货人 要改的
//                            quhuoxinxiEntity.setShouPhone(data.get(0));                    //收货人联系方式 要改的
//                            quhuoxinxiEntity.setQuhuoxinxiTypes(Integer.valueOf(data.get(0)));   //货物类型 要改的
//                            quhuoxinxiEntity.setQuhuoxinxiStatusTypes(Integer.valueOf(data.get(0)));   //时间类型 要改的
//                            quhuoxinxiEntity.setWupinTypes(Integer.valueOf(data.get(0)));   //物品状态 要改的
//                            quhuoxinxiEntity.setInsertTime(date);//时间
//                            quhuoxinxiEntity.setCreateTime(date);//时间
                            quhuoxinxiList.add(quhuoxinxiEntity);


                            //把要查询是否重复的字段放入map中
                                //货品编号
                                if(seachFields.containsKey("quhuoxinxiUuidNumber")){
                                    List<String> quhuoxinxiUuidNumber = seachFields.get("quhuoxinxiUuidNumber");
                                    quhuoxinxiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> quhuoxinxiUuidNumber = new ArrayList<>();
                                    quhuoxinxiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("quhuoxinxiUuidNumber",quhuoxinxiUuidNumber);
                                }
                                //发货人联系方式
                                if(seachFields.containsKey("quhuoxinxiPhone")){
                                    List<String> quhuoxinxiPhone = seachFields.get("quhuoxinxiPhone");
                                    quhuoxinxiPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> quhuoxinxiPhone = new ArrayList<>();
                                    quhuoxinxiPhone.add(data.get(0));//要改的
                                    seachFields.put("quhuoxinxiPhone",quhuoxinxiPhone);
                                }
                        }

                        //查询是否重复
                         //货品编号
                        List<QuhuoxinxiEntity> quhuoxinxiEntities_quhuoxinxiUuidNumber = quhuoxinxiService.selectList(new EntityWrapper<QuhuoxinxiEntity>().in("quhuoxinxi_uuid_number", seachFields.get("quhuoxinxiUuidNumber")));
                        if(quhuoxinxiEntities_quhuoxinxiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(QuhuoxinxiEntity s:quhuoxinxiEntities_quhuoxinxiUuidNumber){
                                repeatFields.add(s.getQuhuoxinxiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [货品编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //发货人联系方式
                        List<QuhuoxinxiEntity> quhuoxinxiEntities_quhuoxinxiPhone = quhuoxinxiService.selectList(new EntityWrapper<QuhuoxinxiEntity>().in("quhuoxinxi_phone", seachFields.get("quhuoxinxiPhone")));
                        if(quhuoxinxiEntities_quhuoxinxiPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(QuhuoxinxiEntity s:quhuoxinxiEntities_quhuoxinxiPhone){
                                repeatFields.add(s.getQuhuoxinxiPhone());
                            }
                            return R.error(511,"数据库的该表中的 [发货人联系方式] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        quhuoxinxiService.insertBatch(quhuoxinxiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
