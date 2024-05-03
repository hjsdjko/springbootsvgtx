package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpinzhuangkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YingpinzhuangkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpinzhuangkuangView;


/**
 * 应聘状况
 *
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
public interface YingpinzhuangkuangService extends IService<YingpinzhuangkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YingpinzhuangkuangVO> selectListVO(Wrapper<YingpinzhuangkuangEntity> wrapper);
   	
   	YingpinzhuangkuangVO selectVO(@Param("ew") Wrapper<YingpinzhuangkuangEntity> wrapper);
   	
   	List<YingpinzhuangkuangView> selectListView(Wrapper<YingpinzhuangkuangEntity> wrapper);
   	
   	YingpinzhuangkuangView selectView(@Param("ew") Wrapper<YingpinzhuangkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YingpinzhuangkuangEntity> wrapper);
   	
}

