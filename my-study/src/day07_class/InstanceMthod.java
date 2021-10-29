package day07_class;
/*instance 메서드에서 instance변수 사용할수있다
                    static변수 사용할수있다
  static 메서드는 instance변수를 사용할수없다
  static 메서드는 static변수를 사용할수있다
*/


class MemberCall{
	//인스턴스변수:객체가 생성될때 iv변수가 생성->10으로 초기화
	int iv=10;
	
	//스태틱변수:프로그램이 시작돨때 sv가 생성->20으로 초기화
	static int sv=20;
	
	//인스턴스변수:객체가 생성될때 iv2가 생성->이미 만들어져서 20을 저장하고있는 sv값으로 초기화
    int iv2=sv;  
    //static int sc2=iv;-에러 :iv가 언제 생성될지 모르므로 sv에 값을 전달할수없음
   
    static int sv2=new MemberCall().iv;
    //임시방편으로 객체생성후 변수를 사용하는 예
    //억지로라도 인스턴스(멤버)변수로 스태틱변수의 값을 초기화하고자 한다면
    //위와같은 방법을 씁니다 레퍼런스변수 없는 new인스턴스를 만들어서 멤버변수사용
  
    //인스턴스메서드는 인스턴스변수, 스태틱변수, 인스턴스메서드, 스태틱메서드 모두 자유롭게 사용가능

    void instanceMethod1() {
    	System.out.println(sv);
    	System.out.println(iv);
    }
    
    static void staticMethod() {
    	System.out.println(sv); //스태틱메서드는 스태틱필드를 사용할수있다
    	//System.out.println(iv);            인스턴스변수를 사용할수없다
    	
    	System.out.println(new MemberCall().iv);
    	//억지로라도 스태틱 메서드가 인스턴스필드를 사용하려면 객체를 만들고 사용
    	
    	//instanceMethod1();
    	//스태틱메서드는 인스턴스 메서드를 호출할수 없다
    	new MemberCall().instanceMethod1();
    	//억지로라도 스태틱 메서드가 인스턴스필드를 호출하려면 객체를 만들고 사용가능
        }	
    	//인스턴스 메서드는 인스턴스 메서드, 스태틱메서드 모두 자유롭게 사용 가능
    	void instanceMethod2() {
    		staticMethod();
    		instanceMethod1();
    	}
    }
public class InstanceMthod {
	public static void main(String[] args) {
	}
}
