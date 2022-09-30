<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>     
<script type="text/javascript">        
	google.load('visualization', '1.0', {'packages':['corechart']});        
	google.setOnLoadCallback(drawChart);        
	function drawChart() {          
		
	var data = new google.visualization.DataTable();         
	data.addColumn('string', 'Topping');         
	data.addColumn('number', 'Slices');         
	data.addRows([           
	                         ['남자', eval($("#man").val())],           
	                         ['여자', eval($("#woman").val())]
	             ]);          
	var options = {'title':'성별',                        
			'width':400,                        
			'height':300};          
	var chart = new google.visualization.PieChart(document.getElementById('chart_gender'));         
	chart.draw(data, options);       
	}     
</script> 

<script type="text/javascript">        
	google.load('visualization', '1.0', {'packages':['corechart']});        
	google.setOnLoadCallback(drawChart);        
	function drawChart() {          
	var data = new google.visualization.DataTable();         
	data.addColumn('string', 'Topping');         
	data.addColumn('number', 'Slices');         
	data.addRows([           
	              ['10대', eval($("#age0").val())],           
	              ['20대', eval($("#age1").val())],           
	              ['30대', eval($("#age2").val())],           
	              ['40대', eval($("#age3").val())],           
	              ['50대', eval($("#age4").val())],
	              ['60대', eval($("#age5").val())],           
	              ['70대', eval($("#age6").val())]
	             ]);          
	var options = {'title':'연령층',                        
			'width':400,                        
			'height':300};          
	var chart = new google.visualization.PieChart(document.getElementById('chart_age'));         
	chart.draw(data, options);       
	}     
</script> 


<script type="text/javascript">        
	google.load('visualization', '1.0', {'packages':['corechart']});        
	google.setOnLoadCallback(drawChart);        
	function drawChart() {          
	var data = new google.visualization.DataTable();         
	data.addColumn('string', 'Topping');         
	data.addColumn('number', 'Slices');         
	data.addRows([           
	              ['개인정보 변경으로 인한 재가입', eval($("#out0").val())],           
	              ['자주 이용하지 않음', eval($("#out1").val())],
	              ['찾고자 하는 정보가 없음', eval($("#out2").val())],
	              ['타 사이트의 유사서비스 이용', eval($("#out3").val())],
	              ['속도가 느림', eval($("#out4").val())],
	              ['개인정보/사생활 침해 사례 경험', eval($("#out5").val())],
	              ['기타', eval($("#out6").val())]
	             ]);          
	var options = {'title':'탈퇴사유',                        
			'width':400,                        
			'height':300};          
	var chart = new google.visualization.PieChart(document.getElementById('chart_out'));         
	chart.draw(data, options);       
	}     
</script> 
</head>
<body>
 <input type="hidden" id="man" value="${man }"/>
<input type="hidden" id="woman" value="${woman }"/>
	<div id="chart_gender"></div> 


<input type="hidden" id="age0" value="${list.get(0) }"/>
<input type="hidden" id="age1" value="${list.get(1) }"/>
<input type="hidden" id="age2" value="${list.get(2) }"/>
<input type="hidden" id="age3" value="${list.get(3) }"/>
<input type="hidden" id="age4" value="${list.get(4) }"/>
<input type="hidden" id="age5" value="${list.get(5) }"/>
<input type="hidden" id="age6" value="${list.get(6) }"/>
	<div id="chart_age"></div> 
</body>


<input type="hidden" id="out1" value="${outlist.get(1) }"/>
<input type="hidden" id="out2" value="${outlist.get(2) }"/>
<input type="hidden" id="out3" value="${outlist.get(3) }"/>
<input type="hidden" id="out4" value="${outlist.get(4) }"/>
<input type="hidden" id="out5" value="${outlist.get(5) }"/>
<input type="hidden" id="out6" value="${outlist.get(6) }"/>

	<div id="chart_out"></div> 

</html>