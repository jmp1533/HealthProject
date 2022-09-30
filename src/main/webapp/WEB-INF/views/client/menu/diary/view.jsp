<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<script type="text/javascript"
	src="/resources/js/jquery-1.10.1.js"></script>

<script type="text/javascript">
$(document).ready(function(){
$("#delete").click(function(){
	$("#pop").css("display","block")
	
});
$("#cancel").click(function(){
	$("#pop").css("display","none")
	
});
})
</script> 


<style type="text/css">



 tr td img{
 width: auto;
 height: auto; 
 max-height: 150px; 
 max-width:150px;
 border: 2px solid black;
 margin: auto;
 margin-left: 10px;
 }
tr td{
border-left: 1px solid black	;
  padding: 3px; 
}

tr th{
text-align :center;
font-size:20px;
    padding: 3px;
	border: 1px solid black	;
}
table {
	border: 1px solid black	;
	  padding-bottom: 5px; 
	  margin:4px;
	  margin-left:150px;
	border-collapse: collapse;
}
.con{
margin-left: 50px;
width: 800px;
margin-top:50px;
min-height: 400px;
font-size:18px; 

}

#dele,#cancel{margin:18px;

	font-size: 14px;
	font-weight:500;
	color: #000000;
	padding: 10px 20px;
	background: -moz-linear-gradient(
		top,
		#d9d9d9 0%,
		#828282);
	background: -webkit-gradient(
		linear, left top, left bottom,
		from(#d9d9d9),
		to(#828282));
	-moz-border-radius: 10px;
	-webkit-border-radius: 10px;
	border-radius: 10px;
	border: 1px solid #2e2e2e;
	-moz-box-shadow:
		0px 1px 3px rgba(0,0,0,0.5),
		inset 0px 0px 1px rgba(255,255,255,0.5);
	-webkit-box-shadow:
		0px 1px 3px rgba(0,0,0,0.5),
		inset 0px 0px 1px rgba(255,255,255,0.5);
	box-shadow:
		0px 1px 3px rgba(0,0,0,0.5),
		inset 0px 0px 1px rgba(255,255,255,0.5);
	text-shadow:
		0px -1px 0px rgba(000,000,000,0.7),
		0px 1px 0px rgba(255,255,255,0.3);
}


#pop{

	position:fixed;
	-moz-border-radius: 12px;
	-webkit-border-radius: 12px;
	border-radius: 12px;
border-color:black; border-width:2px; border-style:solid; display:none; 
 margin-left:30%; background-color:#dcdcdc ; height: 150px;width: 260px;




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
	
	<div id="pop" >
  <h3 style="margin-top: 20px;margin-bottom: 20px; margin-left: 5px ">정말로 삭제 하시겠습니까?</h3>
  <hr><div id="po">
  <a href="/client/menu/diary/delete?d_num=${diary.d_num }"><input type="button" value="삭제" id="dele"></a>
   <input type="button" id="cancel" value="취소">
   </div>
</div>


<span style="font-size: 40px"> ${diary.d_title }</span>(${diary.id })
<div style="margin-top:40px; float: right; overflow: hidden;">
	<span  ><a href="#" id="delete">삭제</a> / <a id="update" href="/client/menu/diary/update?d_num=${ diary.d_num}" >수정</a> 
</span ></div><br><br>
<hr size="3" color="#a9a9a9a ;" >
<br>
 <span style="margin-top:5px; margin-right:10px;  float: right;">${diary.d_date }</span>

<br><br>
<div class="con">
${diary.d_content }
</div><br><hr>
<br>
<div align="center" style="font-size: 30px">식사 </div>
<br>
<hr >
	<c:forEach var="dto" items="${list}">
	<table  width="600">
	
  <tr><th colspan="2"> ${dto.dm_time }  </th> </tr>
	
		<tr> 
		  <td width="200" style="padding: 3px">
		  <img src="${dto.dm_img }" id="add_foodimg" ></td>
		  <td>
		  <ul style="margin-left: 30px">
		  
		        <li>칼로리 -${dto.calorie  }
		    </li>
		        <li>지방 -${dto.fat }
		    </li>
		        <li>탄수화물 -${dto.cardohydrate}
		    </li>
		        <li>콜래스트롤- ${dto.cholesterol}
		    </li>
		    <li>
		               단백질 -${dto.protein }
		    </li>
		  </ul>
		  </td> 
		</tr>	
	
		
	</table>
	</c:forEach>

<br>
<hr  style="border-top:2px dashed #a9a9a9a; background-color: #fff">

</div>



</div>
