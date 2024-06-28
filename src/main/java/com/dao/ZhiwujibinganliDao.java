package com.dao;

import com.entity.ZhiwujibinganliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiwujibinganliVO;
import com.entity.view.ZhiwujibinganliView;


/**
 * 植物疾病案例
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwujibinganliDao extends BaseMapper<ZhiwujibinganliEntity> {
	
	List<ZhiwujibinganliVO> selectListVO(@Param("ew") Wrapper<ZhiwujibinganliEntity> wrapper);
	
	ZhiwujibinganliVO selectVO(@Param("ew") Wrapper<ZhiwujibinganliEntity> wrapper);
	
	List<ZhiwujibinganliView> selectListView(@Param("ew") Wrapper<ZhiwujibinganliEntity> wrapper);

	List<ZhiwujibinganliView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiwujibinganliEntity> wrapper);
	
	ZhiwujibinganliView selectView(@Param("ew") Wrapper<ZhiwujibinganliEntity> wrapper);
	
}
