package com.hw.dao;

import com.hw.entity.JobInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface JobinfoDao {
	//鏍规嵁閮ㄩ棬鏌ヨ亴浣�
	public List<JobInfo> getJobByDid(int departmentId);
	//鏌ヨ鍏ㄩ儴鑱屼綅
	public List<JobInfo> queryAllJobs();
	//娣诲姞鑱屼綅
	public int insertJob(JobInfo jobInfo);
	//鏇存敼鑱屼綅
	public int updateJob(JobInfo jobInfo);
	//鍒犻櫎鑱屼綅
	public int deleteJob(int id);
	//
	public JobInfo queryByJobName(String jobName);

	
    
}