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

<h3>헬스장신청목록</h3>

<form action="/admin/mhealth/apply/applydelete">
	<table border="1">
		<tr>
			<th><input type="checkbox" id="allch" name="allch"></th>
			
			<th>번호</th>
			<th>업체명</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>신청인</th>
			<th>신청일</th>
			<th>상세</th>
			
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td><input type="checkbox" name="delck" value="${dto.b_num}"></td>
				
				<td>${dto.b_num}</td>
				<td>${dto.b_name}</td>
				<td>${dto.b_phone}</td>
				<td>${dto.b_email}</td>
				<td>${dto.t_id}</td>
				<td>${dto.b_date}</td>
				
				<td>
					<a href="/admin/mhealth/apply/applyview?b_num=${dto.b_num}">상세보기</a>
				</td>
			</tr>
		</c:forEach>
	</table>
<input type="submit" value="삭제">
</form>
	<!-- 검색 -->
	<div>
		<form method="get" action="/admin/mhealth/apply/applylist">
			<select name="field">
				<option value="b_name">업체명</option>
				<option value="t_id">신청인</option>
				<option value="b_date">신청날짜</option>
			</select>
			<input type="text" name="keyword"/>		
			<input type="submit" value="검색"/>		
		</form>
	</div>
	
	<div>
		<c:choose>
			<c:when test="${pu.startPageNum>10 }">
				<a href="/admin/mhealth/apply/applylist?pageNum=${pu.startPageNum-1 }">[이전]</a>
			</c:when>
			<c:otherwise>
			[이전]
		</c:otherwise>
		</c:choose>

		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<a href="/admin/mhealth/apply/applylist?pageNum=${i}"> 
					<span style="color: red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/admin/mhealth/apply/applylist?pageNum=${i}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>

		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount}">
				<a href="/admin/mhealth/apply/applylist?pageNum=${pu.endPageNum+1 }">[다음]</a>
			</c:when>
			<c:otherwise>
			[다음]
		</c:otherwise>
		</c:choose>
	</div>



</body>
</html>