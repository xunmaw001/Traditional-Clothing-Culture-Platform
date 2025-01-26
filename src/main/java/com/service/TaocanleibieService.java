package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TaocanleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TaocanleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TaocanleibieView;


/**
 * 套餐类别
 *
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
public interface TaocanleibieService extends IService<TaocanleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TaocanleibieVO> selectListVO(Wrapper<TaocanleibieEntity> wrapper);
   	
   	TaocanleibieVO selectVO(@Param("ew") Wrapper<TaocanleibieEntity> wrapper);
   	
   	List<TaocanleibieView> selectListView(Wrapper<TaocanleibieEntity> wrapper);
   	
   	TaocanleibieView selectView(@Param("ew") Wrapper<TaocanleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TaocanleibieEntity> wrapper);
   	

}

