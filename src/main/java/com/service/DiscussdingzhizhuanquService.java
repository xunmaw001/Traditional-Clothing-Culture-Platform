package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdingzhizhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdingzhizhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdingzhizhuanquView;


/**
 * 定制专区评论表
 *
 * @author 
 * @email 
 * @date 2023-02-01 13:06:07
 */
public interface DiscussdingzhizhuanquService extends IService<DiscussdingzhizhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdingzhizhuanquVO> selectListVO(Wrapper<DiscussdingzhizhuanquEntity> wrapper);
   	
   	DiscussdingzhizhuanquVO selectVO(@Param("ew") Wrapper<DiscussdingzhizhuanquEntity> wrapper);
   	
   	List<DiscussdingzhizhuanquView> selectListView(Wrapper<DiscussdingzhizhuanquEntity> wrapper);
   	
   	DiscussdingzhizhuanquView selectView(@Param("ew") Wrapper<DiscussdingzhizhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdingzhizhuanquEntity> wrapper);
   	

}

