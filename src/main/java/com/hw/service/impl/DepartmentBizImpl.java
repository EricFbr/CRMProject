package com.hw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hw.dao.DepartmentDao;
import com.hw.entity.Department;
import com.hw.service.DepartmentBiz;
@Service
public class DepartmentBizImpl implements DepartmentBiz {
	@Resource
	DepartmentDao departmentDao;
	
	public List<Department> getDepartment() {
		
		return departmentDao.getDepartment();
	}

}
