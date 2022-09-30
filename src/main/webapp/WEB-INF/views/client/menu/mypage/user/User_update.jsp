<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#email3").bind("change", function () {
                var email = $("#email3").val();
                $("#email2").val(email);
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
        <c:set var="dto" value="${valDto}" />
        <h1>회원수정</h1>
        <form method="post" action="/client/menu/mypage/UpdateOk" enctype="multipart/form-data" name="frm1">
            <table border="0" cellspacing="1" cellpadding="5">
                <tr>
                    <td align=center bgcolor="#d3d3d3">아이디</td>
                    <td>
                        <input size="20" type="text" name="id1" value="${dto.id1}" readonly="readonly" />
                        <form:errors path="uservalDto.id1" />
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">비밀번호</td>
                    <td>
                        <input size="21" type="password" name="pwd1" />
                        <form:errors path="uservalDto.pwd1" />
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">비밀번호 확인</td>
                    <td>
                        <input size="21" type="password" name="pwd2" />
                        <form:errors path="uservalDto.pwd2" />
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">비밀번호 질문</td>
                    <td>
                        <select name="question1">
                            <option value='1'>기억에 남는 추억의 장소는?</option>
                            <option value='2'>자신의 인생 좌우명은?</option>
                            <option value='3'>자신의 보물 제1호는?</option>
                            <option value='4'>가장 기억에 남는 선생님 성함은?</option>
                            <option value='5'>타인이 모르는 자신만의 신체비밀이 있다면?</option>
                            <option value='6'>추억하고 싶은 날짜가 있다면?</option>
                            <option value='7'>받았던 선물 중 기억에 남는 독특한 선물은?</option>
                            <option value='8'>유년시절 가장 생각나는 친구 이름은?</option>
                            <option value='9'>인상 깊게 읽은 책 이름은?</option>
                            <option value='10'>읽은 책 중에서 좋아하는 구절이 있다면?</option>
                            <option value='11'>자신이 두번째로 존경하는 인물은?</option>
                            <option value='12'>친구들에게 공개하지 않은 어릴 적 별명이 있다면?</option>
                            <option value='13'>초등학교 때 기억에 남는 짝꿍 이름은?</option>
                            <option value='14'>다시 태어나면 되고 싶은 것은?</option>
                            <option value='15'>내가 좋아하는 캐릭터는?</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">비밀번호 답변</td>
                    <td>
                        <input type="text" size="23" maxlength="20" name="answer1" value="${dto.answer1}" />
                        <form:errors path="uservalDto.answer1" />
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">이름</td>
                    <td>
                        <input size="20" type="text" name="name1" value="${dto.name1}" />
                        <form:errors path="uservalDto.name1" />
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">생년월일</td>
                    <td>
                        <input size="20" type="text" name="birth1" value="${dto.birth1}" />
                        <form:errors path="uservalDto.birth1" />
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">성별</td>
                    <td>
                        <select name="gender1">
                            <option value="1">남자</option>
                            <option value="2">여자</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3" rowspan="1">주소</td>
                    <td>
                        <input size="10" type="text" name="zipcode1" value="${dto.zipcode1}"
                            readonly="readonly" />
                        <input size="10" type="button" value="우편번호검색"
                            onclick="window.open('/client/user/insert/addr/Address','','width=450,height=400, scrollbars=yes')" /><br />
                        <input size="50" type="text" name="addr1" value="${dto.addr1}"
                            readonly="readonly" />
                        <form:errors path="uservalDto.addr1" /><br />
                        <input size="50" type="text" name="addr2" value="${dto.addr2}" />
                    </td>
                </tr>

                <tr>
                    <td align=center nowrap bgcolor="#d3d3d3">전화번호</td>
                    <td>
                        <select name="phone1">
                            <option value="010">010</option>
                            <option value="011">011</option>
                            <option value="016">016</option>
                            <option value="017">017</option>
                            <option value="018">018</option>
                            <option value="019">019</option>
                            <option value="02">02</option>
                            <option value="031">031</option>
                            <option value="032">032</option>
                            <option value="033">033</option>
                            <option value="041">041</option>
                            <option value="042">042</option>
                            <option value="043">043</option>
                            <option value="044">044</option>
                            <option value="051">051</option>
                            <option value="052">052</option>
                            <option value="053">053</option>
                            <option value="054">054</option>
                            <option value="055">055</option>
                            <option value="061">061</option>
                            <option value="062">062</option>
                            <option value="063">063</option>
                            <option value="064">064</option>
                            <option value="0502">0502</option>
                            <option value="0505">0505</option>
                            <option value="0506">0506</option>
                            <option value="070">070</option>
                        </select>
                        - <input size="5" type="text" name="phone2" value="${dto.phone2}" />
                        - <input size="5" type="text" name="phone3" value="${dto.phone3}" />
                    </td>
                </tr>

                <tr>
                    <td align=center nowrap bgcolor="#d3d3d3">이메일</td>
                    <td>
                        <input size="15" type="text" name="email1" value="${dto.email1}" />
                        @ <input size="15" type="text" name="email2" id="email2" value="${dto.email2}" />

                        <select name="email3" id="email3">
                            <option value="" selected="selected">- 이메일 선택 -</option>
                            <option value="naver.com">naver.com</option>
                            <option value="daum.net">daum.net</option>
                            <option value="nate.com">nate.com</option>
                            <option value="hotmail.com">hotmail.com</option>
                            <option value="yahoo.com">yahoo.com</option>
                            <option value="empas.com">empas.com</option>
                            <option value="korea.com">korea.com</option>
                            <option value="dreamwiz.com">dreamwiz.com</option>
                            <option value="gmail.com">gmail.com</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">목표체중</td>
                    <td>
                        <input size="20" type="text" name="targetweight1" value="${dto.targetweight1}" />
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3">이미지</td>
                    <td>
                        <input type="file" name="file1" id="file1">
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center">
                        <input type="submit" value="수정" />
                        <input type="button" value="취소" />
                    </td>
                </tr>
            </table>

        </form>
    </div>
</body>
</html>