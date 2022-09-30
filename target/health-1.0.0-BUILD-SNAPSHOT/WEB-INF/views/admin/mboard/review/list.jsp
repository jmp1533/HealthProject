<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui-1.10.3.custom.js"></script>
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
<h2>성공후기</h2>
<div class="main">
<form method="post" action="/admin/mboard/review/delete">
	<input type="submit" value="삭제">
	<table border="1" width="750">
		<tr>
			<th><input type="checkbox" id="allch" name="allch"></th>
			<th>글번호</th><th>작성자</th><th>제목</th><th>조회수</th><th>추천수</th><th>작성일</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>
					<input type="checkbox" name="delck" value="${dto.r_num}">
				</td>
				<td>${dto.r_num }</td>
				<td>${dto.id }</td>
				<td><a href="/admin/mboard/review/view?r_num=${dto.r_num}">${dto.r_title }</a></td>
				<td>${dto.r_hits }</td>
				<td>${dto.count }</td>
				<td>${dto.r_date }</td>
			</tr>
		</c:forEach>
	</table>
</form>
	<form method="get" action="/admin/mboard/review/list">
		<select name="field" >
			<option value="id">아이디</option>
			<option value="r_title">글제목</option>
			<option value="r_content">글내용</option>
		</select>
		<input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
<div>
	<c:choose>
		<c:when test="${pu.startPageNum>10 }">
			<a href="/admin/mboard/review/list?pageNum=${pu.startPageNum-1 }">[이전]</a>
		</c:when>
		<c:otherwise>
			[이전]
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		<c:choose>
			<c:when test="${i==pu.pageNum }">
				<a href="/admin/mboard/review/list?pageNum=${i }
				&field=${field}&keyword=${keyword}">
				<span style="color:red">[${i }]</span>
				</a>
			</c:when>
			<c:otherwise>
				<a href="/admin/mboard/review/list?pageNum=${i }
				&field=${field}&keyword=${keyword}">[${i }]</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:choose>
		<c:when test="${pu.endPageNum<pu.totalPageCount }">
			<a href="/admin/mboard/review/list?pageNum=${pu.endPageNum+1 }">[다음]</a>
		</c:when>
		<c:otherwise>
			[다음]
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>