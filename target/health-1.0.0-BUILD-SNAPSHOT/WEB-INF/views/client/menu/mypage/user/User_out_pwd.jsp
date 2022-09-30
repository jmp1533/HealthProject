<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<a href="/client/menu/mypage/user/User_info">내정보</a>
		</div>
		<div class="list_2">
			<a href="/client/menu/mypage/user/User_mytrainer_info">담당 트레이너</a>
		</div>
		<div class="list_3">
			<a href="/client/menu/mypage/user/User_out_pwd">회원탈퇴</a>
		</div>
	</div>
</div>
<h2>회원탈퇴</h2>

<form method="post" action="/client/menu/mypage/user/User_out_pwd">
	
	<div>탈퇴사유 선택</div>
	
	<input type="radio" name="out_reason" id="reason1" value="개인정보 변경으로 인한 재가입"/><label for="reason1">개인정보 변경으로 인한 재가입</label><br/>
	<input type="radio" name="out_reason" id="reason2" value="자주 이용하지 않음"/><label for="reason2">자주 이용하지 않음</label><br/>
	<input type="radio" name="out_reason" id="reason3" value="찾고자 하는 정보가 없음"/><label for="reason3">찾고자 하는 정보가 없음</label><br/>
	<input type="radio" name="out_reason" id="reason4" value="타 사이트의 유사서비스 이용"/><label for="reason4">타 사이트의 유사서비스 이용</label><br/>
	<input type="radio" name="out_reason" id="reason5" value="속도가 느림"/><label for="reason5">속도가 느림</label><br/>
	<input type="radio" name="out_reason" id="reason6" value="개인정보/사생활 침해 사례 경험"/><label for="reason6">개인정보/사생활 침해 사례 경험</label><br/>
	<input type="radio" name="out_reason" id="reason7"
	 value="기타"/><label for="reason7">기타</label>
	
	<br/><br/>
	
	
	
	
	<div>고객님의 정보를 안전하게 보호하기 위해 비밀번호를 입력해 주시기 바랍니다.</div>
	<c:choose>
		<c:when test="${not empty sessionScope.ulogid}">
			<label for="pwd">비밀번호</label> 
			<input type="password" id="pwd"	name="pwd"><br/> 
		</c:when>
	</c:choose>

	<div align="center">
		<input type="submit" value="회원탈퇴"/>
	</div>
</form>
</div>
</body>
</html>