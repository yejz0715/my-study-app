//객체 object
const obj = {};
//객체:하나의 값이 아니라 속성(이름-값(모든자료형) )의 집합
const man = {
  name: "홍길동",
  age: 20,
  height: 180,
};
//객체속성에 접근할 때 두가지방법
//1 man.name - 객체이름.속성이름
//2 man["name"] - 객체이름["속성이름(문자열)"]
man.age = 26;
console.log(man);

//test1
//변수 female 객체로 선언해서 name과 age라는 속성을 추가하고, 각각에 자신의 이름과 나이를 입력하세요.
const female = {
  name: "홍길순",
  age: 27,
};
console.log(female);
//test1
//book의 title을 이용해서 코드 2번째 줄이 책의 제목을 출력하도록 만들어 보세요.
const book = { title: "어린왕자" };
console.log("제목:", book.title);
