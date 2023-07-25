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



	<section class="container mt-5">
	<h1 class="mb-4 text-center"  > NOTICE</h1>
	<!-- 표현식 -->
	
	<table class="table">
		<thead class="table-dark">
		<th>NO</th> <th>SUBJECT</th> <th>NAME</th><th>DATE</th><th>HIT</th>
		</thead>
		
		<tbody class="table-light">
			<c:forEach items="${list}" var="d" varStatus="i"> <!-- 서버에서 보낸 arrylist를(콜렉션 계열) items에 넣는다 , items의 갯수만큼 꺼내서 돌림 var=d->dto의미  -->
			
			 	<tr>
					<td >${d.noticeNum}</td>	
					<td> <a class="text-decoration-none" href="./detail?noticeNum=${d.noticeNum}">${d.noticeTitle}</a></td>
					<td> ${d.noticeName}</td>
					<td> ${d.noticeDate}</td>
					<td> ${d.noticeHit}</td>
	 			</tr>
	 	
								
			</c:forEach>	
	
		</tbody>
	</table>
	
	<a class="btn btn-danger" href="./add"> 글등록 </a>
	</section>
</body>
</html>