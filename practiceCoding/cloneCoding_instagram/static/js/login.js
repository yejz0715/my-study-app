//  로그인 입력창 길이 검증 및 버튼 활성화
function validateInputLength() {
  let email = document.querySelector("#email");
  let pw = document.querySelector("#pw");
  let btn = document.querySelector("#btn");
  if (email.value.length != 0 && pw.value.length >= 8) {
    btn.disabled = false;
  } else {
    btn.disabled = true;
  }
}

// 이메일 검증 함수-이메일양식
function validateEmail() {
  let email = document.querySelector("#email").value;
  // 이메일 정규식 변수 저장
  const regExp =
    /[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
  // 입력창에 있는 이메일이 정규식에 잘 맞는지 검증
  return regExp.test(email);
}

//3 로그인 버튼 클릭시 동작할 함수
//  이메일 검증 함수 및 비밀번호 검증 함수 실행
//  두 결과가 true라면 로그인 api호출
//  false라면 잘못된 정보입니다 다시 입력해주세요
function onClickLoginBtn() {
  let result = validateEmail();
  if (result) {
    location.href = "feed.html";
  } else {
    alert("잘못된 정보입니다 다시 입력해주세요");
  }
}
