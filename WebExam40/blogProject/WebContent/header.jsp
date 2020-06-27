<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Seolhwa's Blog</title>
	<link href="css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
	<link href="css/common.css" rel="stylesheet">
	<link href="css/mystyle.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

  <script>
    $(function(){
    	
      $('.slider').bxSlider({
    	  mode: 'fade',
    	  captions: true
      });
      
      $(".sitemap").click(function() {
			$(".sitewrap").slideDown();
		})
	  $("#close").click(function() {
			$(".sitewrap").slideUp();
		})
		
	  $(".nav > nav > .navi > li").hover(function() {
		  $(this).children(".navi2").stop().slideDown();
	  }, function() {
		  $(this).children(".navi2").stop().slideUp();
	  });
		
    });
  </script>

</head>
<body>
	<div class="header">
		<header>
			<div class="topnav">
				<ul>
<c:if test="${empty id}">
					<li><a href="login">Login</a></li>
					<li><a href="member">Join</a></li>
</c:if>
<c:if test="${!empty id}">
					<li><a href="logout">Logout</a></li>
</c:if>
					
					<li><a href="javascript:void(0)" class="sitemap">Sitemaps</a></li>
				</ul>
			</div>
			<div class="navigation">
				<h1 class="logo">
				<a href="index">Seolhwa Park</a></h1>
				<div class="nav">
					<nav>
						<ul class="navi">
							<li><a href="self_main">Self</a>
								<ul class="navi2">
									<li><a href="resume_list">Resume</a></li>
									<li><a href="self_list">Self introduction</a></li>
								</ul>
							</li>
							<li><a href="gallery_main">Gallery</a>
								<ul class="navi2">
									<li><a href="every_list">Everyday Life</a></li>
									<li><a href="illust_list">Illustration</a></li>
								</ul>
							</li>
							<li><a href="study_main">Study</a>
								<ul class="navi2">
									<li><a href="web_list">Web programming</a></li>
									<li><a href="ui_list">UI design</a></li>
								</ul>
							</li>
							<li><a href="diary_list?idx=${idx}">Diary</a></li>
							<li><a href="contact_write">Contact</a></li>
						</ul>
					</nav>
				</div>
			</div>
		</header>
	</div>
	
	<div class="line"></div>
	
	<div class="sitewrap">
		<span class="fa fa-close" id="close" style="cursor:pointer"></span>
		<div class="inner">
			<span class="map">Self</span>
			<span class="map">Gallery</span>
			<span class="map">Study</span>
			<span class="map">Diary</span>
			<span class="map">Contact</span>
		</div>
	</div>
	
	
	
	
	
	
	
	
	