<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
   
  margin-left: 950px;
}
#img{
width: auto;
	      height: auto;
	    max-height: 77px;
	      background-color: 
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
</head>
<body>
<c:set var="dto" value="${movie_Dto}"/>
<a id="imgepop">이미지올리기</a>
<br/>
<br/>
<div id="imgeup" >

  <form id="editor_upimage" name="editor_upimage" action="/seImgInsert" method="post" enctype="multipart/form-data">
        <input type="button" value="x" style="float: right;" id="imgeupdown">
    <div class="upload">
      <input type="file" name="update_image" id="update_image" onchange="pasteHTML();" class="fi">
    	</div>
     	<input type="hidden" id="imgpath">
     	<img id="img" src=""><br>
     	<input type="submit" onclick="pasteHTML2();" value="이미지넣기" />
  </form>
</div>

<h2>동영상 글쓰기</h2>
<form method="post" action="/admin/mboard/movie/update" enctype = "multipart/form-data" id="insert">
	<input type="hidden" value="${dto.v_num}" id="v_num" name="v_num"/>
	카테고리
	<select name="vcate_num">
  		<option value='1'>광배근</option>
  		<option value='2'>대내외전근</option>
  		<option value='3'>대둔근</option>
  		<option value='4'>대퇴사두근</option>
  		<option value='5'>대흉근</option>
  		<option value='6'>대퇴이두근</option>
  		<option value='7'>복근</option>
  		<option value='8'>비복근</option>
  		<option value='9'>삼각근</option>
  		<option value='10'>상완삼두근</option>
  		<option value='11'>상완이두근</option>
  		<option value='12'>승모근</option>
  		<option value='13'>전완근</option>
  		<option value='14'>척추기립근</option>
	</select>
	<br/>
	제목 <input type="text" value="${dto.v_title }" id="v_title" name="v_title"/>	<br/>
	링크 <input type="text" value="${dto.v_link }" id="v_link" name="v_link"/>	<br/>
	타이틀이미지 <input type="file" id="file1" name="file1">	<br/>
	<input type="hidden" id="v_content" name="v_content"/>
</form>

<br>
<form action="/seImgInsert" id="editor_upimage" method="post" enctype="multipart/form-data">
	<textarea name="ir1" id="ir1" rows="40" cols="100" style="display: block;">${dto.v_content}</textarea>	
</form>

<input type="button" id="su" value="전송" />


<script type="text/javascript">
var oEditors = [];
nhn.husky.EZCreator.createInIFrame({
	oAppRef: oEditors,
	elPlaceHolder: "ir1",
	sSkinURI: "/resources/SE2.1.3.O8706/SmartEditor2Skin.html",	
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
        	var path="/resources/uploadG/"+data;
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
		$("#v_content").val(sHTML);
		$("#insert").submit();
		
  });
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