<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv='Content-type' content='text/html; charset=utf-8'>
<meta http-equiv="cache-control" content="no-cache, must-revalidate">
<meta http-equiv="pragma" content="no-cache">
<title>이미지삽입</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7/jquery.js"></script> 
    <script src="http://malsup.github.com/jquery.form.js"></script> 
<link rel="stylesheet" type="text/css" href="css/editor.css" />
<link href="css/imgupload.css" rel="stylesheet" type="text/css" />
<style type="text/css">
  body { margin:0; padding:0; }
</style>
<script language="javascript">
/**
 *작성자 : 여태성 
 *작성일 : 2010.10.25
 *
 */
var capaHTML = 0;
var isGecko = 0;

if ( navigator.product == "Gecko" ) {
  capaHTML = 1;
  isGecko = 1;
}



function submitImageUploadForm(uploadForm)//여기
{
  var theFrm = document.editor_upimage;

  fileName = theFrm.update_image.value;

  
    pathpoint = fileName.lastIndexOf('.');
    filepoint = fileName.substring(pathpoint+1,fileName.length);
    filetype = filepoint.toLowerCase();
    alert(pathpoint)
     alert(filepoint)
      alert(filetype)
       alert(parent)
    theFrm.imagepath.value = parent.parent.imagepath;
    alert(parent)
  try {//구간
	 
	  
      theFrm.submit();//서브미트구간
 
  } catch (e) {
    theFrm.reset();
    alert('파일을 업로드할 수 없습니다.');
    return;
  }
}

function closeWin() { 

  parent.parent.oEditors.getById["<%=request.getParameter("id")%>"].exec("SE_TOGGLE_IMAGEUPLOAD_LAYER");  
  return false;
}

function insertFileName(){

	var name = document.getElementById("sendFileName").value;
	if(name!=null&&name!=""){		
		
		  parent.parent.insertIMG("contents",name);
		  parent.parent.oEditors.getById["<%=request.getParameter("id")%>"].exec("SE_TOGGLE_IMAGEUPLOAD_LAYER");  
		  return false;
	}else{
		
	}
}

</script>

<script> 
        // wait for the DOM to be loaded 
      $('#editor_upimage').ajaxForm({
        dataType: 'text', 
        beforeSerialize: function(){           // form을 직렬화하기전 엘레먼트의 속성을 수정할 수도 있다.            
        },
        beforeSubmit : function() {
        //action에 걸어주었던 링크로 가기전에 실행 ex)로딩중 표시를 넣을수도 있다.
        },
        success : function(data) {           //컨트롤러 실행 후 성공시 넘어옴
     alert(data)
        }

    });
    
    
    </script> 
</head>
<body onload="insertFileName();">
<input type="hidden" id="sendFileName" value="${sendFileName }">
<div id="naver_common_editor">
  <form id="editor_upimage" name="editor_upimage" action="/seImgInsert" method="post" enctype="multipart/form-data">
  <input type="hidden" name="imagepath">  
  <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
  <div class="pic_content" style="border:0;">
    <p class="search"><input type="file" name="update_image" style="width:222px;ime-mode:disabled" onkeydown="return false"></p>
    
    <div class="btn_box">
    <input type="submit" value="qwe">
      <a href="javascript:submitImageUploadForm(document.getElementById('editor_upimage'));"><img src="img/btn_layer_confirm.gif" alt="확인" width="38" height="21"></a>
      <a href="javascript:closeWin()"><img src="img/btn_layer_cancel.gif" alt="취소" width="38" height="21" border="0"></a>
    </div>
  </div>  
  </form>
  
</div>
</body>
</html>
