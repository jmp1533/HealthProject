<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	$("a#update").click(function(){
		$("form#update").submit();
	})
	
$("a#numer").click(function(){

		var pagenum=$(this).html();
		var p_num=${dto.p_num};
		var path="/client/menu/peple/user/reple?pageNum="+pagenum+"&pnum="+p_num
		$("a").css("color","white")
		$(this).css("color","red");
		$.getJSON(path,function(data){
				   var co="<table border='1' width='600' id='table'><tr>"+
				   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
		$.each(data,function(i,reple){		
		 	 co+="<tr><td>"+reple.pr_num+"</td><td>"+reple.id+"</td>"+
           	"<td>"+reple.pr_content+"</td><td>"+reple.pr_date+"</td></tr>"
			});
		co+="</table>";
	   $("#replecot").html(co);
	   
		});
	});
	$("a#next").click(function(){
	
		var pagenum=${pu.endPageNum-1}
		var p_num=${dto.p_num}
		var path="/client/menu/peple/user/reple?pageNum="+pagenum+"&pnum="+p_num
		$.getJSON(path,function(data){
			
		    var co="<table border='1' width='600' id='table'><tr>"+
			   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
	     $.each(data,function(i,reple){
		
	 	 co+="<tr><td>"+reple.pr_num+"</td><td>"+reple.id+"</td>"+
    	"<td>"+reple.pr_content+"</td><td>"+reple.pr_date+"</td></tr>"
		});
	      co+="</table>";
         $("#replecot").html(co);
		});
	});
	$("a#before").click(function(){
		var pagenum=${pu.endPageNum+1}
		var p_num=${dto.p_num}
		var path="/client/menu/peple/user/reple?pageNum="+pagenum+"&pnum="+p_num
		$.getJSON(path,function(data){
			
	    var co="<table border='1' width='600' id='table'><tr>"+
			   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
	     $.each(data,function(i,reple){
		
	 	 co+="<tr><td>"+reple.pr_num+"</td><td>"+reple.id+"</td>"+
       	"<td>"+reple.pr_content+"</td><td>"+reple.pr_date+"</td></tr>"
		});
	      co+="</table>";
        $("#replecot").html(co);
		});
	})
	
	
})
</script>
</head>
<body>
<h3>상세보기</h3>

<input type="hidden" name="p_num" value="${dto.p_num}">
<img src="${dto.p_img}" width="50px" height="50px" /><br>
<Div style="float: right;">
<c:if test="${dto.id==id }">
<a href="#" id="update">수정</a> / <a href="/client/menu/people/user/delete?p_num=${dto.p_num }">삭제</a> 
</c:if>

</Div>

<form action="/client/menu/people/user/update" method="post" id="update" >
<input type="hidden" name="p_num" value="${dto.p_num }">
<input type="hidden" name="p_img" value="${dto.p_img }"> 
         아이디:${dto.id}<input type="hidden" name="id" value="${dto.id}">  <br>
	제목 : ${dto.p_title}<input type="hidden" name="p_title" value="${dto.p_title}">  <br>
	지역: ${dto.p_zone}<input type="hidden" name="p_zone" value=" ${dto.p_zone}">  <br>
	날짜:${dto.p_sportsdate}<input type="hidden" name="p_sportsdate" value="${dto.p_sportsdate}">   <br>
	시간:${dto.p_sportstime}<input type="hidden" name="p_sportstime" value="${dto.p_sportstime}">  <br>
	조회수:${dto.p_hits} <input type="hidden" name="p_hits" value="${dto.p_hits}"> <br>

	<br/>

	
	 	내용
    <div style="min-height:200px ">
${dto.p_content}	<input type="hidden" name="p_content" value='${dto.p_content}'>
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
			<td>${reple.pr_num  }</td>
		<td>${reple.id  }</td>
		<td>${reple.pr_content  }</td>
		<td>${reple.pr_date  }</td>
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
	<c:forEach var="i" begin="${pu.startPageNum }" end="${pu.endPageNum }" >
		<c:choose>
			<c:when test="${i==pu.pageNum }">
			<a  id="numer" style="color: red;">
				${i }
				</a>
			</c:when>
			<c:otherwise>
				<a id="numer">${i}</a>
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

<c:if test="${not empty id }">
댓글쓰기
<form action="/client/menu/peple/user/reple" method="post" id="replefom">
<input type="hidden" value="${dto.p_num}" name="p_num">
<textarea rows="4" cols="50" name="content"> </textarea>
<input type="submit" id="repleinsert" value="입력">
</form>
</c:if>


	<br/>
	
		[다음글]<a href="/client/menu/people/user/view?p_num=${next.p_num }">${next.p_title }</a><br/>
		[이전글]<a href="/client/menu/people/user/view?p_num=${prev.p_num }">${prev.p_title }</a>

</body>
</html>
