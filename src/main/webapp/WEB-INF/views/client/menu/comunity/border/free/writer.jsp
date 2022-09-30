<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script> 
    <script src="http://malsup.github.com/jquery.form.js"></script> 

	<script type="text/javascript" src="/resources/js/jquery.autogrowtextarea.js"></script>
    
 <style>
		textarea {

			width:300px;overflow:visible

	
		}
		img{
		width: auto;
	      height: auto;
	    max-height: 77px;
		}
	</style>
 
   

 <script> 
        // wait for the DOM to be loaded 
      $('#serverInfoForm').ajaxForm({
        dataType: 'text', 
        beforeSerialize: function(){           // form을 직렬화하기전 엘레먼트의 속성을 수정할 수도 있다.            
        },
        beforeSubmit : function() {
        //action에 걸어주었던 링크로 가기전에 실행 ex)로딩중 표시를 넣을수도 있다.
        },
        success : function(data) {           //컨트롤러 실행 후 성공시 넘어옴
     
        }

    });
    
    
    $(document).ready(function() {
    $("#asd").click(function(){
    	$("#forms").append("<br><input type='hidden' name='imgpath'>"+
    			"<div id='img'> <img src='http://tv02.search.naver.net/kwebthumb?type=r80&q=http://www.readwriteweb.com/hack/scale.jpg#150x150'>"+
    					"<a>삭제</a></div>"+
    			 "<textarea name='content' id='content'  rows='1'> </textarea>");
    });
    	
 
    $( "#forms" ).on( "click","textarea",function() {
    
    	$(this).autoGrow(); 
    	});
    $( "#forms" ).on( "click","div",function() {
     	$( this ).click(function(){
     		$(this).css("display","none");
     	})
    	});
    
   
    });
    </script> 
</head>
<body>
<form name="serverInfoForm" id="serverInfoForm" method="post" action="/utility/page/Ajaxuplod" enctype = "multipart/form-data">
        <input type="file" name="agentInstallFile" id="agentInstallFile"> 
        <input type="submit"  class="btn" value="전송">
</form>
<input type="button" value="asd" id="asd">
<img alt="" src="" style=" height: auto;  max-height: 150px;">
<form name="write" id="write" action="/client/menu/diary/writer" method="post" >


<!-- 동적 -->
<div id="forms">
<input type="text" name="title"><br>
 <input type="hidden" name="imgpath"  >
 <textarea name="content" id="content"  rows="1"> </textarea>
</div>



<input type="submit" value="전송">
</form>
</body>
</html>