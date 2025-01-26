package com.dao;

import com.entity.DingzhizhuanquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingzhizhuanquVO;
import com.entity.view.DingzhizhuanquView;


/**
 * 定制专区
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface DingzhizhuanquDao extends BaseMapper<DingzhizhuanquEntity> {
	
	List<DingzhizhuanquVO> selectListVO(@Param("ew") Wrapper<DingzhizhuanquEntity> wrapper);
	
	DingzhizhuanquVO selectVO(@Param("ew") Wrapper<DingzhizhuanquEntity> wrapper);
	
	List<DingzhizhuanquView> selectListView(@Param("ew") Wrapper<DingzhizhuanquEntity> wrapper);

	List<DingzhizhuanquView> selectListView(Pagination page,@Param("ew") Wrapper<DingzhizhuanquEntity> wrapper);
	
	DingzhizhuanquView selectView(@Param("ew") Wrapper<DingzhizhuanquEntity> wrapper);
	

}
