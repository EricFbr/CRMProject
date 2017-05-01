package com.hw.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ConsultRecord {
	
    private int id;

    private int customId;

    private int consultManId;

    private int consultStatus;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date consultDate;
   

    private String result;
    //紧跟 
    private int following;
    //已报名
    private int signed;
    //死单(死单时同时更新客户基础信息表状态)
    private int denied;
    //报名后退费
    private int refundment;
    //总数
    private int total;
    
    private String customName;
    
    private String customPhoneNo;
    
    private String newAllot;
    
	public ConsultRecord() {
		super();
	}

	public ConsultRecord(int customId, int consultManId, int consultStatus, Date consultDate, String result,
			int following, int signed, int denied, int refundment, int total) {
		super();
		this.customId = customId;
		this.consultManId = consultManId;
		this.consultStatus = consultStatus;
		this.consultDate = consultDate;
		this.result = result;
		this.following = following;
		this.signed = signed;
		this.denied = denied;
		this.refundment = refundment;
		this.total = total;
	}
	
	public String getNewAllot() {
		return newAllot;
	}

	public void setNewAllot(String newAllot) {
		this.newAllot = newAllot;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCustomId() {
		return customId;
	}

	public void setCustomId(int customId) {
		this.customId = customId;
	}

	public int getConsultManId() {
		return consultManId;
	}

	public void setConsultManId(int consultManId) {
		this.consultManId = consultManId;
	}

	public int getConsultStatus() {
		return consultStatus;
	}

	public void setConsultStatus(int consultStatus) {
		this.consultStatus = consultStatus;
	}

	public Date getConsultDate() {
		return consultDate;
	}

	public void setConsultDate(Date consultDate) {
		this.consultDate = consultDate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}

	public int getSigned() {
		return signed;
	}

	public void setSigned(int signed) {
		this.signed = signed;
	}

	public int getDenied() {
		return denied;
	}

	public void setDenied(int denied) {
		this.denied = denied;
	}

	public int getRefundment() {
		return refundment;
	}

	public void setRefundment(int refundment) {
		this.refundment = refundment;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ConsultRecord [id=" + id + ", customId=" + customId + ", consultManId=" + consultManId
				+ ", consultStatus=" + consultStatus + ", consultDate=" + consultDate + ", result=" + result
				+ ", following=" + following + ", signed=" + signed + ", denied=" + denied + ", refundment="
				+ refundment + ", total=" + total + "]";
	}
	
	

}