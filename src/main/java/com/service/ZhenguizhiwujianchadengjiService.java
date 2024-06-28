package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhenguizhiwujianchadengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhenguizhiwujianchadengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhenguizhiwujianchadengjiView;


/**
 * 珍贵植物检查登记
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface ZhenguizhiwujianchadengjiService extends IService<ZhenguizhiwujianchadengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhenguizhiwujianchadengjiVO> selectListVO(Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
   	
   	ZhenguizhiwujianchadengjiVO selectVO(@Param("ew") Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
   	
   	List<ZhenguizhiwujianchadengjiView> selectListView(Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
   	
   	ZhenguizhiwujianchadengjiView selectView(@Param("ew") Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper);
   	
}

