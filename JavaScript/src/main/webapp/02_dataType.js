//dataType-자료형

//-문자형( " "/ ' '/ ` `)
//javascript에서 문자는 " ", ' ' 붙여줘야함
const name1= " yeji ";
const name2= ' yeji ';
const name3= ` my name is ${name1} `; //my name is yeji
//const name3= " my name is ${name1} "; //" my name is ${name1} "

//` ` 아닌 ' ' 나 " "를 사용하면 내용 그대로 나옴

//_숫자형
//사칙연산 가능(+ / - / * / / / % )
const age=30;
const x=1/0; //Infinity 무한대

const y=name1/2; //NaN :Not a number

//Boolean
const a=true; //참 
const b=false; //거짓

//ull, undefined
//null:존재하지 않는 값 / undefined:값이 할당되지 않음

//typeof 연산자 : 변수의 자료형을 알아낼 수 있다
console.log(typeof 3); //number
