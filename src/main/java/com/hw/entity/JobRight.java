package com.hw.entity;

public class JobRight {
    private Integer id;

    private Integer jobInfoId;

    private Integer rightId;

	public JobRight() {
		super();
	}

	public JobRight(Integer jobInfoId, Integer rightId) {
		super();
		this.jobInfoId = jobInfoId;
		this.rightId = rightId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getJobInfoId() {
		return jobInfoId;
	}

	public void setJobInfoId(Integer jobInfoId) {
		this.jobInfoId = jobInfoId;
	}

	public Integer getRightId() {
		return rightId;
	}

	public void setRightId(Integer rightId) {
		this.rightId = rightId;
	}

	@Override
	public String toString() {
		return "JobRight [id=" + id + ", jobInfoId=" + jobInfoId + ", rightId=" + rightId + "]";
	}
	

}