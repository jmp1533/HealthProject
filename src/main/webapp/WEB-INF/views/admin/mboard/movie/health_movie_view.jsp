<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		height: 1600px;
	}
</style>
</head>
<body>
<h2>글상세보기</h2>
<div align="center">
<a href="/admin/mboard/movie/update?v_num=${dto.v_num }">수정</a>
<table width="600">
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
</body>
</html>







