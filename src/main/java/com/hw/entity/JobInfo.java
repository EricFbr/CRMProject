package com.hw.entity;

public class JobInfo {
    private Integer id;

    private String job;

    private Integer departmentId;

	public JobInfo() {
		super();
	}

	public JobInfo(String job, Integer departmentId) {
		super();
		this.job = job;
		this.departmentId = departmentId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "JobInfo [id=" + id + ", job=" + job + ", departmentId=" + departmentId + "]";
	}

   
}