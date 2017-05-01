package com.hw.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomInfo2 {
	private int id;

    private int customId;

    //客户姓名
    private String customName;
    //客户联系电话
    private String customPhoneNo;

    private String status;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startDate;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date lastFollowDate;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date planDate;

    private String mark;

	public CustomInfo2() {
		super();
	}

	public CustomInfo2(int customId, String customName, String customPhoneNo, String status, Date startDate,
			Date lastFollowDate, Date planDate, String mark) {
		super();
		this.customId = customId;
		this.customName = customName;
		this.customPhoneNo = customPhoneNo;
		this.status = status;
		this.startDate = startDate;
		this.lastFollowDate = lastFollowDate;
		this.planDate = planDate;
		this.mark = mark;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

	@Override
	public String toString() {
		return "CustomInfo2 [id=" + id + ", customId=" + customId + ", customName=" + customName + ", customPhoneNo="
				+ customPhoneNo + ", status=" + status + ", startDate=" + startDate + ", lastFollowDate="
				+ lastFollowDate + ", planDate=" + planDate + ", mark=" + mark + "]";
	}

	
    
}
