package com.entity.view;

import com.entity.TaocanleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 套餐类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
@TableName("taocanleibie")
public class TaocanleibieView  extends TaocanleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TaocanleibieView(){
	}
 
 	public TaocanleibieView(TaocanleibieEntity taocanleibieEntity){
 	try {
			BeanUtils.copyProperties(this, taocanleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
