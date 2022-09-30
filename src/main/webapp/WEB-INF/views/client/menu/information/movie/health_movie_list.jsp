<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style type="text/css">


</style>

<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			건강정보
		</div>
		<div class="list_1"><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/information/news/healthsNews"  >건강뉴스</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2" style="background-color: red;">
			<a href="/client/menu/information/movie/health_movie_list"  >운동 방법</a>
		</div>
	</div>
	<img>
</div>
<div class="main">
	<div class="list">
	<h1>운동영상</h1><br>
	<a href="/client/menu/information/movie/health_movie_list?cateNum=0"> <h3 style="margin-bottom: 4px;">&lt;전체&gt;</h3></a>
	<c:forEach var="cate" items="${vcate }" varStatus="n">
		<c:if test="${(n.index%8)== 0 && n.index!=0}"><br> </c:if>
		<a href="/client/menu/information/movie/health_movie_list?cateNum=${cate.vcate_num }"> &lt;${cate.vcate_name }&gt;  </a>

	</c:forEach>
	<table style="margin-top: 10px;">
		<tr>
			<th class="list_num">글번호</th>
			<th class="list_pitcture">이미지</th>
			<th class="list_title">글제목</th>
			<th class="list_count">조회수</th>
		</tr>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td class="list_num">${dto.v_num }</td>
				<td class="list_pitcture"><a href="${dto.v_image }" target="_blank"><img
						src="${dto.v_image }" style="width: 60px; height: 48px"></a></td>
				<td class="list_title"><a
					href="/client/menu/information/movie/health_movie_view?num=${dto.v_num }">${dto.v_title }</a></td>
				<td class="list_count">${dto.v_hits }</td>
			</tr>
			<tr><td colspan="4"> <hr></td></tr>
		</c:forEach>
	</table>
	</div>
	<div class="list_number" style="text-align: center;"><!-- 페이징처리 -->
		<c:choose>
			<c:when test="${pu.startPageNum>10 }">
				<a
					href="/client/menu/information/movie/health_movie_list?pageNum=${pu.startPageNum-1 }&cateNum=${cateNum}&field=${field}&keyword=${keyword}">[이전]</a>
			</c:when>
			<c:otherwise>
			[이전]
		</c:otherwise>
		</c:choose>
		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<!--현재페이지만 빨간색으로 표시-->
					<a href="/client/menu/information/movie/health_movie_list?pageNum=${i}&cateNum=${cateNum}&field=${field}&keyword=${keyword}">
						<span style="color: red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/client/menu/information/movie/health_movie_list?pageNum=${i}&cateNum=${cateNum}&field=${field}&keyword=${keyword}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount }">
				<a href="/client/menu/information/movie/health_movie_list?pageNum=${pu.endPageNum+1 }&cateNum=${cateNum}&field=${field}&keyword=${keyword}">[다음]</a>
			</c:when>
			<c:otherwise>
			[다음]
		</c:otherwise>
		</c:choose>
	</div>
	<div class="list_search">
		<form  style="float: right;" method="get" action="/client/menu/information/movie/health_movie_list">
			<input type="hidden" name="cateNum" value="${cateNum }">
			<select name="field">
				<option value="v_title">글제목</option>
				<option value="v_content">글내용</option>
			</select>
			<input type="text" name="keyword"> <input type="submit" value="검색">
		</form>
	</div>
</div>
</div>












