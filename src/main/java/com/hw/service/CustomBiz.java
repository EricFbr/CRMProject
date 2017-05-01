package com.hw.service;

import java.sql.Date;
import java.util.List;

import com.hw.entity.Customer;

public interface CustomBiz {
	public int updateCustomStatus(int customStatus,int customId);

	public List<Customer> queryAll();

	public List<Customer> queryByCreateDate(Date createDate);

	public List<Customer> queryByCustomStatus(int customStatus);

	public List<Customer> queryByName(String name);

	public List<Customer> queryByInviteName(String inviteName);

	public List<Customer> queryByPhoneNo(String phoneNo);

	public int insertCustom(Customer customer);

	public int updateCustom(int id,String name,String education,String phoneNo,Integer qq,String email,Integer customStatus);

	public List<Customer> exportCustom(int type);

	
	
}
