//논리연산자:logicalOperator (or, and, not)

const name1="Mike";
const age=30;

// || OR :여러개중 하나라도 T면 T / 모두 F면 F
	//이름 tom 이거나 성인이면 통과
	if(name1==='Tom' || age>19){
		console.log('통과');
	}else{
		console.log('돌아가');
	};
	
//&& AND :여러개중 모든것이 T면 T / 하나라도 F면 F
	//이름 Mike 이고, 성인이면 통과
	if(name1==='Mike' && age>19){
		console.log('통과');
	}else{
		console.log('돌아가');
	};
	
// ! NOT :T 면 F / F면 T
	//나이 입력받고 성인이 아니면 돌아가
	const a=prompt('나이?');
	const isAdult=a>19; //성인
	if(!isAdult){
		console.log('돌아가');
	};

//우선순위 (&& > ||)	
//남자이고, 이름이 Mike이거나 성인이면 통과
const gender='F';
const name2='jin';
const ault=true;

if(gender==='남자' && name2==='Mike' || ault){
	console.log('통과');
}else{
		console.log('돌아가');
	}; //통과
	//&& 가 ||보다 우선순위가 높기때문에 통과

	