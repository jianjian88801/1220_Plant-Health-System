package com.dao;

import com.entity.PutongyuangongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PutongyuangongVO;
import com.entity.view.PutongyuangongView;


/**
 * 普通员工
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface PutongyuangongDao extends BaseMapper<PutongyuangongEntity> {
	
	List<PutongyuangongVO> selectListVO(@Param("ew") Wrapper<PutongyuangongEntity> wrapper);
	
	PutongyuangongVO selectVO(@Param("ew") Wrapper<PutongyuangongEntity> wrapper);
	
	List<PutongyuangongView> selectListView(@Param("ew") Wrapper<PutongyuangongEntity> wrapper);

	List<PutongyuangongView> selectListView(Pagination page,@Param("ew") Wrapper<PutongyuangongEntity> wrapper);
	
	PutongyuangongView selectView(@Param("ew") Wrapper<PutongyuangongEntity> wrapper);
	
}
