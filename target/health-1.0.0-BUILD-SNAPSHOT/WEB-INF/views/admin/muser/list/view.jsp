<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원상세보기</h2>

	사진 : <img src="resources/upload/${dto.u_img}">
	아이디 : ${dto.u_id }
	이름 : ${dto.u_name}
	성별 : ${dto.u_gender}
	생년월일 : ${dto.u_birth}
	전화번호 : ${dto.u_phone}
	이메일 : ${dto.u_email}
	주소 : ${dto.u_zipcode},${dto.u_addr}
	목표체중 : ${dto.u_targetweight}
	가입일 : ${dto.u_regdate}
	탈퇴여부 : ${dto.u_out}
	
	<br/>
	<a href="/admin/muser/list/list">목록보기</a>
</body>
</html>