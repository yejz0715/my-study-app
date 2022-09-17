function validateInputLength() {
  let email = document.getElementById("email");
  let name = document.getElementById("name");
  let id = document.getElementById("id");
  let pw = document.getElementById("pw");
  let btn = document.getElementById("btn");
  if (
    email.value.legnth != 0 &&
    name.value.legnth != 0 &&
    id.value.legnth != 0 &&
    pw.value.legnth >= 8
  ) {
    btn.disabled = false; //disabled 비화성화 false=활성화
  } else {
    btn.disabled = true;
  }
}
