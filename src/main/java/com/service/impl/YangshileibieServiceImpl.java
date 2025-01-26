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


import com.dao.YangshileibieDao;
import com.entity.YangshileibieEntity;
import com.service.YangshileibieService;
import com.entity.vo.YangshileibieVO;
import com.entity.view.YangshileibieView;

@Service("yangshileibieService")
public class YangshileibieServiceImpl extends ServiceImpl<YangshileibieDao, YangshileibieEntity> implements YangshileibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YangshileibieEntity> page = this.selectPage(
                new Query<YangshileibieEntity>(params).getPage(),
                new EntityWrapper<YangshileibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YangshileibieEntity> wrapper) {
		  Page<YangshileibieView> page =new Query<YangshileibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YangshileibieVO> selectListVO(Wrapper<YangshileibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YangshileibieVO selectVO(Wrapper<YangshileibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YangshileibieView> selectListView(Wrapper<YangshileibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YangshileibieView selectView(Wrapper<YangshileibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
