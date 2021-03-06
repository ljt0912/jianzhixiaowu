package edu.gdkm.jiankanyiliao.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import org.apache.ibatis.annotations.Many;

import edu.gdkm.jiankanyiliao.po.DepartmentsSchedulings;

@Mapper
public interface BookingRegisterRepository {
	@Select("select * from sch_hos_depa where sch_hos_depa_id = #{Id}")
	@Results({
		@Result(property="dsId",column="sch_hos_depa_id"),
		@Result(property="hospitalDepartments",column="hd_id",
		one=@One(select="edu.gdkm.jianzhixiaowu.repository.HospitalDepartmentsRepository.getHospitalDepartment")),
		@Result(property="schedulings",column="sch_id",
		many=@Many(select="edu.gdkm.jianzhixiaowu.repository.SchedulingRepository.getSchedulings"))
	})
	public DepartmentsSchedulings getDepartmentsScheduling(Integer Id);
	
	@Select("select * from sch_hos_depa where hd_id = #{hId} and sch_id in " + 
			" (select sch_id from (SELECT s.sch_id FROM scheduling s " + 
			" WHERE CURDATE()  <= DATE(sch_date) LIMIT 14) as scl)")
	@Results({
		@Result(property="dsId",column="sch_hos_depa_id"),
		@Result(property="hospitalDepartments",column="hd_id",
		one=@One(select="edu.gdkm.jiankanyiliao.repository.HospitalDepartmentsRepository.getHospitalDepartment")),
		@Result(property="schedulings",column="sch_id",
		many=@Many(select="edu.gdkm.jiankanyiliao.repository.SchedulingRepository.findScheduling")),
		@Result(property="dutys",column="sch_hos_depa_id",
		many=@Many(select="edu.gdkm.jiankanyiliao.repository.DutyRepostiory.findDutyById"))
	})
	public List<DepartmentsSchedulings> findDepatmentsSchedulings(@Param(value="hId")Integer hId);
	
	
}
