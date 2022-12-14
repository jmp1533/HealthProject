<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin: 0;
		padding: 0;
	}
	ul,li {
		list-style: none;
	}
	body {
		text-align: center;
		color: #FFF;
		background: #FFF;
	}
	div#adminwapper {
		text-align: left;
		width: 1200px;
		margin: 0 auto;
		height: auto;
		position: static;
	}
	header,footer,nav,section,article {
		display: block;
	}
	header,nav,footer {
		background-color: #666;
	}	
	header,footer,nav,section {
	}	
	header,nav,footer {
		width: 100%;
	}
	header {
		height: 100px;
	}
	header ul li{
		float: left;
		padding-left: 5px;
		list-style-type: none;
	}
	nav {
		height: 40px;
		width: 1200px;
		position: absolute;
		z-index: 100;
	}
	nav .adminmenu li {
		float: left;
		width: 200px;
		list-style-type: none;
	}
	nav ul {
		margin-bottom: 0px;
		list-style-type: none;
	}
	nav .adminmenu a {
		padding-top: 10px;
		width: 100%;
		height: 30px;
		text-align: center;
		display: block;
		background-color: blue;
		color: white;
		text-decoration: none;
	}
	section {
		position: static;
		padding-top:100px;
		z-index:0;
	}
	#center{
		height: auto;
	}
	#center .cate{
		width: 20%;
		height:auto;
		float:left;
		background-color: white;
		text-decoration: none;
	}
	#center .content{
		width: 80%;
		height:auto;
		margin-left:20%;
		background-color: lime;
	}
	.suv ul{
	}
	footer {	
		height: 100px;
	}
	
</style>
<script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".adminmenu li a").click(function() {
			$(".suv ul").css("display", "block");
		});
	});
</script>
</head>
<body>
	<div id="adminwapper">
		<header>
			<a href="#"><h1>admin</h1></a>
			<a href="/"><h1>web</h1></a>
			<ul>
				<li>				
					<c:choose>
						<c:when test="${not empty sessionScope.adminid}">
							<a href="/client/user/insert/Logout">????????????</a>
						</c:when>
						<c:otherwise>
			     			<a href="#">?????????</a>
			     		</c:otherwise>
					</c:choose>
	     		</li>
				<li><a href="#">????????????</a></li>
				<li><a href="#">???????????????</a></li>
			</ul>
		</header>
		
		<nav>
			<ul class="adminmenu">
				<li><a href="#">??????</a></li>
				<li><a href="#">????????????</a></li>
				<li><a href="#">?????????</a></li>
				<li><a href="#">?????????</a></li>
				<li><a href="#">????????????</a></li>
				<li><a href="#">??????</a></li>
			</ul>
		</nav>
		
		<div id="center">
			<div class="cate">
				<section>
					<div class="suv">
						<ul>
							<li><a href="/admin/muser/list/list">????????????</a></li>
							<li><a href="/admin/muser/record/list">????????????</a></li>
						</ul>
						<ul>
							<li><a href="/admin/mtrainer/list/list">??????????????????</a></li>
							<li><a href="/admin/mtrainer/apply/list">????????????????????????</a></li>
							<li><a href="/admin/mtrainer/record/list">??????????????????</a></li>
						</ul>
						<ul>
							<li><a href="/admin/mhealth/list/CompanyList">????????? ??????</a></li>
							<li><a href="/admin/mhealth/apply/applylist">????????? ????????????</a></li>
						</ul>
						<ul>
							<li><a href="/admin/mboard/movie/health_movie_list">????????????</a></li>
							<li><a href="/admin/mboard/free/list">???????????????</a></li>
							<li><a href="/admin/mboard/tip/list">????????????</a></li>
							<li><a href="/admin/mboard/review/list">????????????</a></li>
						</ul>
						<ul>
							<li><a href="/admin/mservice/notice/Noticelist">????????????</a></li>
							<li><a href="/admin/mservice/faq/list">FAQ</a></li>
							<li><a href="/admin/mservice/qna/qna_list">QA</a></li>
						</ul>
						<ul>
							<li><a href="/admin/mstatistics/all/all">????????????</a></li>
							<li><a href="/admin/mstatistics/user/age">????????????</a></li>
							<li><a href="/admin/mstatistics/trainer/age">??????????????????</a></li>
						</ul>
					</div>
				</section>
			</div>
			<div class="content">
				<section>
					<tiles:insertAttribute name="admincontent"/>
				</section>
			</div>
		</div>
		<footer>
		</footer>
	</div>
</body>
</html>