package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PutongyuangongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PutongyuangongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PutongyuangongView;


/**
 * 普通员工
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface PutongyuangongService extends IService<PutongyuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PutongyuangongVO> selectListVO(Wrapper<PutongyuangongEntity> wrapper);
   	
   	PutongyuangongVO selectVO(@Param("ew") Wrapper<PutongyuangongEntity> wrapper);
   	
   	List<PutongyuangongView> selectListView(Wrapper<PutongyuangongEntity> wrapper);
   	
   	PutongyuangongView selectView(@Param("ew") Wrapper<PutongyuangongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PutongyuangongEntity> wrapper);
   	
}

