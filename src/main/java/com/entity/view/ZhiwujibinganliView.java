package com.entity.view;

import com.entity.ZhiwujibinganliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 植物疾病案例
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@TableName("zhiwujibinganli")
public class ZhiwujibinganliView  extends ZhiwujibinganliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiwujibinganliView(){
	}
 
 	public ZhiwujibinganliView(ZhiwujibinganliEntity zhiwujibinganliEntity){
 	try {
			BeanUtils.copyProperties(this, zhiwujibinganliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
