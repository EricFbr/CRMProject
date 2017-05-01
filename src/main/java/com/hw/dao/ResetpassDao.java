package com.hw.dao;

import com.hw.entity.ResetPass;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ResetpassDao {

	public int reqResetPass(ResetPass resetPass);

	public List<ResetPass> querRestRequest();

	public int deleRestRequest(String username);

}