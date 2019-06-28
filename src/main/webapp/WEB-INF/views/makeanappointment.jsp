<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
1111



<a href="/jiankanyiliao/selectdepartments/makeanappointment/getHsIdAndDId?dsId=3&dId=1">医生信息</a>
</body>

 <script src="../../static/js/jquery.min.js"></script> 
<script>
	$(function(){
		$.ajax({
			url:"findDepatmentsSchedulings",
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