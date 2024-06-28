package com.entity.view;

import com.entity.ZhiwujiuzhicailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 植物救治材料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@TableName("zhiwujiuzhicailiao")
public class ZhiwujiuzhicailiaoView  extends ZhiwujiuzhicailiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiwujiuzhicailiaoView(){
	}
 
 	public ZhiwujiuzhicailiaoView(ZhiwujiuzhicailiaoEntity zhiwujiuzhicailiaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhiwujiuzhicailiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
