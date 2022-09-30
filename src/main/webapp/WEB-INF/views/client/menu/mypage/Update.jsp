<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
    <c:choose>
        <c:when test="${not empty sessionScope.ulogid}">
            <form method="post" action="/client/menu/mypage/User_update">
                <label for="pwd">비밀번호 입력 : </label>
                <input type="text" id="pwd" name="pwd"><br />
                <input type="submit" value="확인" />
            </form>
        </c:when>
        <c:when test="${not empty sessionScope.tlogid}">
            <form method="post" action="/client/menu/mypage/Trainer_update">
                <label for="pwd">비밀번호 입력 : </label>
                <input type="text" id="pwd" name="pwd"><br />
                <input type="submit" value="확인" />
            </form>
        </c:when>
    </c:choose>
</body>

</html>