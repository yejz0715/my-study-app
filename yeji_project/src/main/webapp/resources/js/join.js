
$(document).ready(function() {
	console.log('start!')


	// 비밀번호 중복 확인 
	$('.join_input_password').focusout(function() {

		var userPwd = $("#pwd").val();
		var userPwd_chk = $("#pwd_check").val();

		if (userPwd > 0 && userPwd == userPwd_chk) $('#guide_pwd').css("color", "#038900").text("비밀번호가 일치합니다 :)")
		else $('#guide_pwd').css("color", "#FF0000").text("비밀번호가 일치하지 않습니다. 다시 입력해주세요!")
	});
	
});


// 아이디 중복 확인 
function duplicateId() { // 중복확인버튼 클릭하면 duplicateId함수실행      
	console.log(`duplicateId()..
	.`); //콘솔로그 사용하기
	var userId = $("#id").val(); //1 입력한 아이디값 받아오기 #id의 값을 userId에 전달/ $("#id").val(); : 값얻어오기

	if (userId == 'admin') {
		$('#guide_id').css("color", "#FF0000").text("이미 등록된 아이디 입니다. 다시 입력해주세요!");
		// 중복확인 버튼이 활성화 상태             
		$('#id_check').attr("disabled", false); //#id_check.속성값설정(비활성화,F)=활성화
		return;
		//입력값이 admin이라면..
	} else if (userId.length != 0) {
		$('#guide_id').css("color", "#038900").text("사용가능한 아이디입니다.");
		// 중복확인 버튼이 비활성화 상태
		$('#id_check').attr("disabled", true).css({ "background": "#D1D1D1", "border": "1px solid #D1D1D1" });
	}  //#id_check.속성값설정(비활성화,T)=비활성화
	//입력값의 길이가 0이 아니라면..(입력은했으나 admin이 아닐때)
	else alert(`아이디를 입력하세요!`);
	//입력값이 없을때..

	$("#id").on("propertychange change keyup paste input", function() { //중복체크한후 다른 아이디를 입력했을때
		$('#guide_id').css("color", "#D1D1D1").text("아이디는 영문과 숫자조합만 가능합니다(4-20자리)");
		// 중복확인 버튼이 활성화 상태
		$('#id_check').attr("disabled", false).css("background", "#EBDCD3");;
	}); //#id_check.속성값설정(비활성화,F)=활성화
};


//필수값
function joinButton(){
	if($('#id') !=0)
		alert(`회원가입이 완료되었습니다 :) `);
				
};

//유효성검사
/* id 검증 함수 
	function validateId(id) {
		const regExpId = /^[a-z]+[a-z0-9]{4,20}$/g; //변수선언
		return regExpId.test(id); // test => boolean 
	}
	// pwd 검증 함수
	function validatePwd(pwd) {
		const regExpPwd = /^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^*+=-]).{10,20}$/;
		return regExpPwd.test(pwd); // test => boolean
	}
*/





















