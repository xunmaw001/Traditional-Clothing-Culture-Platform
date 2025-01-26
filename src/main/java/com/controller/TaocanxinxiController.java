package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;
import com.entity.OrdersEntity;
import com.service.OrdersService;

import com.entity.TaocanxinxiEntity;
import com.entity.view.TaocanxinxiView;

import com.service.TaocanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 套餐信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-01 13:06:06
 */
@RestController
@RequestMapping("/taocanxinxi")
public class TaocanxinxiController {
    @Autowired
    private TaocanxinxiService taocanxinxiService;


    @Autowired
    private StoreupService storeupService;

    @Autowired
    private OrdersService ordersService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TaocanxinxiEntity taocanxinxi, 
		HttpServletRequest request){

        EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();


		PageUtils page = taocanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TaocanxinxiEntity taocanxinxi, 
		HttpServletRequest request){
        EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();

		PageUtils page = taocanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TaocanxinxiEntity taocanxinxi){
       	EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( taocanxinxi, "taocanxinxi")); 
        return R.ok().put("data", taocanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TaocanxinxiEntity taocanxinxi){
        EntityWrapper< TaocanxinxiEntity> ew = new EntityWrapper< TaocanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( taocanxinxi, "taocanxinxi")); 
		TaocanxinxiView taocanxinxiView =  taocanxinxiService.selectView(ew);
		return R.ok("查询套餐信息成功").put("data", taocanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TaocanxinxiEntity taocanxinxi = taocanxinxiService.selectById(id);
		taocanxinxi.setClicknum(taocanxinxi.getClicknum()+1);
		taocanxinxi.setClicktime(new Date());
		taocanxinxiService.updateById(taocanxinxi);
        return R.ok().put("data", taocanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TaocanxinxiEntity taocanxinxi = taocanxinxiService.selectById(id);
		taocanxinxi.setClicknum(taocanxinxi.getClicknum()+1);
		taocanxinxi.setClicktime(new Date());
		taocanxinxiService.updateById(taocanxinxi);
        return R.ok().put("data", taocanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TaocanxinxiEntity taocanxinxi, HttpServletRequest request){
    	taocanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(taocanxinxi);

        taocanxinxiService.insert(taocanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TaocanxinxiEntity taocanxinxi, HttpServletRequest request){
    	taocanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(taocanxinxi);

        taocanxinxiService.insert(taocanxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody TaocanxinxiEntity taocanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(taocanxinxi);
        taocanxinxiService.updateById(taocanxinxi);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        taocanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TaocanxinxiEntity> wrapper = new EntityWrapper<TaocanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = taocanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,TaocanxinxiEntity taocanxinxi, HttpServletRequest request,String pre){
        EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = taocanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanxinxi), params), params));
        return R.ok().put("data", page);
    }


	/**
     * 协同算法（按用户购买推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,TaocanxinxiEntity taocanxinxi, HttpServletRequest request){
    	String userId = request.getSession().getAttribute("userId").toString();
    	String goodtypeColumn = "taocanleibie";
    	List<OrdersEntity> orders = ordersService.selectList(new EntityWrapper<OrdersEntity>().eq("userid", userId).eq("tablename", "taocanxinxi").orderBy("addtime", false));
        List<String> goodtypes = new ArrayList<String>();
    	Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
    	List<TaocanxinxiEntity> taocanxinxiList = new ArrayList<TaocanxinxiEntity>();
	//去重
    	List<OrdersEntity> ordersDist = new ArrayList<OrdersEntity>();
    	for(OrdersEntity o1 : orders) {
    		boolean addFlag = true;
    		for(OrdersEntity o2 : ordersDist) {
    			if(o1.getGoodid()==o2.getGoodid() || o1.getGoodtype().equals(o2.getGoodtype())) {
    				addFlag = false;
    				break;
    			}
    		}
    		if(addFlag) ordersDist.add(o1);
    	}
        if(ordersDist!=null && ordersDist.size()>0) {
        	for(OrdersEntity o : ordersDist) {
        		taocanxinxiList.addAll(taocanxinxiService.selectList(new EntityWrapper<TaocanxinxiEntity>().eq(goodtypeColumn, o.getGoodtype())));
        	}
        }
    	EntityWrapper<TaocanxinxiEntity> ew = new EntityWrapper<TaocanxinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = taocanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, taocanxinxi), params), params));
        List<TaocanxinxiEntity> pageList = (List<TaocanxinxiEntity>)page.getList();
        if(taocanxinxiList.size()<limit) {
        	int toAddNum = (limit-taocanxinxiList.size())<=pageList.size()?(limit-taocanxinxiList.size()):pageList.size();
            for(TaocanxinxiEntity o1 : pageList) {
                boolean addFlag = true;
                for(TaocanxinxiEntity o2 : taocanxinxiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    taocanxinxiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(taocanxinxiList.size()>limit) {
            taocanxinxiList = taocanxinxiList.subList(0, limit);
        }
        page.setList(taocanxinxiList);
	return R.ok().put("data", page);
    }







}
