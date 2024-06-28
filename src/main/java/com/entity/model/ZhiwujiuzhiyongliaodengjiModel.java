package com.entity.model;

import com.entity.ZhiwujiuzhiyongliaodengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 植物救治用料登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public class ZhiwujiuzhiyongliaodengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 植物名称
	 */
	
	private String zhiwumingcheng;
		
	/**
	 * 材料编号
	 */
	
	private String cailiaobianhao;
		
	/**
	 * 数量
	 */
	
	private String shuliang;
		
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
	 * 设置：材料编号
	 */
	 
	public void setCailiaobianhao(String cailiaobianhao) {
		this.cailiaobianhao = cailiaobianhao;
	}
	
	/**
	 * 获取：材料编号
	 */
	public String getCailiaobianhao() {
		return cailiaobianhao;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
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
