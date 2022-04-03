//symbol
//property key: 문자열

//Symbol() : 유일한 식별자 만들때 사용 
const a=Symbol(); //new 붙이지x
//이름이 같아도 다른존재 유일성 보장
const id1=Symbol('id');
const id2=Symbol('id');
id1===id2; //false  
id1==id2; //false

//Symbol.for():전역 심볼
//하나의 심볼만 보장받을수 있음
//없으면 만들고, 있으면 가져오기 때문
//하나를 생성한 뒤 키를 통해 같은 Symbol을 공유
const id3=Symbol.for('id');
const id4=Symbol.for('id');
id3===id4; //true  


