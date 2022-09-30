<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
	google.load("visualization", "1", {packages:["corechart"]});
	google.setOnLoadCallback(drawChart);
	function drawChart() {
		var data = new google.visualization.DataTable();
		data.addColumn('date', '일(일)');
		data.addColumn('number', '이날 체중(kg)');
		data.addColumn('number', '목표 체중');
		var w2=${wight};
		var d=${d };
		data.addRows([[new Date('${year}', '${month }',1),null,w2]]); 
		data.addRows([[new Date('${year}','${month }',d),null,w2]]); 
		<c:forEach var="dto" items="${list}">
			var dd=${dto.ui_date.getDate()};
			var w=${dto.ui_weight };
			var y='${year}'
			var m=${dto.ui_date.getMonth()};
			data.addRows([[new Date(y,m,dd),w,null]]);      
		</c:forEach>
		<c:if test="${empty list }">
			data.addRows([[new Date('${year }','${month }',1),0,null]]);  
		</c:if>
		var options = {
		
			vAxis:{title:'몸무게(kg)',maxValue:100,minValue:10},
			hAxis:{maxValue:new Date('${year }','${month }',1),minValue:new Date('${year }','${month }','${d }')},
          
			pointSize: 5,
			backgroundColor:'transparent'
		};
		var dataView = new google.visualization.DataView(data);
		dataView.setColumns([{calc: function(data, row) { return data.getFormattedValue(row, 0); }, type:'string'}, 1]);
		var chart = new google.visualization.LineChart(document.getElementById('chart_div1'));
		chart.draw(data, options);
	};
	google.setOnLoadCallback(drawChart2);
	function drawChart2() {
		var  calorie=${food_chart.calorie }
        var data = google.visualization.arrayToDataTable([
			['영양소', 'Sales' ],
			['칼로리', ' ${food_chart.calorie }'*1],
			['지방',   ' ${food_chart.fat }'*1],
			['탄수화물',  '  ${food_chart.cardohydrate}'*1],
			['콜래스트롤', ' ${food_chart.cholesterol }'*1],
			['단백질	',   ' ${food_chart.protein }'*1]
		]);

		var options = {
	
			backgroundColor:'transparent'
		};
		var chart = new google.visualization.BarChart(document.getElementById('chart_div2'));
		chart.draw(data, options);
	}
</script>
<style type="text/css">

#chart_div{
	border-radius: 10px;
	border: 1px solid black;
	padding: 20px;
	width: 620px;
	margin-bottom: 20px;
	margin-top: 50px;
}
#chart_div1,#chart_div2{
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
	<a href="/client/menu/diary/chart/month?year=${year}" 
	style="float: right;margin-right: 40px; font-size: 20px;"> 월별 보기</a>
	</div>
		<br> 
			<br> 
		<a href="/client/menu/diary/chart?month=${month-1}&year=${year}"style="float: left; margin-top: 10px ;font-size:30px;	font-weight:900; margin-left: 50px;color: blue;">&lt;이전</a>
		
		<span style="font-size:40px;font-weight:900; ">${year}년 ${month+1 }월 체중도표</span>
		
		<a href="/client/menu/diary/chart?month=${month+1}&year=${year}"style="float:right;margin-top: 10	px;font-weight:900; font-size:30px; margin-right: 50px; color: blue;">다음&gt;</a>
	</div>
	<br>
	<br>
	<div style="margin-left: 120px;">
	<div id="chart_div">
	<h1>'${year }년  ${month+1 }월 체중변화 그래프'</h1>
		<div id="chart_div1" style="width: 600px; height: 450px;margin-top: 20px  "></div><br>
	</div><hr>
		<div id="chart_div">
		<h1>'이번달 평균 영양소 섭취량'</h1>
		<div id="chart_div2" style="width: 600px; height: 450px;margin-top: 20px "></div>
    </div>	
</div>
</div>
</div>
