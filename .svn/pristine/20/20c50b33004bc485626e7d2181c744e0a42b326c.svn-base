<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px;margin-bottom: 20px;border-bottom-width:1px solid black;">
			커뮤니티
		</div>
		<div class="list_1" ><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/insert/comunity/border/free/list">자유게시판</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2" style="background-color: red;">
			<a href="/client/menu/insert/comunity/border/tip/list">팁 & 노하우</a>
		</div>
		<div class="list_3">
			<a href="/client/menu/insert/comunity/border/Review/list" >성공 후기</a>
		</div>
	</div>
	<img>
</div>

<div class="main">
	<h2>팁&노하우 게시판</h2>
			<span style="float: right;">
		<a href="/client/menu/insert/comunity/border/tip/list?cateNum=0">전체</a>
	<c:forEach var="cate" items="${cate }">
		<a href="/client/menu/insert/comunity/border/tip/list?cateNum=${cate.tcate_num }">${cate.tcate_name }/</a>
	</c:forEach> 
	</span>
	<div class="list" style="overflow: hidden;">

	<table >
		<tr>
			<th class="list_category">종류</th>
			<th class="list_num">글번호</th>
			<th class="list_title">제목</th>
			<th class="list_id">작성자</th>
			<th class="list_count">조회수</th>
			<th class="list_date">작성일</th>
		</tr>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td class="list_category">${dto.tcate_name }</td>
				<td class="list_num" >${dto.tip_num }</td>
				<td class="list_title" >
				<a href="/client/menu/insert/comunity/border/tip/view?tip_num=${dto.tip_num}">
				 ${dto.tip_title }    </a>(${dto.count })
				 </td>
				<td class="list_id" >${dto.id }</td>
			
				<td class="list_hits" >${dto.tip_hits }</td>
				<td class="list_date">${dto.tip_date.toString().substring(0,19) }</td>
			</tr>
			<tr><td colspan="6"><hr><td></tr>
		</c:forEach>
	</table>
	</div>
	<div class="list_number" style="text-align: center;"><!-- 페이징처리 -->
		<c:choose>
			<c:when test="${pu.startPageNum>10 }">
				<a href="/client/menu/insert/comunity/border/tip/list?pageNum=${pu.startPageNum-1 }">[이전]</a>
			</c:when>
			<c:otherwise>
				[이전]
			</c:otherwise>
		</c:choose>
		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<a href="/client/menu/insert/comunity/border/tip/list?pageNum=${i }
					&cateNum=${cateNum}&field=${field}&keyword=${keyword}">
					<span style="color:red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/client/menu/insert/comunity/border/tip/list?pageNum=${i }
					&cateNum=${cateNum}&field=${field}&keyword=${keyword}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount }">
				<a href="/client/menu/insert/comunity/border/tip/list?pageNum=${pu.endPageNum+1 }">[다음]</a>
			</c:when>
			<c:otherwise>
				[다음]
			</c:otherwise>
		</c:choose>
	</div>
	<div class="list_search">
		<form style="float: right;" method="get" action="/client/menu/insert/comunity/border/tip/list">
		<input type="hidden" name="cateNum" value="${cateNum }">
			<select name="field" >
				<option value="id">아이디</option>
				<option value="tip_title">글제목</option>
				<option value="tip_content">글내용</option>
			</select>
			<input type="text" name="keyword">
			<input type="image" src="/resources/images/search_icon.png" />
		</form>
		<a href="/client/menu/insert/comunity/border/tip/write">글쓰기 </a>
	</div>

</div>
</div>
</body>