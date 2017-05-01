package com.hw.service.impl;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.ConsultRecordDao;
import com.hw.dao.CustomerDao;
import com.hw.dao.CustominfoDao;
import com.hw.entity.Customer;
import com.hw.service.CustomBiz;
@Service
public class CustomBizImpl implements CustomBiz {
	@Resource
	CustomerDao customerDao;
	@Resource
	CustominfoDao custominfoDao;
	@Resource
	ConsultRecordDao consultRecordDao;
	
	public int updateCustomStatus(int customStatus,int customId) {
		
		return customerDao.updateCustomStatus(customStatus,customId);
	}
	public List<Customer> queryAll() {
		
		return customerDao.queryAll();
	}
	public List<Customer> queryByCreateDate(Date createDate) {
		
		return customerDao.queryByCreateDate(createDate);
	}
	public List<Customer> queryByCustomStatus(int customStatus) {
		
		return customerDao.queryByCustomStatus(customStatus);
	}
	public List<Customer> queryByName(String name) {
		
		return customerDao.queryByName(name);
	}
	public List<Customer> queryByInviteName(String inviteName) {
		
		return customerDao.queryByInviteName(inviteName);
	}
	public List<Customer> queryByPhoneNo(String phoneNo) {
		
		return customerDao.queryByPhoneNo(phoneNo);
	}
	public int insertCustom(Customer customer) {
		
		return customerDao.insertCustom(customer);
	}
	@Transactional
	public int updateCustom(int id,String name,String education,String phoneNo,Integer qq,String email,Integer customStatus) {
		switch (customStatus) {
		case 0:
			customerDao.updateCustom(id, name, education, phoneNo, qq, email, customStatus);
			break;
		case 1:
			customerDao.updateCustom(id, name, education, phoneNo, qq, email, customStatus);
			break;
		case 2:
			customerDao.updateCustom(id, name, education, phoneNo, qq, email, customStatus);
			custominfoDao.updateWithCustom(id, 2);
			break;
		case 3:
			customerDao.updateCustom(id, name, education, phoneNo, qq, email, customStatus);
			consultRecordDao.updateRecord(1, id);
			break;
		case 4:
			customerDao.updateCustom(id, name, education, phoneNo, qq, email, customStatus);
			custominfoDao.updateWithCustom(id,4);
			consultRecordDao.updateRecord(3, id);
			break;
		case 5:
			customerDao.updateCustom(id, name, education, phoneNo, qq, email, customStatus);
			break;
		default:
			break;
		}
		return customerDao.updateCustom(id,name,education,phoneNo,qq,email,customStatus);
	}
	public List<Customer> exportCustom(int type) {
		if(type==1){
			return customerDao.exportCustomByWeek();
		}else if(type==2){
			return customerDao.exportCustomByMonth();
		}
		return null;
		
	}
	

}
