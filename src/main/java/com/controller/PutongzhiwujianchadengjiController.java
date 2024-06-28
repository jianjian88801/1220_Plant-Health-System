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

import com.entity.PutongzhiwujianchadengjiEntity;
import com.entity.view.PutongzhiwujianchadengjiView;

import com.service.PutongzhiwujianchadengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 普通植物检查登记
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@RestController
@RequestMapping("/putongzhiwujianchadengji")
public class PutongzhiwujianchadengjiController {
    @Autowired
    private PutongzhiwujianchadengjiService putongzhiwujianchadengjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PutongzhiwujianchadengjiEntity putongzhiwujianchadengji,
		HttpServletRequest request){
        EntityWrapper<PutongzhiwujianchadengjiEntity> ew = new EntityWrapper<PutongzhiwujianchadengjiEntity>();
		PageUtils page = putongzhiwujianchadengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, putongzhiwujianchadengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PutongzhiwujianchadengjiEntity putongzhiwujianchadengji, 
		HttpServletRequest request){
        EntityWrapper<PutongzhiwujianchadengjiEntity> ew = new EntityWrapper<PutongzhiwujianchadengjiEntity>();
		PageUtils page = putongzhiwujianchadengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, putongzhiwujianchadengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PutongzhiwujianchadengjiEntity putongzhiwujianchadengji){
       	EntityWrapper<PutongzhiwujianchadengjiEntity> ew = new EntityWrapper<PutongzhiwujianchadengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( putongzhiwujianchadengji, "putongzhiwujianchadengji")); 
        return R.ok().put("data", putongzhiwujianchadengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PutongzhiwujianchadengjiEntity putongzhiwujianchadengji){
        EntityWrapper< PutongzhiwujianchadengjiEntity> ew = new EntityWrapper< PutongzhiwujianchadengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( putongzhiwujianchadengji, "putongzhiwujianchadengji")); 
		PutongzhiwujianchadengjiView putongzhiwujianchadengjiView =  putongzhiwujianchadengjiService.selectView(ew);
		return R.ok("查询普通植物检查登记成功").put("data", putongzhiwujianchadengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PutongzhiwujianchadengjiEntity putongzhiwujianchadengji = putongzhiwujianchadengjiService.selectById(id);
        return R.ok().put("data", putongzhiwujianchadengji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PutongzhiwujianchadengjiEntity putongzhiwujianchadengji = putongzhiwujianchadengjiService.selectById(id);
        return R.ok().put("data", putongzhiwujianchadengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PutongzhiwujianchadengjiEntity putongzhiwujianchadengji, HttpServletRequest request){
    	putongzhiwujianchadengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(putongzhiwujianchadengji);
        putongzhiwujianchadengjiService.insert(putongzhiwujianchadengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PutongzhiwujianchadengjiEntity putongzhiwujianchadengji, HttpServletRequest request){
    	putongzhiwujianchadengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(putongzhiwujianchadengji);
        putongzhiwujianchadengjiService.insert(putongzhiwujianchadengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PutongzhiwujianchadengjiEntity putongzhiwujianchadengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(putongzhiwujianchadengji);
        putongzhiwujianchadengjiService.updateById(putongzhiwujianchadengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        putongzhiwujianchadengjiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<PutongzhiwujianchadengjiEntity> wrapper = new EntityWrapper<PutongzhiwujianchadengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = putongzhiwujianchadengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
