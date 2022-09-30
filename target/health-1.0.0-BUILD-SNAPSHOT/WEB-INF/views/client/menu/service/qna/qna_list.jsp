<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu" ><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			고객센터
		</div>
		<div class="list_1"  ><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/service/notice/Noticelist">공지사항</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2"  >
			<a href="/client/menu/service/faq/list">FAQ</a>
		</div>
		<div class="list_3" style="background-color: red;">
			<a href="/client/menu/service/qna/qna_list" >1:1문의</a>
		</div>
		<div class="list_4" >
			<a href="/client/menu/service/policy/view" >개인정보 취급방침</a>
		</div>
	</div>
</div>
<div class="main">
	<h3>1:1문의 내역</h3>
	<div class="list" style="min-height: 500px;">
		<table>
			<tr>
				<th>분류</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<c:forEach var="list" items="${list}">
				<tr>
					<td>${list.qcate_name}</td>
					<td><a href="/client/menu/service/qna/qna_view?q_num=${list.q_num}">${list.q_title}</a></td>
					<td>${list.id}</td>
					<td>${list.q_date}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<a href="/client/menu/service/qna/qna_write">글쓰기</a>
</div>
</div>