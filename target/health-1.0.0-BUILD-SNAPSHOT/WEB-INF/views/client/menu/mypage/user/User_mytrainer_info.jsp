<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h3>내트레이너</h3>
	<table border="1" width="450">
		<tr>
			<td align="center"><img src="${dto.t_img }"	width="140px" height="200px" /></td>
		</tr>
		<tr>
			<td>아이디 : ${dto.t_id}</td>
		</tr>
		<tr>
			<td>이름 : ${dto.t_name}</td>
		</tr>
		<tr>
			<td>생년월일 : ${dto.t_birth}</td>
		</tr>
		<tr>
			<td>성별 : ${dto.t_gender}</td>
		</tr>
		<tr>
			<td>이메일 : ${dto.t_email}</td>
		</tr>
		<tr>
			<td>전화 : ${dto.t_phone}</td>
		</tr>
		<tr>
			<td>신장 : ${dto.t_height}cm</td>
		</tr>
		<tr>
			<td>체중 : ${dto.t_weight}kg</td>
		</tr>
		<tr>
			<td>소개글 : ${dto.t_introduction}</td>
		</tr>
	</table>
	
	<div align="center">
		<a href="/client/menu/mypage/Mypage">이전페이지로</a>
	</div>
	
	

</div>
</body>
</html>