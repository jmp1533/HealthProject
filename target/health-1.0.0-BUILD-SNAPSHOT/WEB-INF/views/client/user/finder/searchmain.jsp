<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<h4>아이디 찾기</h4>
<form action="/client/user/finder/search/idSearch" method="post">
	<table>
		<tr>
			<td align=center bgcolor="#d3d3d3">이름</td> 
			<td>
				<input size="20" type="text" name="name"/>
			</td>
		</tr>
		
		<tr>
			<td align=center bgcolor="#d3d3d3">이메일주소</td>
			<td>
				<input size="21" type="text" name="email"/>
			</td>
		</tr>
	</table>
	<input type="submit" value="ID 검색"/>
	<input type="reset" value="취소" />
</form>

<form action="/client/user/finder/search/pwdSearch" method="post">
<h4>비밀번호 찾기</h4>
	<table>
		<tr>
			<td align=center bgcolor="#d3d3d3">아이디</td> 
			<td>
				<input size="20" type="text" name="id"/>
			</td>
		</tr>

		<tr>
			<td align=center bgcolor="#d3d3d3">이메일주소</td>
			<td>
				<input size="21" type="text" name="email2"/>
			</td>
		</tr>
	</table>
	<input type="submit" value="비밀번호 검색"/>
	<input type="reset" value="취소" />
</form>
</div>
</body>
</html>