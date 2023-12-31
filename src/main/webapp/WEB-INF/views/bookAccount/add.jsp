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
	<form action="./add" method="post" id="frm">
		<h1 class="mb-5">상품가입 page</h1>
		
		<input type="hidden" name="bookNum" value="${dto.bookNum}">
		<div class="mb-3 ">
		<label for="pw" class="form-label">PW</label>
		<input type="password" class="form-control" id="pw" name="accountPassword" placeholder="출금비밀번호 입력"> <br>  <!-- dto의 setter의 이름을 씀-->
		</div>
		
		<button  type="button"  id="btn" class="btn btn-outline-primary text-decoration-none "> 가입</button>
	</form>
</section>

<script type="text/javascript">
	const btn = document.getElementById("btn");
	const pw = document.getElementById("pw");
	const frm = document.getElementById("frm");
	
	
	btn.addEventListener("click", function(){
		
		if(pw.value.length == 4 && Number.isInteger(pw.value*1)){
			frm.submit();
		}else{
			alert("비번은 4글자 또는 숫자로만 작성");
			
		}
		
	
	})
	
	
	
	
</script>
</body>
</html>