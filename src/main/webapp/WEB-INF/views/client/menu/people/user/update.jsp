<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <form method="post" action="/client/menu/people/user/update">
        <input type="hidden" name="p_num" value="${dto.p_num}">

        <label for="p_title">제목</label><input type="text" name="p_title" size="150"><br />
        <label for="p_content">내용</label><textarea name="p_content" rows="10" cols="130"></textarea><br />
        <input type="submit" value="등록">
    </form>
</body>
</html>