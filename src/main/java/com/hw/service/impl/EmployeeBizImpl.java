package com.hw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.EmployeeDao;
import com.hw.entity.Employee;
import com.hw.service.EmployeeBiz;
@Service
public class EmployeeBizImpl implements EmployeeBiz {
	@Resource
	EmployeeDao employeeDao;	
	
	public Employee login(String username, String password) {
		
		return employeeDao.login(username, password);
	}
	public int addUser(Employee employee) {
		
		return employeeDao.addUser(employee);
	}
	public Employee checkUsername(String username) {
		
		return employeeDao.checkUsername(username);
	}
	public int cancleUser(String username) {
		
		return employeeDao.cancleUser(username);
	}
	public int resetPass(String password, String username) {
		
		return employeeDao.resetPass(password,username);
	}
	public List<Employee> allEmployees() {
		
		return employeeDao.allEmployees();
	}
	public List<Employee> empForDepart(int departmentId, int managerId) {
		
		return employeeDao.empForDepart(departmentId, managerId);
	}
	public List<Employee> empForJobId(int jobInfoId) {
		
		return employeeDao.empForJobId(jobInfoId);
	}
	public List<Employee> queryConsulters() {
		
		return employeeDao.queryConsulters();
	}

}
