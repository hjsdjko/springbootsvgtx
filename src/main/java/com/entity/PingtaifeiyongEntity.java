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
 * 平台费用
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
@TableName("pingtaifeiyong")
public class PingtaifeiyongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PingtaifeiyongEntity() {
		
	}
	
	public PingtaifeiyongEntity(T t) {
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
	 * 费用编号
	 */
					
	private String feiyongbianhao;
	
	/**
	 * 年月
	 */
					
	private String nianyue;
	
	/**
	 * 费用类型
	 */
					
	private String feiyongleixing;
	
	/**
	 * 费用金额
	 */
					
	private Integer feiyongjine;
	
	/**
	 * 企业账号
	 */
					
	private String qiyezhanghao;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：费用编号
	 */
	public void setFeiyongbianhao(String feiyongbianhao) {
		this.feiyongbianhao = feiyongbianhao;
	}
	/**
	 * 获取：费用编号
	 */
	public String getFeiyongbianhao() {
		return feiyongbianhao;
	}
	/**
	 * 设置：年月
	 */
	public void setNianyue(String nianyue) {
		this.nianyue = nianyue;
	}
	/**
	 * 获取：年月
	 */
	public String getNianyue() {
		return nianyue;
	}
	/**
	 * 设置：费用类型
	 */
	public void setFeiyongleixing(String feiyongleixing) {
		this.feiyongleixing = feiyongleixing;
	}
	/**
	 * 获取：费用类型
	 */
	public String getFeiyongleixing() {
		return feiyongleixing;
	}
	/**
	 * 设置：费用金额
	 */
	public void setFeiyongjine(Integer feiyongjine) {
		this.feiyongjine = feiyongjine;
	}
	/**
	 * 获取：费用金额
	 */
	public Integer getFeiyongjine() {
		return feiyongjine;
	}
	/**
	 * 设置：企业账号
	 */
	public void setQiyezhanghao(String qiyezhanghao) {
		this.qiyezhanghao = qiyezhanghao;
	}
	/**
	 * 获取：企业账号
	 */
	public String getQiyezhanghao() {
		return qiyezhanghao;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
