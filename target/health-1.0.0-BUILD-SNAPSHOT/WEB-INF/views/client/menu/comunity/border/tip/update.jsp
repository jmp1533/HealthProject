<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="resources/SE2.1.3.O8706/js/HuskyEZCreator.js" charset="utf-8"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script> 
    <script src="http://malsup.github.com/jquery.form.js"></script> 
<script src="resources/SmartEditor/js/HuskyEZCreator.js" charset="utf-8" language="JavaScript" type="text/javascript"></script>
<script type="text/javascript">
function cafeboardFormSubmit(){
 oEditors[0].exec("UPDATE_IR_FIELD", []);
 $('#editor_upimage').submit(); 
}
</script>
<script type="text/javascript">
$(document).ready(function() {
	$("#imgepop").click(function(){
			$("#imgeup").css("display","block")
	})
	$("#imgeupdown").click(function(){
			$("#imgeup").css("display","none")
	})
	
	$("#ir1").val();
});

</script>
<style type="text/css">
#imgeup{
position: absolute;
  background-color: green;
  width: 200px;
  height: 200px;
   border-style:solid; 
   border-color:red;	
   border-width: 3px;
   display: none;
}
div.upload {
    width: 157px;
    height: 30px;
    background-color:red;
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
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px;margin-bottom: 20px;border-bottom-width:1px solid black;">
			커뮤니티
		</div>
		<div class="list_1" ><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/insert/comunity/border/free/list">자유게시판</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2" style="background-color: red;">
			<a href="/client/menu/insert/comunity/border/tip/list">팁 & 노하우</a>
		</div>
		<div class="list_3">
			<a href="/client/menu/insert/comunity/border/Review/list" >성공 후기</a>
		</div>
	</div>
	<img>
</div>
<div class="main">
	<h2 style="border-bottom: 2px solid black; margin-bottom: 14px;">팁&노하우(수정문)</h2>
 
 <form action="/client/menu/insert/comunity/border/tip/update" method="post" id="update">
 <input type="hidden" name="tip_num" value="${dto.tip_num}">
  <input type="hidden" name="id" value="${dto.id }">
제목<input type="text" name="tip_title" value="${dto.tip_title}">
글종류<select name="tcate_num">
			<option value="1">다이어트</option>
			<option value="2">식단</option>
			<option value="3">운동법</option>
		</select><br/>
<input type="hidden" id="content" name="tip_content">

</form>

<br>
<div style="position: absolute; margin-top: 10px; margin-left: 630px" class="write_img">
			<a id="imgepop">이미지올리기</a>
		<div style="position: absolute;" id="imgeup" >
		<form id="editor_upimage" name="editor_upimage" action="/seImgInsert" method="post" enctype="multipart/form-data">
			<input type="button" value="x" style="float: right;" id="imgeupdown">
			<input type="file" name="update_image" id="update_image" onchange="pasteHTML();" class="fi">
			<input type="hidden" id="imgpath">
			<img id="img" src=''><br>
			<input type="submit" onclick="pasteHTML2();" value="이미지넣기" />
		</form>
		</div>
		</div>
<form action="/seImgInsert" id="editor_upimage"
 method="post" enctype="multipart/form-data"
>
<textarea name="ir1" id="ir1" rows="30" cols="120" style="display: block;">${dto.tip_content}</textarea>	
	<!--textarea name="ir1" id="ir1" rows="10" cols="100" style="width:100%; height:412px; min-width:610px; display:none;"></textarea-->
</form>

<input type="button" id="su" value="업데이트" />
</div>

<script type="text/javascript">
var oEditors = [];
nhn.husky.EZCreator.createInIFrame({
	oAppRef: oEditors,
	elPlaceHolder: "ir1",
	sSkinURI: "resources/SE2.1.3.O8706/SmartEditor2Skin.html",	
	htParams : {bUseToolbar : true,
		fOnBeforeUnload : function(){//alert("아싸!");	
		}
	}, //boolean
	fOnAppLoad : function(){		//예제 코드		//oEditors.getById["ir1"].exec("PASTE_HTML", ["로딩이 완료된 후에 본문에 삽입되는 text입니다."]);
	},
	fCreator: "createSEditor2"
});

function pasteHTML() {
    $('#editor_upimage').ajaxForm({
        dataType: 'text', 
        beforeSerialize: function(){           // form을 직렬화하기전 엘레먼트의 속성을 수정할 수도 있다.            
        },
        beforeSubmit : function() {
        //action에 걸어주었던 링크로 가기전에 실행 ex)로딩중 표시를 넣을수도 있다.
        },
        success : function(data) {
        	var path="resources/uploadG/"+data;
        	$("#img").attr("src",path)
             $("#imgpath").val(path);   	
      var sHTML = "<img src='"+path+"'>";     
  	//oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
        }  
    });
}

function pasteHTML2() {  
      var path=$("#imgpath").val();
	  var sHTML = "<img src='"+path+"'>";    
	  oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
}

  $("#su").click(function(){
	  
		var sHTML = oEditors.getById["ir1"].getIR();
		$("#content").val(sHTML);
		
		$("#update").submit();
		
  });
</script>



<script type="text/javascript">
//이미지 업로드 경로
var imagepath = "resources/uploadG"; 
var oEditors = [];
nhn.husky.EZCreator.createInIFrame({
 oAppRef: oEditors,
 elPlaceHolder: "ir1",//스마트에디터를 적용시킬 name,id,path
 sSkinURI: "resources/SmartEditor/SEditorSkin.html",
 fCreator: "createSEditorInIFrame"
});
//이미지삽입 함수 imgupload_pro.jsp 에서 호출 

</script>

</body>
</html>