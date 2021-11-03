package day08_Extends;

/*
 추상클래스(Abstract Class)
  상속을 통한 다형성의 구현(메서드 오버라이딩)에 강제성을 부여하기위한 클래스
 추상메서드를 포함한 클래스:추상메서드를 하나이상 포함한 클래스
 추상메서드:메서드의 원형만 존재하고 실제내용이 없는 메서드(메서드의 정의만있고 몸체-구현은 없다) 
  
  작성법
  접근지정자 abstract 리턴값의타입 메소드명(매개변수)
  추상클래스는 추상메서드포함 +( 일반멤버변수, 일반메서드, 생성자)도 포함할 수 있다
  추상클래스를 상속한 자식클래스가 추상메서드를 오버라이딩하지않으면 에러
 */
abstract class AbstractAnimal{ //추상클래스
	public abstract void sound();// 메소드의 정의만 있고, 메소드의 body(몸체)구현은 없다
}

class DogA extends AbstractAnimal{
	public void sound() {
		System.out.println("멍~멍~");
	}
}
//추상클래스를 상속한 자식 클래스가 추상메서드를 오버라이딩 하지 않는다면 에러
class CatA extends AbstractAnimal{
	@Override
	public void sound() {
		System.out.println("야옹~");	
	}
}
//추상메서드를 오버라이딩한 자식클래스는 일반클래스로 사용될수있음
//추상클래스로 추상클래스만의 객체를 만들순 없지만 추상클래스(부모)의 레퍼런스 변수로
//자식클래스의 인스턴스 주소는 저장할 수 있다

//AbstractAnimal a = new AbstractAnimal(); X
//추상클래스는 내부에 완전치못한 추상메서드가 있으므로 객체생성이 안되지만
//AbstractAnimal b = new DogA(); O
//AbstractAnimal c = new CatA(); O
//자식들의 인스턴스를 저장할 레퍼런스 변수로는 사용이 가능합니다.(다형성의 구현)
public class Extends06 {
	public static void main(String[] args) {
		AbstractAnimal dog = new DogA();
		AbstractAnimal cat = new CatA();
		System.out.println("강아지 소리");
		dog.sound();
		System.out.println("고양이 소리");
		cat.sound();
	}
}
//추상클래스의 단점:추상메서드 구현의 강제성
//추상메서드의 갯수가 많으면 상속에 부담을 주게됨
//자식클래스에서 사용하지 않을 추상메서드라도 객체생성을 위해 구현해야하는 문제점이있다

//상속받으려할때 필요없는 메서드가 있어도 추상메서드를 모두 오버라이딩(구현)해야하고 
//오버라이딩한 클래스를 상속받으려할땐 필요없는 메서드를 강제로 구현(오버라이딩)하지않고
//필요한것만 구현하여 사용가능