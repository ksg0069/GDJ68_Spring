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

<form action="./add" method="post">
	이름 <input type="text" name="st_name"> <br>
	국어 <input type="text" name="kor">		<br>
	영어 <input type="text" name="eng">	<br>
	수학 <input type="text" name="math">	<br>
	
	<button type="submit">등록</button> 
</form>

</body>
</html>