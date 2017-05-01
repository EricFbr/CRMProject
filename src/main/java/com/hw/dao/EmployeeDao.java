package com.hw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.hw.entity.Employee;
@Repository
public interface EmployeeDao {	
	//登录查询用户
   public Employee login(@Param("username") String username,@Param("password") String password);
   //添加管理员
   public int addUser(Employee employee);
   //查看添加的用户名是否重复
   public Employee checkUsername(String username);
   //注销用户
   public int cancleUser(String username);
   //修改密码
   public int resetPass(@Param("password") String password,@Param("username")String username);
   //查询所有员工
   public List<Employee> allEmployees();
   //部门主管查看部门员工ID
   public List<Employee> empForDepart(@Param("departmentId")int departmentId,@Param("id") int managerId);
   //根据jobinfo查询子部门员工
   public List<Employee> empForJobId(int jobInfoId);
   //查询所有咨询师
   public List<Employee> queryConsulters();
   
}