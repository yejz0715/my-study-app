//arrow function-함수선언문,화살표 함수

//함수선언문 :10에서 배운 내용 
 sayHello0(); // hello : 어디서든 호출가능
 //자바스크립트는 실행 전 초기화 단계에서 코드의 모든 함수선언문을 찾아서 생성해준다 그래서 함수를 사용할수있는 범위는 코드위치보다 더 위로 올라간다. ->호이스팅
 function sayHello0(){
    console.log('hello');
}

//함수표현식 : 한줄씩 실행 코드에 도달하면 생성 
let sayHello1=function(){
    console.log('hello');
}
sayHello1();

//arrow function (화살표 함수1) 
const sayHello2=(name)=>{
    const msg=`Hello, ${name}`;
    console.log(msg);
}
sayHello2('jine');