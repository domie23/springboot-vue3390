package com.entity.model;

import com.entity.QuhuoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 取货预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QuhuoyuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 货物
     */
    private Integer quhuoxinxiId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 取货方式
     */
    private Integer quhuoTypes;


    /**
     * 送货地址/快递柜
     */
    private String quhuoyuyueName;


    /**
     * 报价
     */
    private Double quhuoyuyueNumber;


    /**
     * 预约状态
     */
    private Integer statusTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show2 nameShow
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
	 * 获取：货物
	 */
    public Integer getQuhuoxinxiId() {
        return quhuoxinxiId;
    }


    /**
	 * 设置：货物
	 */
    public void setQuhuoxinxiId(Integer quhuoxinxiId) {
        this.quhuoxinxiId = quhuoxinxiId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：取货方式
	 */
    public Integer getQuhuoTypes() {
        return quhuoTypes;
    }


    /**
	 * 设置：取货方式
	 */
    public void setQuhuoTypes(Integer quhuoTypes) {
        this.quhuoTypes = quhuoTypes;
    }
    /**
	 * 获取：送货地址/快递柜
	 */
    public String getQuhuoyuyueName() {
        return quhuoyuyueName;
    }


    /**
	 * 设置：送货地址/快递柜
	 */
    public void setQuhuoyuyueName(String quhuoyuyueName) {
        this.quhuoyuyueName = quhuoyuyueName;
    }
    /**
	 * 获取：报价
	 */
    public Double getQuhuoyuyueNumber() {
        return quhuoyuyueNumber;
    }


    /**
	 * 设置：报价
	 */
    public void setQuhuoyuyueNumber(Double quhuoyuyueNumber) {
        this.quhuoyuyueNumber = quhuoyuyueNumber;
    }
    /**
	 * 获取：预约状态
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }


    /**
	 * 设置：预约状态
	 */
    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
