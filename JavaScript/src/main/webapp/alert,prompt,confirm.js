//대화상자: alert,prompt,confirm

//alert :메세지창을 띄어줌

//prompt:입력할 수 있는 창을 띄어줌 / 어떤값을 입력받을 때 사용
const name1=prompt("이름을 입력하세요");
alert("환영합니다"+name1+"님");
//prompt는 default값도 입력가능, 2가지 인수를 입력하고 입력할 칸에 기본값으로 ''2022-3-' 이 되어있음
const name2=prompt("예약일을 입력하세요", "2022-3-");


//confirm:확인받을 때 사용
const isAdult=confirm("당신은 성인 입니까?"); 
//alert처럼 메시지창이 나오는데 다른점은 취소버튼도 있음/ 확인-true, 취소-false 뜸

//대화상자는 빠르고 간편하게 사용할수있지만,
// 단점은 스크립트 일시 정지 / 스타일링x 