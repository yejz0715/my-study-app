//object2-객체 (method, this)

    //method:객체 프로퍼티로 할당 된 함수
//1
    let girl={
        name:"jin",
        showName:function(){
            console.log(girl.name)
        }
    };
    girl.showName(); //jin
//2
    let boy={
        name:'jin',
        sayThis:function(){
            console.log(this); //this가 아닌 boy였다면, 에러
        }
    };
    let man=boy;
    boy=null;
    man.showName(); //jin 

    //화살표함수는 일반함수와 달리 자신만의 this를 가지지않음
    //화실표함수 내부에서 this를 사용하면 그 this는 외부에서 값을 가져옴
 
    