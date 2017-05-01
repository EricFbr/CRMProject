package com.hw.dao;

import com.hw.entity.Customer;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CustomerDao {
	//更改customInfo同时更改客户状态
	public int updateCustomStatus(@Param("customStatus")int customStatus,@Param("customId")int customId);
	//查询全部客户
	public List<Customer> queryAll();
	//按照添加时间
	public List<Customer> queryByCreateDate(Date createDate);
	//客户状态
	public List<Customer> queryByCustomStatus(int customStatus);
	//客户姓名
	public List<Customer> queryByName(String name);
	//邀请人姓名
	public List<Customer> queryByInviteName(String inviteName);
	//电话
	public List<Customer> queryByPhoneNo(String phoneNo);
	//添加客户
	public int insertCustom(Customer customer);
	//更改客户信息
	public int updateCustom(@Param("id")int id,@Param("name")String name,@Param("education")String education,@Param("phoneNo")String phoneNo,@Param("qq")Integer qq,@Param("email")String email,@Param("customStatus")Integer customStatus);
	//导出本周用户信息
	public List<Customer> exportCustomByWeek();
	//导出本月用户信息
	public List<Customer> exportCustomByMonth();
    
}