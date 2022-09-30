<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>FAQ수정</h2>
<form method="post" action="/admin/mservice/faq/update">
<label for="cate">분류선택</label>
<input type="hidden" name="faq_num" value="${dto.faq_num }"/>
<select name="faq_cate">
	<option value="가입/탈퇴" selected="selected">가입/탈퇴</option>
	<option value="홈페이지이용">홈페이지이용</option>
	<option value="홈페이지오류">홈페이지오류</option>
	<option value="기타">기타</option>
</select>
<br/>
<label for="faq_question">제목</label><input type="text" name="faq_question" size="150" value="${dto.faq_question }"><br/>
<label for="faq_answer">내용</label><textarea name="faq_answer" rows="10" cols="130">${dto.faq_answer }</textarea><br/>
<input type="submit" value="등록">

</form>
</body>
</body>
</html>