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


import com.dao.DingzhileibieDao;
import com.entity.DingzhileibieEntity;
import com.service.DingzhileibieService;
import com.entity.vo.DingzhileibieVO;
import com.entity.view.DingzhileibieView;

@Service("dingzhileibieService")
public class DingzhileibieServiceImpl extends ServiceImpl<DingzhileibieDao, DingzhileibieEntity> implements DingzhileibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingzhileibieEntity> page = this.selectPage(
                new Query<DingzhileibieEntity>(params).getPage(),
                new EntityWrapper<DingzhileibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingzhileibieEntity> wrapper) {
		  Page<DingzhileibieView> page =new Query<DingzhileibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingzhileibieVO> selectListVO(Wrapper<DingzhileibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingzhileibieVO selectVO(Wrapper<DingzhileibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingzhileibieView> selectListView(Wrapper<DingzhileibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingzhileibieView selectView(Wrapper<DingzhileibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
