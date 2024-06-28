package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CailiaoleimuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CailiaoleimuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CailiaoleimuView;


/**
 * 材料类目
 *
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public interface CailiaoleimuService extends IService<CailiaoleimuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CailiaoleimuVO> selectListVO(Wrapper<CailiaoleimuEntity> wrapper);
   	
   	CailiaoleimuVO selectVO(@Param("ew") Wrapper<CailiaoleimuEntity> wrapper);
   	
   	List<CailiaoleimuView> selectListView(Wrapper<CailiaoleimuEntity> wrapper);
   	
   	CailiaoleimuView selectView(@Param("ew") Wrapper<CailiaoleimuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CailiaoleimuEntity> wrapper);
   	
}

