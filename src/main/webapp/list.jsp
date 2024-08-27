<%@ page language="java"
		 contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"%>
<%@ page import="mvc.user.domain.UserResponseDTO" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	
	<div align="right">
		${ loginUser.name } 님 환영합니다. 
	</div>
	
	<div align="center">
		<table class="table">
			<thead>
				<tr>
					<th>아이디</th><th>패스워드</th><th>이름</th>
				</tr>
			</thead>
			<c:forEach items="${lst}" var="user">
				<tr> 
					<td>${user.id}</td>
					<td>${user.pwd}</td>
					<td>${user.name}</td>
				</tr>
			</c:forEach>
			
			
		</table>
	</div>
	
</body>
</html>