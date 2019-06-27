package edu.gdkm.jiankanyiliao.po;
/*
 * 	医生类
 * 	
 * */
public class Doctor {
	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", dPosition=" + dPosition + ", dName=" + dName + ", describe=" + describe
				+ ", hospitalDepartments=" + hospitalDepartments + ", dPic=" + dPic + "]";
	}
	public String getdPic() {
		return dPic;
	}
	public void setdPic(String dPic) {
		this.dPic = dPic;
	}
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

	
	//医生编号
	private Integer dId;
	//院内职位
	private String dPosition;
	//医生姓名
	private String dName;
	//关于医生的描述
	private String describe;
	//医生所属科室
	private HospitalDepartments hospitalDepartments;
	//医生头像
	private String dPic;
}
