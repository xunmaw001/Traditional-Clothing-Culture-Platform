package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingzhileibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingzhileibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingzhileibieView;


/**
 * 定制类别
 *
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface DingzhileibieService extends IService<DingzhileibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingzhileibieVO> selectListVO(Wrapper<DingzhileibieEntity> wrapper);
   	
   	DingzhileibieVO selectVO(@Param("ew") Wrapper<DingzhileibieEntity> wrapper);
   	
   	List<DingzhileibieView> selectListView(Wrapper<DingzhileibieEntity> wrapper);
   	
   	DingzhileibieView selectView(@Param("ew") Wrapper<DingzhileibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingzhileibieEntity> wrapper);
   	

}

