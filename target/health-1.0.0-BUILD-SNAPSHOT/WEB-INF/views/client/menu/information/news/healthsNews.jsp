<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			건강정보
		</div>
		<div class="list_1" style="background-color: red;"><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/information/news/healthsNews"  >건강뉴스</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2">
			<a href="/client/menu/information/movie/health_movie_list" >운동 방법</a>
		</div>
	</div>
	<img>
</div>
<div class="main">
	<div class="list" style="overflow: hidden;">
		<table>
			<tr><td>
			<span style="font-size: 25px;">건강 뉴스</span>
			<span style="float: right;"><a href="/client/menu/information/news/healthsNews">최신순</a>
			<a href="/client/menu/information/news/healthsNews?sort=sim">정확순</a></span>
			</td></tr>
			<tr><td><hr ></td></tr>
			<c:forEach var="dto" items="${dto }">
				<tr>
					<td><a href="${dto.link }" target="_blank"><span style="font-size: 19px">${dto.title }</span></a><br/></td>
				</tr>
				<tr>
					<td><span style="font-size: 15px">${dto.content.substring(0,70) }....</span></td>
				</tr>
				<tr>
					<td><span style="float: right;">${dto.date }</span></td>
				</tr>
				<tr><td><hr><td></tr>
			</c:forEach>
		</table>
	</div>
	<div class="list_number" style="text-align: center;"><!-- 페이징처리 -->
		<c:choose>
			<c:when test="${pu.startPageNum>10 }">
				<a href="/client/menu/information/news/healthsNews?pageNum=${pu.startPageNum-1 }&sort=${sort }">[이전]</a>
			</c:when>
			<c:otherwise>
				[이전]
			</c:otherwise>
		</c:choose>
		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<a href="/client/menu/information/news/healthsNews?pageNum=${i }&sort=${sort }">
					<span style="color:red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/client/menu/information/news/healthsNews?pageNum=${i }&sort=${sort }">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount }">
				<a href="/client/menu/information/news/healthsNews?pageNum=${pu.endPageNum+1 }&sort=${sort }">[다음]</a>
			</c:when>
			<c:otherwise>
				[다음]
			</c:otherwise>
		</c:choose>
	</div>
	<!-- 
	<div class="list_search">
		<form style="float: right; margin-right: 80px; margin-top: 15px" method="post" action="/client/menu/information/news/healthsNews">
			<select name="field">
				<option value="title">글제목</option>
				<option value="content">글내용</option>
			</select>
			<input type="text" name="keyword">
			<input type="submit" value="검색">
		</form>
	</div> -->
</div>
</div>