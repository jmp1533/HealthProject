<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    </div>
            </div>
            <c:set var="dto" value="${dto }" />
            <h2>${dto.u_id }님의 정보</h2>
            <table border="1">
                <tr>
                    <th>이미지</th>
                    <td><img src="${dto.u_img }" /></td>
                </tr>
                <tr>
                    <th>이름</th>
                    <td>${dto.u_name }</td>
                </tr>
                <tr>
                    <th>생년월일</th>
                    <td>${dto.u_birth }</td>
                </tr>
                <tr>
                    <th>성별</th>
                    <td>
                        <c:choose>
                            <c:when test="${dto.u_gender==1}">
                                남자
                            </c:when>
                            <c:otherwise>
                                여자
                            </c:otherwise>
                        </c:choose>
                    </td>
                </tr>
                <tr>
                    <th>전화번호</th>
                    <td>${dto.u_phone }</td>
                </tr>
                <tr>
                    <th>이메일</th>
                    <td>${dto.u_email }</td>
                </tr>
            </table>

            <a href="/client/menu/mypage/traner/joinapplylist">목록</a>
        </div>
    </body>
</html>