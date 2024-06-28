package com.dao;

import com.entity.CailiaoleimuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CailiaoleimuVO;
import com.entity.view.CailiaoleimuView;


/**
 * 材料类目
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface CailiaoleimuDao extends BaseMapper<CailiaoleimuEntity> {
	
	List<CailiaoleimuVO> selectListVO(@Param("ew") Wrapper<CailiaoleimuEntity> wrapper);
	
	CailiaoleimuVO selectVO(@Param("ew") Wrapper<CailiaoleimuEntity> wrapper);
	
	List<CailiaoleimuView> selectListView(@Param("ew") Wrapper<CailiaoleimuEntity> wrapper);

	List<CailiaoleimuView> selectListView(Pagination page,@Param("ew") Wrapper<CailiaoleimuEntity> wrapper);
	
	CailiaoleimuView selectView(@Param("ew") Wrapper<CailiaoleimuEntity> wrapper);
	
}
