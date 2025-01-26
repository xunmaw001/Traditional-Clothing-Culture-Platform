package com.entity.model;

import com.entity.TaocanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 套餐信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public class TaocanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 套餐标题
	 */
	
	private String taocanbiaoti;
		
	/**
	 * 套餐类别
	 */
	
	private String taocanleibie;
		
	/**
	 * 套餐照片
	 */
	
	private String taocanzhaopian;
		
	/**
	 * 款式
	 */
	
	private String kuanshi;
		
	/**
	 * 租借时间/小时
	 */
	
	private String zujieshijian;
		
	/**
	 * 套餐简介
	 */
	
	private String taocanjianjie;
		
	/**
	 * 套餐详情
	 */
	
	private String taocanxiangqing;
		
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
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：套餐标题
	 */
	 
	public void setTaocanbiaoti(String taocanbiaoti) {
		this.taocanbiaoti = taocanbiaoti;
	}
	
	/**
	 * 获取：套餐标题
	 */
	public String getTaocanbiaoti() {
		return taocanbiaoti;
	}
				
	
	/**
	 * 设置：套餐类别
	 */
	 
	public void setTaocanleibie(String taocanleibie) {
		this.taocanleibie = taocanleibie;
	}
	
	/**
	 * 获取：套餐类别
	 */
	public String getTaocanleibie() {
		return taocanleibie;
	}
				
	
	/**
	 * 设置：套餐照片
	 */
	 
	public void setTaocanzhaopian(String taocanzhaopian) {
		this.taocanzhaopian = taocanzhaopian;
	}
	
	/**
	 * 获取：套餐照片
	 */
	public String getTaocanzhaopian() {
		return taocanzhaopian;
	}
				
	
	/**
	 * 设置：款式
	 */
	 
	public void setKuanshi(String kuanshi) {
		this.kuanshi = kuanshi;
	}
	
	/**
	 * 获取：款式
	 */
	public String getKuanshi() {
		return kuanshi;
	}
				
	
	/**
	 * 设置：租借时间/小时
	 */
	 
	public void setZujieshijian(String zujieshijian) {
		this.zujieshijian = zujieshijian;
	}
	
	/**
	 * 获取：租借时间/小时
	 */
	public String getZujieshijian() {
		return zujieshijian;
	}
				
	
	/**
	 * 设置：套餐简介
	 */
	 
	public void setTaocanjianjie(String taocanjianjie) {
		this.taocanjianjie = taocanjianjie;
	}
	
	/**
	 * 获取：套餐简介
	 */
	public String getTaocanjianjie() {
		return taocanjianjie;
	}
				
	
	/**
	 * 设置：套餐详情
	 */
	 
	public void setTaocanxiangqing(String taocanxiangqing) {
		this.taocanxiangqing = taocanxiangqing;
	}
	
	/**
	 * 获取：套餐详情
	 */
	public String getTaocanxiangqing() {
		return taocanxiangqing;
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
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
