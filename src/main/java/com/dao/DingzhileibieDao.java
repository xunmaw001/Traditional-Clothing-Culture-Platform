package com.dao;

import com.entity.DingzhileibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingzhileibieVO;
import com.entity.view.DingzhileibieView;


/**
 * 定制类别
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface DingzhileibieDao extends BaseMapper<DingzhileibieEntity> {
	
	List<DingzhileibieVO> selectListVO(@Param("ew") Wrapper<DingzhileibieEntity> wrapper);
	
	DingzhileibieVO selectVO(@Param("ew") Wrapper<DingzhileibieEntity> wrapper);
	
	List<DingzhileibieView> selectListView(@Param("ew") Wrapper<DingzhileibieEntity> wrapper);

	List<DingzhileibieView> selectListView(Pagination page,@Param("ew") Wrapper<DingzhileibieEntity> wrapper);
	
	DingzhileibieView selectView(@Param("ew") Wrapper<DingzhileibieEntity> wrapper);
	

}
