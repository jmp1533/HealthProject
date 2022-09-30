<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script>
    <script src="http://malsup.github.com/jquery.form.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#b_email3").bind("change", function () {
                var email = $("#b_email3").val();
                $("#b_email2").val(email);
            });
        });
//
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
        <h2>매장등록</h2>
        <form method="post" action="/client/menu/mypage/traner/Trainer_health_register" name="frm1">
            <table border="0" cellspacing="1" cellpadding="5">
                <tr>
                    <td>업체명</td>
                    <td>
                        <input size="30" type="text" name="b_name" />
                    </td>
                </tr>

                <tr>
                    <td>사업자등록번호</td>
                    <td>
                        <input size="3" type="text" name="b_corporatenum1" />
                        - <input size="2" type="text" name="b_corporatenum2" />
                        - <input size="5" type="text" name="b_corporatenum3" />
                    </td>
                </tr>

                <tr>
                    <td align=center bgcolor="#d3d3d3" rowspan="1">주소</td>
                    <td>
                        <input size="10" type="text" name="zipcode1" />
                        <input size="10" type="button" value="우편번호검색"
                            onclick="window.open('/client/user/insert/addr/Address','','width=450,height=400, scrollbars=yes')" /><br />
                        <input size="50" type="text" name="addr1" /><br />
                        <input size="50" type="text" name="addr2" />
                    </td>
                </tr>

                <tr>
                    <td>전화번호</td>
                    <td>
                        <select name="b_phone1">
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
                        - <input size="5" type="text" name="b_phone2" />
                        - <input size="5" type="text" name="b_phone3" />
                    </td>
                </tr>

                <tr>
                    <td>이메일</td>
                    <td>
                        <input size="15" type="text" name="b_email1" />
                        @ <input size="15" type="text" name="b_email2" id="b_email2" />

                        <select name="b_email3" id="b_email3">
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
                    <td>소개글</td>
                    <td>
                        <textarea rows="20" cols="70" name="b_content"></textarea>
                    </td>
                </tr>
            </table>
            <div id="imgname">

            </div>
            <input type="submit" value="입력" />
        </form>
        <form id="t_img_form" name="t_img_form" action="/seImgInsert" method="post" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>파일</td>
                    <td>
                        <input type="file" name="update_image" id="update_image" onchange="t_update_img();"
                            class="fi">
                    </td>
                </tr>
                <tr>
                    <td>이미지</td>
                    <td id="imgimg" width="800px">

                    </td>
                </tr>
            </table>
        </form>
        <script type="text/javascript">
            var n = 1;
            var m = 0;
            function t_update_img() {
                $('#t_img_form').ajaxForm({
                    dataType: 'text',
                    beforeSerialize: function () {
                    },
                    beforeSubmit: function () {
                    },
                    success: function (data) {
                        var path = "/resources/uploadG/" + data;
                        $("#imgimg").append("<img src='" + path + "' width='200px' height='200px'/>");
                        $("#imgname").append("<input type='hidden' id='im" + m + "' name='im" + m + "' value='" + path + "'/>");
                        m++;
                    }
                });
            }

            $("#update_image").change(function () {
                if (n <= 8) {
                    $("#t_img_form").submit();
                    n++;
                } else {
                    alert("더이상 올릴수 없습니다.");
                }
            });
        </script>
    </div>
</body>

</html>