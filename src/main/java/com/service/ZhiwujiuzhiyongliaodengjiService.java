package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiwujiuzhiyongliaodengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiwujiuzhiyongliaodengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiwujiuzhiyongliaodengjiView;


/**
 * 植物救治用料登记
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwujiuzhiyongliaodengjiService extends IService<ZhiwujiuzhiyongliaodengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiwujiuzhiyongliaodengjiVO> selectListVO(Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
   	
   	ZhiwujiuzhiyongliaodengjiVO selectVO(@Param("ew") Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
   	
   	List<ZhiwujiuzhiyongliaodengjiView> selectListView(Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
   	
   	ZhiwujiuzhiyongliaodengjiView selectView(@Param("ew") Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper);
   	
}

