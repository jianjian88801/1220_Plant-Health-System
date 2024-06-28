package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiwujishufanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiwujishufanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiwujishufanganView;


/**
 * 植物技术方案
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwujishufanganService extends IService<ZhiwujishufanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiwujishufanganVO> selectListVO(Wrapper<ZhiwujishufanganEntity> wrapper);
   	
   	ZhiwujishufanganVO selectVO(@Param("ew") Wrapper<ZhiwujishufanganEntity> wrapper);
   	
   	List<ZhiwujishufanganView> selectListView(Wrapper<ZhiwujishufanganEntity> wrapper);
   	
   	ZhiwujishufanganView selectView(@Param("ew") Wrapper<ZhiwujishufanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiwujishufanganEntity> wrapper);
   	
}

