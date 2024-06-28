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

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhiwuzhongleiEntity;
import com.entity.view.ZhiwuzhongleiView;

import com.service.ZhiwuzhongleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 植物种类
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@RestController
@RequestMapping("/zhiwuzhonglei")
public class ZhiwuzhongleiController {
    @Autowired
    private ZhiwuzhongleiService zhiwuzhongleiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhiwuzhongleiEntity zhiwuzhonglei,
		HttpServletRequest request){
        EntityWrapper<ZhiwuzhongleiEntity> ew = new EntityWrapper<ZhiwuzhongleiEntity>();
		PageUtils page = zhiwuzhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwuzhonglei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhiwuzhongleiEntity zhiwuzhonglei, 
		HttpServletRequest request){
        EntityWrapper<ZhiwuzhongleiEntity> ew = new EntityWrapper<ZhiwuzhongleiEntity>();
		PageUtils page = zhiwuzhongleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhiwuzhonglei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhiwuzhongleiEntity zhiwuzhonglei){
       	EntityWrapper<ZhiwuzhongleiEntity> ew = new EntityWrapper<ZhiwuzhongleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhiwuzhonglei, "zhiwuzhonglei")); 
        return R.ok().put("data", zhiwuzhongleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhiwuzhongleiEntity zhiwuzhonglei){
        EntityWrapper< ZhiwuzhongleiEntity> ew = new EntityWrapper< ZhiwuzhongleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhiwuzhonglei, "zhiwuzhonglei")); 
		ZhiwuzhongleiView zhiwuzhongleiView =  zhiwuzhongleiService.selectView(ew);
		return R.ok("查询植物种类成功").put("data", zhiwuzhongleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhiwuzhongleiEntity zhiwuzhonglei = zhiwuzhongleiService.selectById(id);
        return R.ok().put("data", zhiwuzhonglei);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhiwuzhongleiEntity zhiwuzhonglei = zhiwuzhongleiService.selectById(id);
        return R.ok().put("data", zhiwuzhonglei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhiwuzhongleiEntity zhiwuzhonglei, HttpServletRequest request){
    	zhiwuzhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiwuzhonglei);
        zhiwuzhongleiService.insert(zhiwuzhonglei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhiwuzhongleiEntity zhiwuzhonglei, HttpServletRequest request){
    	zhiwuzhonglei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhiwuzhonglei);
        zhiwuzhongleiService.insert(zhiwuzhonglei);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhiwuzhongleiEntity zhiwuzhonglei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhiwuzhonglei);
        zhiwuzhongleiService.updateById(zhiwuzhonglei);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhiwuzhongleiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZhiwuzhongleiEntity> wrapper = new EntityWrapper<ZhiwuzhongleiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = zhiwuzhongleiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
