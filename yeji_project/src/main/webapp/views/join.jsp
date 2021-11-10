<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../resources/css/join.css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="../resources/js/join.js"></script>

</head>
<body>

<form name="fm" method="post">
	<div class=join>
		<h1>회원가입</h1>
		<input type="text" class="join_input" id="name" placeholder="이름" reqired />
		<div class="checkid">
			<input type="text" class="join_input" id="id" placeholder="아이디" /> 
			<input type="button" value="중복확인" id="id_check" onclick="duplicateid()"/>
		</div>
		<p align="left">아이디는 영문과 숫자조합만 가능합니다(4-20자리)</p>
		<input type="password" class="join_input" id="pwd" placeholder="비밀번호" />
		<input type="password" class="join_input" id="pwd_check"
			placeholder="비밀번호확인" />
		<p align="left">비밀번호는 영문과 숫자 및 특수문자 조합만 가능합니다(8-20자리)</p>
		<div class=radio_gender>
			<input type="radio" name="gender" id="female" checked="checked" />
			<!-- name아닌 id로 한경우 버튼두개 눌러짐 -->
			<label for="female">여성</label> <input type="radio" name="gender"
				id="male" /> <label for="male">남성</label>
		</div>
		<textArea placeholder="간단한 소개글을 작성해보세요"></textArea>
		<input type="button" class="join_button" value="회원가입" />

	</div>
</form> 
</body>
</html>