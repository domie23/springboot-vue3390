package com.entity.model;

import com.entity.QuhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 货物信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QuhuoxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 货品编号
     */
    private String quhuoxinxiUuidNumber;


    /**
     * 发货人
     */
    private String quhuoxinxiName;


    /**
     * 发货地址
     */
    private String quhuoxinxiAddress;


    /**
     * 发货人联系方式
     */
    private String quhuoxinxiPhone;


    /**
     * 收货人
     */
    private String shouName;


    /**
     * 收货人联系方式
     */
    private String shouPhone;


    /**
     * 货物类型
     */
    private Integer quhuoxinxiTypes;


    /**
     * 时间类型
     */
    private Integer quhuoxinxiStatusTypes;


    /**
     * 物品状态
     */
    private Integer wupinTypes;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：货品编号
	 */
    public String getQuhuoxinxiUuidNumber() {
        return quhuoxinxiUuidNumber;
    }


    /**
	 * 设置：货品编号
	 */
    public void setQuhuoxinxiUuidNumber(String quhuoxinxiUuidNumber) {
        this.quhuoxinxiUuidNumber = quhuoxinxiUuidNumber;
    }
    /**
	 * 获取：发货人
	 */
    public String getQuhuoxinxiName() {
        return quhuoxinxiName;
    }


    /**
	 * 设置：发货人
	 */
    public void setQuhuoxinxiName(String quhuoxinxiName) {
        this.quhuoxinxiName = quhuoxinxiName;
    }
    /**
	 * 获取：发货地址
	 */
    public String getQuhuoxinxiAddress() {
        return quhuoxinxiAddress;
    }


    /**
	 * 设置：发货地址
	 */
    public void setQuhuoxinxiAddress(String quhuoxinxiAddress) {
        this.quhuoxinxiAddress = quhuoxinxiAddress;
    }
    /**
	 * 获取：发货人联系方式
	 */
    public String getQuhuoxinxiPhone() {
        return quhuoxinxiPhone;
    }


    /**
	 * 设置：发货人联系方式
	 */
    public void setQuhuoxinxiPhone(String quhuoxinxiPhone) {
        this.quhuoxinxiPhone = quhuoxinxiPhone;
    }
    /**
	 * 获取：收货人
	 */
    public String getShouName() {
        return shouName;
    }


    /**
	 * 设置：收货人
	 */
    public void setShouName(String shouName) {
        this.shouName = shouName;
    }
    /**
	 * 获取：收货人联系方式
	 */
    public String getShouPhone() {
        return shouPhone;
    }


    /**
	 * 设置：收货人联系方式
	 */
    public void setShouPhone(String shouPhone) {
        this.shouPhone = shouPhone;
    }
    /**
	 * 获取：货物类型
	 */
    public Integer getQuhuoxinxiTypes() {
        return quhuoxinxiTypes;
    }


    /**
	 * 设置：货物类型
	 */
    public void setQuhuoxinxiTypes(Integer quhuoxinxiTypes) {
        this.quhuoxinxiTypes = quhuoxinxiTypes;
    }
    /**
	 * 获取：时间类型
	 */
    public Integer getQuhuoxinxiStatusTypes() {
        return quhuoxinxiStatusTypes;
    }


    /**
	 * 设置：时间类型
	 */
    public void setQuhuoxinxiStatusTypes(Integer quhuoxinxiStatusTypes) {
        this.quhuoxinxiStatusTypes = quhuoxinxiStatusTypes;
    }
    /**
	 * 获取：物品状态
	 */
    public Integer getWupinTypes() {
        return wupinTypes;
    }


    /**
	 * 设置：物品状态
	 */
    public void setWupinTypes(Integer wupinTypes) {
        this.wupinTypes = wupinTypes;
    }
    /**
	 * 获取：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
