<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<h2>방명록</h2>
<form method="post" action="/admin/mboard/tip/delete">
	<input type="submit" value="삭제">
	<a href="/admin/mboard/tip/list?cateNum=0">전체</a>
<c:forEach var="cate" items="${cate }">
	<a href="/admin/mboard/tip/list?cateNum=${cate.tcate_num }">${cate.tcate_name }</a>
</c:forEach> 
<table border="1" width="600">
	<tr>
		<th><input type="checkbox" id="allch" name="allch"></th>
		<th>글번호</th><th>작성자</th><th>제목</th><th>작성일</th><th>종류</th><th>조회수</th><th>추천수</th>
	</tr>
	<c:forEach var="dto" items="${list }">
		<tr>
		<td>
			<input type="checkbox" name="delck" value="${dto.tip_num}">
		</td>
			<td>${dto.tip_num }</td>
		<td>${dto.id }</td>
		<td><a href="/admin/mboard/tip/view?tip_num=${dto.tip_num}"> ${dto.tip_title } </a></td>
		<td>${dto.tip_date }</td>
		<td>${dto.tcate_name }</td>
		<td>${dto.tip_hits }</td>
		<td>${dto.count }</td>
		</tr>
	</c:forEach>
</table>
</form>
<form method="get" action="/admin/mboard/tip/list">
	<input type="hidden" name="cateNum" value="${cateNum }">
		<select name="field" >
			<option value="id">아이디</option>
			<option value="tip_title">글제목</option>
			<option value="tip_content">글내용</option>
		</select>
		<input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
<div>
	<c:choose>
		<c:when test="${pu.startPageNum>10 }">
			<a href="/admin/mboard/tip/list?pageNum=${pu.startPageNum-1 }">[이전]</a>
		</c:when>
		<c:otherwise>
			[이전]
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		<c:choose>
			<c:when test="${i==pu.pageNum }">
				<a href="/admin/mboard/tip/list?pageNum=${i }
				&cateNum=${cateNum}&field=${field}&keyword=${keyword}">
				<span style="color:red">[${i }]</span>
				</a>
			</c:when>
			<c:otherwise>
				<a href="/admin/mboard/tip/list?pageNum=${i }
				&cateNum=${cateNum}&field=${field}&keyword=${keyword}">[${i }]</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:choose>
		<c:when test="${pu.endPageNum<pu.totalPageCount }">
			<a href="/admin/mboard/tip/list?pageNum=${pu.endPageNum+1 }">[다음]</a>
		</c:when>
		<c:otherwise>
			[다음]
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>