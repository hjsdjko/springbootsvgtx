package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 用户
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
public class YonghuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 毕业院校
	 */
	
	private String biyeyuanxiao;
		
	/**
	 * 最高学历
	 */
	
	private String zuigaoxueli;
		
	/**
	 * 期望职位
	 */
	
	private String qiwangzhiwei;
		
	/**
	 * 薪资要求
	 */
	
	private String xinziyaoqiu;
		
	/**
	 * 期望城市
	 */
	
	private String qiwangchengshi;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
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
	 * 设置：期望职位
	 */
	 
	public void setQiwangzhiwei(String qiwangzhiwei) {
		this.qiwangzhiwei = qiwangzhiwei;
	}
	
	/**
	 * 获取：期望职位
	 */
	public String getQiwangzhiwei() {
		return qiwangzhiwei;
	}
				
	
	/**
	 * 设置：薪资要求
	 */
	 
	public void setXinziyaoqiu(String xinziyaoqiu) {
		this.xinziyaoqiu = xinziyaoqiu;
	}
	
	/**
	 * 获取：薪资要求
	 */
	public String getXinziyaoqiu() {
		return xinziyaoqiu;
	}
				
	
	/**
	 * 设置：期望城市
	 */
	 
	public void setQiwangchengshi(String qiwangchengshi) {
		this.qiwangchengshi = qiwangchengshi;
	}
	
	/**
	 * 获取：期望城市
	 */
	public String getQiwangchengshi() {
		return qiwangchengshi;
	}
			
}
