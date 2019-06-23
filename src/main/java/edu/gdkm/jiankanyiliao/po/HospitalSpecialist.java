package edu.gdkm.jiankanyiliao.po;

import java.util.List;

public class HospitalSpecialist {
	@Override
	public String toString() {
		return "HospitalSpecialist [ id= "+id + ",name = "+name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<HospitalDepartments> getHospitalDepartments() {
		return hospitalDepartments;
	}
	public void setHospitalDepartments(List<HospitalDepartments> hospitalDepartments) {
		this.hospitalDepartments = hospitalDepartments;
	}
	private Integer id;
	private String name;
	private List<HospitalDepartments> hospitalDepartments;
}
