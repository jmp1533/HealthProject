<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/client/popup/msg/msginsert">
	<table border="1" width="550px">
		<tr>
			<th>글쓴이</th>
			<td>
				<input type="text" id="msg_send_id" name="msg_send_id" value="${sessionScope.id}" readonly="readonly">
			</td>
		</tr>
		<tr>
			<th>받는이</th>
			<td>
				<input type="text" id="msg_receive_id" name="msg_receive_id"/>
			</td>
		</tr>
		<tr>
			<th>글제목</th>
			<td>
				<input type="text" id="msg_title" name="msg_title" size="50px;"/>
			</td>
		</tr>
		<tr>
			<th>글내용</th>
			<td>
				<textarea rows="15" cols="60" id="msg_content" name="msg_content"></textarea>
			</td>
		</tr>
		<tr>
			<td align="center" colspan="2">
				<input type="submit" value="보내기"/>
			</td>
		</tr>
	</table>
</form>
</body>
</html>