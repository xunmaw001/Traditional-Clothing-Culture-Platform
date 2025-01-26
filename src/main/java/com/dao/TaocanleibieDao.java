package com.dao;

import com.entity.TaocanleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TaocanleibieVO;
import com.entity.view.TaocanleibieView;


/**
 * 套餐类别
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface TaocanleibieDao extends BaseMapper<TaocanleibieEntity> {
	
	List<TaocanleibieVO> selectListVO(@Param("ew") Wrapper<TaocanleibieEntity> wrapper);
	
	TaocanleibieVO selectVO(@Param("ew") Wrapper<TaocanleibieEntity> wrapper);
	
	List<TaocanleibieView> selectListView(@Param("ew") Wrapper<TaocanleibieEntity> wrapper);

	List<TaocanleibieView> selectListView(Pagination page,@Param("ew") Wrapper<TaocanleibieEntity> wrapper);
	
	TaocanleibieView selectView(@Param("ew") Wrapper<TaocanleibieEntity> wrapper);
	

}
