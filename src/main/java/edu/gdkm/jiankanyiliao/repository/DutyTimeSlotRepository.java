package edu.gdkm.jiankanyiliao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import edu.gdkm.jiankanyiliao.po.DutyTimeSlot;

@Mapper
public interface DutyTimeSlotRepository {
	@Select("select * from duty_time_slot where timeslot_id = #{tId}")
	@Results({
		@Result(property="timeSlotId",column="timeslot_id"),
		@Result(property="timeSlot",column="time_slot")
	})
	public DutyTimeSlot findDutyTimeSlotById(@Param(value="tId")Integer tId);
}
