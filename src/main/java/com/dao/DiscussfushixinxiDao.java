package com.dao;

import com.entity.DiscussfushixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfushixinxiVO;
import com.entity.view.DiscussfushixinxiView;


/**
 * 服饰信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:07
 */
public interface DiscussfushixinxiDao extends BaseMapper<DiscussfushixinxiEntity> {
	
	List<DiscussfushixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussfushixinxiEntity> wrapper);
	
	DiscussfushixinxiVO selectVO(@Param("ew") Wrapper<DiscussfushixinxiEntity> wrapper);
	
	List<DiscussfushixinxiView> selectListView(@Param("ew") Wrapper<DiscussfushixinxiEntity> wrapper);

	List<DiscussfushixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfushixinxiEntity> wrapper);
	
	DiscussfushixinxiView selectView(@Param("ew") Wrapper<DiscussfushixinxiEntity> wrapper);
	

}
