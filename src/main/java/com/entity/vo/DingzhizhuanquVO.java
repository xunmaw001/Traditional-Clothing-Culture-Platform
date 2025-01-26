package com.entity.vo;

import com.entity.DingzhizhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 定制专区
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public class DingzhizhuanquVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 定制标题
	 */
	
	private String dingzhibiaoti;
		
	/**
	 * 定制类别
	 */
	
	private String dingzhileibie;
		
	/**
	 * 定制样板
	 */
	
	private String dingzhiyangban;
		
	/**
	 * 定制价格
	 */
	
	private Float dingzhijiage;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
		
	/**
	 * 定制详情
	 */
	
	private String dingzhixiangqing;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：定制标题
	 */
	 
	public void setDingzhibiaoti(String dingzhibiaoti) {
		this.dingzhibiaoti = dingzhibiaoti;
	}
	
	/**
	 * 获取：定制标题
	 */
	public String getDingzhibiaoti() {
		return dingzhibiaoti;
	}
				
	
	/**
	 * 设置：定制类别
	 */
	 
	public void setDingzhileibie(String dingzhileibie) {
		this.dingzhileibie = dingzhileibie;
	}
	
	/**
	 * 获取：定制类别
	 */
	public String getDingzhileibie() {
		return dingzhileibie;
	}
				
	
	/**
	 * 设置：定制样板
	 */
	 
	public void setDingzhiyangban(String dingzhiyangban) {
		this.dingzhiyangban = dingzhiyangban;
	}
	
	/**
	 * 获取：定制样板
	 */
	public String getDingzhiyangban() {
		return dingzhiyangban;
	}
				
	
	/**
	 * 设置：定制价格
	 */
	 
	public void setDingzhijiage(Float dingzhijiage) {
		this.dingzhijiage = dingzhijiage;
	}
	
	/**
	 * 获取：定制价格
	 */
	public Float getDingzhijiage() {
		return dingzhijiage;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
				
	
	/**
	 * 设置：定制详情
	 */
	 
	public void setDingzhixiangqing(String dingzhixiangqing) {
		this.dingzhixiangqing = dingzhixiangqing;
	}
	
	/**
	 * 获取：定制详情
	 */
	public String getDingzhixiangqing() {
		return dingzhixiangqing;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
