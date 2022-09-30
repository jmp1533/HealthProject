<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.choice_main div{
	background-color: white;
	width: 300px;
	height: 300px;
	float: left;
	margin:50px;
}
</style>
</head>
<body>
<div class="choice_main" style="width:1000px; height: 700px; margin:auto;">
	<div class="user_sign" style="background-image: url('/resources/images/user_sign.png');">
		<div style="width: 100px; height: 27px; margin-top: 190px; margin-left: 100px;">
			<a href="/client/user/insert/user/User_sign_up"><img src="/resources/images/user_sign_btn.png" /> </a>
		</div>
	</div>
	<div class="trainer_sign" style="background-image: url('/resources/images/trainer_sign.png');">
		<div style="width: 100px; height: 27px; margin-top: 190px; margin-left: 100px;">
			<a href="/client/user/insert/trainer/Trainer_sign_up"><img src="/resources/images/trainer_sign_btn.png" /></a>
		</div>
	</div>
</div>
</body>
</html>