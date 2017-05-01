package com.hw.service;

import java.util.List;

import com.hw.entity.ResetPass;

public interface ReqResetPassBiz {
	
	public int reqResetPass(ResetPass resetPass);

	public List<ResetPass> querRestRequest();

	public int deleRestRequest(String username);
	
}
