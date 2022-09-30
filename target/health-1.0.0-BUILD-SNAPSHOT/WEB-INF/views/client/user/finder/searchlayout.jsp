<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/jquery-ui-1.10.3.custom.css" type="text/css" />
<script type="text/javascript"
	src="resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript"
	src="resources/js/jquery-ui-1.10.3.custom.js"></script>
<style type="text/css">
*{
	margin: 0;
	padding: 0; 
}
.wrap{
	height: 500px;
	width: 500px;
}

header,footer,section{
	display: block;
}

header{
	height: 80px;
}

body{
	text-align: center;
}
section{
	position: static;
	padding-top: 20px;
	background-color: silver;
	width: 100%;
	height: auto;
	z-index: 0;	
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="wrap">
	<header>
		<h2>아이디/비밀번호 찾기</h2>
	</header>
	
	<section>
		<tiles:insertAttribute name="search_content" />
	</section>
	<footer>Footer</footer>
</div>
</body>
</html>