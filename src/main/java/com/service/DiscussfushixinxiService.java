package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfushixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfushixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfushixinxiView;


/**
 * 服饰信息评论表
 *
 * @author 
 * @email 
 * @date 2023-02-01 13:06:07
 */
public interface DiscussfushixinxiService extends IService<DiscussfushixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfushixinxiVO> selectListVO(Wrapper<DiscussfushixinxiEntity> wrapper);
   	
   	DiscussfushixinxiVO selectVO(@Param("ew") Wrapper<DiscussfushixinxiEntity> wrapper);
   	
   	List<DiscussfushixinxiView> selectListView(Wrapper<DiscussfushixinxiEntity> wrapper);
   	
   	DiscussfushixinxiView selectView(@Param("ew") Wrapper<DiscussfushixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfushixinxiEntity> wrapper);
   	

}

