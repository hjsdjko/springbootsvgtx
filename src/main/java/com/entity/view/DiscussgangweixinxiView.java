package com.entity.view;

import com.entity.DiscussgangweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 岗位信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
@TableName("discussgangweixinxi")
public class DiscussgangweixinxiView  extends DiscussgangweixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgangweixinxiView(){
	}
 
 	public DiscussgangweixinxiView(DiscussgangweixinxiEntity discussgangweixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussgangweixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
