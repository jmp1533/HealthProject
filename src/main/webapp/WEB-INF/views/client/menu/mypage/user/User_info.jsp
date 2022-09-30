<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
    <script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.js"></script>
</head>

<body>
    <div class="wrap">
        <div class="page_list">
            <%--200*800사이즈로 이미지 넣을것 제작 --%>
                <div class="list_menu">
                    <%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
                        <div class="list_1">
                            <a href="/client/menu/mypage/user/User_info">내정보</a>
                        </div>
                        <div class="list_2">
                            <a href="/client/menu/mypage/user/User_mytrainer_info">담당 트레이너</a>
                        </div>
                        <div class="list_3">
                            <a href="/client/menu/mypage/user/User_out_pwd">회원탈퇴</a>
                        </div>
                </div>
        </div>
        <h3>${dto.u_id}님 회원정보</h3>
        <table border="1" width="450">
            <tr>
                <td align="center"><img src="/resources/upload/${dto.u_img }" width="140px" height="200px" />
                </td>
            </tr>
            <tr>
                <td>이름 : ${dto.u_name}</td>
            </tr>
            <tr>
                <td>생년월일 : ${dto.u_birth}</td>
            </tr>
            <tr>
                <td>성별:
                    <c:choose>
                        <c:when test="${dto.u_gender==1}">남자</c:when>
                        <c:otherwise>여자 </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td>이메일 : ${dto.u_email}</td>
            </tr>
            <tr>
                <td>주소 : ${dto.u_addr}</td>
            </tr>
            <tr>
                <td>전화 : ${dto.u_phone}</td>
            </tr>
            <tr>
                <td>목표체중 : ${dto.u_targetweight}kg</td>
            </tr>
        </table>
        <div align="center">
            <a href="/client/menu/mypage/Update">내정보 수정</a>
        </div>
    </div>
</body>

</html>