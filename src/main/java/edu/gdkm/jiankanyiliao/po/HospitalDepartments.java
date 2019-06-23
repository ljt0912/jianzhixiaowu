package edu.gdkm.jiankanyiliao.po;

public class HospitalDepartments {
	public Integer getHsId() {
		return hsId;
	}
	public void setHsId(Integer hsId) {
		this.hsId = hsId;
	}
	@Override
	public String toString() {
		return "HospitalDepartments [id=" + id + ", name=" + name +", hsId = "+hsId+ "]";
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
	private Integer id;
	private String name;
	private Integer hsId;
}
