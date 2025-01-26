package com.entity.view;

import com.entity.DiscussfushixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服饰信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-01 13:06:07
 */
@TableName("discussfushixinxi")
public class DiscussfushixinxiView  extends DiscussfushixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfushixinxiView(){
	}
 
 	public DiscussfushixinxiView(DiscussfushixinxiEntity discussfushixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussfushixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
