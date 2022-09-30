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
<h3>Q&A</h3>

		<table border="1">
			<tr>
				<th>글번호</th>
				<th>분류</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<c:forEach var="dto" items="${list}">
				<tr>
					<td>${dto.q_num}</td>
					<td>${dto.qcate_name}</td>
					<td><a href="/admin/mservice/qna/qna_view?q_num=${dto.q_num}">${dto.q_title}</a></td>
					<td>${dto.id}</td>
					<td>${dto.q_date}</td>
				</tr>
			</c:forEach>
		</table>

	
	<!-- 검색 -->
	<div>
		<form method="get" action="/admin/mservice/qna/qna_list">
			<select name="field">
				<option value="q_title">제목</option>
				<option value="id">아이디</option>
				<option value="q_date">작성일</option>
			</select>
			<input type="text" name="keyword"/>		
			<input type="submit" value="검색"/>		
		</form>
	</div>
	
	
	<!-- 페이징처리 -->
	<div>
		<c:choose>
			<c:when test="${pu.startPageNum>10 }">
				<a
					href="/admin/mservice/qna/qna_list?pageNum=${pu.startPageNum-1 }">[이전]</a>
			</c:when>
			<c:otherwise>
			[이전]
		</c:otherwise>
		</c:choose>

		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<a href="/admin/mservice/qna/qna_list?pageNum=${i}"> <span
						style="color: red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/admin/mservice/qna/qna_list?pageNum=${i}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>

		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount}">
				<a
					href="/admin/mservice/qna/qna_list?pageNum=${pu.endPageNum+1 }">[다음]</a>
			</c:when>
			<c:otherwise>
			[다음]
		</c:otherwise>
		</c:choose>
	</div>



</body>
</html>