package com.hw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hw.entity.ConsultRecord;
import com.hw.entity.CustomInfo;
import com.hw.entity.JobInfo;
import com.hw.service.ConsultRecordBiz;
import com.hw.service.CustomInfoBiz;
import com.hw.service.JobInfoBiz;
import com.hw.utils.JasonConvert;

@Controller
public class CountController {
	@Resource
	private CustomInfoBiz cib;
	@Resource
	private ConsultRecordBiz crb;
	@RequestMapping(value="countInfo",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String countInfo(int followManId) throws JsonProcessingException {
		
		CustomInfo countInfo = cib.countInfo(followManId);
		String convert = new JasonConvert().convert(countInfo);
		
		return convert;
		
	}
	@RequestMapping(value="countConsult",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String countConsult(int consultManId) throws JsonProcessingException {
		ConsultRecord countConsult = crb.countConsult(consultManId);
		String convert = new JasonConvert().convert(countConsult);
		return convert;
		
	}
}
