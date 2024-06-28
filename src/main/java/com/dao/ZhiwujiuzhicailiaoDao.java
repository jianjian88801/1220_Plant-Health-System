package com.dao;

import com.entity.ZhiwujiuzhicailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiwujiuzhicailiaoVO;
import com.entity.view.ZhiwujiuzhicailiaoView;


/**
 * 植物救治材料
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwujiuzhicailiaoDao extends BaseMapper<ZhiwujiuzhicailiaoEntity> {
	
	List<ZhiwujiuzhicailiaoVO> selectListVO(@Param("ew") Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
	
	ZhiwujiuzhicailiaoVO selectVO(@Param("ew") Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
	
	List<ZhiwujiuzhicailiaoView> selectListView(@Param("ew") Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);

	List<ZhiwujiuzhicailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
	
	ZhiwujiuzhicailiaoView selectView(@Param("ew") Wrapper<ZhiwujiuzhicailiaoEntity> wrapper);
	
}
