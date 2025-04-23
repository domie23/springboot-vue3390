package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 取货预约
 *
 * @author 
 * @email
 */
@TableName("quhuoyuyue")
public class QuhuoyuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QuhuoyuyueEntity() {

	}

	public QuhuoyuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 货物
     */
    @TableField(value = "quhuoxinxi_id")

    private Integer quhuoxinxiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 取货方式
     */
    @TableField(value = "quhuo_types")

    private Integer quhuoTypes;


    /**
     * 送货地址/快递柜
     */
    @TableField(value = "quhuoyuyue_name")

    private String quhuoyuyueName;


    /**
     * 报价
     */
    @TableField(value = "quhuoyuyue_number")

    private Double quhuoyuyueNumber;


    /**
     * 预约状态
     */
    @TableField(value = "status_types")

    private Integer statusTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：货物
	 */
    public Integer getQuhuoxinxiId() {
        return quhuoxinxiId;
    }
    /**
	 * 获取：货物
	 */

    public void setQuhuoxinxiId(Integer quhuoxinxiId) {
        this.quhuoxinxiId = quhuoxinxiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：取货方式
	 */
    public Integer getQuhuoTypes() {
        return quhuoTypes;
    }
    /**
	 * 获取：取货方式
	 */

    public void setQuhuoTypes(Integer quhuoTypes) {
        this.quhuoTypes = quhuoTypes;
    }
    /**
	 * 设置：送货地址/快递柜
	 */
    public String getQuhuoyuyueName() {
        return quhuoyuyueName;
    }
    /**
	 * 获取：送货地址/快递柜
	 */

    public void setQuhuoyuyueName(String quhuoyuyueName) {
        this.quhuoyuyueName = quhuoyuyueName;
    }
    /**
	 * 设置：报价
	 */
    public Double getQuhuoyuyueNumber() {
        return quhuoyuyueNumber;
    }
    /**
	 * 获取：报价
	 */

    public void setQuhuoyuyueNumber(Double quhuoyuyueNumber) {
        this.quhuoyuyueNumber = quhuoyuyueNumber;
    }
    /**
	 * 设置：预约状态
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }
    /**
	 * 获取：预约状态
	 */

    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Quhuoyuyue{" +
            "id=" + id +
            ", quhuoxinxiId=" + quhuoxinxiId +
            ", yonghuId=" + yonghuId +
            ", quhuoTypes=" + quhuoTypes +
            ", quhuoyuyueName=" + quhuoyuyueName +
            ", quhuoyuyueNumber=" + quhuoyuyueNumber +
            ", statusTypes=" + statusTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
