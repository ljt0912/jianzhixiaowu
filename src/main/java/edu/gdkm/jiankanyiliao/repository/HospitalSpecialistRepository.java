package edu.gdkm.jiankanyiliao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Many;
import edu.gdkm.jiankanyiliao.po.HospitalSpecialist;

@Mapper
public interface HospitalSpecialistRepository {

	
	@Select("select * from hospital_specialist")
	@Results({
		@Result(property="id",column="hs_id"),
		@Result(property="name",column="hs_name"),
		@Result(property="hospitalDepartments",column="hs_id",
		many=@Many(select="edu.gdkm.jiankanyiliao.repository.HospitalDepartmentsRepository.getHospitalDepartments"))
	})
	public List<HospitalSpecialist> findAllHospitalSpecialist();
}
