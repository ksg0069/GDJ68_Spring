	<%-- <%@page import="com.iu.main.bankBook.BankBookDTO"%>  --%>
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
	

	
<section class="container mt-5">
	<h1 class="mb-4 text-center"  > ${board }</h1>
	
	<table class="table">
		<thead class="table-dark">
		<th>SUBJECT</th> <th>NAME</th><th>DATE</th><th>HIT</th>
		</thead>
		
		<tbody class="table-light">
			
			 	<tr>
					<td> ${dto.subject}</td>
					<td> ${dto.name}</td>
					<td> ${dto.createDate}</td>
					<td> ${dto.hit}</td>
	 			</tr>
	 	
		</tbody>
		
		<tfoot >
		

		<tr>
			<td colspan="4">${dto.contents} <br>
			
 		<c:forEach items="${dto.fileDTOs}" var="f">
		<img alt="" src="/resources/upload/board/${f.fileName}">
		</c:forEach>  
		
			</td>
			
		</tr>
	
		</tfoot>

	</table>
	

	<form id="frm" action="" method="">
		<input type="hidden" name="num" value="${dto.num}">
	</form>

		<a class="btn btn-dark" href="./list"> 목록 </a>

		<!-- <a class="btn btn-dark" href="./update?num=${dto.num }"> 수정 </a> -->
		<button id="update" class="c1" data-url="./update">수정</button>
		
		<button type="button" id="del" class="c1" data-url="delete" data-delete-name="num" data-delete-num="${dto.num}" >삭제</button>
		
		<c:if test="${board ne 'NOTICE'}">
		<!-- <a class="btn btn-dark" href="./reply?num=${dto.num}"> 댓글 </a> -->
		<button id="reply" class="c1" data-url="reply">댓글</button>
		</c:if>
		
		
	</form>
	
</section>






<script src="../resources/js/delete.js"></script>
</body>
</html>