<%-- <%@page import="com.iu.main.member.MemberDTO"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/bootstrap.jsp"></c:import>
</head>
<body>
<c:import url="../temp/header.jsp"></c:import>
<%-- <% MemberDTO memberDTO =(MemberDTO) request.getAttribute("member"); %> --%>
<h1>mypage</h1>

	<div>

		<p>id: ${member.id}</p>
		<p>name: ${member.name }</p>
		<p>${member.email}</p>
		<p>${member.birth}</p>
	</div>
	
	<a href="./update"> 회원수정 </a>

	<div id="productList">

	</div>


<script>
	const productList = document.getElementById("productList");
	
	getList(1);

	productList.addEventListener("click", function(event){
		if(event.target.classList.contains("move")){
			let page = event.target.getAttribute("data-num");
			
			getList(page);
			
		}
	})

	function getList(page){

		fetch("../bookAccount/list?page="+page, {
			method:"get"
			
		})
		.then((response)=>{
			return response.text();
		})
		.then((r)=>{
			
			productList.innerHTML=r;
			
		});
		;
	}

</script>
</body>
</html>