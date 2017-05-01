package com.hw.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;



public class CustomInfo {
    private int id;

    private int customId;

    private int followManId;

    private int status;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date lastFollowDate;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date planDate;

    private String mark;
    //已上门客户数
    private int visited;
    //未接通客户数
    private int disConnect;
    //死单客户数
    private int denied;
    //紧跟客户数
    private int following;
    //总分配客户数
    private int total;
    //电话无效
    private int invalid;
    //新增未联系
    private int newAllot;
    //客户姓名
    private String customName;
    //客户联系电话
    private String customPhoneNo;
    
    private int consultManId;
	public CustomInfo() {
		super();
	}


	public CustomInfo(int customId, int followManId, int status, Date startDate, Date lastFollowDate, Date planDate,
			String mark, String customPhoneNo) {
		super();
		this.customId = customId;
		this.followManId = followManId;
		this.status = status;
		this.startDate = startDate;
		this.lastFollowDate = lastFollowDate;
		this.planDate = planDate;
		this.mark = mark;
		this.customPhoneNo = customPhoneNo;
	}
	

	public int getConsultManId() {
		return consultManId;
	}


	public void setConsultManId(int consultManId) {
		this.consultManId = consultManId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCustomId() {
		return customId;
	}


	public void setCustomId(int customId) {
		this.customId = customId;
	}


	public int getFollowManId() {
		return followManId;
	}


	public void setFollowManId(int followManId) {
		this.followManId = followManId;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getLastFollowDate() {
		return lastFollowDate;
	}


	public void setLastFollowDate(Date lastFollowDate) {
		this.lastFollowDate = lastFollowDate;
	}


	public Date getPlanDate() {
		return planDate;
	}


	public void setPlanDate(Date planDate) {
		this.planDate = planDate;
	}


	public String getMark() {
		return mark;
	}


	public void setMark(String mark) {
		this.mark = mark;
	}


	public int getVisited() {
		return visited;
	}


	public void setVisited(int visited) {
		this.visited = visited;
	}


	public int getDisConnect() {
		return disConnect;
	}


	public void setDisConnect(int disConnect) {
		this.disConnect = disConnect;
	}


	public int getDenied() {
		return denied;
	}


	public void setDenied(int denied) {
		this.denied = denied;
	}


	public int getFollowing() {
		return following;
	}


	public void setFollowing(int following) {
		this.following = following;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public int getInvalid() {
		return invalid;
	}


	public void setInvalid(int invalid) {
		this.invalid = invalid;
	}


	public int getNewAllot() {
		return newAllot;
	}


	public void setNewAllot(int newAllot) {
		this.newAllot = newAllot;
	}


	public String getCustomName() {
		return customName;
	}


	public void setCustomName(String customName) {
		this.customName = customName;
	}


	public String getCustomPhoneNo() {
		return customPhoneNo;
	}


	public void setCustomPhoneNo(String customPhoneNo) {
		this.customPhoneNo = customPhoneNo;
	}


	@Override
	public String toString() {
		return "CustomInfo [id=" + id + ", customId=" + customId + ", followManId=" + followManId + ", status=" + status
				+ ", startDate=" + startDate + ", lastFollowDate=" + lastFollowDate + ", planDate=" + planDate
				+ ", mark=" + mark + ", visited=" + visited + ", disConnect=" + disConnect + ", denied=" + denied
				+ ", following=" + following + ", total=" + total + ", invalid=" + invalid + ", newAllot=" + newAllot
				+ ", customName=" + customName + ", customPhoneNo=" + customPhoneNo + "]";
	}

	

	

	
}