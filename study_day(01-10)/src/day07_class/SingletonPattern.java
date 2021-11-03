package day07_class;

/*싱글턴 패턴(Singleton Pattern)
특정 클래스의 인스턴스를 반드시 한개만 생성할 수 있도록 강제하는 패턴
멤버필드값이 객체들간 static변수가 아니면서 일관된값을 가져야하고 객체도 둘이상
더 만들필요가 없다면, 하나의 인스턴스를 여러 레퍼런스(참조)변수가 공유하여 사용하도록 제어하는 싱글턴 방식이 사용됨
*/
class SingletonEx{ //싱글턴클래스 생성
	int n1;    //멤버필드-private 아닌것
	int n2;

   //1 생성자를 private로 보호
     private SingletonEx() {}
     
   //2 클래스내부에서 생성자를 호출하여 객체하나를(new 인스턴스)를 생성 (private & static으로 생성) 
      private static SingletonEx itc=new SingletonEx(); //new로 새로운 공간 할당받음
      private static SingletonEx itxEx=new SingletonEx();
     
   //3 생성해놓은 객체의 참조변수값을 리턴하는 public형의 메서드를 생성   
      //메서드 이름 getInstance()-static으로 생성
      public static SingletonEx getInstance(){
      return itc;
      }         
  }    
public class SingletonPattern {
	public static void main(String[] args) {
		//SingletonEx s1=new SingletonEx();에러
		//SingletonEx s2=new SingletonEx();에러
 //싱글턴패턴은 (s1, s2)레퍼런스변수가 같은 주소를 갖게하는 방식	
		//SingletonEx s3=new SingletonEx();
	    //SingletonEx s4=s3;
		//싱글턴은 하나의 인스턴스를 공유해서 쓰는것과 비슷
		SingletonEx s1= SingletonEx.getInstance();
		SingletonEx s2= SingletonEx.getInstance();
		SingletonEx s3= SingletonEx.getInstance();
		System.out.println(s1); //day07_class.SingletonEx@12c8a2c0
		System.out.println(s2); //day07_class.SingletonEx@12c8a2c0
		System.out.println(s3);	//day07_class.SingletonEx@12c8a2c0
		s1.n1=150;
		System.out.println(s2.n1); //150
		s2.n2=200;
		System.out.println(s3.n1+""+s3.n2); //150200
			}
}
/*
 생성자가 private로 보호되어 main메서드안에서 new SingletonEx()로 새로운객체 생성이 되지않음
SingletonEx s1=new SingletonEx();에러
싱글톤방식은 클래스내부에 유일한 객체(itc)를 생성해두고 (public static으로 생성)
public static으로 만들어진 getInstance()메서드를 호출하여 itc를 리턴받아 객체를 사용
생성자메서드는 static인스턴스 itc만들때 최초 실행된 때 말고는 실행되지않음

주로 유지되어야 할 정보와 메서드를 많이 갖고있는 클래스에서 많이 사용됨
두개의 객체가 유지되면 부담스러운 부분을 하나로 공유하고 필요한 내용을 멤버변수로 해결하는 방식이다

싱글턴패턴이 구현되는 클래스의 활용
날짜시간에 관련된 정보를 제공하는 Calender :
클래스 싱글턴패턴이 구현되어 new인스턴스를 사용하여 객체생성이 안됨
반드시 getInstance메서드를 사용해야함




*/