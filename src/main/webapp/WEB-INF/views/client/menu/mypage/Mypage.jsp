<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
    <div class="wrap">
        <div class="page_list">
            <%--200*800사이즈로 이미지 넣을것 제작 --%>
                <div class="list_menu">
                    <%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
                        <c:choose>
                            <c:when test="${not empty sessionScope.ulogid}">
                                <div class="list_1">
                                    <a href="/client/menu/mypage/user/User_info">내정보</a>
                                </div>
                                <div class="list_2">
                                    <a href="/client/menu/mypage/user/User_mytrainer_info">담당 트레이너</a>
                                </div>
                                <div class="list_3">
                                    <a href="/client/menu/mypage/user/User_out_pwd">회원탈퇴</a>
                                </div>
                            </c:when>
                            <c:when test="${not empty sessionScope.tlogid}">
                                <div class="list_1">
                                    <a href="/client/menu/mypage/traner/Trainer_info">내정보</a>
                                </div>
                                <div class="list_2">
                                    <a href="/client/menu/mypage/traner/Trainer_health_register">내 헬스장</a>
                                </div>
                                <div class="list_3">
                                    <a href="/client/menu/mypage/traner/joinlist">회원관리 목록</a>
                                </div>
                                <div class="list_4">
                                    <a href="/client/menu/mypage/traner/joinapplylist">신청 회원</a>
                                </div>
                                <div class="list_5">
                                    <a href="/client/menu/mypage/traner/Trainer_out_pwd">회원탈퇴</a>
                                </div>
                            </c:when>
                            <c:otherwise></c:otherwise>
                        </c:choose>
                </div>
        </div>
        <div class="main"></div>
    </div>
</body>
</html>