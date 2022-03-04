//typeConversion 형변환

//형변환이 필요한 이유?
const mathScore=prompt("수학점수?"); //50입력했을때 /prompt은 문자형
 const engScore=prompt("영어점수?"); //50입력했을때
 const result=(mathScore+engScore)/2; //"50"+"50"=5050/2=2525
 //prompt은 문자형이기때문에 100이 아닌 5050으로 더해진다

//자동 형변환
//"6" / "2" = 3; //6,2가 문자형인데 나누기가 되는 이유는 자동형변환 때문이다 
// 자동으로 되서 편리하다고 생각하겠지만, 원인을 찾기 힘든 에러를 발생시킬수 있기 때문에
// 항상 의도를 가지고 원하는 타입으로 변환해줘야한다 => 명시적 형변환

//명시적 형변환
//String() 문자형으로 변환
console.log(String(3),String(true),String(null),String(undefined)) //console.log는 ,로 여러개의 값을 한번에 찍을수 있음
//3, true, null, undefined ->문자형으로 잘 변환됨

//Number() 숫자형으로 변환
console.log(Number("123"),Number("dddd"),Number(true),Number(false))
//123(문자형숫자o), NaN(문자형글자x), 1, 0
//Number(null)-0 / Number(undegined)-NaN

//Boolean() 불린형으로 변환
//숫자0, 빈문자'', null, undefined, NaN 값들은 모두 false 변환
//이외에는 true 변환
//Boolean(0)-false / Boolean('0')-true
//Boolean('')-false / Boolean(' ')-true