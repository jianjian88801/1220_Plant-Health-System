package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiwuzhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiwuzhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiwuzhongleiView;


/**
 * 植物种类
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwuzhongleiService extends IService<ZhiwuzhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiwuzhongleiVO> selectListVO(Wrapper<ZhiwuzhongleiEntity> wrapper);
   	
   	ZhiwuzhongleiVO selectVO(@Param("ew") Wrapper<ZhiwuzhongleiEntity> wrapper);
   	
   	List<ZhiwuzhongleiView> selectListView(Wrapper<ZhiwuzhongleiEntity> wrapper);
   	
   	ZhiwuzhongleiView selectView(@Param("ew") Wrapper<ZhiwuzhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiwuzhongleiEntity> wrapper);
   	
}

