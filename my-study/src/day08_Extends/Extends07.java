package day08_Extends;


/*
자바에서 제공하는 상속기능은 단일상속만 지원한다
하나의 클래스는 하나의 부모클래스를 가질수 있다(여러개의 클래스를 상속할 수 없음)

다중상속을 위해 만들어진 interface는 제약있는 클래스이다
인터페이스는 멤버필드로 public static final 멤버만 가질 수 있고
          멤버메서드로 public abstract 메소드만 가질 수 있다
          
*/
interface InterA{
	//int n1; 에러 일반변수 생성못함
	//InterA(){} 에러 생성자x
    //public void print(){} 에러 추상메서드만 생성이 가능하고 일반메서드 생성못함
	
	//인터페이스내부에 선언할 수 있는 요소
	public static final int num1=10;
	//인터페이스 내부에 선언된 멤버필드는 'public static final int' 생략가능
	 int num2=3;
	//'public static final int' 이 생략된 변수와 일반멤버변수의 구분은 초기값의 유무에 따로 구분된다
	//int n3; 값이 초기화되지않는 변수는 일반 멤버변수로 인식되어 에러
	 
	 public abstract void test2();
	//인터페이스 내부에 선언된 메서드는 'public abstract void' 생략가능
	 void test3();
	 //public abstract가 생략된 메서드와 허용돠지않는 일반 메서드의 구분은 { }의 유무에따라 구분함
	 
}
//인터페이스를 상속(구현)하는 클래스는 상속할 클래스앞에 extends 대신 implements를 쓴다
class SubX implements InterA{
	@Override
	public void test2() {
		System.out.println("SubA클래스의 test메소드 실행");
	}

	@Override
	public void test3() {
	}
}
public class Extends07 {
	public static void main(String[] args) {
	//인터페이스는 객체를 생성할 수 없다(생성자가 없으므로 객체생성불가)
    
	//상속을 통한 다형성 구현에만 인터페이스가 활용됨
    //부모인터페이스의 레퍼런스를 사용하여 자식클래스의 객체를 참조 가능
		InterA a=new SubX();
		//부모 인터페이스의 레퍼런스를 사용하여 자식클래스의 오버라이딩된 메서드를 호출
		a.test2();
	}
}
//인터페이스들간의 상속:인터페이스끼리 상속해서 부모의 추상메서드를 물려받을수 있다
//인터페이스끼리의 상속은 추상메서드의 오버라이드 의무는 면제된다
//다만 상속받은 추상메서드를 보유하게되어 이를 implements 한 클래스가 오버라드하게 한다
//클래스에서 다수개의인터페이스를 구현(implements)할수있다
//일반클래스가 인터페이스를 다수개 implements했다면 그 인터페이스들이 보유한 추상메서들을 모두 구현(override)해야함

//인터페이스 간 상속을 구현하고있는 인터페이스를 클래스에서 구현하는경우
//부모인터페이스의 추상메소드를 포함하여 모두 오버라이딩해야한다

//인터페이스를 다중상속한 경우 부모인터페이스는 자신의 추상메서드만 접근할 수 있다
