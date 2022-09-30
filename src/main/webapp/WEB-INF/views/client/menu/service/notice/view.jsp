<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h3>공지사항상세보기</h3>

<input type="hidden" name="noti_num" value="${dto.noti_num}">
<a href="/client/menu/service/notice/Noticelist">목록</a>
	<table border="1">
		<tr>
			<td colspan="2">제목 : ${dto.noti_title}</td>
		</tr>
		<tr>
			<td>작성일 : ${dto.noti_date}</td>
		</tr>
		<tr>
			<td colspan="2">${dto.noti_content}</td>
		</tr>
	</table>
		[다음글]<a href="/client/menu/service/notice/view?noti_num=${next.noti_num}">${next.noti_title}</a><br/>
		[이전글]<a href="/client/menu/service/notice/view?noti_num=${prev.noti_num}">${prev.noti_title}</a>
