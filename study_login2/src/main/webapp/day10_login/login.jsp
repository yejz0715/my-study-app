<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="login.css">
 <!-- <script src="script/login.js"></script> --> 
<script type="text/javascript">
function move(){
	var id=document.frm.id.value;	
	var pwd=document.frm.pwd.value;
	
	if(id==''&& pwd !=''){
		alert('아이디를 입력해주세요');
		document.frm.id.focus();
       return;       
       const regExpId = /^[a-z]+[a-z0-9]{4,20}$/g;
	}
		
	if(pwd=='' && id !=''){
		alert('비밀번호를 입력해주세요');
		document.frm.pwd.focus();
	       return;
	}
	
	if(id=='' && pwd==''){
		alert('아이디와 비밀번호를 입력해주세요');
	}

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
   <form name=frm method="get" >
	<div class="login_container"><!--전체를 div 하나로   -->
	
		<h1>예지월드에 오신걸 환영합니다! :)</h1>
		
		<input type="text" class="login_input" name="id" placeholder="아이디" minLength="4" maxLength="20"  /> <input			
			type="password" class="login_input" name="pwd" placeholder="비밀번호"  minlength="10" maxLength="20"  /> <input
			type="button" id="login_button" value="로그인" onclick="move()"/>
	
	</div>
	</form>
</body>
</html>