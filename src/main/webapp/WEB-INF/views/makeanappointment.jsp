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
</body>

 <script src="../static/js/jquery.min.js"></script> 
<script>
	$(function(){
		$.ajax({
			url:"MakeAnAppointment",
			type:"POST",
			
			success:function(data){
					var obj = JSON.stringify(data);
					alert(obj);
			}
		})
	});
</script>
</html>