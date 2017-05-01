package com.hw.service;

import java.util.List;

import com.hw.entity.Employee;

public interface EmployeeBiz {
	
	public Employee login(String username,String password);

	public int addUser(Employee employee);

	public Employee checkUsername(String username);

	public int cancleUser(String username);

	public int resetPass(String password,String username);

	public List<Employee> allEmployees();

	public List<Employee> empForDepart(int departmentId, int managerId);
	//根据jobinfo查询子部门员工
	public List<Employee> empForJobId(int jobInfoId);

	public List<Employee> queryConsulters();
	
}
