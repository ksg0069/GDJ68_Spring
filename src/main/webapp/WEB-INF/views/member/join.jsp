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
<style>
	.f{
		color: red;
	}
	.s{
		color: blue;
	}
</style>
<body>
<c:import url="../temp/header.jsp"></c:import>
 
 
 <section class="container mt-5">
 
 <form action="./join" id=frm method="post" enctype="multipart/form-data">
 		<h1 class="mb-5">회원가입</h1>
 		<!-- id -->
		<div class="mb-3 ">
		<label for="id" class="form-label">ID</label>
		<input  type="text" class="form-control" id="id" name="id" placeholder="id 입력"> <br>  <!-- dto의 setter의 이름을 씀-->
		<div id="idResult"></div>	
	   </div>
		

		<!-- pw -->
		<div class="mb-3 ">
		<label for="pw" class="form-label">PW</label>
		<input type="password" class="form-control" id="pw" name="pw" placeholder="pw 입력"> <br>  <!-- dto의 setter의 이름을 씀-->
		<div id="pwResult"></div>
		</div>
		
		<!-- pw check-->
		<div class="mb-3 ">
			<label for="pw2" class="form-label">PW</label>
			<input type="password" class="form-control" id="pw2" name="pw2" placeholder="pw 재입력"> <br>  <!-- dto의 setter의 이름을 씀-->
			<div id="pw2Result"></div>	
		</div>

		<!-- name -->
		<div class="mb-3 ">
		<label for="name" class="form-label">NAME</label>
		<input type="text" class="form-control" id="name" name="name" placeholder="이름 입력"> <br>  <!-- dto의 setter의 이름을 씀-->
		<div id="nameResult"></div>
		</div>
		<!-- email  -->
		<div class="mb-3 ">
		<label for="email" class="form-label">Email</label>
		<input type="email" class="form-control" id="email" name="email" placeholder="Email 입력"> <br>  <!-- dto의 setter의 이름을 씀-->
		<div id="emailResult"></div>
		</div>
		<!-- birth -->
		<div class="mb-3 ">
		<label for="birth" class="form-label">생년월일</label>
		<input type="date" class="form-control" id="birth" name="birth">   <!-- dto의 setter의 이름을 씀-->
		<div id="birthResult"></div>
		</div>
		
		<!-- file -->
		<div class="mb-3 ">
		<label for="pic" class="form-label">사진첨부</label>
		<input type="file" class="form-control" id="pic" name="pic">   <!-- dto의 setter의 이름을 씀-->
		</div>
		
		<button  type="button" class="btn btn-outline-primary" id="btn"><a  class="text-dark text-decoration-none "  >회원가입</a></button>
		
		
</form>		

 
 </section>
 
 <script src="../resources/js/member.js">
 </script>
</body>
</html>