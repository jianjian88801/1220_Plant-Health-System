package com.entity.view;

import com.entity.ZhiwuzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 植物种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@TableName("zhiwuzhonglei")
public class ZhiwuzhongleiView  extends ZhiwuzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiwuzhongleiView(){
	}
 
 	public ZhiwuzhongleiView(ZhiwuzhongleiEntity zhiwuzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, zhiwuzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
