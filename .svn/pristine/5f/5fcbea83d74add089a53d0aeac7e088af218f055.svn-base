<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="http://maps.google.com/maps/api/js?sensor=true"></script>
<script type="text/javascript">
	window.onload = function() {
		if (navigator.geolocation == undefined) {
			alert("위치정보를 이용할 수 없습니다.");
			return;
		}
		
		var p_park = document.getElementById("p_park").value;
		var logitude = document.getElementById("logitude").value;
		var latitude = document.getElementById("latitude").value;

		var myMap = document.getElementById("map");
		var loc = new google.maps.LatLng(latitude, logitude);
		var gmap = new google.maps.Map(myMap, {
			zoom : 16,
			center : loc,
			mapTypeId : google.maps.MapTypeId.ROADMAP
		});
		var gmarker = new google.maps.Marker({
			position : loc,
			map : gmap,
			title : p_park
		});
	}
</script>
<body>
	<c:set var="dto" value="${parklist_Dto}"></c:set>
	<input type="hidden" value="${dto.p_park}" id="p_park">
	<input type="hidden" value="${dto.logitude}" id="logitude">
	<input type="hidden" value="${dto.latitude}" id="latitude">
	
	<div align="center">
		<img src="${dto.p_img}" style="width: 200px; height: 200px; float: left;">
		<div>
		<table border="1" height="200px;">
			<tr>
				<th colspan="2">${dto.p_park}</th>
			</tr>
			<tr>
				<td width="100px;">설명</td>
				<td>${dto.p_list_content}</td>
			</tr>
			<tr>
				<td>주소</td>
				<td>${dto.p_addr}</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>${dto.p_admintel}</td>
			</tr>
		</table>			
		</div>
	</div>

	<div align="center" style="clear: both;">
		<div id="map" style="height: 270px;"></div>
	</div>
</body>