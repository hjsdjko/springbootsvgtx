package com.entity.model;

import com.entity.YingpinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 应聘信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
public class YingpinxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 岗位类型
	 */
	
	private String gangweileixing;
		
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
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 毕业院校
	 */
	
	private String biyeyuanxiao;
		
	/**
	 * 最高学历
	 */
	
	private String zuigaoxueli;
		
	/**
	 * 个人简历
	 */
	
	private String gerenjianli;
				
	
	/**
	 * 设置：岗位类型
	 */
	 
	public void setGangweileixing(String gangweileixing) {
		this.gangweileixing = gangweileixing;
	}
	
	/**
	 * 获取：岗位类型
	 */
	public String getGangweileixing() {
		return gangweileixing;
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
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：用户手机
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：毕业院校
	 */
	 
	public void setBiyeyuanxiao(String biyeyuanxiao) {
		this.biyeyuanxiao = biyeyuanxiao;
	}
	
	/**
	 * 获取：毕业院校
	 */
	public String getBiyeyuanxiao() {
		return biyeyuanxiao;
	}
				
	
	/**
	 * 设置：最高学历
	 */
	 
	public void setZuigaoxueli(String zuigaoxueli) {
		this.zuigaoxueli = zuigaoxueli;
	}
	
	/**
	 * 获取：最高学历
	 */
	public String getZuigaoxueli() {
		return zuigaoxueli;
	}
				
	
	/**
	 * 设置：个人简历
	 */
	 
	public void setGerenjianli(String gerenjianli) {
		this.gerenjianli = gerenjianli;
	}
	
	/**
	 * 获取：个人简历
	 */
	public String getGerenjianli() {
		return gerenjianli;
	}
			
}
