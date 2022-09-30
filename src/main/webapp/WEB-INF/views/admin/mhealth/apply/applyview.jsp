<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.js"></script>
</head>
<body>

<h3>헬스장신청목록-상세보기</h3>

<table border="1">
	<tr>
		<td>글번호</td><td>${dto.b_num}</td>
	</tr>
	<tr>
		<td>신청인</td><td>${dto.t_id}</td>
	</tr>
	<tr>
		<td>사업자번호</td><td>${dto.b_corporatenum}</td>
	</tr>
	<tr>
		<td>업체이름</td><td>${dto.b_name}</td>
	</tr>
	<tr>
		<td>주소</td><td>${dto.b_addr}</td>
	</tr>
	<tr>
		<td>전화번호</td><td>${dto.b_phone}</td>
	</tr>
	<tr>
		<td>이메일</td><td>${dto.b_email}</td>
	</tr>
	<tr>
		<td>내용</td><td>${dto.b_content}</td>
	</tr>
	<tr>
		<td>신청날짜</td><td>${dto.b_date}</td>
	</tr>
	
	
	<tr>
	
		<td>이미지</td>
		
		<td>
			
			<img src="/resources/upload/${img[0]}">
			<img src="/resources/upload//${img[1]}">
			<img src="/resources/upload/${img[2]}">
			<img src="/resources/upload/${img[3]}">
			<img src="/resources/upload/${img[4]}">
			<img src="/resources/upload/${img[5]}">
			<img src="/resources/upload/${img[6]}">
			<img src="/resources/upload/${img[7]}">
			
		</td>
	</tr>
	

</table>


<form action="/admin/mhealth/apply/applyupdate">
	<input type="hidden" name="b_num" value="${dto.b_num}">
	
	x<input type="text" name="b_x">
	y<input type="text" name="b_y">
	<input type="submit" value="등록">
</form>

<br>
<a href="/admin/mhealth/apply/applylist">헬스장신청목록</a>
</body>
</html>