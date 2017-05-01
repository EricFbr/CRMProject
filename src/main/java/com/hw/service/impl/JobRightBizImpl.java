package com.hw.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hw.dao.JobrightDao;
import com.hw.entity.JobRight;
import com.hw.service.JobRightBiz;
@Service
public class JobRightBizImpl implements JobRightBiz {
	@Resource
	JobrightDao jobrightDao;
	public int addRight(JobRight jobRight) {
		
		return jobrightDao.addRight(jobRight);
	}

}
