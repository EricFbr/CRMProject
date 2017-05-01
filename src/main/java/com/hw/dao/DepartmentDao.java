package com.hw.dao;

import com.hw.entity.Department;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface DepartmentDao {

	public List<Department> getDepartment();
    
}