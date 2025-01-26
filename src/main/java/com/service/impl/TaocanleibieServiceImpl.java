package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TaocanleibieDao;
import com.entity.TaocanleibieEntity;
import com.service.TaocanleibieService;
import com.entity.vo.TaocanleibieVO;
import com.entity.view.TaocanleibieView;

@Service("taocanleibieService")
public class TaocanleibieServiceImpl extends ServiceImpl<TaocanleibieDao, TaocanleibieEntity> implements TaocanleibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TaocanleibieEntity> page = this.selectPage(
                new Query<TaocanleibieEntity>(params).getPage(),
                new EntityWrapper<TaocanleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TaocanleibieEntity> wrapper) {
		  Page<TaocanleibieView> page =new Query<TaocanleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TaocanleibieVO> selectListVO(Wrapper<TaocanleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TaocanleibieVO selectVO(Wrapper<TaocanleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TaocanleibieView> selectListView(Wrapper<TaocanleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TaocanleibieView selectView(Wrapper<TaocanleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
