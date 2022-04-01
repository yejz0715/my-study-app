//closure(클로저): 함수와 그 함수의 렉시컬 환경의 조합
//함수가 생성될 당시의 외부변수를 기억, 생성이후에도 계속 접근가능

function makeCounter(){
    let num=0; //은닉화:직접적으로 변경되면 안되는 변수에 대한 접근 막음
    
    return function () {
        return num++;
    };
}                           //내부함수에서 외부함수의 변수(num)에 접근
let counter=makeCounter;
console.log(counter()); //0  
console.log(counter()); //1
console.log(counter()); //2  //수정불가능