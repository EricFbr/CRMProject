package com.hw.dao;

import com.hw.entity.CustomInfo;
import com.hw.entity.CustomInfo2;
import com.hw.entity.JobInfo;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CustominfoDao {
	//
	public CustomInfo countInfoForDepart(int departmentId);
	//
	public CustomInfo countInfo(int followManId);
	//查询当天指定人的记录
	public List<CustomInfo> todayData(int followManId);
	//查看历史遗留
	public List<CustomInfo> historyData(int followManId);
	//查看计划联系在当天
	public List<CustomInfo> planToday(int followManId);
	//查看当月数据
	public List<CustomInfo> monthData(int followManId);
	//更改备注
	public int addMark(@Param("mark")String mark,@Param("id") int id);
	//更改客户信息状态
	public int updateCustomInfo(@Param("id")int id,@Param("status") int status,@Param("planDate")Date planDate,@Param("lastFollowDate")Date lastFollowDate);
	//更改客户状态同时更改客户信息状态
	public int updateWithCustom(@Param("id")int id,@Param("status") int status);
	//
	public int allotToConsult(CustomInfo customInfo);
	//导出本周客户表
	public List<CustomInfo> exportCustomByWeek();
	//导出本月客户表
	public List<CustomInfo> exportCustomByMonth();
	//导出本周客户信息表
	public List<CustomInfo2> exportCustomInfoByWeek(int followManId);
	//导出本月客户信息表
	public List<CustomInfo2> exportCustomInfoByMonth(int followManId);
	//添加新的客户信息
	public int allotCustom(CustomInfo customInfo);
}