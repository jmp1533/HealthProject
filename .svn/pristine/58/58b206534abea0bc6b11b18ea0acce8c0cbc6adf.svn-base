<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty u_id}">
			<p>아이디 : ${u_id }</p>		
		</c:when>
		<c:when test="${not empty t_id}">
			<p>아이디 : ${t_id }</p>
		</c:when>
		<c:otherwise>
			<P>일치하는 아이디가 없습니다.</P>
		</c:otherwise>
	</c:choose>
	
	<a href="/client/user/finder/search/searchmain">비밀번호 찾기</a>
</body>
</html>