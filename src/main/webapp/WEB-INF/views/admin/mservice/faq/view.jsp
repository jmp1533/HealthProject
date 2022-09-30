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
<c:set var="dto" value="${dto}"/>
<a href="/admin/mservice/faq/update?faq_num=${dto.faq_num }">수정</a>
	<table border="1">
		<tr>
			<th>분류</th>
			<td>${dto.faq_cate}</td>
		</tr>
		<tr>
			<th>쓴날짜</th>
			<td>${dto.faq_date}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.faq_question}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${dto.faq_answer}</td>
		</tr>
	</table>

	[다음글]<a href="/admin/mservice/faq/view?faq_num=${next.faq_num}">${next.faq_question}</a><br/>
	[이전글]<a href="/admin/mservice/faq/view?faq_num=${prev.faq_num}">${prev.faq_question}</a>		
</body>
</html>