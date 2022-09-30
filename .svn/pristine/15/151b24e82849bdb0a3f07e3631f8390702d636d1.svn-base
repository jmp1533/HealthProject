<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>공지사항상세보기</h3>

<input type="hidden" name="noti_num" value="${dto.noti_num}">
	<table border="1">
		<tr>
			<td colspan="2">제목 : ${dto.noti_title}</td>
		</tr>
		<tr>
			<td>작성일 : ${dto.noti_date}</td>
			<td>조회수: ${dto.noti_hits} </td>
		</tr>
		<tr>
			<td colspan="2">${dto.noti_content}</td>
		</tr>
	</table>
	
	<a href="/admin/mservice/notice/update?noti_num=${dto.noti_num}">수정</a>
	
		[다음글]<a href="/admin/mservice/notice/view?noti_num=${next.noti_num}">${next.noti_title}</a><br/>
		[이전글]<a href="/admin/mservice/notice/view?noti_num=${prev.noti_num}">${prev.noti_title}</a>
</body>
</html>