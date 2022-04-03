//variable
//변수,호이스팅,TDZ(Temporal Dead Zone)
  
        //변수생성과정
        //1선언 2초기화 3 할당
        //var 1선언 및 초기화 2할당 (var과 let은 선언만 먼저하고 나중에 할당해도 됨)
        //let 1선언 2초기화 3 할당
        //const 1선언+초기화+할당(동시에)
        /*const gender;
          gender='male'; //에러 선언+초기화+할당 동시에 해야함*/
        
        //스코프
        //var :함수스코프:함수 내에서 선언했으면 함수 내에서만 유효함(함수에서만)
        //const, let:블록스코프 : 코드블록 내에서 선언했으면 코드블록 내에서만 유효함 외부접근x
        const age1=30;
        if(age1>19){
            var txt='성인'; //cont,let 사용시 에러 
        }
        console.log(txt); //성인

        //const
        //console.log(name0); //error :const,let도 호이스팅이 되는데 에러인건 TDZ 때문/ 할당전에는 사용할수 x (선언전에 변수접근 금지)
        //var name0='mike';
        
        //let
        let age=30; //호이스팅 : 정상실행
        function showAge(){
            console.log(age);
         //   let age=20; //에러 :TDZ 할당전 사용X 
        }
        showAge();

        //var
        //1 한번 선언된 변수를 다시 선언 할 수있다.
        //2 선언전 사용가능
        console.log(name); 
        var name='mike'; //호이스팅:{스코프 내부} 어디서든 변수선언은 최상위에 선언된것처럼 행동 
        //2-2
        var name;
        console.log(name); //undefined :선언(name)은 호이스팅되지만, 할당('mike')은 되지x
        name='mike';
        

    