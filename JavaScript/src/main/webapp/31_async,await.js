//async,await

//async 사용하면 프로미스의 then메소드를 체인형식으로 호출하는것보다 가독성이 좋음

//async function getname() {
//함수앞에 async를 사용하면 프로미스로 반환
//return "mike"; //1
//return Promise.resolve("tom"); //3 리턴값이 프로미스면 이 값 그대로 사용
//throw new Error("err..."); //4 함수내부에러발생 reject
//}
//console.log(getname()); //1 Promise { 'mike' }

//getname().then((name) => { //2
//함수를 호출하고 then을 사용하면
//console.log(name); //mike
//});

//getname().catch((err) => { //4
// console.log(err);
//});

//await
// function getname(name) {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       resolve(name);
//     }, 1000);
//   });
// }
// //await는 async함수 내부에서만 사용가능 일반함수에서 사용하면 에러
// async function showname() {
//   const result = await getname("mike"); //프로미스 차례가 될때까지 기다림 result에 getname의 resolve된 값을 넣어줌
//   console.log(result); // ->1초후 mike 나옴
// }
// console.log("시작");
// showname();

//promise->async,await
const pf1 = () => {
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("1번 주문완료");
    }, 1000);
  });
};
const pf2 = (message) => {
  console.log(message);
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("2번 주문완료");
    }, 2000);
  });
};
const pf3 = (message) => {
  console.log(message);
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("3번 주문완료");
    }, 3000);
  });
};
console.log("시작");
async function order() {
  const result1 = await pf1();
  const result2 = await pf2(result1);
  const result3 = await pf3(result2);
  console.log(result3);
  console.log("종료");
  //result1 변수에 pf1()데이터가  기다렸다가 들어가니깐 promise의 then보다 가독성이 좋음
}
order();
