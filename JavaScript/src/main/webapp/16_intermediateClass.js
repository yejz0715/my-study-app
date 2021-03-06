// intermediateClass 생성자함수

        //객체 리터럴
        let user={
            name:'jine',
            age:30,
        }
        //생성자함수:비슷한 객체를 여러번 만들어야할 때사용 /new 함수명() 
        function Item(title,price){ //생성자함수 첫글자:대문자 
           //this={};
            this.title=title;
            this.price=price;
            this.showPrice=function(){ //메소드
                console.log(`가격은 &{price}입니다. `);
            }; 
            //return this; /코드작성하지않아도 new로 호출하면 알고리즘으로 실행됨
        }
        let item1=new Item('인형', 3000);
        let item2=new Item('가방', 5000);
        let item3=new Item('지갑', 4000);  //new를 쓰지않으면 그냥 함수실행 ->undefined로 나옴
        console.log(item1,item2,item3); //Item{title:"인형",price:3000,showPrice:f} 
        item3.showPrice(); //가격은 9000원 입니다
    