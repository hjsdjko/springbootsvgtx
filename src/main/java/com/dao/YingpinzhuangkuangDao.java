package com.dao;

import com.entity.YingpinzhuangkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingpinzhuangkuangVO;
import com.entity.view.YingpinzhuangkuangView;


/**
 * 应聘状况
 * 
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
public interface YingpinzhuangkuangDao extends BaseMapper<YingpinzhuangkuangEntity> {
	
	List<YingpinzhuangkuangVO> selectListVO(@Param("ew") Wrapper<YingpinzhuangkuangEntity> wrapper);
	
	YingpinzhuangkuangVO selectVO(@Param("ew") Wrapper<YingpinzhuangkuangEntity> wrapper);
	
	List<YingpinzhuangkuangView> selectListView(@Param("ew") Wrapper<YingpinzhuangkuangEntity> wrapper);

	List<YingpinzhuangkuangView> selectListView(Pagination page,@Param("ew") Wrapper<YingpinzhuangkuangEntity> wrapper);
	
	YingpinzhuangkuangView selectView(@Param("ew") Wrapper<YingpinzhuangkuangEntity> wrapper);
	
}
