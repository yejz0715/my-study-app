//관계연산자(relational operator)
//문제
//함수 solution의 내용을 수정해서 a와 b가 모두 True라면 True를, 그렇지 않으면 False를 return하도록 만들어 보세요.
function solution(a, b) {
  if (a && b) return true;
  else return false;
}
console.log(solution(false, false)); //false
