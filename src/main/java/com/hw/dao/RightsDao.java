package com.hw.dao;

import com.hw.entity.Rights;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface RightsDao {
	//鏍规嵁鐧诲綍鍛樺伐鏌ヨ鏉冮檺
	public List<Rights> rightsSelect(int jobInfoId);
	//鏌ヨ鎵�鏈夋潈闄�
	public List<Rights> queryAllRights();
	//娣诲姞鏉冮檺
	public int insertRight(@Param("rightName") String rightName,@Param("rightType")int rightType,@Param("url") String url,@Param("pId")int pId);
	//鏍规嵁pId鏌ヨURL
	public Rights queryBypId(int pId);
	//鏇存敼鏉冮檺
	public int updateRight(@Param("rightType") int rightType,@Param("pId")String pId,@Param("rid") String rid);
	//鍒犻櫎鏉冮檺
	public int deleteRight(int rid);
	
	public Rights queryByRightName(String rightNamer);
}