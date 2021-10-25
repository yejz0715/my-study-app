package day07_class;
/*
static키워드
클래스(중첩클래스에서만 사용가능),멤버변수,멤버메소드에 적용할 수 있는 키워드
정적변수(클래스의 변수), 정적메소드(클래스의 메소드)를 선언할때 사용

자바프로그럄의 구동과정
1 JVM(자바가상머신)에 의해 실행할 모든 클래스중 static매소드, static멤버필드를 수집해서
  메머리에 로딩되고 프로그램의 시작(main메서드의 실행)잔에 메모리 적재됨
2 메모리에 로딩된 static메소드중 main이름을 검색 
3 main메소드가 검색되었다면 JVM해당 main메소드를 호출하여 프로그램을 시작

static(필드,메서드)의 특징
프로그램의 구동전부터 메모리를 확보하고 있는 멤버필드 및 메서드
*/

class staticA{
	int num; //멤버변수-동적변수
	static int number=100; //멤버변수선언-정적변수
}
public class Static {
	public static void main(String[] args) {
		//동적멤버변수는 객체가 반드시 만들어져야 사용이 가능한 변수
		staticA a=new staticA();
		a.num=100;
		System.out.println("a 객체의 동적멤버변수값 : "+ a.num);
		//위에서 객체 생성명령(staticA a=new staticA();)이 없다면
        //아래두개의 명령은 모두 에러
		
		//그러나 스태틱변수는 main메서드 실행전 객체생성 전에
		//이미 생성되어 있는 객체와는 돌립적, 클래스와는 종속적으로 사용하도록 생성됩니다
		//객체를 생성하지 않고도 사용할 수 있는 클래스의 멤버변수.
		
		//동적변수는 객체생성마다 그 객체안에 생성되서 객체의 갯수만큼 생성되지만
		//정적변수는 프로그램 전체를 통틀어 한개 만들어집니다
		//그 값도 일관성있게 끝까지 유지됩니다.
		
		
		//다만 클래스 외부에서 static변수에 접근하려면 위와 같이 클래스 이름과 함께 사용합니다
		System.out.println(staticA.number);
		
		//동적변수와 마찬가지로 private으로 보호되지않았다면 임의 접근이 가능하고 
		staticA.number=10;
		System.out.println(staticA.number);
		//private로 보호된 static변수는 static메서드를 사용하여 값을 저장하거나 얻어냅니다
		//static이 아닌 멤버 매서들에서 접근이 불가능합니다
	}

}
