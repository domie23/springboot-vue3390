package com.entity.view;

import com.entity.QuhuoyuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 取货预约
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("quhuoyuyue")
public class QuhuoyuyueView extends QuhuoyuyueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 取货方式的值
		*/
		private String quhuoValue;
		/**
		* 预约状态的值
		*/
		private String statusValue;



		//级联表 quhuoxinxi
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
				* 货物类型的值
				*/
				private String quhuoxinxiValue;
			/**
			* 时间类型
			*/
			private Integer quhuoxinxiStatusTypes;
				/**
				* 时间类型的值
				*/
				private String quhuoxinxiStatusValue;
			/**
			* 物品状态
			*/
			private Integer wupinTypes;
				/**
				* 物品状态的值
				*/
				private String wupinValue;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public QuhuoyuyueView() {

	}

	public QuhuoyuyueView(QuhuoyuyueEntity quhuoyuyueEntity) {
		try {
			BeanUtils.copyProperties(this, quhuoyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 取货方式的值
			*/
			public String getQuhuoValue() {
				return quhuoValue;
			}
			/**
			* 设置： 取货方式的值
			*/
			public void setQuhuoValue(String quhuoValue) {
				this.quhuoValue = quhuoValue;
			}
			/**
			* 获取： 预约状态的值
			*/
			public String getStatusValue() {
				return statusValue;
			}
			/**
			* 设置： 预约状态的值
			*/
			public void setStatusValue(String statusValue) {
				this.statusValue = statusValue;
			}










				//级联表的get和set quhuoxinxi

					/**
					* 获取： 货品编号
					*/
					public String getQuhuoxinxiUuidNumber() {
						return quhuoxinxiUuidNumber;
					}
					/**
					* 设置： 货品编号
					*/
					public void setQuhuoxinxiUuidNumber(String quhuoxinxiUuidNumber) {
						this.quhuoxinxiUuidNumber = quhuoxinxiUuidNumber;
					}

					/**
					* 获取： 发货人
					*/
					public String getQuhuoxinxiName() {
						return quhuoxinxiName;
					}
					/**
					* 设置： 发货人
					*/
					public void setQuhuoxinxiName(String quhuoxinxiName) {
						this.quhuoxinxiName = quhuoxinxiName;
					}

					/**
					* 获取： 发货地址
					*/
					public String getQuhuoxinxiAddress() {
						return quhuoxinxiAddress;
					}
					/**
					* 设置： 发货地址
					*/
					public void setQuhuoxinxiAddress(String quhuoxinxiAddress) {
						this.quhuoxinxiAddress = quhuoxinxiAddress;
					}

					/**
					* 获取： 发货人联系方式
					*/
					public String getQuhuoxinxiPhone() {
						return quhuoxinxiPhone;
					}
					/**
					* 设置： 发货人联系方式
					*/
					public void setQuhuoxinxiPhone(String quhuoxinxiPhone) {
						this.quhuoxinxiPhone = quhuoxinxiPhone;
					}

					/**
					* 获取： 收货人
					*/
					public String getShouName() {
						return shouName;
					}
					/**
					* 设置： 收货人
					*/
					public void setShouName(String shouName) {
						this.shouName = shouName;
					}

					/**
					* 获取： 收货人联系方式
					*/
					public String getShouPhone() {
						return shouPhone;
					}
					/**
					* 设置： 收货人联系方式
					*/
					public void setShouPhone(String shouPhone) {
						this.shouPhone = shouPhone;
					}

					/**
					* 获取： 货物类型
					*/
					public Integer getQuhuoxinxiTypes() {
						return quhuoxinxiTypes;
					}
					/**
					* 设置： 货物类型
					*/
					public void setQuhuoxinxiTypes(Integer quhuoxinxiTypes) {
						this.quhuoxinxiTypes = quhuoxinxiTypes;
					}


						/**
						* 获取： 货物类型的值
						*/
						public String getQuhuoxinxiValue() {
							return quhuoxinxiValue;
						}
						/**
						* 设置： 货物类型的值
						*/
						public void setQuhuoxinxiValue(String quhuoxinxiValue) {
							this.quhuoxinxiValue = quhuoxinxiValue;
						}

					/**
					* 获取： 时间类型
					*/
					public Integer getQuhuoxinxiStatusTypes() {
						return quhuoxinxiStatusTypes;
					}
					/**
					* 设置： 时间类型
					*/
					public void setQuhuoxinxiStatusTypes(Integer quhuoxinxiStatusTypes) {
						this.quhuoxinxiStatusTypes = quhuoxinxiStatusTypes;
					}


						/**
						* 获取： 时间类型的值
						*/
						public String getQuhuoxinxiStatusValue() {
							return quhuoxinxiStatusValue;
						}
						/**
						* 设置： 时间类型的值
						*/
						public void setQuhuoxinxiStatusValue(String quhuoxinxiStatusValue) {
							this.quhuoxinxiStatusValue = quhuoxinxiStatusValue;
						}

					/**
					* 获取： 物品状态
					*/
					public Integer getWupinTypes() {
						return wupinTypes;
					}
					/**
					* 设置： 物品状态
					*/
					public void setWupinTypes(Integer wupinTypes) {
						this.wupinTypes = wupinTypes;
					}


						/**
						* 获取： 物品状态的值
						*/
						public String getWupinValue() {
							return wupinValue;
						}
						/**
						* 设置： 物品状态的值
						*/
						public void setWupinValue(String wupinValue) {
							this.wupinValue = wupinValue;
						}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
