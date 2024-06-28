package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiwujiuzhicailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiwujiuzhicailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiwujiuzhicailiaoView;


/**
 * 植物救治材料
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwujiuzhicailiaoService extends IService<ZhiwujiuzhicailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiwujiuzhicailiaoVO> selectListVO(Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
   	
   	ZhiwujiuzhicailiaoVO selectVO(@Param("ew") Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
   	
   	List<ZhiwujiuzhicailiaoView> selectListView(Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
   	
   	ZhiwujiuzhicailiaoView selectView(@Param("ew") Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
   	
}

