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
	<h1>Update page</h1>
	
	

<section class="container mt-5">
	
		<form action="./update" method="post">
		
			<input type="hidden" name="noticeNum" readonly="readonly"  value="${dto.noticeNum }">
			<div class="mb-3">
			<label for="nName" class="form-label">작성자</label>
			<input type="text" class="form-control" readonly="readonly" id="nName" name="noticeName" value="${dto.noticeName}"> <br>  <!-- dto의 setter의 이름을 씀-->
			</div>
			
			<div class="mb-3">
			<label for="nTitle" class="form-label">제목</label>
			<input type="text" class="form-control" id="nTitle" name="noticeTitle" value="${dto.noticeTitle}"> <br>
			</div>
			
			<div class="mb-3">
			<label for="nContents" class="form-label">본문</label>
			<textarea rows="" cols="" class="form-control" id="nContents" name="noticeContents" >${dto.noticeContents}</textarea>
			</div>
			
		
			<button class="btn btn-danger" type="submit">수정</button>
	
		
		</form>
	</section>	

		

		
		

	
	</form>

</body>
</html>