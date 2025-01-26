package com.dao;

import com.entity.JingquxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JingquxinxiVO;
import com.entity.view.JingquxinxiView;


/**
 * 景区信息
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface JingquxinxiDao extends BaseMapper<JingquxinxiEntity> {
	
	List<JingquxinxiVO> selectListVO(@Param("ew") Wrapper<JingquxinxiEntity> wrapper);
	
	JingquxinxiVO selectVO(@Param("ew") Wrapper<JingquxinxiEntity> wrapper);
	
	List<JingquxinxiView> selectListView(@Param("ew") Wrapper<JingquxinxiEntity> wrapper);

	List<JingquxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JingquxinxiEntity> wrapper);
	
	JingquxinxiView selectView(@Param("ew") Wrapper<JingquxinxiEntity> wrapper);
	

}
