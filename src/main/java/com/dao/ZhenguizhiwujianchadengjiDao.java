package com.dao;

import com.entity.ZhenguizhiwujianchadengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhenguizhiwujianchadengjiVO;
import com.entity.view.ZhenguizhiwujianchadengjiView;


/**
 * 珍贵植物检查登记
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhenguizhiwujianchadengjiDao extends BaseMapper<ZhenguizhiwujianchadengjiEntity> {
	
	List<ZhenguizhiwujianchadengjiVO> selectListVO(@Param("ew") Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
	
	ZhenguizhiwujianchadengjiVO selectVO(@Param("ew") Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
	
	List<ZhenguizhiwujianchadengjiView> selectListView(@Param("ew") Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);

	List<ZhenguizhiwujianchadengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
	
	ZhenguizhiwujianchadengjiView selectView(@Param("ew") Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
	
}
