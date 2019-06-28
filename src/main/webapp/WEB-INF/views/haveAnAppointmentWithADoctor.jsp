<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>预约医生</title>
</head>
<body>
	预约医生列表
	<a  onclick="a()">预约医生</a>
</body>
 <script src="../../../static/js/jquery.min.js"></script> 
<script>
	$(function(){
		$.ajax({
			url:"findDuty",
			type:"POST",
			
			success:function(data){
					var obj = JSON.stringify(data);
					console.log(obj);
					alert(obj);
			}
		})

	});
	function a(){
		$.ajax({
			url:"updateQuantity",
			type:"GET",
			data:{dutyId : 1,dutyQuantity:3},
			success:function(data){
				if(data == "SUCCESS"){
					alert("预约成功");
				}else{
					alert("预约失败");
				}
			}
			
		});
	}
</script>
</html>