<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui-1.10.3.custom.js"></script>
<style type="text/css">
.*{
	padding : 0;
}
.wrap {
	width: 1280px;
	height: 880px;
	background-color: gray;
	margin: auto;
}
.top {
	width: 100%;
	height: 17%;
	background-color: skyblue;
	
}
.top1{
	width: 100%;
	height: 76%;
	background-color: purple;
}
.top2{
	width: 100%;
	height: 24%;
	background-color: maroon;
}
#dropDownMenu .mainmenu{
		float:left;
		width:200px;
		list-style-type: none;
		z-index: 1;
}
li.mainmenu ul{
	margin:0;
	list-style-type: none;
	padding: 0;
}
.mainmenu a{
		width:100%;
		padding-top:4%;
		padding-bottom:4%;
		display: block;/* 인라인요소를 블록요소로 바꾸기 */
		background-color: #a50000;
		color:white;
		text-decoration: none;
		border-bottom: 1px solid #fff
}
.mainmenu > a{ /* 클래스속성이 mainmenu의 요소중 첫번째 a 요소*/
	background-color: #555;
	height: 100%;
}
ul#dropDownMenu li a:hover{/* hover되었을때 배경색 바꾸기 */
	background-color: #aaa;
}
.main_nav{
	float: right;
	margin-right: 20px;
}
.main_nav ul li{
	list-style-type: none;
	float : left;
	margin-right: 5px;
}
.mid {
	width: 100%;
	height: 75%;
}
.tabs1{
	width:100%;
	height: 40%;
	background-color: red;
}
.menu_taps{
	width:60%;
	height:100%;
	border: 2px solid black;
	background-color: white;
	margin: auto;
}

.news_tab{
	width: 40%;
	height: 80%;
	border: 2px solid black;
	background-color: white;
	float:left;
	margin-top:1.4%;
	margin-bottom:1.4%;
	margin-left: 4.8%;
	margin-right: 4.8%;
}
.people_tab{
	width: 40%;
	height: 80%;
	border: 2px solid black;
	background-color: white;
	float:left;
	margin-top:1.4%;
	margin-bottom:1.4%;
	margin-left: 4.8%;
	margin-right: 4.8%;
}
.tabs2{
	width: 100%;
	height: 30%;
	background-color: blue;
}
.community_tabs{
	width: 100%;
	height: 30%;
	background-color: green;
}
.community1{
	width: 30%;
	height: 80%;
	border: 2px solid black;
	background-color: white;
	float:left;
	margin: 1.4%;
}
.community2{
	width: 30%;
	height: 80%;
	border: 2px solid black;
	background-color: white;
	float:left;
	margin: 1.4%;
}
.community3{
	width: 30%;
	height: 80%;
	border: 2px solid black;
	background-color: white;
	float:left;
	margin: 1.4%;
}

.bot {
	width: 100%;
	height: 8%;
	background-color: aqua;
}
</style>
<script type="text/javascript">
	$(document).ready(function(){
		$("li.mainmenu ul").hide();//하위메뉴숨기기
		$("li.mainmenu").hover(function(){
			//$('ul',this) => 자기자신(this)의 자식중 ul요소
			$('ul',this).stop();
			$('ul',this).slideDown(500);
		},function(){
			$('ul',this).slideUp(500);
		});
	});
</script>
</head>
<body>
<div class="wrap">

	<div class="top">
		<div class="top1">
			<div class="main_img">
				<a href="main.html"><img src=""></a>
				검색<input type="text" id="search" />
			</div>
			<div class="main_nav">
				<ul>
					<li><a href="client/user/insert/user/login">로그인</a>
					<li><a href="client/user/insert/user/User_sign_up">회원가입</a>
					<li><a href="#">고객센터</a>
					<li><a href="#">마이페이지</a>
				</ul>
			</div>
		</div>
		<div class="top2">
			<ul id="dropDownMenu" style="margin-top: 0px;
    			margin-bottom: 0px;">
				<li class="mainmenu" style="height: 42.234;">
					<a href="#">건강정보</a>
					<ul><!-- 하위메뉴 -->
						<li><a href="#">건강뉴스</a></li>
						<li><a href="#">운동방법</a></li>
					</ul>
				</li>
				<li class="mainmenu">
					<a href="#">다이어리</a>
					<ul>
						<li><a href="#">다이어리</a></li>
						<li><a href="#">체중변화그래프</a></li>
					</ul>
				</li>
				<li class="mainmenu">
					<a href="#">매장/공원</a>
					<ul>
						<li><a href="#">헬스장 검색</a></li>
						<li><a href="#">공원 위치찾기</a></li>
					</ul>
				</li>
				<li class="mainmenu">
					<a href="#">피플</a>
					<ul>
						<li><a href="#">트레이너 현황</a></li>
						<li><a href="#">헬스프렌드 찾기</a></li>
					</ul>
				</li>
				<li class="mainmenu">
					<a href="#">커뮤니티</a>
					<ul>
						<li><a href="#">자유게시판</a></li>
						<li><a href="#">팁&노하우 게시판</a></li>
						<li><a href="com.L3_1team.health.controller.client.menu/list">Before & After</a></li>
					</ul>
				</li>
				<li class="mainmenu">
					<a href="#">고객센터</a>
					<ul>
						<li><a href="#">공지사항</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">1:1문의</a></li>
						<li><a href="#">개인정보 취급방침</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
	
	<div class="mid">
		<div class="tabs1">
			<div class="menu_taps">
		
			</div>
		</div>
		<div class="tabs2">
			<div class="news_tab">
			
			</div>
			
			<div class="people_tab">
				
			</div>
		</div>
		
		<div class="community_tabs">
			<div class="community1"> 
			</div>
			<div class="community2">
			</div>
			<div class="community3">
			</div>
		</div>
		
	</div>
	
	<div class="bot">
	</div>
</div>
</body>
</html>