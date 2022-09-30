<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
	
    $( "#food_div" ).on("click","input",function() {	
    	$( this ).click(function(){
     	$(this).parents("#foodtable").remove();
     	})
    	});
    
	$("#delete" ).click(function(){
     	$(this).parents("#foodtable").remove();
     })

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
   
  margin-left: 700px;
  
}
#img{
width: auto;
	      height: auto;
	    max-height: 77px;
	      background-color: 
}



select{
padding: 3px;
 margin-bottom: 4px;
  margin-left: 20px;
}


#food_input_table {
  margin-left: 80px;
  margin-bottom: 20px;
}


#food_input_table tr th{
  border:  1px solid black;
  text-align: center;
}


#food_input_table tr td ul li {
 margin-left: 5px
}
#food_input_table tr td ul li input{
 margin-bottom: 4px;
 width: 80px;
 padding: 3px;
 margin-left: 20px;
}
#food_input_table tr td {
   border:  1px solid black;
  padding: 10px;
 
}


#food_input_submit input{
margin-top:10px;
	font-size: 14px;
	padding: 10px 20px;
	-moz-border-radius: 12px;
	-webkit-border-radius: 12px;
	border-radius: 12px;
	-moz-box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	-webkit-box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	text-shadow:
		0px -1px 0px rgba(000,000,000,0.4),
		0px 1px 0px rgba(255,255,255,0.3);

}

#foodtable {
border-collapse: collapse;
border-top: 1px solid black;
border-bottom: 1px solid black;

}
#foodtable tr{
}
#foodtable #foodtable_img{
width: 150px;
}
#foodtable #foodtable_con{
padding: 3px;
width: 350px;
padding-left: 50px;
}
#de{

margin-top:10px;
float:right;
margin-right:10px;
	font-size: 14px;
	padding: 10px 20px;
	-moz-border-radius: 12px;
	-webkit-border-radius: 12px;
	border-radius: 12px;
	-moz-box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	-webkit-box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	text-shadow:
		0px -1px 0px rgba(000,000,000,0.4),
		0px 1px 0px rgba(255,255,255,0.3);

}


#su{
margin-top:10px;
	font-size: 20px;
	padding: 10px 20px;
	-moz-border-radius: 12px;
	-webkit-border-radius: 12px;
	border-radius: 12px;
	-moz-box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	-webkit-box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	box-shadow:
		0px 1px 3px rgba(000,000,000,0.5),
		inset 0px 0px 2px rgba(255,255,255,0.7);
	text-shadow:
		0px -1px 0px rgba(000,000,000,0.4),
		0px 1px 0px rgba(255,255,255,0.3);

}
</style>
<div class="wrap">
<div class="page_list"><%--200*800사이즈로 이미지 넣을것 제작 --%>
	<div class="list_menu"><%--이미지 넣을땐 158*50 픽셀로 만들것! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			다이어리
		</div>
		<div class="list_1" ><%--이미지 링크뒤에 글내용 바꾸고 크기 다시 조절해야함 --%>
			<a href="/client/menu/diary/date">다이어리</a><%--이미지로 변경해서 각 페이지 초기값으로 링크 연결. --%>
		</div>
		<div class="list_2">
			<c:choose>
				<c:when test="${not empty tlogid }">
					<a href="/client/menu/diary/chart_traner">회원 체중 그래프</a>
				</c:when>
				<c:otherwise>
					<a href="/client/menu/diary/chart">체중변화그래프</a>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
   	<img>
</div>


  <div class="main">
<h1 style="font-size: 40px;">수정</h1>
<div id="imgeup" style="position: absolute; margin-top:70px;" class="img_uplode_pop">

 <form id="editor_upimage" name="editor_upimage" action="/seImgInsert" method="post" enctype="multipart/form-data">

        <input type="button" value="x" style="float: right;" id="imgeupdown">
  
      <input type="file" name="update_image" id="update_image" onchange="pasteHTML();" class="fi">
    	
     	<input type="hidden" id="imgpath">
     	<img id="img" src=""><br>
     	<input type="submit" onclick="pasteHTML2();" value="이미지넣기" />
     	
  </form>
  </div>
  
   
 <form action="/client/menu/diary/update" method="post" id="update">


<span style="float: right; margin-right: 130px; font-size: 17px; font-weight:700; margin-top: 20px"> ${diary.d_date }</span><br>
제목 - <input type="text" name="d_title" value="${diary.d_title }"  id="input_title" >
<div style="position: absolute; margin-top: 10px; margin-left: 630px" class="write_img">
 <a id="imgepop"  >이미지올리기</a>
 </div>
<textarea name="ir1" id="ir1" rows="30" cols="120" style="display: block;"> ${diary.d_content}</textarea>
<input type="hidden" id="d_content" name="d_content">
<input type="hidden" id="d_num" name="d_num" value="${diary.d_num }">

 <h2>등록된 음식</h2> 
 <hr style=" width: 700px;">
<div name="food_div" id="food_div"  >
<c:forEach var="dto" items="${list}">


    <table id='foodtable'><tr>
	   <td  align='center' id='foodtable_img'>
	   <img src="${dto.dm_img }" id="add_foodimg" style="width: auto;height: auto; max-height: 150px;">
	  <input type='hidden' name='dm_img' value="${dto.dm_img }" > 
	   </td>
	<td>
	<td  id='foodtable_con'>
		  <ul>
	     <li>시간 -
	       <select name='dm_time' id='add_foodtime' >
	       <c:choose>
			<c:when test="${dto.dm_time=='아침'}"> 
		 <option value="아침" selected="selected">아침</option> <option value="점심">점심</option> <option value="저녁">저녁</option> <option value="간식">간식</option>
			</c:when>
	     <c:when test="${dto.dm_time=='점심'}"> 
		 <option value="아침">아침</option> <option value="점심" selected="selected">점심</option> <option value="저녁">저녁</option> <option value="간식">간식</option>
			</c:when>
				<c:when test="${dto.dm_time=='저녁'}"> 
		 <option value="아침">아침</option> <option value="점심">점심</option> <option value="저녁" selected="selected">저녁</option> <option value="간식">간식</option>
			</c:when>
			<c:otherwise>
			<option value="아침">아침</option> <option value="점심">점심</option> <option value="저녁" >저녁</option> <option value="간식" selected="selected">간식</option>
			</c:otherwise>
		</c:choose>
	   
	    </select>
	          </li>
	      <li>
	            칼로리  - <input type='text' value="${dto.calorie}" name='calorie' id='add_kcal'>
	      </li>
	              <li>  지방 - <input type='text' value="${dto.fat}" name='fat' id='add_tan'>   </li>
	           <li>   탄수화물 -<input type='text' value="${dto.cardohydrate}" name='cardohydrate' id='add_dan'>  </li>
		     <li> 콜래스트롤 -<input type='text' value="${dto.cholesterol} " name='cholesterol' id='add_read_ji'> 	  </li>
		       <li>  단백질 -<input type='text' value="${dto.protein}" name='protein' id='add_col'>  </li>  	
	   	</ul>
	</td>
	  <td><input type='button' value='삭제'  id='de' >  </td>
	</tr>
	</table>

</c:forEach>
</div>
 <hr style=" width: 700px;">
</form>
  
<br>
<form id="edit" name="edit" action="/seImgInsert" method="post" enctype="multipart/form-data">
 	<table id="food_input_table">
     <tr><th colspan="2" >음식등록 </th>  </tr>
 	<tr>
 	<td style="width: 200px"> 		
  	<img id="read_foodimg" class="read_foodimg" src='' align="middle" style="	width: auto;
	      height: auto;
	    max-height: 200px; border: 1px solid black;"><br>
      <input  type="file" name="update_image" id="update_image22" onchange="foodupload();" class="fi" >
    <br>
    </td>
    <td style="width: 300px">
 <ul><li>
 	시간- <select id="read_time"><option value="아침">아침</option> <option value="점심">점심</option> <option value="저녁">저녁</option> <option value="간식">간식</option></select><br>
  </li>
     <li>    칼로리 <input type="number" id="read_kcal" name="read_kcal" value="0"></li>
     <li>  지방<input type="number" id="read_tan" name="read_tan" value="0"> </li>
     <li>  탄수화물 <input type="number" id="read_dan" name="read_dan" value="0"></li>
      <li>     콜래스트롤 <input type="number" id="read_ji" name="read_ji" value="0"></li>
  <li>	단백질 <input type="number" id="read_col" name="read_col" value="0"></li>
  	</ul>
  	
  <div style="" id="food_input_submit">
  	<input type="button" value="음식선택" onclick="window.open('/client/menu/diary/foodpopup','','width=450,height=400, scrollbars=yes')">
     <input type="button" value="등록" style="float:right; margin-right: 10px; " id="food_on" >
  </div> 
  	</td>
 	</tr>
 	</table> 	
  </form>
	
	<!--textarea name="ir1" id="ir1" rows="10" cols="100" style="width:100%; height:412px; min-width:610px; display:none;"></textarea-->




<input type="button" id="su" value="업데이트" />
</div>
</div>
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
            alert("asd")  
        	var path="/resources/uploadG/"+data;
        	$("#img").attr("src",path)
             $("#imgpath").val(path);   	
      var sHTML = "<img src="+path+">";     
  	//oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
        }  
    });
}

function foodupload() {
    $("#edit").ajaxForm({
        dataType: 'text', 
        beforeSerialize: function(){           // form을 직렬화하기전 엘레먼트의 속성을 수정할 수도 있다.            
        },
        beforeSubmit : function() {
        //action에 걸어주었던 링크로 가기전에 실행 ex)로딩중 표시를 넣을수도 있다.
        },
        success : function(data) {
     
        	var path="/resources/uploadG/"+data;
        	
        	$(".read_foodimg").attr("src",path)
        	$("#update_image22").css("display","none")
        }  
    });
}

function pasteHTML2() {  
      var path=$("#imgpath").val();
	  var sHTML = "<img src="+path+">";    
	  oEditors.getById["ir1"].exec("PASTE_HTML", [sHTML]);
}




  
  $("#food_on").click(function(){
    var content= "<table id='foodtable'><tr>"+
	   "<td  align='center' id='foodtable_img'>"+
		  " <img src='"+$("#read_foodimg").attr("src")+"'  id='add_foodimg' style='"+
			  "width: auto;   height: auto; max-height: 150px;'>"+
			" <input type='hidden' name='dm_img' value="+$("#read_foodimg").attr("src")+" > </td><td  id='foodtable_con'>"+ 
			"<ul>"+
		    "<li>시간 - "+$("#read_time").val()+"<input type='hidden' value="+$("#read_time").val()+" name='dm_time' id='add_foodtime'> </li>"+
		    "<li>칼로리  - "+$("#read_kcal").val()+"<input type='hidden' value="+$("#read_kcal").val()+" name='calorie' id='add_kcal'></li>"+
		    "<li>지방 - "+$("#read_tan").val()+"<input type='hidden' value="+$("#read_tan").val()+" name='fat' id='add_tan'> </li>"+
		    "<li>탄수화물 - "+$("#read_dan").val()+"<input type='hidden' value="+$("#read_dan").val()+" name='cardohydrate' id='add_dan'> </li>"+
		    "<li>콜래스트롤 - "+$("#read_ji").val()+"<input type='hidden' value="+$("#read_ji").val()+" name='cholesterol' id='add_read_ji'> </li>"+
		    "<li>단백질 - "+$("#read_col").val()+"<input type='hidden' value="+$("#read_col").val()+" name='protein' id='add_col'> "+
		    "</li>"+
		    "<ul>"+
			"</td><td><input type='button' id='de' value='삭제' id='delete' ></td></tr></table>"
	  $("#food_div").append(content);	  
  })


  $("#su").click(function(){
	  
		var sHTML = oEditors.getById["ir1"].getIR();
		$("#d_content").val(sHTML);
		alert(	sHTML)
		$("#update").submit();
		
  });
  $("#update_image").change(function(){
		$("#editor_upimage").submit();
	}) 
	$("#update_image22").change(function(){
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

