<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript"
	src="/resources/js/jquery-1.10.1.js"></script>
	
	<style type="text/css">
	a{
	color: 
	}
	</style>
<script type="text/javascript">
$(document).ready(function(){
	$("a#update").click(function(){
		$("form#update").submit();
	})
	
	$("a#numer").click(function(){
		var pagenum=$(this).html();
		var tipnum=${dto.tip_num};
		var path="/admin/mboard/tip/Reples?pageNum="+pagenum+"&tipnum="+tipnum
		$("a").css("color","white");
		$(this).css("color","red");
		$.getJSON(path,function(data){
	   
				   var co="<table border='1' width='600' id='table'><tr>"+
				   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
		$.each(data,function(i,reple){
			
		 	 co+="<tr><td>"+reple.fr_num+"</td><td>"+reple.id+"</td>"+
           	"<td>"+reple.fr_content+"</td><td>"+reple.fr_date+"</td></tr>"
			});
		co+="</table>";
	   $("#replecot").html(co);
	   
		});
	});
	$("a#next").click(function(){
	
		var pagenum=${pu.endPageNum-1}
		var tipnum=${dto.tip_num}
		var path="/admin/mboard/tip/Reples?pageNum="+pagenum+"&tipnum="+tipnum
		$.getJSON(path,function(data){
			
		    var co="<table border='1' width='600' id='table'><tr>"+
			   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
	     $.each(data,function(i,reple){
		
	 	 co+="<tr><td>"+reple.tr_num+"</td><td>"+reple.id+"</td>"+
    	"<td>"+reple.tr_content+"</td><td>"+reple.tr_date+"</td></tr>"
		});
	      co+="</table>";
         $("#replecot").html(co);
		});
	});
	$("a#before").click(function(){
		var pagenum=${pu.endPageNum+1}
		var tipnum=${dto.tip_num}
		var path="/admin/mboard/tip/Reples?pageNum="+pagenum+"&tipnum="+tipnum
		$.getJSON(path,function(data){
			
	    var co="<table border='1' width='600' id='table'><tr>"+
			   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
	     $.each(data,function(i,reple){
		
	 	 co+="<tr><td>"+reple.tip_num+"</td><td>"+reple.id+"</td>"+
       	"<td>"+reple.tip_content+"</td><td>"+reple.tip_date+"</td></tr>"
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
</head>
<body>
<form action="/client/menu/insert/comunity/border/tip/updateform" id="update" method="post">
<input type="hidden" name="tip_num" value="${dto.tip_num}"> 
<input type="hidden" name="id" value="${dto.id }">  아이디 ${dto.id }<br>
<input type="hidden" name="tip_date" value="${dto.tip_date }"> 날짜 ${dto.tip_date }<br>
<input type="hidden" name="tip_title" value="${dto.tip_title }"> 제목 ${dto.tip_title }<br>
<input type="hidden" name="tip_hits" value="${dto.tip_hits }"> 조회 ${dto.tip_hits }<br>
<input type="hidden" name="count" value="${dto.count }"> 추천 ${dto.count}<br>
 <div >
 <input type="hidden" name="tip_content" value='${dto.tip_content }'>  ${dto.tip_content}
</div>
</form>

댓글
<div id="replecontent">
<div id="replecot">
<table border="1" width="600" id="table">
	<tr>
		<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th>
	</tr>
	
	<c:forEach var="reple" items="${reple }">
		<tr>
			<td>${reple.tip_num }</td>
		<td>${reple.id }</td>
		<td>${reple.tr_content }</td>
		<td>${reple.tr_date }</td>
		</tr>
	</c:forEach>
	
</table>
</div>
<div>
	<c:choose>
		<c:when test="${pu.startPageNum>10 }">
			<a  id="before">[이전]</a>
		</c:when>
		<c:otherwise>
			[이전]
		</c:otherwise>
	</c:choose>
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }">
		<c:choose>
			<c:when test="${i==pu.pageNum }">
			<a  id="numer" style="color: red;">
				${i }
				</a>
			</c:when>
			<c:otherwise>
				<a  id="numer">${i }</a>
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
</div>

<br/>
[다음글]<a href="/admin/mboard/tip/view?tip_num=${next.tip_num }">${next.tip_title }</a><br/>
[이전글]<a href="/admin/mboard/tip/view?tip_num=${prev.tip_num }">${prev.tip_title }</a><br/>
<a href="/admin/mboard/tip/list">메뉴</a>
</body>
</html>