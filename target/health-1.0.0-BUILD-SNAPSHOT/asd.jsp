<html>
	<head>
		<div id="my_chart" style="width: 600px; height: 400px"> </div>
		<script type="text/javascript" src="https://www.google.com/jsapi"></script>
		<script type="text/javascript">
			google.load("visualization", "1", {packages:["corechart"]});
			google.setOnLoadCallback(drawChart);
			function drawChart() {
				var arr = [['Age', 'Weight'],
							[ 9,	40],
							[ 20,	45],
							[ 23,	46],
					];

				var options = {
					title: 'Age vs. Weight comparison',
					hAxis: {title: 'Age', minValue: 10, maxValue: 15},
					vAxis: {title: 'Weight', minValue: 0, maxValue: 15},

				};
				var data = new google.visualization.arrayToDataTable(arr);
		


				var chart = new google.visualization.LineChart(document.getElementById('my_chart'));
				chart.draw(data, options);
			}
			</script>
	</head>
	<body>
	<div id="tide_chart_week" style="float:left; height:800px; background:blue;"></div>
	</body>
</html>
