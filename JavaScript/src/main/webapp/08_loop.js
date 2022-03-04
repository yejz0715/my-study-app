//반복문 loop
//for, while, do while

//1-10까지 로그
//for 
for(let i=0; i<10; i++ ){//( 초기값; 조건; 코드실행 후 작업 )
	console.log(i+1); //1-10
}

//while
let i=0;
while(i<10){
	console.log(i);
	i++;
};
//do while
let i=0;
do{
 console.log(i);
	i++;
}while(i<10);

//break :멈추고 빠져나옴
while(true){ //while(true) :무한반복
	let answer=confirm('계속 할까요?'); //confirm: 확인메시지 창 /확인-T, 취소-F
	if(!answer){
		break;
	}
};
//continue :멈추고 다음 반복으로 진행
//짝수
for(let i=0; i<10; i++){
	if(i%2){
		continue;
	}
	console.log(i);
}