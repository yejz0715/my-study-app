//Promise 프로미스:비동기 작업의 단위

const pr0 = new Promise((resolve, reject) => {
  //new Promise로 생성하고 함수를 전달받는 인수(resolve:성공(1인수), reject:실패(2인수))
  //code
}); // =>어떤일이 완료된 이후 실행되는 함수 : callback함수

//new Promise 생성자가 반환하는 Promise 객체는
//   초기 state:pending(대기), result:undefined
// ->성공(resolve(value)) state:fulfilled(이행됨), result:value
// ->실패(reject(error)) state:rejected(거부됨), result:error

const pr = new Promise((resolve, reject) => {
  setTimeout(() => {
    //1초후 함수실행
    //resolve("ok");
    reject(new Error("error...."));
  }, 1000);
});

console.log("시작");
pr.then((result) => {
  //성공
  console.log(result);
})
  .catch((err) => {
    //실패
    console.log(err);
  })
  .finally(() => {
    //처리가 완료되면 항상 실행
    console.log("끝");
  });

//callback함수
const f1 = (callback) => {
  setTimeout(function () {
    console.log("1번 주문완료");
    callback();
  }, 1000);
};
const f2 = (callback) => {
  setTimeout(function () {
    console.log("2번 주문완료");
    callback();
  }, 2000);
};
const f3 = (callback) => {
  setTimeout(function () {
    console.log("3번 주문완료");
    callback();
  }, 1000);
};
console.log("시작");
f1(function () {
  //1번주문완료
  f2(function () {
    //2번주문완료
    f3(function () {
      //3번주문완료
      console.log("끝");
    });
  });
});
//callback함수->promise
const pf1 = () => {
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("1번 주문완료");
    }, 1000);
  });
};
const pf2 = () => {
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("2번 주문완료");
    }, 2000);
  });
};
const pf3 = () => {
  return new Promise((res, rej) => {
    setTimeout(() => {
      res("3번 주문완료");
    }, 3000);
  });
};
console.log("시작");
pf1()
  .then((res) => pf2(res)) //f1(프로미스반환)실행, resolve함수를 실행으로 넘긴값을 f2로 넘겨줌
  .then((res) => pf3(res))
  .then((res) => console.log(res))
  .catch(console.log)
  .finally(() => {
    console.log("끝");
  });
//promise.all(배열) 여러개의 프로미스를 동시에 실행(모든작업이 완료될때까지 기다림 /하나라도 실패면 catch로 )
Promise.all([pf1(), pf2(),pf3()]).then((res)=>{
     console.log(res);
    });
//promise.race(배열) 경주, 여러개중 하나라도 완료되면 끝
Promise.race([pf1(), pf2(),pf3()]).then((res)=>{
    console.log(res);
   });