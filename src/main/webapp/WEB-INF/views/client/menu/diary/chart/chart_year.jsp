<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
     
     
      function drawChart() {
    	  var data = new google.visualization.DataTable();
          data.addColumn('date', '일(일)');
          data.addColumn('number', '이날 체중(kg)');
  
         	<c:forEach var="dto" items="${list}">
            var d=${dto.ui_date.getDate()};
            var m=${dto.ui_date.getMonth()};
            var y='${year}'
          
            var w=${dto.ui_weight};
            data.addRows([[new Date(y,m,d),w]]);      
	          </c:forEach>
	          <c:if test="${empty list }">
		         alert('해당날짜의 데이터가 없습니다')  
		          </c:if>
		        
	
        var options = {

          legend: 'none',
          vAxis:{title:'몸무게(kg)',maxValue:150,minValue:30},
          hAxis:{maxValue:new Date(y,1,1),minValue:new Date('${year+1}',1,1)},
      	backgroundColor:'transparent'
        };

        var dataView = new google.visualization.DataView(data);
        dataView.setColumns([{calc: function(data, row) { return data.getFormattedValue(row, 0); }, type:'string'}, 1]);
        var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
       
        chart.draw(data, options);
      };
 
      
    </script>
    <style>
#chart_div{
	border-radius: 10px;
	border: 1px solid black;
	padding: 20px;
	width: 620px;
	margin-bottom: 20px;
	margin-top: 50px;
	margin-left:30px;
		border-radius: 5px;
   background-image: -webkit-gradient(
	linear,
	left top,
	left bottom,
	color-stop(0, #FFFFFF),
	color-stop(0.56, #EDEDED),
	color-stop(1, #A29FCF)
);
background-image: -o-linear-gradient(bottom, #FFFFFF 0%, #EDEDED 56%, #A29FCF 100%);
background-image: -moz-linear-gradient(bottom, #FFFFFF 0%, #EDEDED 56%, #A29FCF 100%);
background-image: -webkit-linear-gradient(bottom, #FFFFFF 0%, #EDEDED 56%, #A29FCF 100%);
background-image: -ms-linear-gradient(bottom, #FFFFFF 0%, #EDEDED 56%, #A29FCF 100%);
background-image: linear-gradient(to bottom, #FFFFFF 0%, #EDEDED 56%, #A29FCF 100%)
}
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
<br>
<br>
	<div class="list_number" style="text-align: center;">
	<div>
  <a href="/client/menu/diary/chart" style="float: right;margin-right: 40px; font-size: 20px;">일별 보기</a> 
</div>
<br><br>
   <a href="/client/menu/diary/chart/month?year=${year-1}" style="float: left; margin-top: 10px ;font-size:30px;	font-weight:900; margin-left: 50px;color: blue;">&lt;이전 </a>
    	<span style="font-size:40px;font-weight:900; "> ${year}년  체중변화 그래프</span>
    	
    
    <a href="/client/menu/diary/chart/month?year=${year+1}" style="float:right;margin-top: 10	px;font-weight:900; font-size:30px; margin-right: 50px; color: blue;">다음&gt;</a>
   </div> 

     <br>
      <br>
      <div id="chart_div" style="width: 600px; height: 500px; margin-left: 120px;"></div>
      
 

</div>
</div>