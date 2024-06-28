package com.entity.model;

import com.entity.ZhenguizhiwujianchadengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 珍贵植物检查登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public class ZhenguizhiwujianchadengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 植物名称
	 */
	
	private String zhiwumingcheng;
		
	/**
	 * 植物种类
	 */
	
	private String zhiwuzhonglei;
		
	/**
	 * 植物简介
	 */
	
	private String zhiwujianjie;
		
	/**
	 * 植物健康状况
	 */
	
	private String zhiwujiankangzhuangkuang;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 地点
	 */
	
	private String didian;
		
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
	 * 设置：植物种类
	 */
	 
	public void setZhiwuzhonglei(String zhiwuzhonglei) {
		this.zhiwuzhonglei = zhiwuzhonglei;
	}
	
	/**
	 * 获取：植物种类
	 */
	public String getZhiwuzhonglei() {
		return zhiwuzhonglei;
	}
				
	
	/**
	 * 设置：植物简介
	 */
	 
	public void setZhiwujianjie(String zhiwujianjie) {
		this.zhiwujianjie = zhiwujianjie;
	}
	
	/**
	 * 获取：植物简介
	 */
	public String getZhiwujianjie() {
		return zhiwujianjie;
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
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：地点
	 */
	 
	public void setDidian(String didian) {
		this.didian = didian;
	}
	
	/**
	 * 获取：地点
	 */
	public String getDidian() {
		return didian;
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
