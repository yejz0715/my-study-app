//object-객체

        //객체(key와value으로 구성됨)
        //property(프로퍼티):어떤 값을 나타냄/이값이 다른값과 연관되어있을때
        const superman={
            name:'clark',
            age:33,
        }
        console.log(superman.name); //clark
        console.log(superman['age']); //33
        console.log(superman); // Object{
                               //      age:33
                               //      name:"clack"     }

        //접근할땐 ' . ' 사용 superman.name //'clark'
        //         '[ ]' 사용 superman['age'] //33
        //추가할때 ' . ' '[ ]' :superman.gender='male';
        //삭제       delete superman.gender;

        //프로퍼티 존재여부확인(in) - 확신할수없을때/함수인자로 받거나..
        superman.birthDay; //undefinde
        console.log('birthDay' in superman); //false
        console.log('age' in superman); //true

        function isAdult(user){
            if(!('age in user') || //user에 age가 없거나
            user.age<20){          //user.age 나이가 20미만이거나 
                return false;
            }
            return true;
        }
        const jin={
            name:"jin"
        }
        console.log(isAbult(jin)); //age 없으니 false
        
        //for..in반복문 -객체를 순회하면서 값 얻을수있음
        for(let key in superman){
            console.log(key)  //1-name  2-age
            console.log(superman[key]) //1-clark  2-33
        }