package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingzhidingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingzhidingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingzhidingdanView;


/**
 * 定制订单
 *
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface DingzhidingdanService extends IService<DingzhidingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingzhidingdanVO> selectListVO(Wrapper<DingzhidingdanEntity> wrapper);
   	
   	DingzhidingdanVO selectVO(@Param("ew") Wrapper<DingzhidingdanEntity> wrapper);
   	
   	List<DingzhidingdanView> selectListView(Wrapper<DingzhidingdanEntity> wrapper);
   	
   	DingzhidingdanView selectView(@Param("ew") Wrapper<DingzhidingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingzhidingdanEntity> wrapper);
   	

}

