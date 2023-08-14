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
<c:if test="${empty member }">
	<script type="text/javascript">
		alert("로그인하세요");
		location.href="../member/login";
	</script>
</c:if>
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
			<label for="contents" class="form-label">본문</label>
			<textarea rows="" cols="" class="form-control" id="contents" name="contents"></textarea>
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

		$("#contents").summernote({
			height: 400,
			callbacks: {
				onImageUpload: function(files){
					alert('이미지 업로드');
					//이미지를 server로 전송하고
					//응답으로 이미지경로와 파일명을 받아서
					//img 태그를 만들어서 src속성에 이미지 경로를 넣는것
					let formData = new FormData(); // <form></form>
					formData.append("files",files[0]); // <input type="file" name="files"> 를 폼안에 추가

					$.ajax({
						type:"post",
						url:'./setContentsImg',
						data:formData,
						enctype: 'multipart/form-data',
						cache: false,
						processData: false,
		       			contentType: false,
						success:function(result){
							console.log(result);
							$("#contents").summernote('insertImage', result.trim());
						},
						error:function(){
							console.log('error');
						}	
					});

				},
				onMediaDelete:function(files){
					let path = $(files[0]).attr("src"); // /resources/upload/notice/파일명
					console.log("del");
					$.ajax({
						type:'post',
						url:'./setContentsImgDelete',
						data:{
							path:path
						},
						success:function(result){
							console.log(result);
						},
						error:function(){
							console.log('error');
						}
					})
				}

			}
		})
			
		

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

