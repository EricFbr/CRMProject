package com.hw.dao;

import com.hw.entity.JobRight;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface JobrightDao {

	public int addRight(JobRight jobRight);

}