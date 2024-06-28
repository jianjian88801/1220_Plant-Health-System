package com.dao;

import com.entity.ZhiwujishufanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiwujishufanganVO;
import com.entity.view.ZhiwujishufanganView;


/**
 * 植物技术方案
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwujishufanganDao extends BaseMapper<ZhiwujishufanganEntity> {
	
	List<ZhiwujishufanganVO> selectListVO(@Param("ew") Wrapper<ZhiwujishufanganEntity> wrapper);
	
	ZhiwujishufanganVO selectVO(@Param("ew") Wrapper<ZhiwujishufanganEntity> wrapper);
	
	List<ZhiwujishufanganView> selectListView(@Param("ew") Wrapper<ZhiwujishufanganEntity> wrapper);

	List<ZhiwujishufanganView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiwujishufanganEntity> wrapper);
	
	ZhiwujishufanganView selectView(@Param("ew") Wrapper<ZhiwujishufanganEntity> wrapper);
	
}
