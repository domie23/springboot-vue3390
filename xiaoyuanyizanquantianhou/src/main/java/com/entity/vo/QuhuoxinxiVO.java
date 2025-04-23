package com.entity.vo;

import com.entity.QuhuoxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 货物信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("quhuoxinxi")
public class QuhuoxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 货品编号
     */

    @TableField(value = "quhuoxinxi_uuid_number")
    private String quhuoxinxiUuidNumber;


    /**
     * 发货人
     */

    @TableField(value = "quhuoxinxi_name")
    private String quhuoxinxiName;


    /**
     * 发货地址
     */

    @TableField(value = "quhuoxinxi_address")
    private String quhuoxinxiAddress;


    /**
     * 发货人联系方式
     */

    @TableField(value = "quhuoxinxi_phone")
    private String quhuoxinxiPhone;


    /**
     * 收货人
     */

    @TableField(value = "shou_name")
    private String shouName;


    /**
     * 收货人联系方式
     */

    @TableField(value = "shou_phone")
    private String shouPhone;


    /**
     * 货物类型
     */

    @TableField(value = "quhuoxinxi_types")
    private Integer quhuoxinxiTypes;


    /**
     * 时间类型
     */

    @TableField(value = "quhuoxinxi_status_types")
    private Integer quhuoxinxiStatusTypes;


    /**
     * 物品状态
     */

    @TableField(value = "wupin_types")
    private Integer wupinTypes;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：货品编号
	 */
    public String getQuhuoxinxiUuidNumber() {
        return quhuoxinxiUuidNumber;
    }


    /**
	 * 获取：货品编号
	 */

    public void setQuhuoxinxiUuidNumber(String quhuoxinxiUuidNumber) {
        this.quhuoxinxiUuidNumber = quhuoxinxiUuidNumber;
    }
    /**
	 * 设置：发货人
	 */
    public String getQuhuoxinxiName() {
        return quhuoxinxiName;
    }


    /**
	 * 获取：发货人
	 */

    public void setQuhuoxinxiName(String quhuoxinxiName) {
        this.quhuoxinxiName = quhuoxinxiName;
    }
    /**
	 * 设置：发货地址
	 */
    public String getQuhuoxinxiAddress() {
        return quhuoxinxiAddress;
    }


    /**
	 * 获取：发货地址
	 */

    public void setQuhuoxinxiAddress(String quhuoxinxiAddress) {
        this.quhuoxinxiAddress = quhuoxinxiAddress;
    }
    /**
	 * 设置：发货人联系方式
	 */
    public String getQuhuoxinxiPhone() {
        return quhuoxinxiPhone;
    }


    /**
	 * 获取：发货人联系方式
	 */

    public void setQuhuoxinxiPhone(String quhuoxinxiPhone) {
        this.quhuoxinxiPhone = quhuoxinxiPhone;
    }
    /**
	 * 设置：收货人
	 */
    public String getShouName() {
        return shouName;
    }


    /**
	 * 获取：收货人
	 */

    public void setShouName(String shouName) {
        this.shouName = shouName;
    }
    /**
	 * 设置：收货人联系方式
	 */
    public String getShouPhone() {
        return shouPhone;
    }


    /**
	 * 获取：收货人联系方式
	 */

    public void setShouPhone(String shouPhone) {
        this.shouPhone = shouPhone;
    }
    /**
	 * 设置：货物类型
	 */
    public Integer getQuhuoxinxiTypes() {
        return quhuoxinxiTypes;
    }


    /**
	 * 获取：货物类型
	 */

    public void setQuhuoxinxiTypes(Integer quhuoxinxiTypes) {
        this.quhuoxinxiTypes = quhuoxinxiTypes;
    }
    /**
	 * 设置：时间类型
	 */
    public Integer getQuhuoxinxiStatusTypes() {
        return quhuoxinxiStatusTypes;
    }


    /**
	 * 获取：时间类型
	 */

    public void setQuhuoxinxiStatusTypes(Integer quhuoxinxiStatusTypes) {
        this.quhuoxinxiStatusTypes = quhuoxinxiStatusTypes;
    }
    /**
	 * 设置：物品状态
	 */
    public Integer getWupinTypes() {
        return wupinTypes;
    }


    /**
	 * 获取：物品状态
	 */

    public void setWupinTypes(Integer wupinTypes) {
        this.wupinTypes = wupinTypes;
    }
    /**
	 * 设置：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
