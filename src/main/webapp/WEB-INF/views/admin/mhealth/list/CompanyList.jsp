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
<form method="post" action="/admin/mhealth/list/CompanyList">
		헬스장검색
		<input type="text" name="companyname" id="companyname"/>
		<input type="submit" value="검색"/> <br/>
</form>
<form method="post" action="/admin/mhealth/list/Companydelete">
<input type="submit" value="삭제"/>
		<table border="1" width="800" align="center">
		<tr>
			<td><input type="checkbox" id="allch" name="allch"></td>
			<th>헬스장</th>
			<th>주소</th>
			<th>전화번호</th>
		</tr>
		<c:forEach var="companydto" items="${requestScope.list}">
		<tr>
			<td>
				<input type="checkbox" name="delck" value="${companydto.b_num}">
			</td>
			<td><a href="/admin/mhealth/list/Companyview?b_num=${companydto.b_num}">${companydto.b_name}</a></td>
			<td>${companydto.b_addr}</td>
			<td>${companydto.b_phone}</td>
		</tr>
			</c:forEach>
		</table>
</form>
<div>
	<c:choose>
		<c:when test="${page.startPageNum>10 }">
			<a href="/admin/mhealth/list/CompanyList?pageNum=${page.startPageNum-1 }">[이전]</a>
		</c:when>
		<c:otherwise>
			[이전]
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="${page.startPageNum}" end="${page.endPageNum}">
		<c:choose>
			<c:when test="${i==page.pageNum}">
				<a href="/admin/mhealth/list/CompanyList?pageNum=${i}&companyname=${companyname}">
				<span style="color:red">[${i}]</span>
				</a>
			</c:when>
			<c:otherwise>
				<a href="/admin/mhealth/list/CompanyList?pageNum=${i}&companyname=${companyname}">[${i}]</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	<c:choose>
		<c:when test="${page.endPageNum<page.totalPageCount}">
			<a href="/admin/mhealth/list/CompanyList?pageNum=${page.endPageNum+1}&companyname=${companyname}">[다음]</a>
		</c:when>
		<c:otherwise>
			[다음]
		</c:otherwise>
	</c:choose>
</div>
</body>
</html>