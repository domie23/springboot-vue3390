package com.entity.view;

import com.entity.QuhuoxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 货物信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("quhuoxinxi")
public class QuhuoxinxiView extends QuhuoxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 货物类型的值
		*/
		private String quhuoxinxiValue;
		/**
		* 时间类型的值
		*/
		private String quhuoxinxiStatusValue;
		/**
		* 物品状态的值
		*/
		private String wupinValue;



	public QuhuoxinxiView() {

	}

	public QuhuoxinxiView(QuhuoxinxiEntity quhuoxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, quhuoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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








}
