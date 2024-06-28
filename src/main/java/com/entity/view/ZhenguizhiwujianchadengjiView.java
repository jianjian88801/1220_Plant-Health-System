package com.entity.view;

import com.entity.ZhenguizhiwujianchadengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 珍贵植物检查登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@TableName("zhenguizhiwujianchadengji")
public class ZhenguizhiwujianchadengjiView  extends ZhenguizhiwujianchadengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhenguizhiwujianchadengjiView(){
	}
 
 	public ZhenguizhiwujianchadengjiView(ZhenguizhiwujianchadengjiEntity zhenguizhiwujianchadengjiEntity){
 	try {
			BeanUtils.copyProperties(this, zhenguizhiwujianchadengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
