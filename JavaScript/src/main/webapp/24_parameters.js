//parameters(나머지 매개변수), Spread syntax(전개구문)
    
    //arguments:함수로 넘어 온 모든 인수에 접근
    //함수내에서 이용 가능한 지역변수
    //length /index(배열x), Array형태의 객체, 배열의 내장메서드(forEach,map)사용x
    
    //Rest parameters(나머지 매개변수:정해지지 않는 개수의 인수를 배열로 나타냄) (...나머지매개변수)여러개일때 위치는 매개변수중 가장 마지막
    //전달받은 모든수 더하기
    function add(...numbers){ //numbers 배열/ 배열메소드 사용가능
        let result=0;
        numbers.forEach((num)=>(result += num));
        console.log(result);
    }
    add(); //[]
    add(1,2,3,4,5,6,7,8,9,10); //55

    //(Spread syntax)전개구문 : 배열 (객체도 가능)
    //arr1을 [4,5,6,1,2,3]으로
    let arr1=[1,2,3];
    let arr2=[4,5,6];

    arr1=[...arr2, ...arr1]; 
    console.log(arr1); //[4,5,6,1,2,3]
