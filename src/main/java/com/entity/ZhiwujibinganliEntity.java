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
 * 植物疾病案例
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
@TableName("zhiwujibinganli")
public class ZhiwujibinganliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhiwujibinganliEntity() {
		
	}
	
	public ZhiwujibinganliEntity(T t) {
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
	 * 疾病名称
	 */
					
	private String jibingmingcheng;
	
	/**
	 * 疾病症状
	 */
					
	private String jibingzhengzhuang;
	
	/**
	 * 发生时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fashengshijian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：疾病名称
	 */
	public void setJibingmingcheng(String jibingmingcheng) {
		this.jibingmingcheng = jibingmingcheng;
	}
	/**
	 * 获取：疾病名称
	 */
	public String getJibingmingcheng() {
		return jibingmingcheng;
	}
	/**
	 * 设置：疾病症状
	 */
	public void setJibingzhengzhuang(String jibingzhengzhuang) {
		this.jibingzhengzhuang = jibingzhengzhuang;
	}
	/**
	 * 获取：疾病症状
	 */
	public String getJibingzhengzhuang() {
		return jibingzhengzhuang;
	}
	/**
	 * 设置：发生时间
	 */
	public void setFashengshijian(Date fashengshijian) {
		this.fashengshijian = fashengshijian;
	}
	/**
	 * 获取：发生时间
	 */
	public Date getFashengshijian() {
		return fashengshijian;
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
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
