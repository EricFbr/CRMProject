package com.hw.dao;

import com.hw.entity.ConsultRecord;
import com.hw.entity.ConsultRecord2;

import java.sql.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface ConsultRecordDao {

	public ConsultRecord countConsultForDepart(int departmentId);

	public List<ConsultRecord> queryByCustomName(@Param("customName")String customName,@Param("consultManId") int consultManId);

	public List<ConsultRecord> queryByPhone(@Param("customPhoneNo")String customPhoneNo,@Param("consultManId") int consultManId);

	public List<ConsultRecord> queryByPeriod(@Param("consultDate")Date consultDate,@Param("endDate") Date endDate,@Param("consultManId") int consultManId);

	public List<ConsultRecord> queryMonthRecord(int consultManId);

	public int addResult(@Param("result")String result,@Param("id") int id);

	public int updateRecord(@Param("consultStatus")int consultStatus,@Param("id") int id);

	public ConsultRecord countConsult(int consultManId);
	//查看每周客户咨询信息
	public List<ConsultRecord2> exportConsultRecordByWeek(int consultManId);
	//查看每月客户咨询信息
	public List<ConsultRecord2> exportCustomInfoByMonth(int consultManId);
	//销售助理分配客户给咨询
	public int allotToConsult(ConsultRecord consultRecord);

}