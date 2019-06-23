package edu.gdkm.jiankanyiliao.po;

import java.util.List;

public class Duty {
	@Override
	public String toString() {
		return "Duty [dutyId=" + dutyId + ", timeSlots=" + timeSlots + ", dutyQuantity=" + dutyQuantity
				+ ", departmentsSchedulings=" + departmentsSchedulings + "]";
	}
	public List<DutyTimeSlot> getTimeSlots() {
		return timeSlots;
	}
	public void setTimeSlots(List<DutyTimeSlot> timeSlots) {
		this.timeSlots = timeSlots;
	}
	private Integer	dutyId;
	private List<DutyTimeSlot> timeSlots;
	private int dutyQuantity;
	private DepartmentsSchedulings departmentsSchedulings;

	public Integer getDutyId() {
		return dutyId;
	}
	public void setDutyId(Integer dutyId) {
		this.dutyId = dutyId;
	}
	public int getDutyQuantity() {
		return dutyQuantity;
	}
	public void setDutyQuantity(int dutyQuantity) {
		this.dutyQuantity = dutyQuantity;
	}
	public DepartmentsSchedulings getDepartmentsSchedulings() {
		return departmentsSchedulings;
	}
	public void setDepartmentsSchedulings(DepartmentsSchedulings departmentsSchedulings) {
		this.departmentsSchedulings = departmentsSchedulings;
	}
}
