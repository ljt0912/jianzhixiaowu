package edu.gdkm.jiankanyiliao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import edu.gdkm.jiankanyiliao.po.Doctor;

@Mapper
public interface DoctorRepository {
	@Select("Select d.d_id,d.d_position,d.d_name,d.describe,d.d_pic from doctor d where d_id = #{hid}")
	@Results({
		@Result(property="dId",column="d_id"),
		@Result(property="dPosition",column="d_position"),
		@Result(property="dName",column="d_name"),
		@Result(property="describe",column="describe"),
		@Result(property="dPic",column="d_pic")
	})

	public List<Doctor> findDoctorByHId(@Param(value="hid")Integer hid);
	
	@Select("Select d.d_id,d.d_position,d.d_name,d.describe,d.d_pic from doctor d where d_id = #{dId}")
	@Results({
		@Result(property="dId",column="d_id"),
		@Result(property="dPosition",column="d_position"),
		@Result(property="dName",column="d_name"),
		@Result(property="describe",column="describe"),
		@Result(property="dPic",column="d_pic")
	})
	public List<Doctor> findDoctorByDId(@Param(value="dId")Integer dId);
}
