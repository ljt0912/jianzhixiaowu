package edu.gdkm.jiankanyiliao.po;

public class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", idNum=" + idNum + ", phone=" + phone + ", type=" + type
				+ ", medicalId=" + medicalId + ", self=" + self + "]";
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
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getMedicalId() {
		return medicalId;
	}
	public void setMedicalId(String medicalId) {
		this.medicalId = medicalId;
	}
	public int getSelf() {
		return self;
	}
	public void setSelf(int self) {
		this.self = self;
	}
	//鐢ㄦ埛Id锛堟渶澶ч暱搴�10锛�
	private Integer id;
	//鐢ㄦ埛鍚�
	private String name;
	//鐢ㄦ埛韬唤璇佸彿
	private String idNum;
	//鐢ㄦ埛鎵嬫満鍙�
	private String phone;
	//鐢ㄦ埛韬唤璇佺被鍨� 锛�1銆佷簩浠ｈ韩浠借瘉   2銆佸啗瀹樿瘉  3銆侀娓韩浠借瘉  4銆佹境闂ㄨ韩浠借瘉锛�
	private int type;
	//鐢ㄦ埛灏辫瘖鍗″彿
	private String medicalId;
	//涓庡氨璇婂崱鎷ユ湁鑰呯殑鍏崇郴锛�1銆佹湰浜猴紝 2銆佷粬浜猴級
	private int self;

}
