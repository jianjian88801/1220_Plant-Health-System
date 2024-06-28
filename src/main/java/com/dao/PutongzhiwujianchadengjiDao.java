package com.dao;

import com.entity.PutongzhiwujianchadengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PutongzhiwujianchadengjiVO;
import com.entity.view.PutongzhiwujianchadengjiView;


/**
 * 普通植物检查登记
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface PutongzhiwujianchadengjiDao extends BaseMapper<PutongzhiwujianchadengjiEntity> {
	
	List<PutongzhiwujianchadengjiVO> selectListVO(@Param("ew") Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
	
	PutongzhiwujianchadengjiVO selectVO(@Param("ew") Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
	
	List<PutongzhiwujianchadengjiView> selectListView(@Param("ew") Wrapper<PutongzhiwujianchadengjiEntity> wrapper);

	List<PutongzhiwujianchadengjiView> selectListView(Pagination page,@Param("ew") Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
	
	PutongzhiwujianchadengjiView selectView(@Param("ew") Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
	
}
