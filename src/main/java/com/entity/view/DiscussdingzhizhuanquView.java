package com.entity.view;

import com.entity.DiscussdingzhizhuanquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 定制专区评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-01 13:06:07
 */
@TableName("discussdingzhizhuanqu")
public class DiscussdingzhizhuanquView  extends DiscussdingzhizhuanquEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdingzhizhuanquView(){
	}
 
 	public DiscussdingzhizhuanquView(DiscussdingzhizhuanquEntity discussdingzhizhuanquEntity){
 	try {
			BeanUtils.copyProperties(this, discussdingzhizhuanquEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
