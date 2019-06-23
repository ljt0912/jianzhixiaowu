package edu.gdkm.jiankanyiliao.po;

public class Doctor {
	public Integer getdId() {
		return dId;
	}
	public void setdId(Integer dId) {
		this.dId = dId;
	}
	public String getdPosition() {
		return dPosition;
	}
	public void setdPosition(String dPosition) {
		this.dPosition = dPosition;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public HospitalDepartments getHospitalDepartments() {
		return hospitalDepartments;
	}
	public void setHospitalDepartments(HospitalDepartments hospitalDepartments) {
		this.hospitalDepartments = hospitalDepartments;
	}
	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", dPosition=" + dPosition + ", dName=" + dName + ", describe=" + describe
				+ ", hospitalDepartments=" + hospitalDepartments + "]";
	}
	private Integer dId;
	private String dPosition;
	private String dName;
	private String describe;
	private HospitalDepartments hospitalDepartments;
}
