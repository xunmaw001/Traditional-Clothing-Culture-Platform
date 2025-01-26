package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FushixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FushixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FushixinxiView;


/**
 * 服饰信息
 *
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface FushixinxiService extends IService<FushixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FushixinxiVO> selectListVO(Wrapper<FushixinxiEntity> wrapper);
   	
   	FushixinxiVO selectVO(@Param("ew") Wrapper<FushixinxiEntity> wrapper);
   	
   	List<FushixinxiView> selectListView(Wrapper<FushixinxiEntity> wrapper);
   	
   	FushixinxiView selectView(@Param("ew") Wrapper<FushixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FushixinxiEntity> wrapper);
   	

}

