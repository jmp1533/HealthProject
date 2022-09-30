<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head> 
<body>
<c:set var="msg_Dto" value="${msg_Dto}"/>
	<table border="1" width="590px">
		<tr>
			<th>글제목</th>
			<td>${msg_Dto.msg_title}</td>
		</tr>
		<tr>
			<th>글쓴날짜</th>
			<td>${msg_Dto.msg_date}</td>
		</tr>
		<tr>
			<th>글내용</th>
			<td>${msg_Dto.msg_content}</td>
		</tr>
	</table>
<div>
[다음글]<a href="/client/popup/msg/msgview?msg_num=${next.msg_num }">${next.msg_title }</a><br/>
[이전글]<a href="/client/popup/msg/msgview?msg_num=${prev.msg_num }">${prev.msg_title }</a><br/>
</div>
<a href="/client/popup/msg/msglist">목록</a>
	
</body>
</html>