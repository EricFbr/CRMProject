package com.hw.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Customer2 {
	private int id;

    private String name;

    private String education;

    private String  phoneNo;

    private int qq;

    private String email;

    private String customStatus;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date createDate;

    private String inviteName;
    
    

	public Customer2() {
		super();
	}
	
	public Customer2(String name, String education, String phoneNo, int qq, String email, String customStatus,
			Date createDate, String inviteName) {
		super();
		this.name = name;
		this.education = education;
		this.phoneNo = phoneNo;
		this.qq = qq;
		this.email = email;
		this.customStatus = customStatus;
		this.createDate = createDate;
		this.inviteName = inviteName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getQq() {
		return qq;
	}

	public void setQq(int qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustomStatus() {
		return customStatus;
	}

	public void setCustomStatus(String customStatus) {
		this.customStatus = customStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getInviteName() {
		return inviteName;
	}

	public void setInviteName(String inviteName) {
		this.inviteName = inviteName;
	}

	@Override
	public String toString() {
		return "Customer2 [id=" + id + ", name=" + name + ", education=" + education + ", phoneNo=" + phoneNo + ", qq="
				+ qq + ", email=" + email + ", customStatus=" + customStatus + ", createDate=" + createDate
				+ ", inviteName=" + inviteName + "]";
	}
    
}
