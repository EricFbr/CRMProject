package com.hw.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ConsultRecord2 {
	 	private int id;

	    private int customId;
	    
	    private String customName;
	    
	    private String customPhoneNo;

	    private String consultStatus;
	    
	    @JsonFormat(pattern="yyyy-MM-dd")
	    private Date consultDate;
	   

	    private String result;


		public ConsultRecord2() {
			super();
		}


		public ConsultRecord2(int customId, String customName, String customPhoneNo, String consultStatus,
				Date consultDate, String result) {
			super();
			this.customId = customId;
			this.customName = customName;
			this.customPhoneNo = customPhoneNo;
			this.consultStatus = consultStatus;
			this.consultDate = consultDate;
			this.result = result;
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


		public String getConsultStatus() {
			return consultStatus;
		}


		public void setConsultStatus(String consultStatus) {
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


		@Override
		public String toString() {
			return "ConsultRecord2 [id=" + id + ", customId=" + customId + ", customName=" + customName
					+ ", customPhoneNo=" + customPhoneNo + ", consultStatus=" + consultStatus + ", consultDate="
					+ consultDate + ", result=" + result + "]";
		}
    
	    
}
