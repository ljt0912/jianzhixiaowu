package edu.gdkm.jiankanyiliao.po;

import java.util.List;

/*
 * 	描述：  科室排班类
 * 		
 * 
 * 
 * 
 * 
 * */

public class DepartmentsSchedulings {
	public Scheduling getSchedulings() {
		return schedulings;
	}
	public void setSchedulings(Scheduling schedulings) {
		this.schedulings = schedulings;
	}
	@Override
	public String toString() {
		return "DepartmentsSchedulings [dsId=" + dsId + ", hospitalDepartments=" + hospitalDepartments
				+ ", schedulings=" + schedulings + ", dutys=" + dutys + "]";
	}
	public List<Duty> getDutys() {
		return dutys;
	}
	public void setDutys(List<Duty> dutys) {
		this.dutys = dutys;
	}

	public Integer getDsId() {
		return dsId;
	}
	public void setDsId(Integer dsId) {
		this.dsId = dsId;
	}
	public HospitalDepartments getHospitalDepartments() {
		return hospitalDepartments;
	}
	public void setHospitalDepartments(HospitalDepartments hospitalDepartments) {
		this.hospitalDepartments = hospitalDepartments;
	} 

	//排班Id
	private Integer dsId;
	//科室
	private HospitalDepartments hospitalDepartments;
	//排班日期
	private Scheduling schedulings;
	//当天的值班情况
	private List<Duty> dutys;
}
