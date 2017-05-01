package com.hw.entity;

public class Rights {
    private  int rid;

    private String rightName;

    private int rightType;

    private String url;

    private int pId;
    
    
	public Rights() {
		super();
	}


	public Rights(String rightName, int rightType, String url, int pId) {
		super();
		this.rightName = rightName;
		this.rightType = rightType;
		this.url = url;
		this.pId = pId;
	}


	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}


	public String getRightName() {
		return rightName;
	}


	public void setRightName(String rightName) {
		this.rightName = rightName;
	}


	public int getRightType() {
		return rightType;
	}


	public void setRightType(int rightType) {
		this.rightType = rightType;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	@Override
	public String toString() {
		return "Rights [rid=" + rid + ", rightName=" + rightName + ", rightType=" + rightType + ", url=" + url
				+ ", pId=" + pId + "]";
	}

	
}