package com.hw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.entity.Employee;
import com.hw.service.EmployeeBiz;

@Controller
public class DepartmentController {
	@Resource
	private EmployeeBiz ebi;
	
	@RequestMapping(value="empForDepart",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Employee> empForDepart(Integer departmentId, Integer managerId) {
		
		List<Employee> empForDepart = ebi.empForDepart(departmentId, managerId);
		
		return empForDepart;
		
	}
}
