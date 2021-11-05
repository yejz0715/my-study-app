<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="join.css">
<script>

</script> 
</head>
<body>


<div class=join>
<h1>회원가입</h1>
<input type="text" class="join_input" id="name" placeholder="이름"/>
<input type="text"class="join_input" id="id" placeholder="아이디"/>
<p>아이디는 영문과 숫자조합만 가능합니다(4-20자리)</p>
<input type="password" class="join_input" id="pwd" placeholder="비밀번호"/>
<input type="password" class="join_input" id="pwd_check" placeholder="비밀번호확인"/>
<p>비밀번호는 영문과 숫자 및 특수문자 조합만 가능합니다(8-20자리)</p>
<div class=gender>
<input type="radio" id="gender" value="여성" checked/>
<input type="radio" id="gender" value="남성" />
</div>
<textArea placeholder="간단한 소개글을 작성해보세요"></textArea>
<input type="button" class="join_button" value="회원가입" />

</div>

</body>
</html>