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

<script type="text/javascript">
$(document).ready(function(){
	$("a#update").click(function(){
		$("form#update").submit();
	})
	$("a#numer").click(function(){
		var pagenum=$(this).html();
		var r_num=${dto.r_num};
		var path="/admin/mboard/review/Reples?pageNum="+pagenum+"&r_num="+r_num
		$("a").css("color","white");
		$(this).css("color","red");
		$.getJSON(path,function(data){
	   
				   var co="<table border='1' width='600' id='table'><tr>"+
				   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
		$.each(data,function(i,reple){
			
		 	 co+="<tr><td>"+reple.rre_num+"</td><td>"+reple.id+"</td>"+
           	"<td>"+reple.rre_content+"</td><td>"+reple.rre_date+"</td></tr>"
			});
		co+="</table>";
	   $("#replecot").html(co);
	   
		});
	});
	$("a#next").click(function(){
	
		var pagenum=${pu.endPageNum-1}
		var r_num=${dto.r_num}
		var path="/admin/mboard/review/Reples?pageNum="+pagenum+"&r_num="+r_num
		$.getJSON(path,function(data){
			
		    var co="<table border='1' width='600' id='table'><tr>"+
			   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
	     $.each(data,function(i,reple){
		
	 	 co+="<tr><td>"+reple.rre_num+"</td><td>"+reple.id+"</td>"+
    	"<td>"+reple.rre_content+"</td><td>"+reple.rre_date+"</td></tr>"
		});
	      co+="</table>";
         $("#replecot").html(co);
		});
	});
	$("a#before").click(function(){
		var pagenum=${pu.endPageNum+1}
		var r_num=${dto.r_num}
		var path="/admin/mboard/review/Reples?pageNum="+pagenum+"&r_num="+r_num
		$.getJSON(path,function(data){
			
	    var co="<table border='1' width='600' id='table'><tr>"+
			   "<th>글번호</th><th>제목</th><th>내용</th><th>작성일</th></tr>";
	     $.each(data,function(i,reple){
		
	 	 co+="<tr><td>"+reple.rre_num+"</td><td>"+reple.id+"</td>"+
       	"<td>"+reple.rre_content+"</td><td>"+reple.rre_date+"</td></tr>"
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
})
</script> 
</head>
<body>
<form action="/client/menu/insert/comunity/border/Review/updateform" id="update" method="post">
<input type="hidden" name="r_num" value="${dto.r_num}"> 
<table border="1" width="600">
	<tr>
		<td>글제목</td>
		<td><input type="hidden" name="r_title" value="${dto.r_title }">${dto.r_title }</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td><input type="hidden" name="id" value="${dto.id }">${dto.id }</td>
	</tr>
	<tr>
		<td>작성일</td>
		<td><input type="hidden" name="r_date" value="${dto.r_date }">${dto.r_date }</td>
	</tr>
	<tr>
		<td>조회수</td>
		<td><input type="hidden" name="r_hits" value="${dto.r_hits }">${dto.r_hits }</td>
	</tr>
	<tr>
		<td>Before Img</td>
		<td><input type="hidden" name="r_before_img" value="${dto.r_before_img }"><img src="${dto.r_before_img}" id="add_foodimg" style="width: auto;height: auto; max-height: 110px; max-width:110px; "></td>
	</tr>
	<tr>
		<td>After Img</td>
		<td><input type="hidden" name="r_after_img" value="${dto.r_after_img }"><img src="${dto.r_after_img}" id="add_foodimg" style="width: auto;height: auto; max-height: 110px; max-width:110px; "></td>
	</tr>
	<tr>
		<td>내용</td>
		<td><input type="hidden" name="r_content" value='${dto.r_content }'>${dto.r_content }</td>
	</tr>
	<tr>
		<td>추천</td>
		<td><input type="hidden" name="count" value="${dto.count }">${dto.count}</td>
	</tr>
</table>
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
			<td>${reple.rre_num }</td>
		<td>${reple.id }</td>
		<td>${reple.rre_content }</td>
		<td>${reple.rre_date }</td>
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
</div>

<br>
[다음글]<a href="/admin/mboard/review/view?r_num=${next.r_num }">${next.r_title }</a><br/>
[이전글]<a href="/admin/mboard/review/view?r_num=${prev.r_num }">${prev.r_title }</a><br/>
<a href="/admin/mboard/review/list">메뉴</a>

</body>
</html>