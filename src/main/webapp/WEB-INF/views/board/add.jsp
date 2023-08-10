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



	<h1 class="mb-4 mt-5 text-center"  >${board} 글쓰기</h1>

	<section class="container mt-5">
	
		<form action="./add" method="post" id="frm" enctype="multipart/form-data">
		
			
		
			<div class="mb-3">
			<label for="nName" class="form-label">작성자</label>
			<input type="text" class="form-control" id="nName" name="name" readonly="readonly" value="${member.id}"> <br>  <!-- dto의 setter의 이름을 씀-->
			</div>
			
			
			<div class="mb-3">
			<label for="subject" class="form-label">제목</label>
			<input type="text" class="form-control" id="subject" name="subject"> <br>
			</div>
			
			<div class="mb-3">
			<label for="nContents" class="form-label">본문</label>
			<textarea rows="" cols="" class="form-control" id="nContents" name="contents"></textarea>
			</div>
			
							<!-- file -->
			<div id="fileList" class="my-5">
			</div>

			<div class="mb-3">
				<button type="button" class="btn btn-outline-primary" id="fileAdd">File추가</button>
			</div>
		 
			
			
		
			<button class="btn btn-danger" type="button" id="btn">등록</button>
	
		
		</form>
	</section>
	
	<script src="../resources/js/file.js"></script>

	<script>
		const btn = document.getElementById("btn");
		const subject = document.getElementById("subject");
		const frm = document.getElementById("frm");

		btn.addEventListener("click", function(){

			console.log(subject.value == "");
			console.log(subject.value.length == 0);

			if(subject.value==""){
				alert("제목은 필수 입니다");
				subject.focus();
			}else{

				frm.submit();
			}

		});


	</script>

</body>
</html>

