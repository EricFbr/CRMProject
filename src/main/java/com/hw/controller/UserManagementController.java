package com.hw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.entity.Department;
import com.hw.entity.Employee;
import com.hw.entity.JobInfo;
import com.hw.service.DepartmentBiz;
import com.hw.service.EmployeeBiz;
import com.hw.service.JobInfoBiz;
import com.hw.service.ReqResetPassBiz;

@Controller
public class UserManagementController {
	@Resource
	private EmployeeBiz eBiz;
	@Resource
	private DepartmentBiz dBiz;
	@Resource
	private JobInfoBiz jib;
	@Resource
	private ReqResetPassBiz rpb;
	@RequestMapping(value="addUser",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String addUser(Employee employee) {
		employee.setJobInfoId(2);
		employee.setDepartmentId(1);
		employee.setPassword("123456");
		employee.setNickname("admin");
		employee.setWorkStatus("1");
		int addUser = eBiz.addUser(employee);
		if(addUser>0){
			return "1";	
		}
		return "0";	
	}
	@RequestMapping(value="checkUsername",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public boolean checkUsername(String username) {
		Employee employee = eBiz.checkUsername(username);
		if(employee!=null){
			return false;
		}
		return true;		
	}
	@RequestMapping(value="cancleUser",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String cancleUser(String username) {
		int cancleUser = eBiz.cancleUser(username);
		if(cancleUser>0){
			return "1";
		}
		return "0";	
	}
	@RequestMapping(value="getDepartment",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Department> getDepartment() {
		List<Department> department = dBiz.getDepartment();
		return department;
	}
	@RequestMapping(value="getJobByDid",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<JobInfo> getJobByDid(int departmentId) {
		List<JobInfo> jobInfos = jib.getJobByDid(departmentId);
		return jobInfos;	
	}
	@RequestMapping(value="resetPass",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String resetPass(String username) {
		int resetPass = eBiz.resetPass("123456",username);
		int deleRestRequest = rpb.deleRestRequest(username);
		if(resetPass>0 && deleRestRequest>0){
			return "1";
		}
		return "0";		
	}
}
