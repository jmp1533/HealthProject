<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<h2>방명록</h2>
<form method="post" action="/admin/mboard/free/delete">
	<input type="submit" value="삭제">
<table border="1" width="600">
	<tr>
		<th><input type="checkbox" id="allch" name="allch"></th>
		<th>글번호</th><th>작성자</th><th>제목</th><th>작성일</th><th>조회수</th><th>추천수</th>
	</tr>
	
	<c:forEach var="dto" items="${list }">
		<tr>
			<td>
				<input type="checkbox" name="delck" value="${dto.free_num}">
			</td>
			
			<td>${dto.free_num }</td>
			<td>${dto.id }</td>
			<td><a href="/admin/mboard/free/view?free_num=${dto.free_num}"> ${dto.f_title } </a></td>
			<td>${dto.f_date }</td>
			<td>${dto.f_hits }</td>
			<td>${dto.count}</td>
		</tr>
	</c:forEach>
</table>
</form>
<form method="get" action="/admin/mboard/free/list">
		<select name="field" >
			<option value="id">아이디</option>
			<option value="f_title">글제목</option>
			<option value="f_content">글내용</option>
		</select>
		<input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
<div>
	<c:choose>
		<c:when test="${pu.startPageNum>10 }">
			<a href="/admin/mboard/free/list?pageNum=${pu.startPageNum-1 }">[이전]</a>
		</c:when>
		<c:otherwise>
			[이전]
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		<c:choose>
			<c:when test="${i==pu.pageNum }">
				<a href="/admin/mboard/free/list?pageNum=${i }
				&field=${field}&keyword=${keyword}">
				<span style="color:red">[${i }]</span>
				</a>
			</c:when>
			<c:otherwise>
				<a href="/admin/mboard/free/list?pageNum=${i }
				&field=${field}&keyword=${keyword}">[${i }]</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:choose>
		<c:when test="${pu.endPageNum<pu.totalPageCount }">
			<a href="/admin/mboard/free/list?pageNum=${pu.endPageNum+1 }">[다음]</a>
		</c:when>
		<c:otherwise>
			[다음]
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>