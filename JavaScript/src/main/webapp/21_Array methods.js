//array method
//Array
//push():뒤에 삽입, pop():뒤에 삭제 , unshift():앞에 삽입, shift():앞에 삭제
arr.splice(n,m); //특정요소 지움 n:시작/ m:개수
arr.splice(n,m,x); //특정요소 지우고 추가 n:시작/ m:개수 x:추가
arr,splice(); //삭제된 요소 반환
arr.slice(n,m); // n부터 m까지 반환 ()안 비어있으면 복사
arr.concat(arr2, arr3); //배열이 합쳐서 새배열 반환

arr.forEach(fn); //배열반복, 함수를 인수로 받음
let users=['jin', 'sin', 'min'];
users.forEach((name, index, arr)=>{// 함수- 세개의 매개변수(해당요소/index/해당배열(잘사용하지않음))

arr.indexOf(); //해당요소의 인덱스반환 없으면 -1반환
arr.lastIndexOf(); //뒤에서부터 탐색하고싶으면..!   
arr.includes(); //포함하는지 확인 
arr.find(fn);//찾음. 함수를 이용해 더 복잡한 연산이 가능, 첫번째 true 값만 반환/없으면 undefined반환
arr.findIndex(fn);//해당 인덱스반환 없으면 -1
});
arr.filter(fn); //만족하는 모든 요소를 배열로 반환, find와 사용법이 같음
arr.reverse(); //역순으로 재정렬
arr.map(fn); //함수를 받아 특정기능을 시행하고 새로운 배열을 반환
let userList=[
    {name:'min', age:30},
    {name:'jin', age:24},
];
let newUserList=userList.map((user, index)=>{
    return Object.assign({}, user, { 
        id:index +1,
        isAdult: user.age>19,
    });
});
//join 배열을 합쳐서 문자열을 만들때 사용

//split 문자열을 나눠서 배열을 만들때 사용

//Array.isArray() 배열인지 아닌지
