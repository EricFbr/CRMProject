package com.hw.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hw.entity.ConsultRecord;
import com.hw.entity.ConsultRecord2;
import com.hw.entity.CustomInfo;
import com.hw.entity.CustomInfo2;
import com.hw.entity.Customer;
import com.hw.entity.Employee;
import com.hw.service.ConsultRecordBiz;
import com.hw.service.CustomBiz;
import com.hw.service.CustomInfoBiz;
import com.hw.service.EmployeeBiz;
import com.hw.utils.ExcelUtils;
import com.hw.utils.JasonConvert;

@Controller
public class ReportController {
	@Resource
	private CustomInfoBiz cib;
	@Resource
	private EmployeeBiz eb;
	@Resource
	private CustomBiz cb;
	@Resource
	private ConsultRecordBiz crb;
	@RequestMapping(value="countInfoForDepart",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String countInfoForDepart(int departmentId) throws JsonProcessingException {
		
		CustomInfo countInfoForDepart = cib.countInfoForDepart(departmentId);
		String convert = new JasonConvert().convert(countInfoForDepart);
		
		
		return convert;	
	}
	@RequestMapping(value="allEmployees",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Employee> allEmployees() {
		List<Employee> allEmployees = eb.allEmployees();
		return allEmployees;
	}
	@RequestMapping(value="countConsultForDepart",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String countConsultForDepart(int departmentId) throws JsonProcessingException {
		ConsultRecord countConsultForDepart = crb.countConsultForDepart(departmentId);		
		String convert = new JasonConvert().convert(countConsultForDepart);	
		return convert;
		
	}
	@RequestMapping(value="exportCustom",method={RequestMethod.POST,RequestMethod.GET})
	public void exportCustom(int type,HttpServletResponse response) {
		List<Customer> exportCustom = cb.exportCustom(type);
		ExcelUtils excelUtils=new ExcelUtils();
		String[] columns= {"id","name","education","phoneNo","qq","email","customStatus","createDate","inviteName"};
		
		if(type==1){
			excelUtils.exportToExcel(response, exportCustom, null, "本周客户", columns, "本周客户报表");
		}else if(type==2) {
			excelUtils.exportToExcel(response, exportCustom, null, "本月客户", columns, "本月客户报表");
		}
	
		
	}
	@RequestMapping(value="exportCustomInfo",method={RequestMethod.POST,RequestMethod.GET})
	public void exportCustomInfo(int type,int followManId,HttpServletResponse response) {
		List<CustomInfo2> exportCustomInfo = cib.exportCustomInfo(type,followManId);
		ExcelUtils excelUtils=new ExcelUtils();
		String[] columns= {"id","customId","customName","customPhoneNo","status","startDate","planDate","lastFollowDate","mark"};
		if(type==1){
			excelUtils.exportToExcel(response, exportCustomInfo, null, "本周客户信息", columns, "本周客户信息报表");
		}else if(type==2) {
			excelUtils.exportToExcel(response, exportCustomInfo, null, "本月客户信息", columns, "本月客户信息报表");
		}
	}
	@RequestMapping(value="exportConsultRecord",method={RequestMethod.POST,RequestMethod.GET})
	public void exportConsultRecord(int type,int consultManId,HttpServletResponse response) {
		List<ConsultRecord2> exportConsultRecord = crb.exportConsultRecord(type,consultManId);
		ExcelUtils excelUtils=new ExcelUtils();
		String[] columns= {"id","customId","customName","customPhoneNo","consultStatus","consultDate","result"};
		if(type==1){
			excelUtils.exportToExcel(response, exportConsultRecord, null, "本周客户咨询信息", columns, "本周客户咨询信息报表");
		}else if(type==2) {
			excelUtils.exportToExcel(response, exportConsultRecord, null, "本月客户咨询信息", columns, "本月客户咨询信息报表");
		}
	}
}
