package com.entity.vo;

import com.entity.DingzhidingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 定制订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public class DingzhidingdanVO  implements Serializable {
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
	 * 款式
	 */
	
	private String kuanshi;
		
	/**
	 * 定制价格
	 */
	
	private Float dingzhijiage;
		
	/**
	 * 定制尺寸
	 */
	
	private String dingzhichicun;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 定制备注
	 */
	
	private String dingzhibeizhu;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：定制尺寸
	 */
	 
	public void setDingzhichicun(String dingzhichicun) {
		this.dingzhichicun = dingzhichicun;
	}
	
	/**
	 * 获取：定制尺寸
	 */
	public String getDingzhichicun() {
		return dingzhichicun;
	}
				
	
	/**
	 * 设置：颜色
	 */
	 
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
				
	
	/**
	 * 设置：定制备注
	 */
	 
	public void setDingzhibeizhu(String dingzhibeizhu) {
		this.dingzhibeizhu = dingzhibeizhu;
	}
	
	/**
	 * 获取：定制备注
	 */
	public String getDingzhibeizhu() {
		return dingzhibeizhu;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
