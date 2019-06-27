package edu.gdkm.jiankanyiliao.po;

public class DutyTimeSlot {
	public Integer getDutyTimeOutId() {
		return dutyTimeOutId;
	}
	public void setDutyTimeOutId(Integer dutyTimeOutId) {
		dutyTimeOutId = dutyTimeOutId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	@Override
	public String toString() {
		return "DutyTimeSlot [DutyTimeOutId=" + dutyTimeOutId + ", timeSlot=" + timeSlot + "]";
	}
	private Integer dutyTimeOutId;
	private String timeSlot;
}
