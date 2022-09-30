<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("a#update").click(function(){
		$("form#update").submit();
	})
	
	$("a#numer").click(function(){
		var pagenum=$(this).html();
		var tipnum=${dto.tip_num};
		var path="/client/menu/insert/comunity/border/tip/Reples?pageNum="+pagenum+"&tipnum="+tipnum
		$("a").css("color","white");
		$(this).css("color","red");
		$.getJSON(path,function(data){
	   
			var co="<table>"
			     $.each(data,function(i,reple){
			    	 co+="<tr><td><b style='font-size: 20px'>"+reple.id+"</b><span style='float: right;'>"+
						reple.tr_date.toString().substring(0,16)+"</span></td></tr>"+
						"<tr><td>"+reple.tr_content+"</td></tr>";
				});
			      co+="</table>";
	   $("#replecot").html(co);
	   
		});
	});
	$("a#next").click(function(){
	
		var pagenum=${pu.endPageNum-1}
		var tipnum=${dto.tip_num}
		var path="/client/menu/insert/comunity/border/tip/Reples?pageNum="+pagenum+"&tipnum="+tipnum
		$.getJSON(path,function(data){
			
			var co="<table>"
			     $.each(data,function(i,reple){
			    	 co+="<tr><td><b style='font-size: 20px'>"+reple.id+"</b><span style='float: right;'>"+
						reple.tr_date.toString().substring(0,16)+"</span></td></tr>"+
						"<tr><td>"+reple.tr_content+"</td></tr>";
				});
			      co+="</table>";
         $("#replecot").html(co);
		});
	});
	$("a#before").click(function(){
		var pagenum=${pu.endPageNum+1}
		var tipnum=${dto.tip_num}
		var path="/client/menu/insert/comunity/border/tip/Reples?pageNum="+pagenum+"&tipnum="+tipnum
		$.getJSON(path,function(data){
			
			var co="<table>"
			     $.each(data,function(i,reple){
			    	 co+="<tr><td><b style='font-size: 20px'>"+reple.id+"</b><span style='float: right;'>"+
						reple.tr_date.toString().substring(0,16)+"</span></td></tr>"+
						"<tr><td>"+reple.tr_content+"</td></tr>";
				});
			      co+="</table>";
        $("#replecot").html(co);
		});
	});
	$("#delete").click(function(){
		$("#pop").css("display","block")
		
	});
	$("#cancel").click(function(){
		$("#pop").css("display","none")
		
	});
	$("#dele").click(function(){
	   	
	});
});
</script>
<style type="text/css">
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
	<span style="font-size: 40px"> ${dto.tip_title }</span>(${dto.id })
<c:if test="${not empty id }">
<div style="margin-top:40px; float: right; overflow: hidden;">
	<span  ><a href="#" id="delete">삭제</a> / <a href="#" id="update">수정</a> 
</span ></div>
</c:if>
<br><br>
<!-- 삭제수정 팝업 ajax -->
			<div id="pop" >
			  <h3 style="margin-top: 20px;margin-bottom: 20px; margin-left: 5px ">정말로 삭제 하시겠습니까?</h3>
			  <hr><div id="po">
			  <a href="/client/menu/insert/comunity/border/tip/delete?tip_num=${dto.tip_num }"><input type="button" value="삭제" id="dele"></a>
			   <input type="button" id="cancel" value="취소">
			   </div>
			</div>
<hr size="3" color="#a9a9a9a ;" >
<span style="margin-top:5px; margin-right:10px;  float: right;">날짜: ${dto.tip_date }</span><br>

<div class="view">
<div class="view_content">
			<input type="hidden" name="r_content" value='${dto.tip_content }'>
			<div style="min-height: 200px"> 
			${dto.tip_content }
			</div>
</div>
		댓글 |
		조회수: ${dto.tip_hits }
		<c:if test="${not empty id }">
		| <a href="/client/menu/insert/comunity/border/tip/commend?tip_num=${dto.tip_num }"><input type="button"value="추천하기"></a>
		</c:if>
	</div>

<form action="/client/menu/insert/comunity/border/tip/updateform" id="update" method="post">
<input type="hidden" name="tip_num" value="${dto.tip_num}"> 
<input type="hidden" name="id" value="${dto.id }"> 
<input type="hidden" name="tip_date" value="${dto.tip_date }"> 
<input type="hidden" name="tip_title" value="${dto.tip_title }"> 
<input type="hidden" name="tip_hits" value="${dto.tip_hits }">
<input type="hidden" name="count" value="${dto.count }"> 
 <div >
 <input type="hidden" name="tip_content" value='${dto.tip_content }'>
</div>
</form>

<div class="reple">
		<div style="border-style: inset;" id="replecot">
			<c:forEach var="reple" items="${reple }">
				<table id="table">
					<tr>
						<td><b style="font-size: 20px">${reple.id }:</b>&nbsp;<span style="float: right;">${reple.tr_date.toString().substring(0,16) }</span></td>
					</tr>
					<tr>
						<td>${reple.tr_content }</td>
					</tr>
				</table>
			</c:forEach>
		</div>
		
		<div class="reple_number">
			<c:choose>
				<c:when test="${pu.startPageNum>10 }">
					<a  id="before">[이전]</a>
				</c:when>
				<c:otherwise>
					[이전]
				</c:otherwise>
			</c:choose>
			<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }" >
				<c:choose>
					<c:when test="${i==pu.pageNum }">
					<a id="numer" style="color: red;">
						${i }
						</a>
					</c:when>
					<c:otherwise>
						<a id="numer">${i }</a>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:choose>
				<c:when test="${pu.endPageNum<pu.totalPageCount }">
					<a  id="next"> [다음]</a>
				</c:when>
				<c:otherwise>
					[다음]
				</c:otherwise>
			</c:choose>
		</div>
		
		<div class="reple_write">
			<c:choose>
			<c:when test="${not empty id }">
				<form action="/client/menu/insert/comunity/border/tip/Reple" method="post" id="replefom">
					<input type="hidden" value="${dto.tip_num}" name="tip_num">
					<textarea style="width: 600px; min-height:30px; max-height: 60px;" name="content"> </textarea>
					<input type="submit" style="width: 30px; height: 30px;" id="repleinsert" value="입력">
				</form> 
			</c:when>
			
			<c:otherwise>
				<input type="text" disabled="disabled" style="width: 600px; min-height:30px; max-height: 60px;" value="*** 덧글 작성은 로그인을 하셔야 합니다 ***">
				<input type="button" value="입력" style="width: 30px; height: 30px;">
			</c:otherwise>
			
			</c:choose>
		</div>
		<a href="/client/menu/insert/comunity/border/tip/list"><input type="button"value="메뉴"></a>
	</div>

<br/>
[다음글]<a href="/client/menu/insert/comunity/border/tip/view?tip_num=${next.tip_num }">${next.tip_title }</a><br/>
[이전글]<a href="/client/menu/insert/comunity/border/tip/view?tip_num=${prev.tip_num }">${prev.tip_title }</a><br/>
<a href="/client/menu/insert/comunity/border/tip/list">메뉴</a>
</div>