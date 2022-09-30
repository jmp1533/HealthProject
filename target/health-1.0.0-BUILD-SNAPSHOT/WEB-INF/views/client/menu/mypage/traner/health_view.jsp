<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_1">
			<a href="/client/menu/mypage/traner/Trainer_info">내정보</a>
		</div>
		<div class="list_2">
			<a href="/client/menu/mypage/traner/Trainer_health_register">내 헬스장</a>
		</div>
		<div class="list_3">
			<a href="/client/menu/mypage/traner/joinlist">회원관리 목록</a>
		</div>	
		<div class="list_4">
			<a href="/client/menu/mypage/traner/joinapplylist">신청 회원</a>
		</div>	
		<div class="list_5">
			<a href="/client/menu/mypage/traner/Trainer_out_pwd">회원탈퇴</a>
		</div>
	</div>
</div>
<c:set var="dto" value="${dto }"/>
	<h2>헬스장</h2>
	
	<table  border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td>업체명</td>
			<td>
				<input size="30" type="text" name="b_name" value="${dto.b_name }" readonly="readonly"/>
			</td>
		</tr>
		
		<tr>
			<td>사업자등록번호</td>
			<td>
				  <input size="3" type="text" name="b_corporatenum1" value="${dto.b_corporatenum1 }" readonly="readonly"/>
				- <input size="2" type="text" name="b_corporatenum2" value="${dto.b_corporatenum2 }" readonly="readonly"/>
				- <input size="5" type="text" name="b_corporatenum3" value="${dto.b_corporatenum3 }" readonly="readonly"/>
			</td>
		</tr>
		
		<tr>
			<td rowspan="1">주소</td>
			<td>
				<input size="10" type="text" name="zipcode1" value="${dto.zipcode1 }" readonly="readonly"/><br/>
				<input size="50" type="text" name="addr1" value="${dto.addr1 }" readonly="readonly"/><br/>
				<input size="50" type="text" name="addr2" value="${dto.addr2 }" readonly="readonly"/>
			</td>
		</tr>
		
		<tr>
			<td>전화번호</td>
			<td>
				<input size="5" type="text" name="b_phone1" value="${dto.b_phone1 }" readonly="readonly"/>
				- <input size="5" type="text" name="b_phone2" value="${dto.b_phone2 }" readonly="readonly"/>
				- <input size="5" type="text" name="b_phone3" value="${dto.b_phone3 }" readonly="readonly"/>
			</td>
		</tr>
		
		<tr>
			<td>이메일</td>
			<td>
				<input size="15" type="text" name="b_email1" value="${dto.b_email1 }" readonly="readonly"/>
				@ <input size="15" type="text" name="b_email2" id="b_email2" value="${dto.b_email2 }" readonly="readonly"/>
			</td>
		</tr>
		
		<tr>
			<td>소개글</td>
			<td>
				<textarea rows="20" cols="70" name="b_content">${dto.b_content }</textarea>
			</td>
		</tr>
	</table>
	<table border="0" cellspacing="1" cellpadding="5">
		<tr>
		<th>이미지</th>
			<c:forEach var="img" items="${img}">
				<c:set var="i" value="${i+1}" />	
					<td>
						<img src="resources/uploadG/${img }" width='200px' height='200px'/>
					</td>
				
				<c:if test="${i%4==0}">
					<c:if test="${i%8!=0}">
						<tr></tr>
						<th>이미지</th>
					</c:if>
				</c:if>
			</c:forEach>
		</tr>
	</table>
	<a href="/client/menu/mypage/traner/health_update">수정</a>
</div>
</body>
</html>