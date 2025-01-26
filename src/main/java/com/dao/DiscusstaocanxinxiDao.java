package com.dao;

import com.entity.DiscusstaocanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstaocanxinxiVO;
import com.entity.view.DiscusstaocanxinxiView;


/**
 * 套餐信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface DiscusstaocanxinxiDao extends BaseMapper<DiscusstaocanxinxiEntity> {
	
	List<DiscusstaocanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusstaocanxinxiEntity> wrapper);
	
	DiscusstaocanxinxiVO selectVO(@Param("ew") Wrapper<DiscusstaocanxinxiEntity> wrapper);
	
	List<DiscusstaocanxinxiView> selectListView(@Param("ew") Wrapper<DiscusstaocanxinxiEntity> wrapper);

	List<DiscusstaocanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstaocanxinxiEntity> wrapper);
	
	DiscusstaocanxinxiView selectView(@Param("ew") Wrapper<DiscusstaocanxinxiEntity> wrapper);
	

}
