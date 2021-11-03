package day08_Extends;
//일반객체의 생성과정
//1 멤버필드 메모리 로딩
//2 생성자 호출

//상속관계에서 객체 생성과정
//1 멤버필드의 메모리로딩- 부모/자식클래스의 모든 멤버필드가 메모리로딩
//2 생성자호출(먼저 자식클래스의 생성자호출)
//3 자식클래스 생성자의 첫번째 실행코드인 super()에 의해 부모클래스의 생성자호출
//  super()명령은 따로 쓰지않아도 이미존재, 부모클래스가있다면 자동호출
//4 자식클래스의 생성자의 나머지 코드들실행
//  부모클래스의 private멤버와 같은경우 자식클래스에서 초기화를 할수없기때문에 부모클래스의 생성자를 통해 초기화실행 

class SuperB{ 
	int superNum;
	public SuperB() {
		System.out.println("부모클래스의 생성자");
	}

}
class SubB extends SuperB{ //SuperB 상속
	int subnum;
	//생성자를 별도로 꺼내서 정의하지 않았다면
	//보이지않는 곳에 디폴트생성자가 존재할것이며 그의 첫번째명령은 
	//SubB(){super();} 이다

	//디폴트생성자를 별도로 꺼내서 정의한 경우
      SubB(){ super();	//생략가능/반드시 첫번째 실행코드로 사용
    //다만 부모클래스의 생성자가 오버로딩되거나 하지않았다면 쓰지않아도 super();명령은 실행됨
    //부모클래스생성자가 디폴트생성자만 있을시 super(); 명령 생략-자동 호출
      System.out.println("자식클래스의 생성자 실행");
      }
    
    //매개변수가 있는 생성자가 오버로딩 된경우 ... this()로 형제생성자를 호출한 경우
  public SubB(int subNum) { //오버로딩된 자식클래스 생성자
    	//자식클래스의 오버로딩된 생성자의 첫번째실행코드는 super() 또는 this()를 코딩하는데 
	    //그둘을 같이 실행할순 없다
	    //현재클래스의 매개변수가 없는 생성자를 this()로 호출하고 그안에 super()가 실행되도록 함
	   this();
	   System.out.println("자식클래스의 오버로딩된 생성자실행(this())");	   
      }
  
  //매개변수가 있는 생성자가 오버로딩 된경우.. this()로 형제 생성자를 호출하지않은 결우
  public SubB(int subNum, int num) {
	  super();
	  System.out.println("자식클래스의 오버로딩된 생성자 실행");
  }
}
class SuperC{
	//public SuperC() {}
	public SuperC(int num) {
		System.out.println("부모클래스의 매개변수가 있는 생성자");
	}
}
class SubC extends SuperC{
//부모클래스의 디폴트생성자가 존재하지 않는 경우
//자식클래스의 생성자에서는 반드시 super를 사용하여 명시적으로 매개변수가 있는 부모클래스의 생성자를 호출해야함
public SubC(){
	//숨어있는 부모생성자 호출명령
	//super(10);->부모의 디폴트생성자 호출
	this(10);
}	
	
	public SubC(int n) {
		super(10);	
	}
}
    // 호출했으면 그에 맞는 부모 생성자가 있거나, 없으면 지금 존재하는 부모생성자에 
	// 맞춰서 호출하거나...
	// 컴파일러에 의해서 자동으로 삽입되는 코드  super();
	// 부모클래스의 디폴트 생성자를 실행하는 코드이므로 디폴트 생성자가 없는 경우 
	// 에러가 발생


public class Extends02 {
	public static void main(String[] args) {
		SubB b=new SubB();
		System.out.println();
		SubB c=new SubB(20);
		System.out.println();
		SubB d=new SubB(20,40);

		
		SubC n=new SubC();
	}

}

