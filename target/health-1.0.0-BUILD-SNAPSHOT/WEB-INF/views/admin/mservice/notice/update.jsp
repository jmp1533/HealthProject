<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>공지사항수정</h3>
<form method="post" action="/admin/mservice/notice/update">

<input type="hidden" name="noti_num" value="${dto.noti_num}">

<label for="noti_title">제목</label><input type="text" name="noti_title" size="150" value="${dto.noti_title }"><br/>
<label for="noti_content">내용</label><textarea name="noti_content" rows="10" cols="130">${dto.noti_content}</textarea><br/>
<input type="submit" value="등록">

</form>
</body>
</html>