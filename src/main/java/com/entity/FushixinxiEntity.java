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
 * 服饰信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
@TableName("fushixinxi")
public class FushixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FushixinxiEntity() {
		
	}
	
	public FushixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 服饰编号
	 */
					
	private String fushibianhao;
	
	/**
	 * 服饰标题
	 */
					
	private String fushibiaoti;
	
	/**
	 * 样式类别
	 */
					
	private String yangshileibie;
	
	/**
	 * 服饰照片
	 */
					
	private String fushizhaopian;
	
	/**
	 * 款式
	 */
					
	private String kuanshi;
	
	/**
	 * 服饰尺寸
	 */
					
	private String fushichicun;
	
	/**
	 * 服饰详情
	 */
					
	private String fushixiangqing;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：服饰编号
	 */
	public void setFushibianhao(String fushibianhao) {
		this.fushibianhao = fushibianhao;
	}
	/**
	 * 获取：服饰编号
	 */
	public String getFushibianhao() {
		return fushibianhao;
	}
	/**
	 * 设置：服饰标题
	 */
	public void setFushibiaoti(String fushibiaoti) {
		this.fushibiaoti = fushibiaoti;
	}
	/**
	 * 获取：服饰标题
	 */
	public String getFushibiaoti() {
		return fushibiaoti;
	}
	/**
	 * 设置：样式类别
	 */
	public void setYangshileibie(String yangshileibie) {
		this.yangshileibie = yangshileibie;
	}
	/**
	 * 获取：样式类别
	 */
	public String getYangshileibie() {
		return yangshileibie;
	}
	/**
	 * 设置：服饰照片
	 */
	public void setFushizhaopian(String fushizhaopian) {
		this.fushizhaopian = fushizhaopian;
	}
	/**
	 * 获取：服饰照片
	 */
	public String getFushizhaopian() {
		return fushizhaopian;
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
	 * 设置：服饰尺寸
	 */
	public void setFushichicun(String fushichicun) {
		this.fushichicun = fushichicun;
	}
	/**
	 * 获取：服饰尺寸
	 */
	public String getFushichicun() {
		return fushichicun;
	}
	/**
	 * 设置：服饰详情
	 */
	public void setFushixiangqing(String fushixiangqing) {
		this.fushixiangqing = fushixiangqing;
	}
	/**
	 * 获取：服饰详情
	 */
	public String getFushixiangqing() {
		return fushixiangqing;
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
