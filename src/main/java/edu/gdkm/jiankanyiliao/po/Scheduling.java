package edu.gdkm.jiankanyiliao.po;

import java.sql.Date;

public class Scheduling {
	@Override
	public String toString() {
		return "Scheduling [sId=" + sId + ", date=" + date + "]";
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private Integer sId;
	private Date date;
	
}
