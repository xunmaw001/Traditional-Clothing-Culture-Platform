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


import com.dao.DiscussdingzhizhuanquDao;
import com.entity.DiscussdingzhizhuanquEntity;
import com.service.DiscussdingzhizhuanquService;
import com.entity.vo.DiscussdingzhizhuanquVO;
import com.entity.view.DiscussdingzhizhuanquView;

@Service("discussdingzhizhuanquService")
public class DiscussdingzhizhuanquServiceImpl extends ServiceImpl<DiscussdingzhizhuanquDao, DiscussdingzhizhuanquEntity> implements DiscussdingzhizhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdingzhizhuanquEntity> page = this.selectPage(
                new Query<DiscussdingzhizhuanquEntity>(params).getPage(),
                new EntityWrapper<DiscussdingzhizhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdingzhizhuanquEntity> wrapper) {
		  Page<DiscussdingzhizhuanquView> page =new Query<DiscussdingzhizhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdingzhizhuanquVO> selectListVO(Wrapper<DiscussdingzhizhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdingzhizhuanquVO selectVO(Wrapper<DiscussdingzhizhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdingzhizhuanquView> selectListView(Wrapper<DiscussdingzhizhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdingzhizhuanquView selectView(Wrapper<DiscussdingzhizhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
