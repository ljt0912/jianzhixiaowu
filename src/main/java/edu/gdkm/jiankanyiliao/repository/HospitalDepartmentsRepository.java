package edu.gdkm.jiankanyiliao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;

import edu.gdkm.jiankanyiliao.po.HospitalDepartments;

@Mapper
public interface HospitalDepartmentsRepository {
	@Select("select * from hospital_departments where hs_id = #{id}")
	@Results({
		@Result(property="id",column="hd_id"),
		@Result(property="hsId",column="hs_Id"),
		@Result(property="name",column="hd_name")
	})
	public List<HospitalDepartments> getHospitalDepartments(Integer id);
	
	
	
	@Select("select * from hospital_departments where hd_id = #{hId}")
	@Results({
		@Result(property="id",column="hd_id"),
		@Result(property="hsId",column="hs_Id"),
		@Result(property="name",column="hd_name")
	})
	public HospitalDepartments getHospitalDepartment(Integer hId);
}
