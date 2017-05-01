package com.hw.controller;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.entity.ConsultRecord;
import com.hw.service.ConsultRecordBiz;

@Controller
public class CustomConsultController {
	@Resource
	 private ConsultRecordBiz crb;	

	@RequestMapping(value="queryRecord",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<ConsultRecord> queryRecord(Date consultDate, Date endDate, int consultManId, String customName, String customPhoneNo ) {
		if(customName!=null){
			return crb.queryByCustomName(customName,consultManId);
		}else if(customPhoneNo!=null){
			return crb.queryByPhone(customPhoneNo,consultManId);
		}else if(consultDate!=null&&endDate!=null){
			return crb.queryByPeriod(consultDate,endDate,consultManId);
		}else {
			return crb.queryMonthRecord(consultManId);
		}		
	}
	@RequestMapping(value="addResult",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String addResult(String result, int id) {
		int addResult = crb.addResult(result,id);
		if(addResult>0){
			return "1";
		}
		return "0";		
	}
	@RequestMapping(value="updateRecord",method={RequestMethod.POST,RequestMethod.GET})
	public void updateRecord(Integer consultStatus, Integer id,Integer customId) {
		
		int updateRecord = crb.updateRecord(consultStatus, id, customId);
		
	}
}
