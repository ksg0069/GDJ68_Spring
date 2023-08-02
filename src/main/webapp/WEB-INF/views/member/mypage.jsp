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
		<p>
			<img alt="" src="../resources/upload/member/${member.memberFileDTO.fileName}">
		</p>
	
		<p>id: ${member.id}</p>
		<p>name: ${member.name }</p>
		<p>${member.email}</p>
		<p>${member.birth}</p>
	</div>
	
	<a href="./update"> 회원수정 </a>

</body>
</html>