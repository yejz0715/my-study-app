<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="../resources/css/login.css">
<script src="../resources/js/login.js"></script>
</head>
<body>
	<!--처음에 잡은 구조 
<div class=login>

<div class=box_title>예지월드에 오신걸 환영합니다:)</div>

<div class=box_id>
<div class=label_id>아이디</div>
<div class=item><input type="text" name="id"
 style="width:500px;height:48px; " /></div>
</div>

<div class=box_pwd>
<div class=label_pwd>비밀번호</div>
<div class=item><input type="password" name="pwd" /></div>
</div>

<div class=box_submit>
<div class=label_submit>로그인</div>
<div class=item><input type="button" value="로그인"/></div>
<input type="text" name="id"
 style="width:500px;height:48px; " />
</div> -->
	<form name=frm method="get">
		<div class="login_container">
			<!--전체를 div 하나로   -->

			<h1>예지월드에 오신걸 환영합니다! :)</h1>

			<input type="text" class="login_input" name="id" placeholder="아이디"
				minlength="4" maxLength="20" /> <input type="password"
				class="login_input" name="pwd" placeholder="비밀번호" minlength="10"
				maxLength="20" /> <input type="button" id="login_button"
				value="로그인" onclick="login()" />
			<p>아직 회원이 아니신가요?</p>
			<a href="join.jsp">회원가입으로 이동</a>

		</div>
	</form>
</body>
</html>