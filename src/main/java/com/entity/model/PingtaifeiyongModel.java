package com.entity.model;

import com.entity.PingtaifeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 平台费用
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
public class PingtaifeiyongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
