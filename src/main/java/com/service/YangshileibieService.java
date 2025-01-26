package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YangshileibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YangshileibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YangshileibieView;


/**
 * 样式类别
 *
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface YangshileibieService extends IService<YangshileibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YangshileibieVO> selectListVO(Wrapper<YangshileibieEntity> wrapper);
   	
   	YangshileibieVO selectVO(@Param("ew") Wrapper<YangshileibieEntity> wrapper);
   	
   	List<YangshileibieView> selectListView(Wrapper<YangshileibieEntity> wrapper);
   	
   	YangshileibieView selectView(@Param("ew") Wrapper<YangshileibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YangshileibieEntity> wrapper);
   	

}

