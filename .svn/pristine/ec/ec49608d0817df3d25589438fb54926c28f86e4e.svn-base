<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu" ><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			고객센터
		</div>
		<div class="list_1" style="background-color: red;" ><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/service/notice/Noticelist">공지사항</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2" >
			<a href="/client/menu/service/faq/list">FAQ</a>
		</div>
		<div class="list_3" >
			<a href="/client/menu/service/qna/qna_list" >1:1문의</a>
		</div>
		<div class="list_4" >
			<a href="/client/menu/service/policy/view" >개인정보 취급방침</a>
		</div>
	</div>
</div>
<div class="main">
	<h2 align="center">공지사항</h2>
	
	<div class="list">
	<table>
		<tr>
			<th class="list_num">글번호</th>
			<th class="list_title">제목</th>
			<th class="list_id">작성자</th>
			<th class="list_date">작성일</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<c:set var="count" value="${count-1}"/>
				<tr>
					<td class="list_num" >${count}</td>
					<td class="list_title"><a href="/client/menu/service/notice/view?noti_num=${dto.noti_num}">${dto.noti_title}</a></td>
					<td class="list_id" >관리자</td>
					<td class="list_date">${dto.noti_date}</td>
				</tr>
				
		</c:forEach>
	</table>
	</div>
	<div class="list_number" style="text-align: center;">
		<c:choose>
			<c:when test="${pu.startPageNum>10 }">
				<a href="/client/menu/service/notice/Noticelist?pageNum=${pu.startPageNum-1 }">[이전]</a>
			</c:when>
			<c:otherwise>
			[이전]
		</c:otherwise>
		</c:choose>

		<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
			<c:choose>
				<c:when test="${i==pu.pageNum }">
					<a href="/client/menu/service/notice/Noticelist?pageNum=${i}"> <span
						style="color: red">[${i }]</span>
					</a>
				</c:when>
				<c:otherwise>
					<a href="/client/menu/service/notice/Noticelist?pageNum=${i}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>

		<c:choose>
			<c:when test="${pu.endPageNum<pu.totalPageCount}">
				<a href="/client/menu/service/notice/Noticelist?pageNum=${pu.endPageNum+1 }">[다음]</a>
			</c:when>
			<c:otherwise>
			[다음]
		</c:otherwise>
		</c:choose>
	</div>
</div>
</div>