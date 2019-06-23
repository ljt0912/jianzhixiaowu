package edu.gdkm.jiankanyiliao.po;

public class DutyTimeSlot {
	public Integer getDutyTimeOutId() {
		return DutyTimeOutId;
	}
	public void setDutyTimeOutId(Integer dutyTimeOutId) {
		DutyTimeOutId = dutyTimeOutId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	@Override
	public String toString() {
		return "DutyTimeSlot [DutyTimeOutId=" + DutyTimeOutId + ", timeSlot=" + timeSlot + "]";
	}
	private Integer DutyTimeOutId;
	private String timeSlot;
}
