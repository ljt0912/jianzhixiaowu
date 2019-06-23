package edu.gdkm.jiankanyiliao.po;

import java.util.List;

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
	private Integer dsId;
	private HospitalDepartments hospitalDepartments;
	private List<Scheduling> schedulings;
}
