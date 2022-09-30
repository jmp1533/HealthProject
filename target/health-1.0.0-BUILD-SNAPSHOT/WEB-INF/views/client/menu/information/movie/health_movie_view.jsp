<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			건강정보
		</div>
		<div class="list_1"><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/information/news/healthsNews"  >건강뉴스</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2">
			<a href="/client/menu/information/movie/health_movie_list" style="background-color: red;" >운동 방법</a>
		</div>
	</div>
	<img>
</div>
<div class="main">
<h2>글상세보기</h2>
<div align="center">
<table >
	<tr>
		<td align="center">${dto.v_title }</td>
	</tr>
	<tr>
		<td align="center"><iframe src="${dto.v_link }" style="width: 550px; height: 400px">이영상은 띄울수가 없습니다.</iframe></td>
	</tr>
	<tr>
		<td align="center">${dto.v_content }</td>
	</tr>
	
</table>
</div>

</div>
</div>






