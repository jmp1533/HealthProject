<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="/admin/mservice/faq/writer">

<label for="cate">분류선택</label>
<select name="faq_cate">
	<option value="가입/탈퇴" selected="selected">가입/탈퇴</option>
	<option value="홈페이지이용">홈페이지이용</option>
	<option value="홈페이지오류">홈페이지오류</option>
	<option value="기타">기타</option>
</select>
<br/>
<label for="faq_question">제목</label><input type="text" name="faq_question" size="150"><br/>
<label for="faq_answer">내용</label><textarea name="faq_answer" rows="10" cols="130"></textarea><br/>
<input type="submit" value="등록">

</form>
</body>
</html>