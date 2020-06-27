<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.jsp"%>

<div class="contain">
	<div class="sub-topcontent">
		<h2 class="sub-title">회원가입</h2>
	</div>

	<div class="write-form">
		<table summery="회원가입 글쓰기 테이블 입니다">
			<caption class="readonly">회원가입 입력폼</caption>
			<colgroup>
				<col width="20%">
				<col width="80%">
			</colgroup>
			<tbody>

				<form name="my" method="post" action="member" onsubmit="return formcheck2()">
				<input type="hidden" name="emailcheck" value="1">

					<fieldset>
						<legend class="readonly">입력폼</legend>
						<tr>
							<th scope="row"><label for="id">아이디</label></th>
							<td><input type="text" name="id" id="id" class="minput">
								<a href="javascript:id_check()" class="btn-write">중복확인</a></td>
						</tr>
						<tr>
							<th scope="row"><lavel for="pass1">패스워드</lavel></th>
							<td><input type="password" name="pass1" id="pass1"
								class="minput"></td>
						</tr>
						<tr>
							<th scope="row">패스워드 확인</th>
							<td><input type="password" name="pass2" class="minput"></td>
						</tr>
						<tr>
							<th scope="row">이름</th>
							<td><input type="text" name="name" class="minput"></td>
						</tr>
						<tr>
							<th scope="row">이메일</th>
							<td><input type="text" name="email1" class="email">
								@ <input type="text" name="email2" class="email">
								<a href="javascript:email_check()" class="btn-write">메일인증</a></td>
						</tr>
						<tr>
							<td colspan="2">
							<input type="submit" value="회원등록"
								class="btn-write" > 
							<input type="button" value="목록" class="btn-reset"></td>
						</tr>
					</fieldset>
				</form>
			</tbody>
		</table>
	</div>

</div>

<script>
	function id_check() {
		var url = "id_check?id="+my.id.value;
		window.open(url, "id_check form", "width=200 height=130");
	}
	function email_check() {
		window.open("email_check", "email_check form", "width=200 height=130");
	}

	function formcheck2() {
		if (my.id.value == "") {
			alert("아이디입력하세요");
			my.id.focus();
			return false;
		}
		if (my.pass1.value == "") {
			alert("패스워드입력하세요");
			my.pass1.focus();
			return false;
		}
		if (my.pass1.value != my.pass2.value) {
			alert("패스워드를 확인하세요");
			my.pass1.focus();
			return false;	
		}
		if(my.emailcheck.value=="1"){
			alert('이메일 인증이 필요합니다');
			return false;
		}
		
		return true;
	}
	
	function send() {
		alert("등록합니다.")
		my.submit();
		return true;
	}

	
</script>

<%@ include file="../footer.jsp"%>















