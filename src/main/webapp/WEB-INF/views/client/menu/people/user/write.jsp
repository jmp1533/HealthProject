<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <script type="text/javascript" src="/resources/SE2.1.3.O8706/js/HuskyEZCreator.js" charset="utf-8"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script>
        <script src="http://malsup.github.com/jquery.form.js"></script>
        <script src="/resources/SmartEditor/js/HuskyEZCreator.js" charset="utf-8" language="JavaScript" type="text/javascript"></script>
        <script type="text/javascript">
            function cafeboardFormSubmit() {
                oEditors[0].exec("UPDATE_IR_FIELD", []);
                $('#editor_upimage').submit();
            }
        </script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("#imgepop").click(function () {
                    $("#imgeup").css("display", "block")
                })
                $("#imgeupdown").click(function () {
                    $("#imgeup").css("display", "none")
                })

                $("#ir1").val();
            });
        </script>
        <style type="text/css">
            #imgeup {
                position: absolute;
                background-color: green;
                width: 200px;
                height: 200px;
                border-style: solid;
                border-color: red;
                border-width: 3px;
                display: none;
                margin-left: 950px;
            }

            #img {
                width: auto;
                height: auto;
                max-height: 77px;
                background-color:
            }

            div.upload {
                width: 157px;
                height: 57px;
                background-color: red;
                position: absolute;
                overflow: hidden;
            }

            div.upload input {
                display: block !important;
                width: 157px !important;
                height: 57px !important;
                opacity: 0 !important;
                overflow: hidden !important;
                z-index: 0;
            }
        </style>
    </head>

    <body>
        <a id="imgepop" style="  margin-left: 950px;">이미지올리기</a>
        <div id="imgeup">

            <form id="editor_upimage" name="editor_upimage" action="/seImgInsert" method="post"
                enctype="multipart/form-data">

                <input type="button" value="x" style="float: right;" id="imgeupdown">

                <input type="file" name="update_image" id="update_image" onchange="pasteHTML();" class="fi">

                <input type="hidden" id="imgpath">
                <img id="img" src=''><br>
                <input type="submit" onclick="pasteHTML2();" value="이미지넣기" />

            </form>
        </div>

        <form id="edit" name="edit" action="/seImgInsert" method="post" enctype="multipart/form-data">
            <img id="user_img" class="user_img" src='' style="	width: auto;
	      height: auto;
	    max-height: 110px;"><br>
            <input type="file" name="update_image" id="update_image22" onchange="userupload();" class="fi"
                style="background-color: red;">
        </form>

        <form action="/client/menu/people/user/write" method="post" id="insert" name="frm1">
            날짜<input type="date" name="p_sportsdate"><br>
            시간<input type="number" min="1" max="24" style="width: 40px" name="p_sportstime1">시
            <input type="number" min="1" max="60" style="width: 40px" name="p_sportstime2">분<br>

            <input size="10" type="hidden" name="zipcode1" />
            주소1 <input size="50" type="text" name="addr1" /><br />
            주소2 <input size="50" type="text" name="addr2" />
            <input size="10" type="button" value="주소검색"
                onclick="window.open('/client/user/insert/addr/Address','','width=450,height=400, scrollbars=yes')" /><br />
            <br>
            제목<input type="text" name="p_title">

            <input type="hidden" id="p_img" name="p_img">
            <input type="hidden" id="p_content" name="p_content">
        </form>

        <br>

        <textarea name="ir1" id="ir1" rows="40" cols="140" style="display: block;"></textarea>
        <!--textarea name="ir1" id="ir1" rows="10" cols="100" style="width:100%; height:412px; min-width:610px; display:none;"></textarea-->

        <input type="button" id="su" value="전송" />

        <script type="text/javascript">
            var oEditors = [];
            nhn.husky.EZCreator.createInIFrame({
                oAppRef: oEditors,
                elPlaceHolder: "ir1",
                sSkinURI: "/resources/SE2.1.3.O8706/SmartEditor2Skin.html",
                htParams: {
                    bUseToolbar: true,
                    fOnBeforeUnload: function () {//alert("아싸!");	
                    }
                }, //boolean
                fOnAppLoad: function () {		//예제 코드		//oEditors.getById["ir1"].exec("PASTE_HTML", ["로딩이 완료된 후에 본문에 삽입되는 text입니다."]);
                },
                fCreator: "createSEditor2"
            });

            function pasteHTML() {
                $('#editor_upimage').ajaxForm({
                    dataType: 'text',
                    beforeSerialize: function () {           // form을 직렬화하기전 엘레먼트의 속성을 수정할 수도 있다.            
                    },
                    beforeSubmit: function () {
                        //action에 걸어주었던 링크로 가기전에 실행 ex)로딩중 표시를 넣을수도 있다.
                    },
                    success: function (data) {

                        var path = "/resources/uploadG/" + data;
                        $("#img").attr("src", path)
                        $("#imgpath").val(path);
                        var sHTML = "<img src=" + path + ">";
                        //oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
                    }
                });
            }

            function userupload() {
                $("#edit").ajaxForm({
                    dataType: 'text',
                    beforeSerialize: function () {           // form을 직렬화하기전 엘레먼트의 속성을 수정할 수도 있다.            
                    },
                    beforeSubmit: function () {
                        //action에 걸어주었던 링크로 가기전에 실행 ex)로딩중 표시를 넣을수도 있다.
                    },
                    success: function (data) {

                        var path = "/resources/uploadG/" + data;
                        $("#p_img ").val(path)
                        $(".user_img").attr("src", path)
                        $("#update_image22").css("display", "none")
                    }
                });
            }

            function pasteHTML2() {
                var path = $("#imgpath").val();
                var sHTML = "<img src=" + path + ">";
                oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
            }

            $("#su").click(function () {

                var sHTML = oEditors.getById["ir1"].getIR();
                $("#p_content").val(sHTML);
                alert(sHTML)
                $("#insert").submit();

            });
            $("#update_image").change(function () {
                $("#editor_upimage").submit();
            })
            $("#update_image22").change(function () {
                $("#edit").submit();
            })
        </script>

        <script type="text/javascript">
            //이미지 업로드 경로
            var imagepath = "/resources/uploadG";
            var oEditors = [];
            nhn.husky.EZCreator.createInIFrame({
                oAppRef: oEditors,
                elPlaceHolder: "ir1",//스마트에디터를 적용시킬 name,id,path
                sSkinURI: "/resources/SmartEditor/SEditorSkin.html",
                fCreator: "createSEditorInIFrame"
            });
			//이미지삽입 함수 imgupload_pro.jsp 에서 호출 
        </script>
    </body>
</html>