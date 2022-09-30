<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>공지사항</h2>
<form method="post" action="/client/menu/service/qna/qna_write" >


<input type="hidden" name="admin_id" value="admin">


<label for="noti_title">제목</label><input type="text" name="noti_title" size="150"/> <br/>
<label for="noti_content">내용</label><textarea name="noti_content" rows="10" cols="130" ></textarea>
<input type="submit" value="등록">
</form>
