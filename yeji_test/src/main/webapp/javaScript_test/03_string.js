//string
//문제1
//함수 solution을 수정해서 인자 str의 첫번째 글자를 return하는 함수를 만들어 보세요.
function solution(str) {
  const a = str[0];
  return a;
}
console.log(solution("test")); //t
//문제2
//함수 solution1을 수정해서 인자 str1의 첫2글자를 문자열로 return하는 함수를 만들어 보세요.
function solution1(str) {
  const a = str.substr(1, 2);
  return a;
}
console.log(solution1("test"));
