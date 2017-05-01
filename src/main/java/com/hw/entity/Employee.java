package com.hw.entity;

public class Employee {
    private int id;

    private String username;

    private String password;

    private String nickname;

    private String realname;

    private int jobInfoId;

    private int departmentId;

    private String phoneNo;

    private String officeTel;

    private String workStatus;

    
	public Employee() {
		super();
	}


	public Employee(String username, String password, String nickname, String realname, int jobInfoId, int departmentId,
			String phoneNo, String officeTel, String workStatus) {
		super();
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.realname = realname;
		this.jobInfoId = jobInfoId;
		this.departmentId = departmentId;
		this.phoneNo = phoneNo;
		this.officeTel = officeTel;
		this.workStatus = workStatus;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getRealname() {
		return realname;
	}


	public void setRealname(String realname) {
		this.realname = realname;
	}


	public int getJobInfoId() {
		return jobInfoId;
	}


	public void setJobInfoId(int jobInfoId) {
		this.jobInfoId = jobInfoId;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getOfficeTel() {
		return officeTel;
	}


	public void setOfficeTel(String officeTel) {
		this.officeTel = officeTel;
	}


	public String getWorkStatus() {
		return workStatus;
	}


	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", nickname=" + nickname
				+ ", realname=" + realname + ", jobInfoId=" + jobInfoId + ", departmentId=" + departmentId
				+ ", phoneNo=" + phoneNo + ", officeTel=" + officeTel + ", workStatus=" + workStatus + "]";
	}


	
    
}