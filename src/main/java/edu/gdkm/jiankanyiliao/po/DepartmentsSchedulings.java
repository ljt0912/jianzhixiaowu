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
	@Override
	public String toString() {
		return "DepartmentsScheduling [dsId=" + dsId + ", hospitalDepartments=" + hospitalDepartments + ", schedulings="
				+ schedulings + "]";
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
	public List<Scheduling> getSchedulings() {
		return schedulings;
	}
	public void setSchedulings(List<Scheduling> schedulings) {
		this.schedulings = schedulings;
	}
	//排班Id
	private Integer dsId;
	//科室
	private HospitalDepartments hospitalDepartments;
	//排班日期
	private List<Scheduling> schedulings;
}
