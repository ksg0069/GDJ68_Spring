<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<c:import url="./temp/bootstrap.jsp"></c:import>


</head>

<body>
	<c:import url="./temp/header.jsp"></c:import>
	
	<c:if test="${member ne null }"><h1>로그인 상태</h1> </c:if>
	<%-- <c:if test="${not empty member}"> 로그인상태</c:if> --%>
	
	
	<c:if test="${member eq null }"><h1>비로그인 상태</h1> </c:if>
	<%-- <c:if test="${empty member}"> 비로그인상태</c:if> --%>
	


	<div id="carouselExampleCaptions" class="carousel slide col-6">
	  <div class="carousel-indicators">
	    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
	    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
	    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
	  </div>
	  <div class="carousel-inner">
	    <div class="carousel-item active">
	      <img src="/resources/images/img1.jpg" class="d-block w-100" alt="...">
	      <div class="carousel-caption d-none d-md-block">
	      
	      </div>
	    </div>
	    <div class="carousel-item">
	      <img src="/resources/images/img2.jpg" class="d-block w-100" alt="...">
	      <div class="carousel-caption d-none d-md-block">
	      
	      </div>
	    </div>
	    <div class="carousel-item">
	      <img src="/resources/images/img3.jpg" class="d-block w-100" alt="...">
	      <div class="carousel-caption d-none d-md-block">
	       
	      </div>
	    </div>
	  </div>
	  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
	    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Previous</span>
	  </button>
	  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
	    <span class="carousel-control-next-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Next</span>
	  </button>
	</div>
	
	

	
	

	

</body>
</html>


























