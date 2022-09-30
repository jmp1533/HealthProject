<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>1:1문의</h2>
<form method="post" action="/client/menu/service/qna/qna_write" enctype = "multipart/form-data" name="frm1" >


<label for="cate">분류선택</label>
<select name="qcate_num">
	<option value="1" selected="selected">가입/탈퇴</option>
	<option value="2">홈페이지이용</option>
	<option value="3">홈페이지오류</option>
	<option value="4">기타</option>
</select>

<br/>

<label for="q_title">제목</label><input type="text" name="q_title" size="150"/> <br/>
<label for="q_content">내용</label><textarea name="q_content" rows="10" cols="130" ></textarea><br/>
<label for="q_img">첨부파일</label><input type="file" name="file1" id="file1"><br/>
<input type="submit" value="등록">
</form>
</body>
</html>