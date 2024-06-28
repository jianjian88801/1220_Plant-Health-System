package com.dao;

import com.entity.ZhiwujiuzhiyongliaodengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiwujiuzhiyongliaodengjiVO;
import com.entity.view.ZhiwujiuzhiyongliaodengjiView;


/**
 * 植物救治用料登记
 * 
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwujiuzhiyongliaodengjiDao extends BaseMapper<ZhiwujiuzhiyongliaodengjiEntity> {
	
	List<ZhiwujiuzhiyongliaodengjiVO> selectListVO(@Param("ew") Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
	
	ZhiwujiuzhiyongliaodengjiVO selectVO(@Param("ew") Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
	
	List<ZhiwujiuzhiyongliaodengjiView> selectListView(@Param("ew") Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);

	List<ZhiwujiuzhiyongliaodengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
	
	ZhiwujiuzhiyongliaodengjiView selectView(@Param("ew") Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
	
}
