<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="JSL">
  <meta name="Keywords" content="반응형홈페이지,  JAVA, JSP, PHP, 대전직업전문학교, 대전국비지원, 국비무료">
  <meta name="Description" content="응용SW개발자를 위한 반응형 홈페이지">
  <title>JSL인재개발원</title>
  <link href="../css/font-awesome.min.css" rel="stylesheet">
  <link href="../css/common.css" rel="stylesheet">
  <link href="../css/layout.css" rel='stylesheet'>
  <!--
  	jquery언어 사용법
	1. jquey.js을 기반으로 프로그램을 작성하기 때문에 jquery.js 파일을 다운 또는 CDN 방식으로 링크를 건다
	2. $(function() {
		실행문;
	});
  -->
  <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
  <script src="../js/jquery-3.3.1.min.js"></script>
  

 </head>
 <body>
 <!-- 
 웹문서 만들기 기본 공식
 1. 요소를 어떻게 묶을 것인가? 그룹만들기
 2. 그룹안에 적절한 태그 사용
 3. class 이름 붙이고 css 적용
 -->
	<div class="sr-only">
		<p><a href="#contents">본문 바로가기</a></p>
	</div>

	<div class="top_navigation">
	
		<header class="header">
			<nav class="top_left">
			  <ul>
			  	<li class="first"><a href="index">HOME</a></li>
				<li><a href="">모집안내</a></li>
				<li><a href="">입학상담</a></li>
				<li><a href="">교육신청</a></li>
			  </ul>
			</nav>
			<nav class="top_right">
				<ul>
					<li class="first"><a href="">네이버블로그</a></li>
					<li><a href="">페이스북</a></li>
					<li><a href="">인스타그램</a></li>
					<li><a href="">동영상강좌</a></li>
				</ul>
			</nav>
			
			<div class="gnb_group">
				<h1 class="logo">JSL CO</h1>
				<nav class="gnb">
					<ul class="nav_1depth">
						<li><a href="gratings">기업소개</a>
							<ul class="nav_2depth">
								<li><a href="gratings">인사말</a></li>
								<li><a href="history">연혁 및 </a></li>
								<li><a href="gratings">교직원소개</a></li>
								<li><a href="photo">대우갤러리</a></li>
								<li><a href="map">찾아오시는길</a></li>
							</ul>
						</li>
						<!--<li><a href="allclass.html">학과및모집안내</a>
							<ul class="nav_2depth">
								<li><a href="allclass.html">전체모집과정</a></li>
								<li><a href="allclass.html">스마트웹콘텐츠개발과정</a></li>
							</ul>
						</li> -->
						<li><a href="portfolio">포트폴리오</a>
							<ul class="nav_2depth">
								<li><a href="portfolio">포트폴리오</a></li>
							</ul>
						</li>
						<!-- <li><a href="online.html">온라인접수</a>
							<ul class="nav_2depth">
								<li><a href="online.html">온라인접수</a></li>
								<li><a href="online.html">취업성공패키지</a></li>
							</ul>
						</li> -->
						<li><a href="notice">커뮤니티</a>
							<ul class="nav_2depth">
								<li><a href="notice">공지사항</a></li>
								<li><a href="qa">질문과답변</a></li>
								<li><a href="faq">FAQ</a></li>
								<li><a href="pds">자료실</a></li>
								<li><a href="admin">관리자</a></li>
							</ul>
						</li>
					</ul>
				</nav>
			</div>
		</header>

		<div class="line">
		</div>

	</div>

	<script>
		//$(document).ready(function() {
		$(function() {
			$(".gnb>.nav_1depth>li").hover(function() {
				$(".gnb>.nav_1depth>li").removeClass();
				$(this).addClass("active");

				//$(this).children(".nav_2depth").show();
				//}, function() {
				//  $(".gnb>.nav_1depth>li").removeClass();
				//  $(this).children(".nav_2depth").hide();
				//	});

				$(this).children(".nav_2depth").stop().slideDown("fast");
				}, function() {
				  $(".gnb>.nav_1depth>li").removeClass();
				  $(this).children(".nav_2depth").stop().slideUp("fast");
					});

				/* $(this).children(".nav_2depth").fadeIn();
				}, function() {
				  $(".gnb>.nav_1depth>li").removeClass();
				  $(this).children(".nav_2depth").fadeOut();
					}); */

			});
	</script>

	
	<!-- sub contents -->
	<div class="sub_title">
		<h2>자주하는 질문(FAQ)</h2>
		<div class="container">
		  <div class="location">
			<ul>
				<li class="btn_home">
					<a href="index"><i class="fa fa-home btn_plus"></i></a>
				</li>
				<li class="dropdown">
					<a href="">커뮤니티<i class="fa fa-plus btn_plus"></i></a>
					<div class="dropdown_menu">
						<a href="gratings">공지사항</a>
						<a href="allclass">학과및모집안내</a>
						<a href="portfolio">포트폴리오</a>
						<a href="online">온라인접수</a>
						<a href="notice">커뮤니티</a>
					</div>
				</li>
				<li class="dropdown">
					<a href="">자주하는질문<i class="fa fa-plus btn_plus"></i></a>
					<div class="dropdown_menu">
						<a href="notice">공지사항</a>
						<a href="qa">질문과답변</a>
						<a href="faq">자주하는질문</a>
					</div>
				</li>
			</ul>
		  </div>
		</div><!-- container end -->
	</div>

	<div class="container">
	  <div class="write_wrap">
	  <h2 class="sr-only">글쓰기</h2>
	  <form name="faq" method="post" action="faq_insert" onsubmit="return check()">
	  <!-- action을 처리하기전에 check()사용자 함수를 실행하고 되돌아 와라-->
			<table class="bord_table">
				<caption class="sr-only">자주하는 질문 입력 표</caption>
				<colgroup>
					<col width="20%">
					<col width="*">
				</colgroup>
				<tbody>
					
					<tr>
						<th>질문</th>
						<td><input type="text" name="title"></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea name="contents"></textarea></td>
					</tr>
					
				</tbody>
			</table>
			<div class="btn_wrap">
				<input type="submit" value="저장" class="btn_ok">&nbsp;&nbsp;<input type="reset" value="다시쓰기" class="btn_reset">&nbsp;&nbsp;<input type="button" value="목록" class="btn_list" onClick="location.href='faq';">
			</div>
		</form>
	  </div>
	  
	</div>
	<!-- end contents -->
	<script>
		function check() {
			
			if(faq.title.value=="") {
				alert("제목을 입력");
				faq.title.focus();
				return false;
			}
			if(faq.contents.value=="") {
				alert("내용을 입력");
				faq.contents.focus();
				return false;
			}
			return true;
		}
	</script>
	<script>
		$(function() {
			$(".location  .dropdown > a").on("click",function(e) {
				e.preventDefault();
				if($(this).next().is(":visible")) {
					$(".location  .dropdown > a").next().hide();
				} else {
					$(".location  .dropdown > a").next().hide();
					$(this).next().show();
				}
			});
		});
	</script>
	

	<?php
		include "footer.html";
	?>

 </body>
</html>









