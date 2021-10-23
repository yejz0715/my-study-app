package day07_class;
/*
 생성자(Constructor) 
 클래스의 객체가 생성될 때 멤버필드의 초기화를 위해서 사용되는 메소드 
 각각의 객체가 생성될때, 서로다른 메모리를 가지는 객체를 생성할 수 있게 한다    
    
 특징
 1 메서드이다 (특별한 멤버메서드- 처음객체생성시만 호출, 중간에 호출되지않는다)
 2 클래스의 이름과 동일한 이름을 갖는다
 3 리턴값이 없다
 4 따로 정의(생성)하지 않아도 이미 클래스 내부에 존재한다
 5 생성자는 각각의 객체가 생성될때마다 호출된다
 6 주로 하는일은 new와 함께 객체가 저장될 Heap메모리를 할당하고 그안에 멤버변수를 만드는 일을한다   
 */

class Aclass{
	private int age;
	//필요에 따라 숨어있는 생성자를 꺼내놓고, 메모리확보하는 동작외에 다른일을 시킬수 있다
	Aclass(){
		System.out.println("Aclass의 생성자 호출");
		age=100;
	}
	public int getAge() {return age;}
	public void setAge(int age) {this.age=age;} //this:멤버변수를 식별하는 식별자
}
public class Constructor {
	public static void main(String[] args) {
	Aclass a= new Aclass(); //생성자 호출- 객체가 만들어질때
	//객체가 만들어질때만 호출되기때문에 다른메서드처럼 호출객체와 함께 사용되지않는다
	System.out.println("나이 : " + a.getAge());
	Aclass b=new Aclass();
	b.setAge(200);
	System.out.println("나이 : " + b.getAge());

	}
}
