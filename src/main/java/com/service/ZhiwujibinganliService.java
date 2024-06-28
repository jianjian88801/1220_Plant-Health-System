package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiwujibinganliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiwujibinganliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiwujibinganliView;


/**
 * 植物疾病案例
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhiwujibinganliService extends IService<ZhiwujibinganliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiwujibinganliVO> selectListVO(Wrapper<ZhiwujibinganliEntity> wrapper);
   	
   	ZhiwujibinganliVO selectVO(@Param("ew") Wrapper<ZhiwujibinganliEntity> wrapper);
   	
   	List<ZhiwujibinganliView> selectListView(Wrapper<ZhiwujibinganliEntity> wrapper);
   	
   	ZhiwujibinganliView selectView(@Param("ew") Wrapper<ZhiwujibinganliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiwujibinganliEntity> wrapper);
   	
}

