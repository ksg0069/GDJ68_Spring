<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/bootstrap.jsp"></c:import>
</head>

<body>
<c:import url="../temp/header.jsp"></c:import>

<form action="./update" method="post">
	<input type="hidden" name="st_no" readonly="readonly"  value="${dto.st_no }">
	국어 <input type="text" name="kor" value="${dto.kor}"> <br>
	영어 <input type="text" name="eng" value="${dto.eng}"> <br>
	수학 <input type="text" name="math" value="${dto.math}"> <br>
	
	<button type="submit">수정</button>
	
</form>

</body>
</html>