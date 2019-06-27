package edu.gdkm.jiankanyiliao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import edu.gdkm.jiankanyiliao.po.Scheduling;

@Mapper
public interface SchedulingRepository {
	//
	@Select("select * from scheduling where sch_id in"
			+ " (select sch_id from sch_hos_depa where hd_id = #{hId} )")
	@Results({
		@Result(property="sId",column="sch_id"),
		@Result(property="date",column="sch_date")
	})
	public List<Scheduling> getSchedulings(@Param(value="hId")Integer hId);


//	(SELECT * FROM scheduling WHERE CURDATE()  <= DATE(sch_date) LIMIT 14)
	
	@Select("select sc.* from scheduling sc where sc.sch_id in (select shd.sch_id from"
			+ " sch_hos_depa shd where shd.hd_id = #{hId} and shd.sch_id in"
			+ " ( select sch_id from (SELECT s.sch_id FROM scheduling s "
			+ " WHERE CURDATE()  <= DATE(sch_date) LIMIT 14) as scl))")
	@Results({
		@Result(property="sId",column="sch_id"),
		@Result(property="date",column="sch_date")
	})
	public List<Scheduling> findSchedulings(@Param(value="hId")Integer hId);
	
	
	
	
	@Select("select * from scheduling where sch_id = #{sId}")
	@Results({
		@Result(property="sId",column="sch_id"),
		@Result(property="date",column="sch_date")
	})
	public Scheduling findScheduling(@Param(value="sId")Integer sId);
}
