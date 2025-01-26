package com.dao;

import com.entity.FushixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FushixinxiVO;
import com.entity.view.FushixinxiView;


/**
 * 服饰信息
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface FushixinxiDao extends BaseMapper<FushixinxiEntity> {
	
	List<FushixinxiVO> selectListVO(@Param("ew") Wrapper<FushixinxiEntity> wrapper);
	
	FushixinxiVO selectVO(@Param("ew") Wrapper<FushixinxiEntity> wrapper);
	
	List<FushixinxiView> selectListView(@Param("ew") Wrapper<FushixinxiEntity> wrapper);

	List<FushixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FushixinxiEntity> wrapper);
	
	FushixinxiView selectView(@Param("ew") Wrapper<FushixinxiEntity> wrapper);
	

}
