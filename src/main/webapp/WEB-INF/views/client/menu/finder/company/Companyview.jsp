<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
	*{margin: 0; padding: 0}
	#slide ul li{padding:1px; float: left;}
	#slide ul li img{width: 80px; height: 60px;}
	#map{
	}
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
<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			매장/정보
		</div>
		<div class="list_1"><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/finder/company/CompanyList" style="background-color: red;" >헬스장 검색</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2">
			<a href="/client/menu/finder/park/ParkList" >공원 위치찾기</a>
		</div>
	</div>
	<img>
</div>
<div class="main">
	<c:set var="dto" value="${company_Dto}"></c:set>
	<input type="hidden" value="${dto.b_name}" id="b_name"/>
	<input type="hidden" value="${dto.b_x}" id="x"/>
	<input type="hidden" value="${dto.b_y}" id="y"/>
	
	<div align="center">
		<div style="float: left;" id="slide">
			<img src="/resources/upload/${img[0]}" style="width: 315px; height: 300px;" id="mainimg"><br/>
			<ul>
				<li><img src="/resources/upload/${img[0]}"></li>
				<li><img src="/resources/upload/${img[1]}"></li>
				<li><img src="/resources/upload/${img[2]}"></li>
				<li><img src="/resources/upload/${img[3]}"></li>
			</ul>
			<ul>
				<li><img src="/resources/upload/${img[4]}"></li>
				<li><img src="/resources/upload/${img[5]}"></li>
				<li><img src="/resources/upload/${img[6]}"></li>
				<li><img src="/resources/upload/${img[7]}"></li>
			</ul>
		</div>
		
		<div>
		<table border="0" style="height: 350px;">
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
	<div align="center" style="float: none; margin-top: 100px;">
		<div id="map" style="height: 300px;"></div>
	</div>
</div>
</div>