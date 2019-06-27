package edu.gdkm.jiankanyiliao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Many;


import edu.gdkm.jiankanyiliao.po.Duty;

@Mapper
public interface DutyRepostiory {
	@Select("<script> "+ 
				" SELECT duty_id,d_id FROM duty GROUP BY d_id,sch_hos_depa_id  HAVING sch_hos_depa_id = #{id} "+
//				"<foreach item='ids' collection='ids' open='(' separator=',' close=')' >"+
//					"#{ids}"+
//				"</foreach>"+
			
			" </script>")
	@Results({
		@Result(property="dutyId",column="duty_id"),
		@Result(property="doctor",column="d_id",
		one=@One(select="edu.gdkm.jiankanyiliao.repository.DoctorRepository.findDoctorByDId"))

		

	})
	public List<Duty> findDutyById(@Param(value="id")Integer id);
	
	
	@Select("select d.timeslot_id,d.duty_quantity,d.d_id from duty d where sch_hos_depa_id = #{hsId} and d_id = #{dId}")
	@Results({
		@Result(property="dutyQuantity",column="duty_quantity"),
		@Result(property="timeSlots",column="timeslot_id",
				one=@One(select="edu.gdkm.jiankanyiliao.repository.DutyTimeSlotRepository.findDutyTimeSlotById")),
		@Result(property="doctor",column="d_id",
				one=@One(select=("edu.gdkm.jiankanyiliao.repository.DoctorRepository.findDoctorByDId"))
		)
	})
	public List<Duty> findDutyByIdWithDId(@Param(value="hsId")Integer hsId,@Param(value="dId")Integer dId);
	
}
