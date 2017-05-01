package com.hw.service;

import java.sql.Date;
import java.util.List;

import com.hw.entity.ConsultRecord;
import com.hw.entity.ConsultRecord2;
import com.hw.entity.Customer;

public interface ConsultRecordBiz {
	
	public ConsultRecord countConsultForDepart(int departmentId);

	public List<ConsultRecord> queryByCustomName(String customName, int consultManId);

	public List<ConsultRecord> queryByPhone(String customPhoneNo, int consultManId);

	public List<ConsultRecord> queryByPeriod(Date consultDate, Date endDate, int consultManId);

	public List<ConsultRecord> queryMonthRecord(int consultManId);

	public int addResult(String result, int id);
	
	public int updateRecord(int consultStatus, int id,int customId);

	public ConsultRecord countConsult(int consultManId);
	//查询每周或每月客户咨询记录
	public List<ConsultRecord2> exportConsultRecord(int type, int consultManId);

	public int allotToConsult(ConsultRecord consultRecord);
}
