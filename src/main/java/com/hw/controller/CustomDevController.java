package com.hw.controller;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.entity.CustomInfo;
import com.hw.entity.Employee;
import com.hw.service.CustomBiz;
import com.hw.service.CustomInfoBiz;
import com.hw.service.EmployeeBiz;

@Controller
public class CustomDevController {
	@Resource
	private EmployeeBiz ebi;
	@Resource
	private CustomInfoBiz cib;
	@Resource
	private CustomBiz cb;
	@RequestMapping(value="empForJobId",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Employee> empForJobId(int jobInfoId) {
		List<Employee> empForJobId = ebi.empForJobId(jobInfoId);
		
		return empForJobId;
		
	}
	@RequestMapping(value="customInfo",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<CustomInfo> customInfo(int src,int followManId) {
		//Integer value = Integer.valueOf(src);
		switch (src) {
		case 0:			
			return cib.todayData(followManId);
		case 1:
			return cib.historyData(followManId);
		case 2:
			return cib.planToday(followManId);
		case 3:
			return cib.monthData(followManId);
		default:
			break;
		}		
		return null;
		
	}
	@RequestMapping(value="addMark",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String addMark(String mark, int id) {
		
		int addMark = cib.addMark(mark,id);
		
		
		if(addMark>0){
			return "1";
		}
		return "0";		
	}
	@RequestMapping(value="updateCustomInfo",method={RequestMethod.POST,RequestMethod.GET})
	public void updateCustomInfo(int id,int status,Date planDate,int customId) {
		
		int updateCustomInfo = cib.updateCustomInfo(id, status, planDate, customId);
		
	}
}
