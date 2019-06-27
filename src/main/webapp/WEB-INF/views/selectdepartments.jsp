<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>选择科室</title>
</head>
<body>	
	选择科室
	<a href="/jiankanyiliao/selectdepartments/getDepartmentId?id=1">膏方门诊</a>
</body>
 <script src="../static/js/jquery.min.js"></script> 
<script>
	$(function(){
		$.ajax({
			url:"selectdepartments",
			type:"POST",
			
			success:function(data){
					var obj = JSON.stringify(data);
					console.log(obj);
					alert(obj);
			}
		})
	});
</script>
</html>