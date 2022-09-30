<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>로그인날짜</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.tl_num}</td>
				<td>${dto.t_id}</td>
				<td>${dto.tl_date}</td>
			</tr>
		</c:forEach>
	</table>

<!-- 검색 -->
	<div>
		<form method="get" action="/admin/mtrainer/record/list">
			<select name="field">
				<option value="t_id">아이디</option>
				<option value="tl_date">날짜</option>
			</select>
			<input type="text" name="keyword"/>		
			<input type="submit" value="검색"/>		
		</form>
	</div>	
			
<div>
		<c:choose>
			<c:when test="${pu.startPageNum>10 }">
				<a
					href="/admin/mtrainer/record/list?pageNum=${pu.startPageNum-1 }&field=${field}&keyword=${keyword}">[이전]</a>
			</c:when>
			<c:otherwise>
			[이전]
		</c:otherwise>
		</c:choose>

		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<a href="/admin/mtrainer/record/list?pageNum=${i}&field=${field}&keyword=${keyword}"> <span
						style="color: red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/admin/mtrainer/record/list?pageNum=${i}&field=${field}&keyword=${keyword}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>

		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount}">
				<a
					href="/admin/mtrainer/record/list?pageNum=${pu.endPageNum+1 }&field=${field}&keyword=${keyword}">[다음]</a>
			</c:when>
			<c:otherwise>
			[다음]
		</c:otherwise>

		</c:choose>
	</div>				
</body>
</html>