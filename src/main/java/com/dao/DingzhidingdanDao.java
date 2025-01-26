package com.dao;

import com.entity.DingzhidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingzhidingdanVO;
import com.entity.view.DingzhidingdanView;


/**
 * 定制订单
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface DingzhidingdanDao extends BaseMapper<DingzhidingdanEntity> {
	
	List<DingzhidingdanVO> selectListVO(@Param("ew") Wrapper<DingzhidingdanEntity> wrapper);
	
	DingzhidingdanVO selectVO(@Param("ew") Wrapper<DingzhidingdanEntity> wrapper);
	
	List<DingzhidingdanView> selectListView(@Param("ew") Wrapper<DingzhidingdanEntity> wrapper);

	List<DingzhidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<DingzhidingdanEntity> wrapper);
	
	DingzhidingdanView selectView(@Param("ew") Wrapper<DingzhidingdanEntity> wrapper);
	

}
