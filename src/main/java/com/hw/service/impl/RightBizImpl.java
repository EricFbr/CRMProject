package com.hw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.RightsDao;
import com.hw.entity.Rights;
import com.hw.service.RightBiz;
@Service
public class RightBizImpl implements RightBiz {
	@Resource
	RightsDao rightsDao;
	
	public List<Rights> rightsSelect(int jobInfoId) {
		
		return rightsDao.rightsSelect(jobInfoId);
	}
	
	public List<Rights> queryAllRights() {
		
		return rightsDao.queryAllRights();
	}
	
	public int insertRight(String rightName, int rightType, String url, int pId) {
		
		return rightsDao.insertRight(rightName, rightType, url, pId);
	}
	
	public Rights queryBypId(int pId) {
		
		return rightsDao.queryBypId(pId);
	}
	
	public int updateRight(int rightType, String pId, String rid) {
		
		return rightsDao.updateRight(rightType, pId, rid);
	}
	public int deleteRight(int rid) {
		
		return rightsDao.deleteRight(rid);
	}

	public Rights queryByRightName(String rightNamer) {
		
		return rightsDao.queryByRightName(rightNamer);
	}
	

}
