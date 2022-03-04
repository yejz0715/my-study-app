//operators 연산자 / comparisonOperator 비교연산자

// +, -, *, /, %
// % 나머지

//홀수 : x % 2 = 1 
//짝수 : y % 2 = 0

//5보다 작은 수 : x % 5= 0~4 사이의 값만 반환

//거듭제곱 : **  
//2**3=2*2*2=8

let num=10;
num=num+5;
num+=5; //위의 식과 같다 : 5를 더하고 다시 변수에 넣어줌

//증가연산자, 감소연산자 : 값을 1만큼 증가 또는 감소
let num=10;
num++; //11
num--; //9
let result=num++; //10 변수에 10에 들어가고 증가되기때문에 (나중에 증가됨)
let result=++num; //11 앞에다 써야함 (먼저 증가됨)

//comparisonOperator 비교연산자

// < > <= >= == != 비교연산자를 사용하면 반환값은 항상 boolean형

// == 동등연산자
const a=1;
const b="1";
console.log(a==b); //true 
//=== 일체연산자
console.log(a===b); //false '===' 를 사용하면 type도 비교해줌