//array

//배열:순서가있는 리스트
/*
1번:철수
2번:영희
...
30번:영수
let students=['철수','영희',...,'영수'];
            //   0,    1,  ....,  29 :고유번호 :인덱스:indext
*/

//특징
//1 문자뿐만 아니라, 숫자, 객체, 함수등도 포함할 수 있다
//2 length:배열의 길이를 구할수있음 students.length //30
//3 메소드 - push():배열 끝에 추가 
let days=['월', '화', '수']
days.push('목')
console.log(days) //월,화,수,목
// 메소드- pop():배열 끝 요소 제거
days.pop()
console.log(days)//월,화,수
//메소드-unshift():배열앞에 추가
days.unshift('일')
console.log(days) //일,월,화,수
//메소드-shift():배열앞에 제거
days.shift()
console.log(days)//월,화,수

//for..of
for(let day of days){
    console.log(day) //월,화,수
}

