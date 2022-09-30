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
	<form action="/client/user/finder/search/hintCompare" method="post">
	<c:choose>
		<c:when test="${not empty u_id}">
			<input type="hidden" value="${u_id }" name="id" />
		</c:when>
		<c:when test="${not empty t_id}">
			<input type="hidden" value="${t_id }" name="id" />
		</c:when>
		<c:otherwise>
			<input type="hidden" value="${id}" name="id"/>
		</c:otherwise>
	</c:choose>
	
	<table  border="0" cellspacing="1" cellpadding="5">
		<tr>
			<td align=center bgcolor="#d3d3d3">비밀번호 질문</td>
			<td><select name="choice_question">
				<option value='1'>기억에 남는 추억의 장소는?</option>
				<option value='2'>자신의 인생 좌우명은?</option>
				<option value='3'>자신의 보물 제1호는?</option>
				<option value='4'>가장 기억에 남는 선생님 성함은?</option>
				<option value='5'>타인이 모르는 자신만의 신체비밀이 있다면?</option>
				<option value='6'>추억하고 싶은 날짜가 있다면?</option>
				<option value='7'>받았던 선물 중 기억에 남는 독특한 선물은?</option>
				<option value='8'>유년시절 가장 생각나는 친구 이름은?</option>
				<option value='9'>인상 깊게 읽은 책 이름은?</option>
				<option value='10'>읽은 책 중에서 좋아하는 구절이 있다면?</option>
				<option value='11'>자신이 두번째로 존경하는 인물은?</option>
				<option value='12'>친구들에게 공개하지 않은 어릴 적 별명이 있다면?</option>
				<option value='13'>초등학교 때 기억에 남는 짝꿍 이름은?</option>
				<option value='14'>다시 태어나면 되고 싶은 것은?</option>
				<option value='15'>내가 좋아하는 캐릭터는?</option>
			</select></td>
		</tr>
		<tr>
			<td>힌트 답</td>
			<td><input type="text" name="choice_answer"/></td>
		</tr>
	</table>
	<input type="submit" value="확인" />
	</form>	
</body>
</html>