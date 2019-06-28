package edu.gdkm.jiankanyiliao.po;

public class DutyTimeSlot {


	public Integer getTimeSlotId() {
		return timeSlotId;
	}
	public void setTimeSlotId(Integer timeSlotId) {
		this.timeSlotId = timeSlotId;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	@Override
	public String toString() {
		return "DutyTimeSlot [timeSlotId=" + timeSlotId + ", timeSlot=" + timeSlot + "]";
	}
	private Integer timeSlotId;
	private String timeSlot;
}
