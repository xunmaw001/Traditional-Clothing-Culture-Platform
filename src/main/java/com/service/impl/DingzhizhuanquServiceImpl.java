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


import com.dao.DingzhizhuanquDao;
import com.entity.DingzhizhuanquEntity;
import com.service.DingzhizhuanquService;
import com.entity.vo.DingzhizhuanquVO;
import com.entity.view.DingzhizhuanquView;

@Service("dingzhizhuanquService")
public class DingzhizhuanquServiceImpl extends ServiceImpl<DingzhizhuanquDao, DingzhizhuanquEntity> implements DingzhizhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingzhizhuanquEntity> page = this.selectPage(
                new Query<DingzhizhuanquEntity>(params).getPage(),
                new EntityWrapper<DingzhizhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingzhizhuanquEntity> wrapper) {
		  Page<DingzhizhuanquView> page =new Query<DingzhizhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingzhizhuanquVO> selectListVO(Wrapper<DingzhizhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingzhizhuanquVO selectVO(Wrapper<DingzhizhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingzhizhuanquView> selectListView(Wrapper<DingzhizhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingzhizhuanquView selectView(Wrapper<DingzhizhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
