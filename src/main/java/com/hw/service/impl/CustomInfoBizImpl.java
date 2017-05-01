package com.hw.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.CustomerDao;
import com.hw.dao.CustominfoDao;
import com.hw.dao.EmployeeDao;
import com.hw.entity.CustomInfo;
import com.hw.entity.CustomInfo2;
import com.hw.entity.Customer;
import com.hw.entity.Employee;
import com.hw.entity.JobInfo;
import com.hw.service.CustomInfoBiz;
import com.hw.utils.DateConvert;
@Service
public class CustomInfoBizImpl implements CustomInfoBiz {
	@Resource
	private CustominfoDao custominfoDao;
	@Resource
	private CustomerDao customerDao;
	@Resource
	private EmployeeDao employeeDao;
	public CustomInfo countInfoForDepart(int departmentId) {
		
		return custominfoDao.countInfoForDepart(departmentId);
	}

	public CustomInfo countInfo(int followManId) {
		
		return custominfoDao.countInfo(followManId);
	}

	public List<CustomInfo> todayData(int followManId) {
		
		return custominfoDao.todayData(followManId);
	}

	public List<CustomInfo> historyData(int followManId) {
		
		return custominfoDao.historyData(followManId);
	}

	public List<CustomInfo> planToday(int followManId) {
		
		return custominfoDao.planToday(followManId);
	}

	public List<CustomInfo> monthData(int followManId) {
		
		return custominfoDao.monthData(followManId);
	}

	public int addMark(String mark, int id) {
		
		return custominfoDao.addMark(mark,id);
	}
	@Transactional
	public int updateCustomInfo(int id, int status, Date planDate,int customId) {
		Date lastFollowDate = new DateConvert().dateConvert();
		switch (status) {
		case 0:
			custominfoDao.updateCustomInfo(customId, status, planDate, lastFollowDate);
			customerDao.updateCustomStatus(2, customId);
			return 1;
		case 1:
			custominfoDao.updateCustomInfo(customId, status, planDate, lastFollowDate);
			customerDao.updateCustomStatus(2, customId);
			return 1;
		case 2:
			custominfoDao.updateCustomInfo(customId, status, planDate, lastFollowDate);
			customerDao.updateCustomStatus(2, customId);
			return 1;
		case 3:
			custominfoDao.updateCustomInfo(customId, status, planDate, lastFollowDate);
			customerDao.updateCustomStatus(2, customId);
			return 1;
		case 4:
			custominfoDao.updateCustomInfo(customId, status, planDate, lastFollowDate);
			customerDao.updateCustomStatus(4, customId);
			return 1;
		case 5:
			custominfoDao.updateCustomInfo(customId, status, planDate, lastFollowDate);
			customerDao.updateCustomStatus(4, customId);
			return 1;
		default:
			return 0;
		}
	}

	public int updateWithCustom(int id, int status) {
		
		return custominfoDao.updateWithCustom(id,status);
	}

	public int allotToConsult(CustomInfo customInfo) {
		
		return custominfoDao.allotToConsult(customInfo);
	}

	public List<CustomInfo> exportCustom(int type) {
		if(type==1){
			return custominfoDao.exportCustomByWeek();
		}else if(type==2){
			return custominfoDao.exportCustomByMonth();
		}
		return null;
			
	}

	public List<CustomInfo2> exportCustomInfo(int type, int followManId) {
		if(type==1){
			return custominfoDao.exportCustomInfoByWeek(followManId);
		}else if(type==2){
			return custominfoDao.exportCustomInfoByMonth(followManId);
		}
		return null;
	}
	@Transactional
	public int allotCustom() {
		CustomInfo customInfo =new CustomInfo();		
		List<Customer> allCustomer = customerDao.queryAll();
		List<Employee> allEmployee = employeeDao.empForJobId(8);
		List<Integer> clist=new ArrayList<Integer>();
		List<Integer> elist=new ArrayList<Integer>();
		Date startDate = new DateConvert().dateConvert();
		customInfo.setStartDate(startDate);
		customInfo.setStatus(0);
		Random random =new Random();
		for(int i=0;i<allCustomer.size();i++){
			clist.add(allCustomer.get(i).getId());
		}
		for(int i=0;i<allEmployee.size();i++){
			elist.add(allEmployee.get(i).getId());
		}
		for(int i=0;i<clist.size();i++){
			int followManId=random.nextInt(elist.get(i));
			customInfo.setCustomId(clist.get(i));
			customInfo.setFollowManId(followManId);
			int allotCustom = custominfoDao.allotCustom(customInfo);
			int updateCustomStatus = customerDao.updateCustomStatus(2, clist.get(i));
			if(allotCustom>0&&updateCustomStatus>0){
				return 1;
			}
		}
			
		return 0;
	}

}
