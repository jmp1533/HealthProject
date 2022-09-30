<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>Q&A 답변</h3>

<table border="1" width="500">
		<tr>
			<th>글번호</th>
			<td>${dto.q_num}</td>
		</tr>
		<tr>
			<th>분류</th>
			<td>${dto.qcate_name}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${dto.q_date}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.q_title}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${dto.q_content}</td>
		</tr>
		<tr>
			<th>이미지</th>
			<td><img src="resources/upload/${dto.q_img}"></td>
		</tr>
	</table>

	<table border="1" width="500">
		<tr>
			<th>글번호</th><th>내용</th><th>작성일</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.qr_num}</td>
				<td>${list.qr_content}</td>
				<td>${list.qr_date}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>