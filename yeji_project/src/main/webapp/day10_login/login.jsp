<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="login.css">
<!-- <script src="script/login.js"></script> -->

<!-- javascript 변수  
var:중복선언+초기화가능/재할당가능(선언,초기화이후 반복해서 다른값 재할당 할수있다)/함수내부에 선언된 변수만 지역변수로 인정(함수레벨스코프)
const:중복x/재할당불가능/처음선언할때 초기화/(상수선언키워드)/블록레벨스코프 
let:중복선언x/재할당o/블록내부에서(if문중괄호{}) 선언된변수까지 지역변수로인정(블록레벨스코프)    
                                           -->
<script type="text/javascript">
	function login() { // 함수이름 login()

		var id = document.frm.id.value; //변수선언 
		var pwd = document.frm.pwd.value;

		// 간단하게 
			if (validateId(id) && validatePwd(pwd)) { // id 검증함수인 validate
				console.log('id : ', id); //작은따옴표('')아님 
				console.log('pwd : ', pwd);
			} else {
				alert('입력창을 확인해주세요!');
				return;
			} 
		
		 
		// 입력길이, 입력조건 -> 로그인 
	/*	if (id != "" && pwd != "") {

			if (validateId(id) && validatePwd(pwd)) { // ok -> true 
				// 로그인 성공
				console.log('id', id);
				console.log('pwd', pwd); //콘솔창
			} else {
				alert('아이디와 비번을 확인해주세요');
				return;
			}
		} else if (id == '' && pwd != '') {
			alert('아이디를 입력해주세요');
			document.frm.id.focus();
			return;
		} else if (pwd == '' && id != '') {
			alert('비밀번호를 입력해주세요');
			document.frm.pwd.focus();
			return;
		} else {
			alert('아이디와 비밀번호를 입력해주세요');
			return;
		}*/
	}

	// id 검증 함수 
	function validateId(id) {
		const regExpId = /^[a-z]+[a-z0-9]{4,20}$/g; //변수선언

		return regExpId.test(id); // test => boolean 
	}
	// pwd 검증 함수F
	function validatePwd(pwd) {
		const regExpPwd = /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^*+=-]).{10,20}$/;
		return regExpPwd.test(pwd); // test => boolean
	}
</script>
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