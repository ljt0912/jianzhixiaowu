package edu.gdkm.jiankanyiliao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import edu.gdkm.jiankanyiliao.po.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.One;

@Mapper
public interface DemoRepository {
//	@Select(
//			"<script>"+   					
//				 "select t.t_id,t.t_name,t.t_age from t_user t"+ 		
//				 " <where> "+						
//				 	"<if test=\" #{name} !=null \" >"+
//				 		"t_name like concat('%',#{name},'%')"+
//				 	"</if>"+				
//				"</where>"+				
//			"</script>"					
//				
//			)
//	@Results({
//		@Result(property="id",column="t_id"),
//		@Result(property="name",column="t_name"),
//		@Result(property="age",column="t_age")
//	})
//	public List<User> selectUsersByName(@Param(value = "name")String name);
	
//	@Select("select * from tb_product where id in (select oi.product_id from tb_ordersitem oi where orders_id in (select o.id from tb_orders o where user_id = #{id})")
//	public 
//	@Select("select * from tb_user where id = #{id}")
//	@Results({
//		@Result(property="id",column="id"),
//		@Result(property="username",column="username"),
//		@Result(property="address",column="address")
//	})
//	public User findUserById(@Param(value="id")Integer id);
//	
//	@Select("select * from tb_user where id = (select user_id from tb_orders where id = #{orderid})")
//	@Results({
//		@Result(property="id",column="id"),
//		@Result(property="username",column="username"),
//		@Result(property="address",column="address")
//	})
//	public User findUserByOrderId(@Param(value="orderid")Integer orderid);
	
	@Select("select * from user where u_id = #{id}")
	@Results({
			@Result(property="id",column="u_id"),
			@Result(property="name",column="u_name"),
			@Result(property="idNum",column="u_id_num"),
			@Result(property="phone",column="u_phone"),
			@Result(property="type",column="u_id_type"),
			@Result(property="medicalId",column="med_ins"),
			@Result(property="self",column="self_ral")
			
	})
	public User findUserById(Integer id);
}
