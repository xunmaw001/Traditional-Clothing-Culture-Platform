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


import com.dao.DiscussfushixinxiDao;
import com.entity.DiscussfushixinxiEntity;
import com.service.DiscussfushixinxiService;
import com.entity.vo.DiscussfushixinxiVO;
import com.entity.view.DiscussfushixinxiView;

@Service("discussfushixinxiService")
public class DiscussfushixinxiServiceImpl extends ServiceImpl<DiscussfushixinxiDao, DiscussfushixinxiEntity> implements DiscussfushixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfushixinxiEntity> page = this.selectPage(
                new Query<DiscussfushixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussfushixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfushixinxiEntity> wrapper) {
		  Page<DiscussfushixinxiView> page =new Query<DiscussfushixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfushixinxiVO> selectListVO(Wrapper<DiscussfushixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfushixinxiVO selectVO(Wrapper<DiscussfushixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfushixinxiView> selectListView(Wrapper<DiscussfushixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfushixinxiView selectView(Wrapper<DiscussfushixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
