<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>


<!-- header  -->
	<header>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
		<nav class="navbar navbar-expand-lg bg-dark border-bottom border-bottom-dark" data-bs-theme="dark" >
		 <div class="container-fluid">
		    <a class="navbar-brand" href="#">Navbar</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="collapse navbar-collapse" id="navbarSupportedContent">
		      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="/">Home</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" href="/bankbook/list">BankProduct</a>
		        </li>
		         <li class="nav-item">
		          <a class="nav-link active" href="/notice/list">NOTICE</a>
		        </li>
		         <li class="nav-item">
		          <a class="nav-link active" href="/qna/list">QNA</a>
		        </li>
		        <li class="nav-item dropdown">
		          <a class="nav-link dropdown-toggle active" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
		            Dropdown
		          </a>
		          <ul class="dropdown-menu">
		            <li><a class="dropdown-item" href="#">Action</a></li>
		            <li><a class="dropdown-item" href="#">Another action</a></li>
		            <li><hr class="dropdown-divider"></li>
		            <li><a class="dropdown-item" href="#">Something else here</a></li>
		          </ul>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link disabled">Disabled</a>
		        </li>
		      </ul>
		      
		      <nav>
				<ul class="nav">
				<c:if test="${member eq null }">
					<li class="nav-item text-white me-3"><a class="text-decoration-none" href="/member/login">로그인</a></li>
					<li class="nav-item text-white me-3"><a class="text-decoration-none" href="/member/join">회원가입<a></a></li>
				</c:if>	
				</ul>		      
		      </nav>
		      
		      <nav>
				<ul class="nav">
					<c:if test="${member ne null }">
					<li class="nav-item text-white me-3"><a class="text-decoration-none" href="/member/logout">로그아웃</a></li>
					<li class="nav-item text-white me-3"><a class="text-decoration-none" href="/member/mypage">마이페이지</a></li>
					</c:if>
				</ul>		      
		      </nav>
<!-- 		      <form class="d-flex" role="search">
		        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
		        <button class="btn btn-outline-success" type="submit">Search</button>
		      </form> -->
		    </div>
		  </div>
		</nav>
	</header>