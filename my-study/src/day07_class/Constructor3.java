package day07_class;

           //1 D클래스생성
class Dclass{	
	
 	public Dclass(){   //2 디폴트생성자 생성 
	System.out.println("Dclass 클래스의 디폴트생성자 호출");	
	}

   public Dclass(int i) { //3 int타입 매개변수의 생성자 생성
	   System.out.println("Dclass 클래스의 int 타입매개변수를 전달받는 생성자 호출");
   }
   
   public Dclass(double d) { //4 double타입 매개변수의 생성자 생성
	   System.out.println("Dclass 클래스의 double타입 매개변수를 전달받는 생성자 호출");
   }
}

public class Constructor3 {
	public static void main(String[] args) {
		Dclass d1=new Dclass();
		Dclass d2=new Dclass(10);
		Dclass d3=new Dclass(10.4);
		//Dclass 생성자만들기
	}
}
