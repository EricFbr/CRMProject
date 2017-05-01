package com.hw.service;

import java.util.List;

import com.hw.entity.JobInfo;

public interface JobInfoBiz {
	

	public List<JobInfo> getJobByDid(int departmentId);

	public List<JobInfo> queryAllJobs();

	public int insertJob(JobInfo jobInfo);

	public int updateJob(JobInfo jobInfo);

	public int deleteJob(int id);

	public JobInfo queryByJobName(String jobName);
}
