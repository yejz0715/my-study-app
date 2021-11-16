/* javascript 변수  
var:중복선언+초기화가능/재할당가능(선언,초기화이후 반복해서 다른값 재할당 할수있다)/함수내부에 선언된 변수만 지역변수로 인정(함수레벨스코프)
const:중복x/재할당불가능/처음선언할때 초기화/(상수선언키워드)/블록레벨스코프 
let:중복선언x/재할당o/블록내부에서(if문중괄호{}) 선언된변수까지 지역변수로인정(블록레벨스코프)    */
                                       

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
