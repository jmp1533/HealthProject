<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
    <script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#allch").click(function () {
                if ($(this).is(':checked')) {
                    $("input[name='delck']").prop("checked", true);
                } else {
                    $("input[name='delck']").prop("checked", false);
                }
            });
        });
    </script>
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
        <form method="post" action="/client/menu/mypage/traner/applyupdate">
            <input type="submit" value="등록" />
            <table>
                <tr>
                    <td><input type="checkbox" id="allch" name="allch"></td>
                    <th>신청유저</th>
                    <th>신청날짜</th>
                    <th></th>
                </tr>
                <c:forEach var="list" items="${list }">
                    <input type="hidden" id="tid" name="tid" value="${list.t_id }" />
                    <tr>
                        <td>
                            <input type="checkbox" name="delck" value="${list.u_id}">
                        </td>
                        <td>${list.u_id }</td>
                        <td>${list.join_date }</td>
                        <td><a href="/client/menu/mypage/traner/applyview?u_id=${list.u_id }">상세보기</a></td>
                    </tr>
                </c:forEach>
            </table>
        </form>

        <form method="get" action="/client/menu/mypage/traner/joinapplylist">
            <select name="field">
                <option value="u_id">아이디</option>
            </select>
            <input type="text" name="keyword">
            <input type="submit" value="검색">
        </form>

        <div>
            <c:choose>
                <c:when test="${page.startPageNum>10 }">
                    <a
                        href="/client/menu/mypage/traner/joinapplylist?pageNum=${page.startPageNum-1 }&field=${field}&keyword=${keyword}">[이전]</a>
                </c:when>
                <c:otherwise>
                    [이전]
                </c:otherwise>
            </c:choose>
            <c:forEach var="i" begin="${page.startPageNum}" end="${page.endPageNum}">
                <c:choose>
                    <c:when test="${i==page.pageNum}">
                        <a
                            href="/client/menu/mypage/traner/joinapplylist?pageNum=${i}&field=${field}&keyword=${keyword}">
                            <span style="color:red">[${i}]</span>
                        </a>
                    </c:when>
                    <c:otherwise>
                        <a
                            href="/client/menu/mypage/traner/joinapplylist?pageNum=${i}&field=${field}&keyword=${keyword}">[${i}]</a>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            <c:choose>
                <c:when test="${page.endPageNum<page.totalPageCount}">
                    <a
                        href="/client/menu/mypage/traner/joinapplylist?pageNum=${page.endPageNum+1}&field=${field}&keyword=${keyword}">[다음]</a>
                </c:when>
                <c:otherwise>
                    [다음]
                </c:otherwise>
            </c:choose>
        </div>
    </div>
</body>

</html>