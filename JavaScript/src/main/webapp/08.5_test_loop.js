//for
//문제1 for문을 이용해서 배열 cost의 값을 모두 더해 total_cost 변수에 저장하세요.
let cost = [ 85, 42, 37, 10, 22, 8, 15 ];
let total_cost = 0;
for(i=0; i<cost.length; i++){ //(초기식)i는 0부터/(조건식)배열 cost의 길이까지/(증감식)하나씩 증가
    total_cost+=cost[i]; // 실행문 total_cos=cost[i+(i+1).....]
}
console.log(total_cost);

//while
let a=0; //초기식
while(a<11){ //while(조건식) 
     console.log(a); //실행문 i~10출력
  a++; //증감식  i는 10까지 반복하고 종료함
      }

//for 문제1을 while문 형식을 이용해서 배열 cost의 값을 모두 더해 total_cost 변수에 저장하세요.
let cost1 = [ 85, 42, 37, 10, 22, 8, 15 ];
let total_cost1 = 0;
let b=0;
  while(b<cost1.length){
    total_cost1+=cost1[b];
    b++;
  }    
  console.log(total_cost1);

//do while 
var i = 0; //(초기식)
do {
   i++;  //(증감식)
   console.log(i);  //(실행문) 1~10출력
}
while (i<10);  //(조건식)
