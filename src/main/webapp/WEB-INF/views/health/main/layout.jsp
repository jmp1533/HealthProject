<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/resources/css/jquery-ui-1.10.3.custom.css" type="text/css" />
    <script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
    <script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.js"></script>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
        }

        ul,
        li {
            list-style: none;
        }

        div#wapper {
            width: 100%;
            min-height: 700px;
            height: auto;
            margin-top: 50px;
            margin-bottom: 20px;
        }

        /*가로 넓이는 그림처럼 800px로 잡아주었다*/
        header,
        footer,
        section,
        article {
            display: block;
        }

        header,
        footer {
            width: 100%;

        }

        .header,
        .footer {
            width: 1200px;
            height: 120px;
            margin: auto;
        }

        header {
            height: 120px;
        }

        .suv {
            height: 100%;
            width: 100%;
            z-index: 100;
        }

        .suv ul {
            height: 40px;
        }

        .suv ul li {
            margin: 0;
            width: 130px;
            height: 40px;
            text-align: center;
            text-decoration: none;
            float: left;
            list-style-type: none;
        }

        .suv li a {
            width: 100px;
            padding-top: 3px;
            padding-bottom: 3px;
            text-align: center;
            display: block;
            text-decoration: none;
            height: 23px;

            font-size: 12px;
            line-height: 20px;
            font-weight: normal;
            color: black;
            clear: both;

        }

        div#section {
            text-align: left;
            width: 1200px;
            margin: 0 auto;
            min-height: 700px;
            height: auto;
            margin-top: 20px;
            margin-bottom: 20px;
        }

        footer {
            height: 150px;
            background-image: -webkit-gradient(linear,
                    right top,
                    right bottom,
                    color-stop(0.13, #F0F0FF),
                    color-stop(0.4, #E6E6E6),
                    color-stop(1, #D0D7D7));
            background-image: -o-linear-gradient(bottom, #F0F0FF 13%, #E6E6E6 40%, #D0D7D7 100%);
            background-image: -moz-linear-gradient(bottom, #F0F0FF 13%, #E6E6E6 40%, #D0D7D7 100%);
            background-image: -webkit-linear-gradient(bottom, #F0F0FF 13%, #E6E6E6 40%, #D0D7D7 100%);
            background-image: -ms-linear-gradient(bottom, #F0F0FF 13%, #E6E6E6 40%, #D0D7D7 100%);
            background-image: linear-gradient(to bottom, #F0F0FF 13%, #E6E6E6 40%, #D0D7D7 100%);


        }

        .header_2 ul li {
            list-style-type: none;
            float: right;
            margin-right: 10px;
        }

        .sub {
            height: 40px;
            background-repeat: no-repeat;
        }
    </style>
    <style type="text/css">
        A:link {
            text-decoration: none
        }


        .wrap {
            min-height: 800px;
            height: auto;
            width: 100%;
        }

        .page_list {
            width: 180px;
            padding: 10px;
            height: auto;
            float: left;
        }

        .page_head {
            width: 100%;
            height: 100px;
        }

        .list_menu {
            width: 168px;
            height: 210px;
            border: 3px solid red;
            border-radius: 10px;
            -moz-border-radius: 10px;
            -webkit-border-radius: 10px;
            background-color: white;
        }

        .list_menu div {
            height: 20px;
            width: 148;
            text-align: center;
            margin: 10px;
        }

        .main {
            min-height: 800px;
            padding: 10px;
            width: 900px;
            margin-left: 250px;
        }

        .list {
            min-height: 100px;
            height: auto;
            width: 100%;
        }

        th {
            margin-top: 5px;
            padding: 10px;
            text-align: center;
            border: 2px solid black;
        }

        td {
            padding-top: 5px;
            padding-bottom: 5px;
        }

        div.list table {
            border-bottom: 2px solid black;
            border-top: 2px solid black;
            width: 100%;
            margin: 0px;
            padding: 0px
        }

        .list_num {
            width: 60px;
            height: 10px;
            text-align: center;
        }

        .list_number {
            width: 100%;
            height: 20px;
        }

        .list_title {
            width: 400px;
        }

        .list_count {
            width: 52px;
            text-align: center;
        }

        .list_id {
            text-align: center;
        }

        .list_hits {
            width: 52px;
            text-align: center;
        }

        .list_search {
            width: 100%;
            height: 20px;
        }

        .list_date {
            width: 70px;
            text-align: center;
        }

        .list_pitcture {
            width: 90px;
            text-align: center;
        }

        .list_menu div:HOVER {
            background-color: red;
        }

        #input_title {
            width: 500px;
            height: 25px;
            font-size: 16px;
        }

        div form img#img {
            max-width: 100px;
            max-height: 100px;
        }

        #imgeup {
            position: absolute;

            background-color: green;
            width: 200px;
            height: 200px;
            border-style: solid;
            border-color: red;
            border-width: 3px;
            display: none;
        }

        .foot_head {
            width: 1200px;
            height: 15px;
            padding-top: 20px;
            padding-bottom: 16px;
            list-style: none;
        }

        .foot_head ul li {
            float: left;
            margin-left: 5px;
        }

        .foot_main {
            margin: 0;
            font-size: 11px;
            line-height: 22px;
            color: #676767;
        }

        .footer * {
            font-family: "돋움"
        }
    </style>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".sub").hide();//기본적으로 숨기기
            $(".suv li").hover(function () {
                $(".sub ", this).slideDown("fast");
                $("a img", this).attr("src", $("a img", this).attr("src").replace(/(.png)$/, "_over$1"));
            }, function () {
                $(".sub ", this).slideUp("fast");
                $("a img", this).attr("src", $("a img", this).attr("src").replace(/_over(.png)$/, "$1"));

            });

            var w_height = $(".main").height();

            var w_height2 = $(".list_menu").height();

            $(".page_list").css("height", w_height + "px")

            $(".page_list img").attr("src", "/resources/images/list_bar_img_1.png")
            $(".page_list img").css("margin-top", (w_height - w_height2 - 394) + "px");

        });
    </script>
    <title>Insert title here</title>
</head>

<body>
    <!--헤더시작-->
    <header>
        <div class="header">
            <div class="header_1"
                style="width: 200px; height:80px; margin-top:10px; margin-bottom:30px; float: left">
                <a href="/"><img src="/resources/images/healthclub.png" /> </a>
            </div>
            <div class="header_2" style="width: 1000px; height: 40px; float: right;">
                <div class="header_search"
                    style="width: 300px; height: 30px; margin-top: 5px; margin-left:200px; margin-right:100px; float:left;">

                </div>
                <div class="header_information"
                    style="width: 400px; height: 30px; margin-top: 5px; float:right;">
                    <ul>
                        <li><a href="#">고객센터</a></li>

                        <li>
                            <c:choose>
                                <c:when test="${not empty sessionScope.ulogid}">
                                    <a href="/client/menu/mypage/Mypage">마이페이지</a>
                                </c:when>
                                <c:when test="${not empty sessionScope.tlogid}">
                                    <a href="/client/menu/mypage/Mypage">마이페이지</a>
                                </c:when>
                                <c:otherwise>
                                    <a href="#"
                                        onclick="window.open('/client/user/finder/search/searchmain','','width=500,height=500,left=500,top=200,scrollbars=no,resizable=no');">아이디/비밀번호
                                        찾기</a>
                                </c:otherwise>
                            </c:choose>
                        </li>

                        <li>
                            <c:choose>
                                <c:when test="${not empty sessionScope.ulogid}">
                        <li><a href="#"
                                onclick="window.open('/client/popup/msg/msglist','','width=600,height=400, scrollbars=no')">쪽지함</a>
                        </li>
                        </c:when>
                        <c:when test="${not empty sessionScope.tlogid}">
                            <li><a href="#"
                                    onclick="window.open('/client/popup/msg/msglist','','width=600,height=400, scrollbars=no')">쪽지함</a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <a href="/client/user/insert/Choice">회원가입</a>
                        </c:otherwise>
                        </c:choose>
                        </li>

                        <li>
                            <c:choose>
                                <c:when test="${not empty sessionScope.ulogid}">
                                    <a href="/client/user/insert/Logout">로그아웃</a>
                                </c:when>
                                <c:when test="${not empty sessionScope.tlogid}">
                                    <a href="/client/user/insert/Logout">로그아웃</a>
                                </c:when>
                                <c:otherwise>
                                    <a href="/client/user/insert/Login">로그인</a>
                                </c:otherwise>
                            </c:choose>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="header_3" style="width: 1000px; height: 80px; float:right">
                <div class="suv">
                    <ul>
                        <li><a href="/client/menu/information/news/healthsNews"><img
                                    src="/resources/images/menubar1.png" /> </a>
                            <ul class="sub"
                                style="width:260px; height:40px;  background-image:url(/resources/images/menu_bar_1.png);">
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/information/news/healthsNews">건강뉴스</a></li>
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/information/movie/health_movie_list">운동방법</a></li>
                            </ul>
                        </li>
                        <li><a href="/client/menu/diary/date"><img
                                    src="/resources/images/menubar2.png" /></a>
                            <ul class="sub"
                                style="width:260px; height:40px; background-image:url(/resources/images/menu_bar_1.png);">
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/diary/date">다이어리</a></li>
                                <c:choose>
                                    <c:when test="${not empty tlogid }">
                                        <li
                                            style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                            <a href="/client/menu/diary/chart_traner">회원 체중 그래프</a></li>
                                    </c:when>
                                    <c:otherwise>
                                        <li
                                            style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                            <a href="/client/menu/diary/chart">체중변화그래프</a></li>
                                    </c:otherwise>
                                </c:choose>
                            </ul>
                        </li>
                        <li><a href="/client/menu/finder/company/CompanyList"><img
                                    src="/resources/images/menubar3.png" /></a>
                            <ul class="sub"
                                style="width:260px; background-image:url(/resources/images/menu_bar_1.png); ">
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/finder/company/CompanyList">헬스장 검색</a></li>
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/finder/park/ParkList">공원 위치찾기</a></li>
                            </ul>
                        </li>
                        <li><a href="/client/menu/people/traner/list"><img
                                    src="/resources/images/menubar4.png" /></a>
                            <ul class="sub"
                                style="width:260px; background-image:url(/resources/images/menu_bar_1.png);">
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/people/traner/list">트레이너 현황</a></li>
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/people/user/list">헬스프렌드 찾기</a></li>
                            </ul>
                        </li>
                        <li><a href="/client/menu/insert/comunity/border/free/list"><img
                                    src="/resources/images/menubar5.png" /></a>
                            <ul class="sub"
                                style="width:390px; height:40px; float:right; background-image:url(/resources/images/menu_bar_2.png);">
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/insert/comunity/border/free/list">자유게시판</a></li>
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/insert/comunity/border/tip/list">팁&노하우 게시판</a>
                                </li>
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/insert/comunity/border/Review/list">성공후기</a></li>
                            </ul>
                        </li>
                        <li><a href="/client/menu/service/notice/Noticelist"><img
                                    src="/resources/images/menubar6.png" /></a>
                            <ul class="sub"
                                style="width:520px; float:right; background-image:url(/resources/images/menu_bar_3.png);">
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/service/notice/Noticelist">공지사항</a></li>
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/service/faq/list">FAQ</a></li>
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/service/qna/qna_list">1:1문의</a></li>
                                <li style="margin-top: 10px; margin-left: 10px; height: 20px;width: 110px;">
                                    <a href="/client/menu/service/policy/view">개인정보 취급방침</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </header>
    <div id="wapper">
        <div id="section">
            <section>
                <tiles:insertAttribute name="content" />
            </section>
        </div>
    </div>

    <footer>
        <div class="footer">
            <div class="foot_head">
                <!-- 1200x15 font size 12px -->
                <ul>
                    <li style="width:32px; "><a href="#"><img src="/resources/images/foot_head_1.png"> </a>
                    </li> <!-- 32x15 -->
                    <li style="width:67px; "><a href="#"><img src="/resources/images/foot_head_2.png"> </a>
                    </li> <!-- 67x15 -->
                    <li style="width:73px; "><a href="#"><img src="/resources/images/foot_head_3.png"> </a>
                    </li> <!-- 73x15 -->
                    <li style="width:108px; "><a href="#"><img src="/resources/images/foot_head_4.png"> </a>
                    </li> <!-- 108x15 -->
                    <li style="width:53px; "><a href="#"><img src="/resources/images/foot_head_5.png"> </a>
                    </li> <!-- 53x15	 -->
                </ul>
            </div>
            <div class="foot_main">
                <!-- 1200x66. font size 12px -->
                (주)healthy / 사업자등록번호 001-01-10101 / 통신판매업신고 제 2013-서울종로-0001호 / 벤처기업확인 서울지방중소기업청 제
                098765432-1-12345호<br />
                등록번호 서울 가01234 (2013.01.01) / 대표 : 홍길동 / E-Mail : help@healthy.co.kr / Fax : 02) 123-4567 /
                서울 종로구 관수동 000번지 11F<br />
                <span style="color:#989898 !important;">Copyright ⓒ Health All Rights Reserved.</span>
            </div>
        </div>
    </footer>
</body>
</html>