package com.dao;

import com.entity.DiscussdingzhizhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdingzhizhuanquVO;
import com.entity.view.DiscussdingzhizhuanquView;


/**
 * 定制专区评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:07
 */
public interface DiscussdingzhizhuanquDao extends BaseMapper<DiscussdingzhizhuanquEntity> {
	
	List<DiscussdingzhizhuanquVO> selectListVO(@Param("ew") Wrapper<DiscussdingzhizhuanquEntity> wrapper);
	
	DiscussdingzhizhuanquVO selectVO(@Param("ew") Wrapper<DiscussdingzhizhuanquEntity> wrapper);
	
	List<DiscussdingzhizhuanquView> selectListView(@Param("ew") Wrapper<DiscussdingzhizhuanquEntity> wrapper);

	List<DiscussdingzhizhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdingzhizhuanquEntity> wrapper);
	
	DiscussdingzhizhuanquView selectView(@Param("ew") Wrapper<DiscussdingzhizhuanquEntity> wrapper);
	

}
