package day07_class;
//this의 용도 1
//:멤버메서드내에 존재하면서, 메서드를 호출하는 호출객체의 레퍼런스값을 저장하는 숨어있는 레퍼런스 변수


//this의 용도 2
//:오버로딩된 형체 생성자를 재호출하기 위한 호출이름. 반드시 호출하는 형태 (매개변수)
//생성자가 오버로딩 되어 있어야함

class ThisB{
	private int num1;
	private int num2;
	private int num3;
	ThisB(int n){
		num1=n;
		System.out.println("ThisB 클래스의 생성자1이 호출");
	}
 ThisB(int n1, int n2){
	 //num1 =n1;
	 this(n1);//this라는 이름으로 자신의 형제 생성자를 호출
	 num2=n2;
	 System.out.println("ThisB 클래스의 생성자2이 호출");
  }
 ThisB(int n1, int n2, int n3){	 
	 //this를  사용한 생성자간 호출코드는 반드시 생성자의 명령중 첫번째 실행코드로만 사용가능
	 this(n1,n2);
	 this.num1=n3;
	 System.out.println("ThisB 클래스의 생성자3이 호출");
}

public class This2 {
	public static void main(String[] args) {
		ThisB b1 = new ThisB(10);
		ThisB b2 = new ThisB(10,20);
		ThisB b3 = new ThisB(10,20,30);
		}
	  }
	}

