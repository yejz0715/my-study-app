package day07_class;
/* this 변수:레퍼런스(참조)변수
 클래스의 멤버필드들은 new라는 키워드에 의해 각각의 객체별로 생성된다(서로다른 메모리공간(겹치치x))
 반면 멤버메서드는 생성된(오버로딩포함)메서드별로 하나만 존재하며 모든 객체들이 공유하게 됨
 이때 현재 메서드를 호출한 객체가 어떤 객체인지 구분하여 실행될수있게 this라는 숨겨진 참조변수를 제공
*/

class ThisA{
	private int num; //class의 멤버필드는 private로
	public void setNum(int num /*,ThisA this*/) { //멤버메소드 setNum / 매개변수:int형 num
		this.num=num;
//this에는 형재 메서드를 호출한 객체의 참조변수값이 전달되어 저장됨
//매개변수로 선언된 num변수를 현재 메서드안에서만 사용되는 지역변수로만 사용되고 소멸
//멤버메서드에서 멤버변수에 접근권한이 있으므로 참조변수 this와 멤버변수가 (.)로 연결되어	사용	
	}
	
	public void display(/*ThisA this*/) {
		System.out.printf("num=%d\n", num);
		//매개변수와 멤버변수가 겹치는 상황 등 여러이유로 this 꼭 사용해야하는 상황이있지만
		//그런상황이 아니라면 위처럼 생략가능
		
	}
	 //this 의 용도1 : 맴버매서드를 호출한 호출객체의 참조변수값(주소값)을 전달받아 
		//전달된 호출객체를 식별하는 용도로 사용
	void copy1(ThisA tmp) {//tmp<-a2  this<-a4
		this.num=tmp.num;
}
 ThisA copy2() {//this<-a1
	 ThisA a= new ThisA();
	 a.num=this.num;
	 return a;//a5<- a
 }

}
public class This {
	public static void main(String[] args) {
	ThisA a1=new ThisA();
	ThisA a2 = new ThisA();
	a1.setNum(10);
	a2.setNum(20);
	a1.display();
	a2.display();
	
	ThisA a3 = a1;//a1참조변수값을 a3에 복사하는 동작
	a3.setNum(100);//a3의 맴버변수만 수정
	a1.display();//출력한 a1과 a3가 모두 수정되어 출력
	a3.display();
	//위 연산은 new를 이용하여 a3에 새로운 공간을 만든게 아니라,
	//a1위 레퍼런스 값만 복사저장한 결과로, a1과 a3는 같은 공간의 주소를 저장하고 있기 때문
	
	ThisA a4=new ThisA();
	a4.copy1(a2);//객체복사방법#1
	a2.setNum(200);
	a4.display();
	a2.display();
	
	//객체복사방법#2
	ThisA a5= a1.copy2();		
	a4.display();
	a5.display();

	}

}
