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


import com.dao.FushixinxiDao;
import com.entity.FushixinxiEntity;
import com.service.FushixinxiService;
import com.entity.vo.FushixinxiVO;
import com.entity.view.FushixinxiView;

@Service("fushixinxiService")
public class FushixinxiServiceImpl extends ServiceImpl<FushixinxiDao, FushixinxiEntity> implements FushixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FushixinxiEntity> page = this.selectPage(
                new Query<FushixinxiEntity>(params).getPage(),
                new EntityWrapper<FushixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FushixinxiEntity> wrapper) {
		  Page<FushixinxiView> page =new Query<FushixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FushixinxiVO> selectListVO(Wrapper<FushixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FushixinxiVO selectVO(Wrapper<FushixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FushixinxiView> selectListView(Wrapper<FushixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FushixinxiView selectView(Wrapper<FushixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
