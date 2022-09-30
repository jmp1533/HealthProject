<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	td { 
		text-align: center;
	}
</style>
<title>Insert title here</title>
</head>
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
<body>
	<table border="1" width="550px">
		<tr>
			<th colspan="6">${sessionScope.id}님 쪽지함</th>
		</tr>
		<tr>
			<td width="1%"><input type="checkbox" id="allch" name="allch"></td>
			<td width="14%">글번호</td>
			<td width="40%">글제목</td>
			<td width="10%">보낸이</td>
			<td width="20%">보낸날짜</td>
			<td width="15%"></td>
		</tr>
	</table>
	
	<form method="post" action="/client/popup/msg/msgdelete">
		<div style="width: 580px; height: 290px; overflow: auto;">
			<table border="1" width="550px">
				<c:forEach var="msg_Dto" items="${list}">
					<c:set var="count" value="${count-1}" />
					<tr>
						<td width="1%">
							<input type="checkbox" name="delck" value="${msg_Dto.msg_num}">
						</td>
						<td width="14%">${count}</td>
						<td width="40%">
						<a href="/client/popup/msg/msgview?msg_num=${msg_Dto.msg_num}">${msg_Dto.msg_title}</a></td>
						<td width="10%">${msg_Dto.msg_send_id}</td>
						<td width="20%">${msg_Dto.msg_date}</td>
						<td width="15%">
							<c:choose>
								<c:when test="${msg_Dto.msg_condition==1}">
									읽지않음
								</c:when>
								<c:otherwise>
									읽음
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	
		<div>
			<input type="submit" value="삭제"/>
			<a href="/client/popup/msg/msginsert">글쓰기</a>
		</div>
	</form>
	
	<div>
		<c:choose>
			<c:when test="${page.startPageNum>10 }">
				<a href="/client/popup/msg/msglist?pageNum=${page.startPageNum-1 }">[이전]</a>
			</c:when>
			<c:otherwise>
			[이전]
		</c:otherwise>
		</c:choose>
		<c:forEach var="i" begin="${page.startPageNum}"
			end="${page.endPageNum}">
			<c:choose>
				<c:when test="${i==page.pageNum}">
					<a href="/client/popup/msg/msglist?pageNum=${i}"> <span
						style="color: red">[${i}]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/client/popup/msg/msglist?pageNum=${i}">[${i}]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:choose>
			<c:when test="${page.endPageNum<page.totalPageCount}">
				<a href="/client/popup/msg/msglist?pageNum=${page.endPageNum+1}">[다음]</a>
			</c:when>
			<c:otherwise>
			[다음]
		</c:otherwise>
		</c:choose>
	</div>
</body>
</html>