package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingzhizhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingzhizhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingzhizhuanquView;


/**
 * 定制专区
 *
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface DingzhizhuanquService extends IService<DingzhizhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingzhizhuanquVO> selectListVO(Wrapper<DingzhizhuanquEntity> wrapper);
   	
   	DingzhizhuanquVO selectVO(@Param("ew") Wrapper<DingzhizhuanquEntity> wrapper);
   	
   	List<DingzhizhuanquView> selectListView(Wrapper<DingzhizhuanquEntity> wrapper);
   	
   	DingzhizhuanquView selectView(@Param("ew") Wrapper<DingzhizhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingzhizhuanquEntity> wrapper);
   	

}

