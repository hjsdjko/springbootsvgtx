package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YingpinzhuangkuangDao;
import com.entity.YingpinzhuangkuangEntity;
import com.service.YingpinzhuangkuangService;
import com.entity.vo.YingpinzhuangkuangVO;
import com.entity.view.YingpinzhuangkuangView;

@Service("yingpinzhuangkuangService")
public class YingpinzhuangkuangServiceImpl extends ServiceImpl<YingpinzhuangkuangDao, YingpinzhuangkuangEntity> implements YingpinzhuangkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingpinzhuangkuangEntity> page = this.selectPage(
                new Query<YingpinzhuangkuangEntity>(params).getPage(),
                new EntityWrapper<YingpinzhuangkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingpinzhuangkuangEntity> wrapper) {
		  Page<YingpinzhuangkuangView> page =new Query<YingpinzhuangkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YingpinzhuangkuangVO> selectListVO(Wrapper<YingpinzhuangkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingpinzhuangkuangVO selectVO(Wrapper<YingpinzhuangkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingpinzhuangkuangView> selectListView(Wrapper<YingpinzhuangkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingpinzhuangkuangView selectView(Wrapper<YingpinzhuangkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
