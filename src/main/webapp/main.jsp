<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "./common/header.jsp"%>
	<div align="right">
		<form>
			<label>
				아이디 :
				<input type="text" name="id">
			</label>
			<label>
				패스워드 :
				<input type="password" name="id">
			</label>
			<button type="submit">Login</button>
			&nbsp;&nbsp;&nbsp;
			<button type="submit">Join</button>
		</form>
	</div>
	<%@ include file = "./common/footer.jsp"%>
</body>
</html>