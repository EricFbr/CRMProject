package com.hw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.entity.JobRight;
import com.hw.entity.Rights;
import com.hw.service.JobInfoBiz;
import com.hw.service.JobRightBiz;
import com.hw.service.RightBiz;

@Controller
public class RightController {
	@Resource
	private RightBiz rb;
	@Resource
	private JobInfoBiz jib;
	@Resource
	private JobRightBiz jrb;
	@RequestMapping(value="queryAllRights",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<Rights> queryAllRights() {
		List<Rights> list = rb.queryAllRights();
		
		return list;	
	}
	@RequestMapping(value="insertRight",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String insertRight(String rightName,int pid) {
		//Rights rights = rb.queryBypId(pid);
		
		//String url = rights.getUrl();
		int insertRight = rb.insertRight(rightName, 2, "", pid);
		System.out.println(insertRight);
		if(insertRight>0){
			return "1";
		}
		return "0";		
	}
	@RequestMapping(value="updateRight",method={RequestMethod.POST,RequestMethod.GET})
	public void updateRight(int rightType, String pId, String rid) {
		int updateRight = rb.updateRight(rightType, pId, rid);
		
	}
	@RequestMapping(value="deleteRight",method={RequestMethod.POST,RequestMethod.GET})
	public void updateRight(int id) {
		int deleteRight = rb.deleteRight(id);
	}
	@RequestMapping(value="addRight",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String addRight(JobRight jobRight,String rightNamer,String jobName) {
		System.out.println(rightNamer+"!!!!!!!!!!!"+jobName);
		jobRight.setJobInfoId(jib.queryByJobName(jobName).getId());
		jobRight.setRightId(rb.queryByRightName(rightNamer).getRid());
		int addRight = jrb.addRight(jobRight);
		if(addRight>0){
		return "1";
		}
		return "0";
		
	}
}
