
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="../resources/css/index.css"> -->
<c:import url="../temp/bootstrap.jsp"></c:import>

</head>
<body>
<c:import url="../temp/header.jsp"></c:import>


	<section class="container mt-5">
	<h1 class="mb-4 text-center"  > BankBook List</h1>
	<!-- 표현식 -->
	
	<table class="table table-dark table-striped">
		<thead>
		<th>상품명</th> <th>이자율</th>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="d" varStatus="i"> <!-- 서버에서 보낸 arrylist를(콜렉션 계열) items에 넣는다 , items의 갯수만큼 꺼내서 돌림 var=d->dto의미  -->
			
				 <tr>
					<td ><a class="text-decoration-none" href="./detail?bookNum=${d.bookNum}">${d.bookName}</a></td>	
					<td> ${d.bookRate} ${i.index } </td>
						 
	 			</tr>
								
			</c:forEach>	
	
		</tbody>
	</table>
	
	<nav aria-label="Page navigation example">
		  <ul class="pagination">
		    <li class="page-item ${pager.pre?'':'disabled'}">
		      <a class="page-link" href="./list?page=${pager.startNum-1}" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
		    <li class="page-item"><a class="page-link" href="./list?page=${i}&kind=${pager.kind}&search=${pager.search}">${i}</a></li>
			</c:forEach>
		    <li class="page-item ${pager.next?'':'disabled'}">
		      <a class="page-link" href="./list?page=${pager.lastNum+1}" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
  		</ul>
	</nav>

	<div class="input-group mb-3">
		<form action="./list" method="get">
			<input type="hidden" value="${pager.page}" name="page">
			
	  	<select name="kind" class="form-select" aria-label="Default select example">
			 <option value="name">Name</option>
			 <option value="contents">Contents</option>
		</select>
		
		<input type="text" name="search" value="${pager.search}" class="form-control" aria-label="Amount (to the nearest dollar)">
		<div class="col-auto">
	    		<button type="submit" class="btn btn-primary">검색</button>
	  	</div>
		</div>
		</form>	
	
	<a class="btn btn-danger" href="./add"> 상품등록 </a>
	</section>
	


</body>
</html>
