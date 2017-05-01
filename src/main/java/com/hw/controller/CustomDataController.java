package com.hw.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hw.entity.ConsultRecord;
import com.hw.entity.CustomInfo;
import com.hw.entity.Customer;
import com.hw.entity.Employee;
import com.hw.service.ConsultRecordBiz;
import com.hw.service.CustomBiz;
import com.hw.service.CustomInfoBiz;
import com.hw.service.EmployeeBiz;
import com.hw.utils.DateConvert;
import com.hw.utils.ExcelUtils;


@Controller
public class CustomDataController {
	@Resource
	private CustomBiz cb;
	@Resource
	private CustomInfoBiz cib;
	@Resource
	private EmployeeBiz eb;
	@Resource
	private ConsultRecordBiz crb;
	@RequestMapping(value="queryCustom",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Customer> queryCustom(Date createDate,Integer customStatus,String name,String inviteName,String phoneNo) {
	
		if(createDate!=null){
			return cb.queryByCreateDate(createDate);
		}else if(customStatus!=null){	
			return cb.queryByCustomStatus(customStatus);
		}else if(name!=null){
			return cb.queryByName(name);
		}else if(inviteName!=null){
			return cb.queryByInviteName(inviteName);
		}else if(phoneNo!=null){
			return cb.queryByPhoneNo(phoneNo);
		}else {
			return cb.queryAll();
		}
		
	}
	@RequestMapping(value="insertCustom",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String insertCustom(Customer customer) {
		Date createDate = new DateConvert().dateConvert();
		
		customer.setCreateDate(createDate);
		int insertCustom = cb.insertCustom(customer);
		if(insertCustom>0){
			return "1";
		}
		return "0";
		
	}
	@RequestMapping(value="updateCustom",method={RequestMethod.POST,RequestMethod.GET})
	public void updateCustom(int id,String name,String education,String phoneNo,Integer qq,String email,Integer customStatus) {
		
		int updateCustom = cb.updateCustom(id,name,education,phoneNo,qq,email,customStatus);
		
	}
	
	@RequestMapping(value="queryConsulters",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Employee> queryConsulters() {
		List<Employee> queryConsulters = eb.queryConsulters();
		return queryConsulters;
		
	}
	
	@RequestMapping(value="allotToConsult",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody	
	public String allotToConsult(ConsultRecord consultRecord) {
			
		int allotToConsult = crb.allotToConsult(consultRecord);
		
		if(allotToConsult>0){
			return "1";
		}
		return "0";
	}
	@RequestMapping(value="batchImportCustom",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public int batchImportCustom(MultipartFile file, HttpServletRequest request)
			throws IllegalStateException, IOException {
		String savePath = request.getSession().getServletContext().getRealPath("/");
		String fileName = file.getOriginalFilename();
		String newFileName = savePath + fileName;
		OutputStream os = new FileOutputStream(fileName);
		File newFile = new File(newFileName);
		file.transferTo(newFile);
		//System.out.println(newFileName);

		List<Customer> list = ExcelUtils.readExcel(newFileName, "com.hw.entity.Customer");
		int count = 0;
		for (Customer customer : list) {
			
				count += cb.insertCustom(customer);
			
		}
		return count;
	}
	@RequestMapping(value="allotCustom",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String allotCustom() {
		int allotCustom = cib.allotCustom();
		if(allotCustom>0){
			return "1";
		}
		return "0";
		
	}
}
