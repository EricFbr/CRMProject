package com.hw.service;

import java.sql.Date;
import java.util.List;

import com.hw.entity.CustomInfo;
import com.hw.entity.CustomInfo2;
import com.hw.entity.JobInfo;

public interface CustomInfoBiz {
	//根据部门ID查询
	public CustomInfo countInfoForDepart(int departmentId);
	//根据指定跟随员工不同状态
	public CustomInfo countInfo(int followManId);	
	//
	public List<CustomInfo> todayData(int followManId);
	//
	public List<CustomInfo> historyData(int followManId);
	//
	public List<CustomInfo> planToday(int followManId);
	//
	public List<CustomInfo> monthData(int followManId);
	//
	public int addMark(String mark, int id);
	//
	public int updateCustomInfo(int id, int status, Date planDate,int customId);
	//更新同时更新客户表
	public int updateWithCustom(int id, int status);
	//
	public int allotToConsult(CustomInfo customInfo);
	//导出本月或者本周客户信息数据
	public List<CustomInfo2> exportCustomInfo(int type,int followManId);
	//把顾客随机分配给销售
	public int allotCustom();
}
