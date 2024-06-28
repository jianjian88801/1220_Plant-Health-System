package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 普通植物检查登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@TableName("putongzhiwujianchadengji")
public class PutongzhiwujianchadengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PutongzhiwujianchadengjiEntity() {
		
	}
	
	public PutongzhiwujianchadengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 植物编号
	 */
					
	private String zhiwubianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：植物编号
	 */
	public void setZhiwubianhao(String zhiwubianhao) {
		this.zhiwubianhao = zhiwubianhao;
	}
	/**
	 * 获取：植物编号
	 */
	public String getZhiwubianhao() {
		return zhiwubianhao;
	}
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
