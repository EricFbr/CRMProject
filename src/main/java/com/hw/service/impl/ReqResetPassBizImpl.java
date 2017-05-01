package com.hw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hw.dao.ResetpassDao;
import com.hw.entity.ResetPass;
import com.hw.service.ReqResetPassBiz;
@Service
public class ReqResetPassBizImpl implements ReqResetPassBiz {
	@Resource
	private ResetpassDao resetpassDao;
	
	public int reqResetPass(ResetPass resetPass) {
		
		return resetpassDao.reqResetPass(resetPass);
	}
	public List<ResetPass> querRestRequest() {
		
		return resetpassDao.querRestRequest();
	}
	public int deleRestRequest(String username) {
		
		return resetpassDao.deleRestRequest(username);
	}

}
