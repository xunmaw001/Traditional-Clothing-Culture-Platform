package com.dao;

import com.entity.YangshileibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YangshileibieVO;
import com.entity.view.YangshileibieView;


/**
 * 样式类别
 * 
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface YangshileibieDao extends BaseMapper<YangshileibieEntity> {
	
	List<YangshileibieVO> selectListVO(@Param("ew") Wrapper<YangshileibieEntity> wrapper);
	
	YangshileibieVO selectVO(@Param("ew") Wrapper<YangshileibieEntity> wrapper);
	
	List<YangshileibieView> selectListView(@Param("ew") Wrapper<YangshileibieEntity> wrapper);

	List<YangshileibieView> selectListView(Pagination page,@Param("ew") Wrapper<YangshileibieEntity> wrapper);
	
	YangshileibieView selectView(@Param("ew") Wrapper<YangshileibieEntity> wrapper);
	

}
