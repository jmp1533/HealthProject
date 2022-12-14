<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/resources/css/jquery-ui-1.10.3.custom.css" type="text/css" />
<script type="text/javascript" src="/resources/js/jquery-1.10.1.js"></script>
<script type="text/javascript" src="/resources/js/jquery-ui-1.10.3.custom.js"></script>
<style type="text/css">
table#gallender{
color:black;
margin-left:50px;
border-spacing: 6px;
border-radius: 5px;
width: 800px;
margin-top:40px;
padding-top: 10px;
padding-left:5px;
padding-right:5px;
padding-bottom:40px;
background-image: -webkit-gradient(
	linear,
	left top,
	left bottom,
	color-stop(0, #EDF7FC),
	color-stop(0.5, #D8F1FC),
	color-stop(1, #F2F5FF)
);
background-image: -o-linear-gradient(bottom, #EDF7FC 0%, #D8F1FC 50%, #F2F5FF 100%);
background-image: -moz-linear-gradient(bottom, #EDF7FC 0%, #D8F1FC 50%, #F2F5FF 100%);
background-image: -webkit-linear-gradient(bottom, #EDF7FC 0%, #D8F1FC 50%, #F2F5FF 100%);
background-image: -ms-linear-gradient(bottom, #EDF7FC 0%, #D8F1FC 50%, #F2F5FF 100%);
background-image: linear-gradient(to bottom, #EDF7FC 0%, #D8F1FC 50%, #F2F5FF 100%);
border: 2px solid #4167e1; 

}


table tr td#to{				
																			
background-image: -webkit-gradient(
	linear,
	left top,
	left bottom,
	color-stop(0, #F0F7FA),
	color-stop(0.51, #BAD9FF),
	color-stop(1, #EDF5FF)
);
background-image: -o-linear-gradient(bottom, #F0F7FA 0%, #BAD9FF 51%, #EDF5FF 100%);
background-image: -moz-linear-gradient(bottom, #F0F7FA 0%, #BAD9FF 51%, #EDF5FF 100%);
background-image: -webkit-linear-gradient(bottom, #F0F7FA 0%, #BAD9FF 51%, #EDF5FF 100%);
background-image: -ms-linear-gradient(bottom, #F0F7FA 0%, #BAD9FF 51%, #EDF5FF 100%);
background-image: linear-gradient(to bottom, #F0F7FA 0%, #BAD9FF 51%, #EDF5FF 100%);
width: 14%;
font-size:20px;
font-weight:900;
height:100px;
border: 2px solid #4167e1; 


}
table#gallender tr th{

width: 14%;
padding: 10px;
border: 2px solid #4167e1;


}
table#gallender tr td a span#v,table#gallender tr td a span#w{
font-size: 13px;
color: #191970
}
table#gallender tr td a span#v{
width: 100%;
overflow: hidden;
}
table#gallender tr td a span#w{
width: 100%;
font-size: 14px;
overflow: hidden;
}
table#gallender tr td:HOVER{
width: 14%;
overflow:hidden;
background-image: -webkit-gradient(
	linear,
	left top,
	left bottom,
	color-stop(0, #9BA2BD),
	color-stop(0.56, #EDEDED),
	color-stop(1, #737096)
);
background-image: -o-linear-gradient(bottom, #9BA2BD 0%, #EDEDED 56%, #737096 100%);
background-image: -moz-linear-gradient(bottom, #9BA2BD 0%, #EDEDED 56%, #737096 100%);
background-image: -webkit-linear-gradient(bottom, #9BA2BD 0%, #EDEDED 56%, #737096 100%);
background-image: -ms-linear-gradient(bottom, #9BA2BD 0%, #EDEDED 56%, #737096 100%);
background-image: linear-gradient(to bottom, #9BA2BD 0%, #EDEDED 56%, #737096 100%);
}
#date{
background-color:#dcdcdc;
width: 100%;
margin-top: 30px;
padding-bottom:20px;
border-radius: 5px;
border-bottom: 4px solid #4167e1; 
 border-top: 2px solid #4167e1; 
}
div#tops{
text-align: center;
width:100%;
margin-top:20px;

}

a#befor{
float: left;
margin-left:50px;
margin-top: 0px;
}
a#nex{
float: right;
margin-right:50px;
margin-top: 0px;
}

</style>

<script type="text/javascript">
	$(document).ready(function() {
		
		$("tr td span#v").hide();//?????????????????????   
		$("tr td span#w").hide();
		$("tr td").hover(function() {
			$(this).find($("span")).css("display", "block")
		}, function() {
			$("tr td span#w").css("display", "none");
			$("tr td span#v").css("display", "none");
		});
	});
</script>

<div class="wrap">
<div class="page_list"><%--200*800???????????? ????????? ????????? ?????? --%>
	<div class="list_menu"><%--????????? ????????? 158*50 ????????? ?????????! --%>
		<div class="list_0"  style="background-color:white; padding: 10px; margin-top: 20px; margin-bottom: 20px;border-bottom-width:1px solid black;">
			????????????
		</div>
		<div class="list_1" ><%--????????? ???????????? ????????? ????????? ?????? ?????? ??????????????? --%>
			<a href="/client/menu/diary/date">????????????</a><%--???????????? ???????????? ??? ????????? ??????????????? ?????? ??????. --%>
		</div>
		<div class="list_2">
			<c:choose>
				<c:when test="${not empty tlogid }">
					<a href="/client/menu/diary/chart_traner">?????? ?????? ?????????</a>
				</c:when>
				<c:otherwise>
					<a href="/client/menu/diary/chart">?????????????????????</a>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
   	<img>
</div>
<div class="main">

	<div id="tops"  >
	<a href="/client/menu/diary/date?month=${month-1}&year=${year}" 
	style="float: left; margin-top: 15px ;font-size:30px;	font-weight:900; margin-left: 50px;color: blue;"> &lt; ?????? </a> 
	<span style="font-size:40px;font-weight:900; ">${year }??? ${month+1 }???</span>

	<a href="/client/menu/diary/date?month=${month+1}&year=${year}"
	style="float:right;margin-top: 15px;font-weight:900; font-size:30px; margin-right: 50px; color: blue;" >?????? &gt;</a>
	</div>
	
	
	<table id="gallender">
<tr id="top_day">
		<th>???</th><th>???</th><th>???</th><th>???</th>
		<th>???</th><th>???</th><th>???</th>
</tr>
<c:forEach var="dto" items="${date}" varStatus="status">
<c:choose>
			<c:when test="${((status.index+1)%7)==1}"> 
			<tr>
			</c:when>
</c:choose>	
	<c:choose>	
      <c:when test="${dto==0}"> <td></td>
      </c:when>
 	   <c:otherwise >
 	         	  <c:choose>
					  <c:when test="${ year>toyear or (month>tomonth and year==toyear) or (month==tomonth and year==toyear and dto>today)}" >
 			                     <td id="to" >${dto } <div style="height: 30px"></div></td>
 	                  </c:when>
 	               <c:otherwise>
 	                      <c:choose>
 	                        <c:when test="${not empty list[dto].id}">
 	                       <td id="to" > 
 	                       <a id="view" href="/client/menu/diary/view?d_num=${list[dto].d_num}" rel="external" >
 	                       <input type="hidden" id="dnum" value="${dto }">
 	                    <div> <span style="color:red;font-weight: 900; ">${dto }</span>  <div style="height: 30px;width:100px; overflow:hidden;">  <span id="v" style="display: none; ">${list[dto].d_title}</span></div></div> </a>
						</td>
 	                        </c:when>
 	                         <c:otherwise>
 	                 	<td id="to">									 	
							<a class="wri" href="/client/menu/diary/writer?year=${year}&month=${month+1}&day=${dto}">	
                                                           <input type="hidden" value="${dto}" class="day"/>						
							<div>  	  
						<span style="color:blue;font-weight: 900; ">	 ${dto }</span>	<div style="height: 30px"><span id="w" style="display: none; text-align: center;"> Write</span></div></div> 
							 </a>
								 </td>
 	                         </c:otherwise>
 	                      </c:choose>
					</c:otherwise>
				 </c:choose>
 	   </c:otherwise>
    </c:choose>
<c:choose>
			<c:when test="${((status.index+1)%7)==0}"> 
			<tr>
			</c:when>
</c:choose>
</c:forEach>
</table>
	</div>


</div>
