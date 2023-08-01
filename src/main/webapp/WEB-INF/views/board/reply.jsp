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



	<h1 class="mb-4 mt-5 text-center" >${board} 답글달기 </h1>

	<section class="container mt-5">
	
		<form action="./reply" method="post" enctype="multipart/form-data">
		
			<input type="hidden" name="num" value="${num}">
		
			<div class="mb-3">
			<label for="nName" class="form-label">작성자</label>
			<input type="text" class="form-control" id="nName" name="name"> <br>  <!-- dto의 setter의 이름을 씀-->
			</div>
			
			<div class="mb-3">
			<label for="nTitle" class="form-label">제목</label>
			<input type="text" class="form-control" id="nTitle" name="subject"> <br>
			</div>
			
			<div class="mb-3">
			<label for="nContents" class="form-label">본문</label>
			<textarea rows="" cols="" class="form-control" id="nContents" name="contents"></textarea>
			</div>
			
							<!-- file -->
	 		<div class="mb-3 ">
			<label for="pic" class="form-label">사진첨부</label>
			<input type="file" class="form-control" id="pic" name="photos">  
			</div>
			
			<div class="mb-3 ">
			<label for="pic" class="form-label">사진첨부</label>
			<input type="file" class="form-control" id="pic" name="photos">   
			</div>
				
			<div class="mb-3 ">
			<label for="pic" class="form-label">사진첨부</label>
			<input type="file" class="form-control" id="pic" name="photos">   
			</div>
			
			<div class="mb-3 ">
			<label for="pic" class="form-label">사진첨부</label>
			<input type="file" class="form-control" id="pic" name="photos">   
			</div>
			
			<div class="mb-3 ">
			<label for="pic" class="form-label">사진첨부</label>
			<input type="file" class="form-control" id="pic" name="photos">   
			</div> 
			
		
		
		
			<button class="btn btn-danger" type="submit">등록</button>
	
		
		</form>
	</section>	

</body>
</html>