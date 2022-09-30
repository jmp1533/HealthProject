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
	<h3>트레이너등록</h3>
<form method="post" action="/admin/mtrainer/apply/update">
	<input type="submit" value="등록하기">
	<table border="1">
		<tr>
			<th><input type="checkbox" id="allch" name="allch"></th>
			<th>이미지</th>
			<th>아이디</th>
			<th>이름</th>
			<th>성별</th>
			<th>이메일</th>
			<th>가입일</th>
			<th>상세</th>
		<tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>
					<input type="checkbox" name="delck" value="${dto.t_id}">
				</td>
				<td align="center">
					<img src="/resources/upload/${dto.t_img}" width="30px" height="30px"/>
				</td>
				<td>${dto.t_id}</td>
				<td>${dto.t_name}</td>
				<td>
					<c:choose>
						<c:when test="${dto.t_gender==1}">
							남자
						</c:when>
						<c:otherwise>
							여자
						</c:otherwise>
					</c:choose>
				</td>
				<td>${dto.t_email}</td>
				<td>${dto.t_date}</td>
				<td>
					<a href="/admin/mtrainer/apply/view?id=${dto.t_id}">상세보기</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</form>

<!-- 검색 -->
	<div>
		<form method="get" action="/admin/mtrainer/apply/list">
			<select name="field">
				<option value="t_id">아이디</option>
				<option value="t_name">이름</option>
				<option value="t_date">가입일</option>
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
					href="/admin/mtrainer/apply/list?pageNum=${pu.startPageNum-1 }">[이전]</a>
			</c:when>
			<c:otherwise>
			[이전]
		</c:otherwise>
		</c:choose>

		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<!--현재페이지만 빨간색으로 표시-->
					<a href="/admin/mtrainer/apply/list?pageNum=${i}"> <span
						style="color: red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/admin/mtrainer/apply/list?pageNum=${i}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>

		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount}">
				<a
					href="/admin/mtrainer/apply/list?pageNum=${pu.endPageNum+1 }">[다음]</a>
			</c:when>
			<c:otherwise>
			[다음]
		</c:otherwise>

		</c:choose>
	</div>
</body>
</html>
