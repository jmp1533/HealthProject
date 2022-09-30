<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#changePwd2").blur(function(){
			var pwd1=$("#changePwd").val();
			var pwd2=$("#changePwd2").val();
			if(pwd1==pwd2){
				$("#pwd_span").html("");
			}else{
				$("#pwd_span").html("비밀번호가 일치하지 않습니다.");
			}
		});
	});
</script>
</head>
<body>
<form action="/client/user/finder/search/changePwd" method="post">
	<c:choose>
		<c:when test="${not empty u_id}">
			<input type="text" value="${u_id }" name="id" />
		</c:when>
		<c:when test="${not empty t_id}">
			<input type="text" value="${t_id }" name="id" />
		</c:when>
		<c:otherwise>
			<input type="text" value="${id}" name="id"/>
		</c:otherwise>
	</c:choose>
	
	변경할 비밀번호<input type="text" name="changePwd" id="changePwd" /> <br/>
	비밀번호 확인<input type="text" id="changePwd2" name="changePwd2"/><br/>
	<span id="pwd_span" style="color:red"></span> <br/>

	<input type="submit" value="확인"/>
</form>
</body>
</html>