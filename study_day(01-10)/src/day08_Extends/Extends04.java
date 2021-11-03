package day08_Extends;
/*상속문법
각각의 클래스에서 발견되는 공통변수, 메소드등 하나의 클래스로 선언하여 물려받는 문법
상속은 모든클래스의 공통되는 속성, 가능을 정의된 부모클래스를 자식클래스에게 물려주는 방식
자식클래스에 부모클래스의 정의되는 속성, 가능들이 동작해야하므로 일반적인 정의만 사용할 수 있다.
또한 상속받은 메서드들은 자식클래스의 생성목적이나 용도에 따라 사용이 어울리지 않은 메서드일 가능성이 있다

자식클래스는 부모클래스에서 물려받은 메소드를 자신의 용도에 맞게 재정의 할 수 있다
메서드 오버라이딩은 자식클래스에서 부모클래스의 메소드의 원형을 다시 정의하는 문법이다
메서드 오버라이딩을 구현하면 부모클래스에서 물려받은 메소드는 무시되고 새롭게 정의한 메소드가 사용된다
*/



/**
 메소드 오버라이딩
 1 메소드의 이름이 동일해야함
 2 메소드의 매개변수의 타입, 개수, 순서가 다를 경우 같은이름의 메소드라도 다른메소드로 인식한다(=오버로딩)
 3 상속관계에서만 사용할 수 있다(오버로딩과 다른점)
 4 부모클래스의 메소드의 원형과 반드시 일치해야한다(리턴값의타입, 메소드이름, 매개변수)
 5 접근지정자는 축소될 수 없다
 6 부모클래스의 final로 정의된 메소드는 오버라이딩 할 수 없다
 */
class Animal2{
	public void crying() {System.out.println("소리를 냅니다.");}
}

class Dog2 extends Animal2{
	public void crying() {super.crying();System.out.println("멍멍");}
}

class Cat2 extends Animal2{
	public void crying2() {super.crying();System.out.println("야옹");}
	//메서드의 이름이 다르므로 메서드오버라이딩이 아님
}
public class Extends04 {
	public static void main(String[] args) {
		Dog2 d =new Dog2();
		Cat2 c =new Cat2();
		//cat2클래스의 crying2()메서드는 오버라이딩되지 않아서 부모메서드만 실행됨
        d.crying();
        c.crying();
        //클래스의 외부에서 super키워드를 통한 부모클래스의 메소드호출이 제한됨
        //c.super.crying; 에러
        
        //상속의 다형성: 부모클래스의 레퍼런스변수는 자식클래스의 객체의주소를 저장할 수 있다
        Animal2 a=d;
        //a.crying()을 실행하면 자식클래스에서 오버라이딩된 메서드가 우선적으로 실행됨
        d.crying();
        a.crying();
	}
}

