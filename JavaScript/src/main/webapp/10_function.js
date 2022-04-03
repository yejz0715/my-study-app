//함수 function
//:하나의 특별한 목적의 작업을 수행하도록 설계된 독립적인 블록 /필요할때마다 호출하여 해당 작업을 반복해서 수행할 수 있다
//함수선언문

/*

//1 매개변수x함수
function showError(){
	alert('에러발생');
}
showError();

//2 매개변수o 함수1
function sayHello(name){ //sayHello:함수명 / name:매개변수 / {}:실행코드
	const msg=`Hello, ${name}`;
	console.log(msg);
}
sayHello('Mike');

//3 매개변수o 함수2 (지역변수)
function sayHello(name){ 
	let msg='Hello'; //msg :지역변수 함수내에서만 사용가능 
	if(name){	
	msg += `, ${name}`;
	}
	console.log(msg);
}
sayHello('Mike'); //Hello, Mike 

//4 매개변수o -전역변수
let msg='Hello'; //전역변수 외부에서 사용하려면 함수밖에서 변수선언해줘야함
console.log(msg);
function sayHello(name){ 
	if(name){	
	msg += `, ${name}`;
	}
	console.log(msg);
}
sayHello('Mike'); //Hello, Mike 
console.log(msg); //Hello, Mike 


//5 전역변수와 지역변수(서로 간섭x)
let msg="welcome"; //전역변수
function sayHello(name){
	let msg="Hello"; //지역변수
	console.log(msg+ ' ' +name);
}
sayHello('mike');//Hello mike
console.log(msg); //welcome

//6 or
function sayHello(name){
	let newName=name || 'friend'; //매개변수가 없으면 friend로
	let msg=`Hello, ${newName}`
	console.log(msg);
}
sayHello(); //friend
console.log('jin'); //Hello jin

//7 default 
function sayHello(name='friend'){ //default값은 매개변수가 없을때 할당
	let msg=`Hello, ${newName}`
	console.log(msg);
}
sayHello(); //friend
console.log('jin'); //Hello jin
*/
//8 return으로 값 반환
function add(a,b){
	return a+b; //return은 함수를 종료하기위한 목적으로 사용하기도 함
}
const result=add(2,4);
console.log(result);
