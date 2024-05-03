package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GangweileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GangweileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GangweileixingView;


/**
 * 岗位类型
 *
 * @author 
 * @email 
 * @date 2021-03-18 22:50:34
 */
public interface GangweileixingService extends IService<GangweileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GangweileixingVO> selectListVO(Wrapper<GangweileixingEntity> wrapper);
   	
   	GangweileixingVO selectVO(@Param("ew") Wrapper<GangweileixingEntity> wrapper);
   	
   	List<GangweileixingView> selectListView(Wrapper<GangweileixingEntity> wrapper);
   	
   	GangweileixingView selectView(@Param("ew") Wrapper<GangweileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GangweileixingEntity> wrapper);
   	
}

