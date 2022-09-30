<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        $("#join").click(function () {
            $.ajax({
                url: '/Joincheck',
                data: "tid=" + $("#tid").val(),
                success: function (data) {
                    var msg = $(data).find("msg").text();
                    alert(msg);
                }
            });
        });
    });
</script>
<div class="wrap">
    <div class="page_list">
        <%--200*800사이즈로 이미지 넣을것 제작 --%>
            <div class="list_menu">
                <%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
                    <div class="list_0"
                        style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
                        트레이너 현황
                    </div>
                    <div class="list_1">
                        <%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
                            <a href="/client/menu/people/traner/list" style="background-color: red;">트레이너 현황</a>
                            <%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
                    </div>
                    <div class="list_2">
                        <a href="/client/menu/people/user/list">헬스 프렌드 찾기</a>
                    </div>
            </div>
            <img>
    </div>
    <div class="main">
        <span style="font-size: 40px"> 트레이너상세보기</span>(${dto.t_id })
        <hr size="3" color="#a9a9a9a ;">
        <br>
        <input type="hidden" id="tid" name="tid" value="${dto.t_id }" />
        <table>
            <tr>
                <td align="center"><img src="/resources/upload/${dto.t_img }" width="250px" height="300px" />
                </td>
                <td>${dto.t_introduction}</td>
            </tr>
            <tr>
                <td>이름 : ${dto.t_name}</td>
            </tr>
            <tr>
                <td>생년월일 : ${dto.t_birth}</td>
            </tr>
            <tr>
                <td>이메일 : ${dto.t_email}</td>
            </tr>
            <tr>
                <td>회사 : ${dto.t_company}</td>
            </tr>
            <tr>
                <td>주소 : ${dto.t_addr}</td>
            </tr>
            <tr>
                <td>전화 : ${dto.t_phone}</td>
            </tr>
            <tr>
                <td>신장 : ${dto.t_height}cm</td>
            </tr>
            <tr>
                <td>체중 : ${dto.t_weight}kg</td>
            </tr>
        </table>
        <input type="button" value="신청" id="join" name="join" />
    </div>
</div>