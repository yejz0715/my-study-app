//switche

//사과 100원
//바나나 200원
//키워 300원
//멜론 400원
//수박 500원
//사고싶은 과일 물어보고 가격 알려주기 

let fruit=prompt('무슨과일을 사고싶나요?');

switch(fruit){
	case '사과':
		console.log('100원');
		break;
	case '바나나':
		console.log('200원');
		break;
	case '키위':
		console.log('300원');
		break;
	case '멜론':
		console.log('400원');
		break;
	case '수박':
		console.log('500원');
		break; //break를 넣지않으면 다 실행됨
		default:
		console.log('그런과일은 없습니다.');
	
}
