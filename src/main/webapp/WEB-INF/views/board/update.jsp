<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/bootstrap.jsp"></c:import>
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
</head>
<body>
<c:import url="../temp/header.jsp"></c:import>
	<h1>${board} Update page</h1>
	
	

<section class="container mt-5">
	
		<form action="./update" method="post" enctype="multipart/form-data">
		
			<input type="hidden" name="num" readonly="readonly"  value="${dto.num }">
			<div class="mb-3">
			<label for="nName" class="form-label">작성자</label>
			<input type="text" class="form-control" readonly="readonly" id="nName" name="name" value="${member.id}"> <br>  <!-- dto의 setter의 이름을 씀-->
			</div>
			
			<div class="mb-3">
			<label for="nTitle" class="form-label">제목</label>
			<input type="text" class="form-control" id="nTitle" name="subject" value="${dto.subject}"> <br>
			</div>
			
			<div class="mb-3">
			<label for="contents" class="form-label">본문</label>
			<textarea rows="" cols="" class="form-control" id="contents" name="contents" >${dto.contents}</textarea>
			</div>

			<div class="mb-3">
				<button type="button" class="btn btn-outline-primary" id="fileAdd">File추가</button>
			</div>
			
			
			<div  id ="fileList" class="mb-3">
			</div>

			<div>
			<c:forEach items="${dto.fileDTOs}" var="f">
				<div class="alert alert-primary" role="alert">
					${f.originalName}
				 </div>
				 <span class="delets" data-delete-num="${f.fileNum}">X</span>
			</c:forEach>
			</div>


			<button class="btn btn-danger" type="submit">수정</button>
	
		
		</form>
	</section>	
		
		<script type="text/javascript" src="../resources/js/file.js"></script>
		<script>
			// $("#contents").summernote('code',"기존내용");
			$("#contents").summernote();
		</script>
</body>
</html>