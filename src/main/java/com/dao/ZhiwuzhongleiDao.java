package com.dao;

import com.entity.ZhiwuzhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiwuzhongleiVO;
import com.entity.view.ZhiwuzhongleiView;


/**
 * 植物种类
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwuzhongleiDao extends BaseMapper<ZhiwuzhongleiEntity> {
	
	List<ZhiwuzhongleiVO> selectListVO(@Param("ew") Wrapper<ZhiwuzhongleiEntity> wrapper);
	
	ZhiwuzhongleiVO selectVO(@Param("ew") Wrapper<ZhiwuzhongleiEntity> wrapper);
	
	List<ZhiwuzhongleiView> selectListView(@Param("ew") Wrapper<ZhiwuzhongleiEntity> wrapper);

	List<ZhiwuzhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiwuzhongleiEntity> wrapper);
	
	ZhiwuzhongleiView selectView(@Param("ew") Wrapper<ZhiwuzhongleiEntity> wrapper);
	
}
