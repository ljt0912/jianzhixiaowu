package edu.gdkm.jiankanyiliao.po;

import java.util.List;
/*
 * 	值班类
 * 
 * */
public class Duty {
	@Override
	public String toString() {
		return "Duty [dutyId=" + dutyId + ", timeSlots=" + timeSlots + ", dutyQuantity=" + dutyQuantity + ", doctor="
				+ doctor + "]";
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public DutyTimeSlot getTimeSlots() {
		return timeSlots;
	}
	public void setTimeSlots(DutyTimeSlot timeSlots) {
		this.timeSlots = timeSlots;
	}


	
	//值班编号
	private Integer	dutyId;
	//值班时间段
	private DutyTimeSlot timeSlots;
	//值班任务量
	private int dutyQuantity;
	//科室排班情况
	private Doctor doctor;

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

}
