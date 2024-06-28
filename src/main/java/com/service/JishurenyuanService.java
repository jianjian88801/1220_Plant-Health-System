package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishurenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishurenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishurenyuanView;


/**
 * 技术人员
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface JishurenyuanService extends IService<JishurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishurenyuanVO> selectListVO(Wrapper<JishurenyuanEntity> wrapper);
   	
   	JishurenyuanVO selectVO(@Param("ew") Wrapper<JishurenyuanEntity> wrapper);
   	
   	List<JishurenyuanView> selectListView(Wrapper<JishurenyuanEntity> wrapper);
   	
   	JishurenyuanView selectView(@Param("ew") Wrapper<JishurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishurenyuanEntity> wrapper);
   	
}

