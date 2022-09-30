<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<h3>공지사항수정</h3>
<form method="post" action="/client/menu/service/notice/update">

<input type="hidden" name="noti_num" value="${dto.noti_num}">

<label for="noti_title">제목</label><input type="text" name="noti_title" size="150"><br/>
<label for="noti_content">내용</label><textarea name="noti_content" rows="10" cols="130"></textarea><br/>
<input type="submit" value="등록">

</form>
