<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.js"></script>
</head>
<body>
<h3>트레이너상세보기</h3>
<hr  width="90%" size="3">
	<table border="1" width="200">
		<tr>
			<td align="center"><img src="/resources/upload/${dto.t_img }"	width="50px" height="50px" />이미지</td>
		</tr>
		<tr>
			<td>이름 : ${dto.t_name}</td>
		</tr>
		<tr>
			<td>생년월일 : ${dto.t_birth}</td>
		</tr>
		<tr>
			<td>이메일 : ${dto.t_email}</td>
		</tr>
		<tr>
			<td>회사 : ${dto.t_company}</td>
		</tr>
		<tr>
			<td>주소 : ${dto.t_addr}</td>
		</tr>
		<tr>
			<td>전화 : ${dto.t_phone}</td>
		</tr>
		<tr>
			<td>신장 : ${dto.t_height}cm</td>
		</tr>
		<tr>
			<td>체중 : ${dto.t_weight}kg</td>
		</tr>
		<tr>
			<td>소개글 : ${dto.t_introduction}</td>
		</tr>
	</table>
	
	<a href="/admin/mtrainer/list/list">목록보기</a>
</body>
</html>