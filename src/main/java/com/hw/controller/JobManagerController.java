package com.hw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.entity.JobInfo;
import com.hw.service.JobInfoBiz;
@Controller
public class JobManagerController {
	@Resource
	private JobInfoBiz jib;
	@RequestMapping(value="queryAllJobs",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public List<JobInfo> queryAllJobs() {
		List<JobInfo> queryAllJobs = jib.queryAllJobs();
		return queryAllJobs;
		
	}
	@RequestMapping(value="insertJob",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public String insertJob(JobInfo jobInfo) {
		int insertJob = jib.insertJob(jobInfo);
		if(insertJob>0){
			return "1";
		}
		return "0";
		
	}
	@RequestMapping(value="updateJob",method={RequestMethod.POST,RequestMethod.GET})
	public void updateJob(JobInfo jobInfo) {
		int updateJob = jib.updateJob(jobInfo);
	}
	@RequestMapping(value="deleteJob",method={RequestMethod.POST,RequestMethod.GET})
	public void deleteJob(int id) {
		int deleteJob = jib.deleteJob(id);
	}
}
