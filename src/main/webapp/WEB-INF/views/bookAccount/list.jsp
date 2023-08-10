<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


	<section class="container mt-5">
	<h1 class="mb-4 text-center"  >상품가입 목록</h1>
	<!-- 표현식 -->
	
	<table class="table">
		<thead class="table-dark">
		<th>계좌번호</th> <th>잔액</th> <th>가입날짜</th>
		</thead>
		
		<tbody class="table-light">
			<c:forEach items="${list}" var="d" varStatus="i"> <!-- 서버에서 보낸 arrylist를(콜렉션 계열) items에 넣는다 , items의 갯수만큼 꺼내서 돌림 var=d->dto의미  -->
			
			 	<tr>
					<td >${d.account}</td>	
					<td> ${d.accountBalance}</td>
					<td> ${d.accountDate}</td>
					
	 			</tr>
	 	
								
			</c:forEach>	
	
		</tbody>
	</table>
		<nav aria-label="Page navigation example">
		  <ul class="pagination">
		  <%-- <c:if test="${pager.pre }"> --%>
		    <li class="page-item ${pager.pre?'':'disabled'}">
		      <a class="page-link move" href="#" data-num="${pager.startNum-1}" aria-label="Previous">
		        <span aria-hidden="true">&laquo;</span>
		      </a>
		    </li>
		    <%-- </c:if> --%>
		    <c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
		    <li class="page-item"><a class="page-link move" href="#" data-num="${i}">${i}</a></li>
			</c:forEach>
			
<%-- 			<c:if test="${pager.next }"> --%>
		    <li class="page-item ${pager.next?'':'disabled' }" >
		      <a class="page-link move" href="#" data-num="${pager.lastNum+1}" aria-label="Next">
		        <span aria-hidden="true">&raquo;</span>
		      </a>
		    </li>
		  <%--   </c:if> --%>
  		</ul>
	</nav>
	
	<!-- <script src="/resources/js/list.js"></script> -->
	<!-- <script>
		setData("${pager.kind}");  //js가 변수로인식해서 '' 써야함
	</script> -->
	</section>
