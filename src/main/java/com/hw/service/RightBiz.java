package com.hw.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hw.entity.Rights;

public interface RightBiz {
	
	public List<Rights> rightsSelect(int jobInfoId);
	
	public List<Rights> queryAllRights();
	
	public int insertRight(String rightName,int rightType,String url,int pId);
	
	public Rights queryBypId(int pId);
	
	public int updateRight(int rightType,String pId,String rid);
	
	public int deleteRight(int rid);

	public Rights queryByRightName(String rightNamer);
}
