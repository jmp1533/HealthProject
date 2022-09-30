<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<script type="text/javascript"> 

	function add(read_kcal,read_tan,read_dan,read_ji,read_col) {
		
		opener.read_kcal.value = opener.read_kcal.value*1+ read_kcal*1;
		opener.read_tan.value =  opener.read_tan.value*1+ read_tan*1;
		opener.read_dan.value = 		opener.read_dan.value*1+read_dan*1 ;
		opener.read_ji.value = 		opener.read_ji.value*1+ read_ji*1;
		opener.read_col.value =opener.read_col.value*1+ read_ji*1;
	
	}
	function sub(read_kcal,read_tan,read_dan,read_ji,read_col) {
		
		opener.read_kcal.value = opener.read_kcal.value*1- read_kcal*1;
		opener.read_tan.value =  opener.read_tan.value*1- read_tan*1;
		opener.read_dan.value = 		opener.read_dan.value*1-read_dan*1 ;
		opener.read_ji.value = 		opener.read_ji.value*1- read_ji*1;
		opener.read_col.value =opener.read_col.value*1- read_ji*1;
	
	}
</script>
</head>
<body>
<a href="javascript:self.close();">닫기</a>
	<div align="center">
		음식을 검색하세요
	</div>
	<form method="post" action="/client/menu/diary/foodpopup" name="food_pup" >
		<input type="text" name="food_name"/>
		<input type="submit" value="검색" id="find"/> 
    </form>
    
		<table border="1" width="400" align="center">
		<tr>
			<th>음식명</th>
			<th>칼로리</th>
			<th>지방</th>
			<th>탄수화물</th>
			<th>콜래스트롤</th>
			<th>단백질</th>
				<th>추가하기</th>
					<th>뺴기</th>
		</tr>
		<c:forEach var="dto" items="${list}">
		<tr>
			<td id="name">${dto.name }</td>
			<td>${dto.kcal  }</td>
			<td>${dto.tan  }</td>
			<td>${dto.dan  }</td>
			<td>${dto.ji  }</td>
			<td>${dto.col  }</td>
			<td>
			<input type="button" value="추가" id="add" onclick="add(${dto.kcal},${dto.tan},${dto.dan},${dto.ji},${dto.col});">
			</td>
			<td>
			<input type="button" value="뺴기" id="add" onclick="sub(${dto.kcal},${dto.tan},${dto.dan},${dto.ji},${dto.col});">
			</td>
		</tr>
			</c:forEach>                                                                                                                
		</table>
		
	
	
</body>
</html>