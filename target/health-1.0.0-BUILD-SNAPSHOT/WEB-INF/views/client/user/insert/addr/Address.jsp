<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	#a{
		color: black;
	}
</style>
<script type="text/javascript">
	function on(zipcode, addr) {
		opener.frm1.zipcode1.value = zipcode;
		opener.frm1.addr1.value = addr;
		window.close();
	}
</script>
</head>
<body>
	<div align="center">
		  찾고자하는 지역의 동/읍/면/리/건물명을 입력하세요.<br/>
		  서울시 강남구 삼성동이라면 삼성 또는 삼성동이라고 <br/>
		  입력하시면됩니다. 
	</div>
	<form method="post" action="/client/user/insert/addr/Address" name="frm2">
		지역명
		<input type="text" name="addrname"/>
		<input type="submit" value="검색"/> 
		
		<table border="1" width="400" align="center">
		<tr>
			<th>우편번호</th>
			<th>주소</th>
		</tr>
		<c:forEach var="addrdto" items="${requestScope.list}">
		<tr>
			<td>${addrdto.zipcode }</td>
			<td><a id="a" href="#" onclick="on('${addrdto.zipcode }' ,'${addrdto.sido} ${addrdto.gugun} ${addrdto.dong} ${addrdto.bunji}')">
			${addrdto.sido} ${addrdto.gugun} ${addrdto.dong} ${addrdto.bunji}</a></td>
		</tr>
			</c:forEach>
		</table>
		<a href="javascript:self.close();">닫기</a>
	</form>
	
</body>
</html>