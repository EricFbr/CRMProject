package com.hw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hw.dao.JobinfoDao;
import com.hw.entity.JobInfo;
import com.hw.service.JobInfoBiz;
@Service
public class JobInfoBizImpl implements JobInfoBiz {
	@Resource
	JobinfoDao jobinfoDao;
	public List<JobInfo> getJobByDid(int departmentId) {
		
		return jobinfoDao.getJobByDid(departmentId);
	}
	public List<JobInfo> queryAllJobs() {
		
		return jobinfoDao.queryAllJobs();
	}
	public int insertJob(JobInfo jobInfo) {
		
		return jobinfoDao.insertJob(jobInfo);
	}
	public int updateJob(JobInfo jobInfo) {
		
		return jobinfoDao.updateJob(jobInfo);
	}
	public int deleteJob(int id) {
		
		return jobinfoDao.deleteJob(id);
	}
	public JobInfo queryByJobName(String jobName) {
		
		return jobinfoDao.queryByJobName(jobName);
	}
	

}
