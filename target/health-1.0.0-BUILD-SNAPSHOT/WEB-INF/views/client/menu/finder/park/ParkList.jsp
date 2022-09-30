<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">
.list_number{
	width:100%;
	height: 20px;
}
.list_menu div a:HOVER {
	background-color: red;
}
</style>
<body>
<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			매장/정보
		</div>
		<div class="list_1" ><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/finder/company/CompanyList"  >헬스장 검색</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2" >
			<a href="/client/menu/finder/park/ParkList" style="background-color: red;" >공원 위치찾기</a>
		</div>
	</div>
	<img>
</div>
<div class="main">
	<div class="list">
	 
		<form method="post" action="/client/menu/finder/park/ParkList">
			<!-- 
				공원검색
				<input type="text" name="parkname"/>
				<input type="submit" value="검색"/> 
			-->
			<table border="1">
			<tr>
				<th>공원명</th>
				<th>주소</th>
				<th>전화번호</th>
			</tr>
			<c:forEach var="parkdto" items="${requestScope.list}">
			<tr>
				<td><a href="/client/menu/finder/park/Parkview?p_idx=${parkdto.p_idx}">${parkdto.p_park}</a></td>
				<td>${parkdto.p_addr}</td>
				<td>${parkdto.p_admintel}</td>
			</tr>
				</c:forEach>
			</table>
		</form>
	</div>
	<div class="list_number" style="text-align: center;">
		<c:choose>
			<c:when test="${page.startPageNum>10 }">
				<a href="/client/menu/finder/park/ParkList?pageNum=${page.startPageNum-1 }">[이전]</a>
			</c:when>
			<c:otherwise>
				[이전]
			</c:otherwise>
		</c:choose>
		<c:forEach var="i" begin="${page.startPageNum}" end="${page.endPageNum}">
			<c:choose>
				<c:when test="${i==page.pageNum}">
					<a href="/client/menu/finder/park/ParkList?pageNum=${i}">
					<span style="color:red">[${i}]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/client/menu/finder/park/ParkList?pageNum=${i}">[${i}]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:choose>
			<c:when test="${page.endPageNum<page.totalPageCount}">
				<a href="/client/menu/finder/park/ParkList?pageNum=${page.endPageNum+1}">[다음]</a>
			</c:when>
			<c:otherwise>
				[다음]
			</c:otherwise>
		</c:choose>
	</div>
</div>
</div>
</body>