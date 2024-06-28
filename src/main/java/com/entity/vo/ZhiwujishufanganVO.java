package com.entity.vo;

import com.entity.ZhiwujishufanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 植物技术方案
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public class ZhiwujishufanganVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 植物名称
	 */
	
	private String zhiwumingcheng;
		
	/**
	 * 植物健康状况
	 */
	
	private String zhiwujiankangzhuangkuang;
		
	/**
	 * 救治方案
	 */
	
	private String jiuzhifangan;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：植物名称
	 */
	 
	public void setZhiwumingcheng(String zhiwumingcheng) {
		this.zhiwumingcheng = zhiwumingcheng;
	}
	
	/**
	 * 获取：植物名称
	 */
	public String getZhiwumingcheng() {
		return zhiwumingcheng;
	}
				
	
	/**
	 * 设置：植物健康状况
	 */
	 
	public void setZhiwujiankangzhuangkuang(String zhiwujiankangzhuangkuang) {
		this.zhiwujiankangzhuangkuang = zhiwujiankangzhuangkuang;
	}
	
	/**
	 * 获取：植物健康状况
	 */
	public String getZhiwujiankangzhuangkuang() {
		return zhiwujiankangzhuangkuang;
	}
				
	
	/**
	 * 设置：救治方案
	 */
	 
	public void setJiuzhifangan(String jiuzhifangan) {
		this.jiuzhifangan = jiuzhifangan;
	}
	
	/**
	 * 获取：救治方案
	 */
	public String getJiuzhifangan() {
		return jiuzhifangan;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
