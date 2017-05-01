package com.hw.service.impl;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.dao.ConsultRecordDao;
import com.hw.dao.CustomerDao;
import com.hw.entity.ConsultRecord;
import com.hw.entity.ConsultRecord2;
import com.hw.entity.Customer;
import com.hw.service.ConsultRecordBiz;
import com.hw.utils.DateConvert;
@Service
public class ConsultRecordBizImpl implements ConsultRecordBiz  {
	@Resource
	ConsultRecordDao consultRecordDao;
	@Resource
	CustomerDao customerDao;
	
	public ConsultRecord countConsultForDepart(int departmentId) {
		
		return consultRecordDao.countConsultForDepart(departmentId);
	}

	public List<ConsultRecord> queryByCustomName(String customName, int consultManId) {
		
		return consultRecordDao.queryByCustomName(customName,consultManId);
	}

	public List<ConsultRecord> queryByPhone(String customPhoneNo, int consultManId) {
		
		return consultRecordDao.queryByPhone(customPhoneNo,consultManId);
	}

	public List<ConsultRecord> queryByPeriod(Date consultDate, Date endDate, int consultManId) {
		
		return consultRecordDao.queryByPeriod(consultDate,endDate,consultManId);
	}

	public List<ConsultRecord> queryMonthRecord(int consultManId) {
		
		return consultRecordDao.queryMonthRecord(consultManId);
	}

	public int addResult(String result, int id) {
		
		return consultRecordDao.addResult(result,id);
	}
	@Transactional
	public int updateRecord(int consultStatus, int id,int customId) {
		int updateRecord = consultRecordDao.updateRecord(consultStatus,id);
		//int i=1/0;
		switch (consultStatus) {
		case 0:
			int updateCustomStatus = customerDao.updateCustomStatus(0, customId);
			if(updateRecord>0&&updateCustomStatus>0){
				return 1;
			}
			return 0;
		case 1:
			int updateCustomStatus2 = customerDao.updateCustomStatus(3, customId);
			if(updateRecord>0&&updateCustomStatus2>0){
				return 1;
			}
			
			return 0;
		case 2:
			int updateCustomStatus3 = customerDao.updateCustomStatus(5, customId);
			if(updateRecord>0&&updateCustomStatus3>0){
				return 1;
			}
			
			return 0;
		case 3:
			int updateCustomStatus4 = customerDao.updateCustomStatus(4, customId);
			if(updateRecord>0&&updateCustomStatus4>0){
				return 1;
			}
			
			return 0;
		case 4:
			int updateCustomStatus5 = customerDao.updateCustomStatus(3, customId);
			if(updateRecord>0&&updateCustomStatus5>0){
				return 1;
			}		
			return 0;
		
		default:
			break;
		}
		
		
		return 0;
	}

	public ConsultRecord countConsult(int consultManId) {
		
		return consultRecordDao.countConsult(consultManId);
	}

	public List<ConsultRecord2> exportConsultRecord(int type, int consultManId) {
		if(type==1){
			return consultRecordDao.exportConsultRecordByWeek(consultManId);
		}else if(type==2){
			return consultRecordDao.exportCustomInfoByMonth(consultManId);
		}
		return null;
	}
	@Transactional
	public int allotToConsult(ConsultRecord consultRecord) {
		int flag=0;
		int customId = consultRecord.getCustomId();
		Date consultDate = new DateConvert().dateConvert();
		consultRecord.setConsultStatus(0);	
		consultRecord.setConsultDate(consultDate);
		int allotToConsult = consultRecordDao.allotToConsult(consultRecord);
		int updateCustomStatus = customerDao.updateCustomStatus(3, customId);
		if(allotToConsult>0&&updateCustomStatus>0){
			return flag=1;
		}
		return flag;
	}

}
