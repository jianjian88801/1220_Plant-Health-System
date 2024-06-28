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
 * 植物救治材料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@TableName("zhiwujiuzhicailiao")
public class ZhiwujiuzhicailiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiwujiuzhicailiaoEntity() {
		
	}
	
	public ZhiwujiuzhicailiaoEntity(T t) {
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
	 * 材料编号
	 */
					
	private String cailiaobianhao;
	
	/**
	 * 材料名称
	 */
					
	private String cailiaomingcheng;
	
	/**
	 * 材料类目
	 */
					
	private String cailiaoleimu;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
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
	 * 设置：材料名称
	 */
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
	}
	/**
	 * 设置：材料类目
	 */
	public void setCailiaoleimu(String cailiaoleimu) {
		this.cailiaoleimu = cailiaoleimu;
	}
	/**
	 * 获取：材料类目
	 */
	public String getCailiaoleimu() {
		return cailiaoleimu;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
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
