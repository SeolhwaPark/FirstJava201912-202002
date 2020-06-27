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
						<li><a href="allclass">학과및모집안내</a>
							<ul class="nav_2depth">
								<li><a href="#">전체모집과정</a></li>
								<li><a href="#">스마트웹콘텐츠개발과정</a></li>
							</ul>
						</li>
						<li><a href="portfolio">포트폴리오</a>
							<ul class="nav_2depth">
								<li><a href="portfolio">포트폴리오</a></li>
							</ul>
						</li>
						<li><a href="online">온라인접수</a>
							<ul class="nav_2depth">
								<li><a href="#">온라인접수</a></li>
								<li><a href="#">취업성공패키지</a></li>
							</ul>
						</li>
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
		<h2>찾아오시는길</h2>
		<div class="container">
		  <div class="location">
			<ul>
				<li class="btn_home">
					<a href="index"><i class="fa fa-home btn_plus"></i></a>
				</li>
				<li class="dropdown">
					<a href="">비젼소개<i class="fa fa-plus btn_plus"></i></a>
					<div class="dropdown_menu">
						<a href="gratings">비젼소개</a>
						<a href="allclass">학과및모집안내</a>
						<a href="portfolio">포트폴리오</a>
						<a href="online">온라인접수</a>
						<a href="notice">커뮤니티</a>
					</div>
				</li>
				<li class="dropdown">
					<a href="">찾아오시는길<i class="fa fa-plus btn_plus"></i></a>
					<div class="dropdown_menu">
						<a href="gratings">인사말</a>
						<a href="gratings">연혁</a>
						<a href="gratings">비젼및이념</a>
						<a href="gratings">교직원소개</a>
						<a href="photo">대우갤러리</a>
						<a href="map">찾아오시는길</a>
					</div>
				</li>
			</ul>
		  </div>
		</div><!-- container end -->
	</div>

	<div class="container">
		<div class="text_center">
				<p><strong>JSL인재개발원(대전)</strong></p>
				<span class="col_bar"></span>
		</div>

		<div class="map_cont">
			<div id="map" style="width:100%;"><p><img src="../images/map.jpg" alt="" style="width:100%;"></p><p style="margin-top:20px;"><a href="https://map.naver.com/?searchCoord=32943c64d98f3649838fdf2bf0437f0d59b1cb6998a34a4238977cdb8ed8c84f&query=67mE7KC87KeB7JeF7KCE66y47ZWZ6rWQ&menu=location&street=on&tab=1&lng=c6bc0397ad9741b833c37da6a2a0a8c9&mapMode=0&vrpanofov=120&vrpanoid=5JmgegTvhY7Ow%2B0byAEPFA%3D%3D&mpx=36ba12183157e689ec1a06cb0032dcc7e2ce2f14dadff5a58bdd9987af435973f7b2edb298b3bcf011fccc47676667ee5407459eefe2d2bba46a16cec8e28f1e&vrpanopan=26.77051835202983&vrpanotilt=0&lat=99d0c44b63a1955617ff2a3195fc3bf6&dlevel=12&enc=b64" style="padding:10px; border:1px solid #ddd;" target="_blank">지도크게보기</a></p>
			<p style="padding-top:50px; line-height:180%;"><strong>주소</strong><br>
				(대전센터)대전광역시 중구 계룡로 825 (용두동, 희영빌딩) 5층,6층/ (서울센터)서울특별시 송파구 올림픽로 35길 104 ( 장미C상가 403호 )</p>
				<p style="padding-top:20px; line-height:180%;"><strong>고객센터</strong><br>
				042-242-4412</p>
				</div>
		</div>
	</div>
	<!-- end contents -->
	
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
	

<footer class="footer">
		<div class="container clearfix">
			<address class="address">
				<p class="title">본사</p>
				(우)12345 대전광역시 중구 계룡로 825 (용두동, 희영빌딩) 5층,6층/고객센터: 042-242-4412 	사업자등록번호: 305-86-06709
			</address>
			<p class="copyright">Copyright &copy JSL 인재개발원주식회사. All rights reserved.</p>
		</div>
</footer>

 </body>
</html>








