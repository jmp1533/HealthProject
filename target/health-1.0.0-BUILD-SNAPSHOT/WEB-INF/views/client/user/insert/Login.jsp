<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		var id = document.getElementById("logid");
		if(id.value!=""){
			location.href='/';
		}
	});
</script>
</head>
<body>
<form method="post" action="/client/user/insert/Login">
	<input type="hidden" value="${sessionScope.id}" id="logid">
	<div align="center">
		<font size="5">아이디</font>
		<input size="21" type="text" style="margin-left:25px; height: 20px;" name="id" id="id"/>
		<br/>
		<font size="5">비밀번호</font>
		<input  size="21" type="password" style="height: 20px;" name="password" id="password"/>
	</div>
		<div align="center">
			<input type="submit" value="로그인">
			<input type="button" value="회원가입">
		</div>
</form>
</body>
</html>