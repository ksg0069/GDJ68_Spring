<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- c= 태그명을 c라고 하겠다 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/bootstrap.jsp"></c:import>

</head>
<body>
<c:import url="../temp/header.jsp"></c:import>
	<h2>이름 ${dto.st_name }</h2>
	<h2>국어 ${dto.kor}</h2>   <br>
	<h2>영어 ${dto.eng}</h2>	<br>  
	<h2>수학 ${dto.math}</h2> <br>  
	<h2>총점 ${dto.total}</h2> <br>  
	<h2>평균 ${dto.avg}</h2> <br>  

	<a href="./update?st_no=${dto.st_no}"> 수정 </a>
	<a href="./delete?st_no=${dto.st_no}">삭제</a>
</body>
</html>