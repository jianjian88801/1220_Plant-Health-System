package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PutongzhiwujianchadengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PutongzhiwujianchadengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PutongzhiwujianchadengjiView;


/**
 * 普通植物检查登记
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface PutongzhiwujianchadengjiService extends IService<PutongzhiwujianchadengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PutongzhiwujianchadengjiVO> selectListVO(Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
   	
   	PutongzhiwujianchadengjiVO selectVO(@Param("ew") Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
   	
   	List<PutongzhiwujianchadengjiView> selectListView(Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
   	
   	PutongzhiwujianchadengjiView selectView(@Param("ew") Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PutongzhiwujianchadengjiEntity> wrapper);
   	
}

