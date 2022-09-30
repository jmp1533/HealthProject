<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{margin: 0; padding: 0}
	#slide ul li{padding:1px; float: left;}
	#slide ul li img{width: 50px; height: 50px;}
</style>
<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
<script type="text/javascript">
	window.onload = function() {
		if (navigator.geolocation == undefined) {
			alert("위치정보를 이용할 수 없습니다.");
			return;
		}
		
		var b_name = document.getElementById("b_name").value;
		var x = document.getElementById("x").value;
		var y = document.getElementById("y").value;

		var myMap = document.getElementById("map");
		var loc = new google.maps.LatLng(x, y);
		var gmap = new google.maps.Map(myMap, {
			zoom : 16,
			center : loc,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		});
		var gmarker = new google.maps.Marker({
			position : loc,
			map : gmap,
			title : b_name
		});
		
		$("img").each(function(){
			$(this).click(function(){
				var src = $(this).attr("src"); 
				$("#mainimg").attr("src", src);
			});
		});
	}
</script>
</head>
<body>
	<c:set var="dto" value="${company_Dto}"></c:set>
	<input type="hidden" value="${dto.b_name}" id="b_name"/>
	<input type="hidden" value="${dto.b_x}" id="x"/>
	<input type="hidden" value="${dto.b_y}" id="y"/>
	
	<div align="center">
		<div style="float: left;" id="slide">
			<img src="${img[0]}" style="width: 215px; height: 200px;" id="mainimg"><br/>
			<ul>
				<li><img src="${img[0]}"></li>
				<li><img src="${img[1]}"></li>
				<li><img src="${img[2]}"></li>
				<li><img src="${img[3]}"></li>
			</ul>
			<ul>
				<li><img src="${img[4]}"></li>
				<li><img src="${img[5]}"></li>
				<li><img src="${img[6]}"></li>
				<li><img src="${img[7]}"></li>
			</ul>
		</div>
		
		<div>
		<table border="1" style="height=200px;">
			<tr>
				<th colspan="2">${dto.b_name}</th>
			</tr>
			<tr>
				<td width="100px;">설명</td>
				<td>${dto.b_content}</td>
			</tr>
			<tr>
				<td>주소</td>
				<td>${dto.b_addr}</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>${dto.b_phone}</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>${dto.b_email}</td>
			</tr>
		</table>			
		</div>
	</div>

	<div align="center" style="margin-top: 200px">
		<div id="map" style="height: 185px;"></div>
	</div>
</body>
</html>