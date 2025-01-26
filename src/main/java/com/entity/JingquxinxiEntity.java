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
 * 景区信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
@TableName("jingquxinxi")
public class JingquxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JingquxinxiEntity() {
		
	}
	
	public JingquxinxiEntity(T t) {
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
	 * 景点编号
	 */
					
	private String jingdianbianhao;
	
	/**
	 * 景点标题
	 */
					
	private String jingdianbiaoti;
	
	/**
	 * 景点照片
	 */
					
	private String jingdianzhaopian;
	
	/**
	 * 景点位置
	 */
					
	private String jingdianweizhi;
	
	/**
	 * 景点简介
	 */
					
	private String jingdianjianjie;
	
	/**
	 * 景点详情
	 */
					
	private String jingdianxiangqing;
	
	
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
	 * 设置：景点编号
	 */
	public void setJingdianbianhao(String jingdianbianhao) {
		this.jingdianbianhao = jingdianbianhao;
	}
	/**
	 * 获取：景点编号
	 */
	public String getJingdianbianhao() {
		return jingdianbianhao;
	}
	/**
	 * 设置：景点标题
	 */
	public void setJingdianbiaoti(String jingdianbiaoti) {
		this.jingdianbiaoti = jingdianbiaoti;
	}
	/**
	 * 获取：景点标题
	 */
	public String getJingdianbiaoti() {
		return jingdianbiaoti;
	}
	/**
	 * 设置：景点照片
	 */
	public void setJingdianzhaopian(String jingdianzhaopian) {
		this.jingdianzhaopian = jingdianzhaopian;
	}
	/**
	 * 获取：景点照片
	 */
	public String getJingdianzhaopian() {
		return jingdianzhaopian;
	}
	/**
	 * 设置：景点位置
	 */
	public void setJingdianweizhi(String jingdianweizhi) {
		this.jingdianweizhi = jingdianweizhi;
	}
	/**
	 * 获取：景点位置
	 */
	public String getJingdianweizhi() {
		return jingdianweizhi;
	}
	/**
	 * 设置：景点简介
	 */
	public void setJingdianjianjie(String jingdianjianjie) {
		this.jingdianjianjie = jingdianjianjie;
	}
	/**
	 * 获取：景点简介
	 */
	public String getJingdianjianjie() {
		return jingdianjianjie;
	}
	/**
	 * 设置：景点详情
	 */
	public void setJingdianxiangqing(String jingdianxiangqing) {
		this.jingdianxiangqing = jingdianxiangqing;
	}
	/**
	 * 获取：景点详情
	 */
	public String getJingdianxiangqing() {
		return jingdianxiangqing;
	}

}
