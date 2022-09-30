<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		$("#allch").click(function(){
			if($(this).is(':checked')){
				$("input[name='delck']").prop("checked", true); 
			}else{
				$("input[name='delck']").prop("checked", false); 
			}
		});
	}); 
</script>
</head>
<body>
	<h2>공지사항</h2>
<form method="post" action="/admin/mservice/notice/delete">
<input type="submit" value="삭제">
	<div align="center">
		<table border="1" width="80%">
			<tr>
				<th><input type="checkbox" id="allch" name="allch"></th>
				<th width="7.5%">글번호</th>
				<th width="65%">제목</th>
				<th width="7.5%">작성자</th>
				<th width="20%">작성일</th>
			</tr>
			<c:forEach var="dto" items="${list}">
				<tr>
					<td><input type="checkbox" name="delck" value="${dto.noti_num}"></td>
					<td align="center">${dto.noti_num}</td>
					<td align="center"><a href="/admin/mservice/notice/view?noti_num=${dto.noti_num}">${dto.noti_title}</a></td>
					<td>관리자</td>
					<td align="center">${dto.noti_date}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</form>
	<a href="/admin/mservice/notice/write">글쓰기</a>
	
	
	<!-- 검색 -->
	<div>
		<form method="get" action="/admin/mservice/notice/Noticelist">
			<select name="field">
				<option value="noti_title">제목</option>
				<option value="noti_date">작성일</option>
			</select>
			<input type="text" name="keyword"/>		
			<input type="submit" value="검색"/>		
		</form>
	</div>
	
	<!-- 페이징처리 -->
	<div>
		<c:choose>
			<c:when test="${pu.startPageNum>10 }">
				<a href="/admin/mservice/notice/Noticelist?pageNum=${pu.startPageNum-1 }&field=${field}&keyword=${keyword}">[이전]</a>
			</c:when>
			<c:otherwise>
			[이전]
		</c:otherwise>
		</c:choose>

		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<a href="/admin/mservice/notice/Noticelist?pageNum=${i}&field=${field}&keyword=${keyword}"> <span
						style="color: red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/admin/mservice/notice/Noticelist?pageNum=${i}&field=${field}&keyword=${keyword}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>

		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount}">
				<a
					href="/admin/mservice/notice/Noticelist?pageNum=${pu.endPageNum+1 }&field=${field}&keyword=${keyword}">[다음]</a>
			</c:when>
			<c:otherwise>
			[다음]
		</c:otherwise>
		</c:choose>
	</div>
</body>
</html>