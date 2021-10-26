package day08_Extends;

/*
클래스의 상속
목적1:다수개의 클래스들이 중복되는 멤버변수, 멤버메서드를 포함하고있는 경우
부모자식관계를 생성하여 코드의 중복을 방지하는것
목적2:코드의 재활용방법
코드의 중복이 발생하고있는 클래스에서 중복되는 멤버들을 별도의 클래스로 선언하고 상속을 구현하여 사용한다

상속의 구현
extends 키워드사용
class SubClass명(자식클래스) extends SuperClass명(부모클래스)
상속을 받는 클래스:서브클래스, 자식클래스, 하위클래스
상속을 제공해주는 클래스:슈퍼클래스, 부모클래스, 상위클래스

접근지정자와 상속
부모클래스의 private는 아무리 자식클래스라고해도 접근할수 없다
private:현재 클래스내에 있는 멤버메서드를 통해서만 접근가능한 은닉 멤버변수
*/


class SuperA{
	private int n1; //은닉멤버변수/ public메소드 있어야 접근가능
	public int n2;
	
	//디폴트 접근지정자:동일한패키지 내부에서는 public으로 동작/ 다른패키지에선 private로 동작
    int n3;
    public int getN1() {return n1;}
}

class SubA extends SuperA{ //SuperA클래스를 상속받는 SubA클래스
	public void printfo() {
	  //System.out.println(This.n1);에러 부모클래스의 private 접근할수없음
	    System.out.println(this.n2); //동일한 패키지므로 디폴트 접근지정자로 선언된
	                           //부모의 멤버에 접근할 수 있음 n2-public
		System.out.println(this.n3);
		//public으로 선언된 멤버메서드를 이용하려면, 부모클래스의 private멤버에도 접근이 가능..
		System.out.println(this.getN1());
		
	}
}
public class Extends01 {
	public static void main(String[] args) {
	}
}
