package day07_class;
//초기화블럭

class StaticF{
	private static int num=1;
	private int number;
	//초기화블럭:객체 생성시 실행(생성자와 성격이 비슷)
	//단순값으로 초기화하는경우 대입연산자를 처리할 수 없지만
	//실행문이 포함된 초기화를 진행하는경우 아래와 같이 초기화과정을 정의할 수 있음
	{
		number=100;
		System.out.println("인스턴스 변수 초기화용 초기화블럭1");
	}

	static {
		System.out.println("staticF의 static블럭 실행");
		num=55;
	}//스태틱블럭은 객체생성 이전에 프로그램시작시 실행
	
	static int cnt=0;
	int seriaNo;
	{
		++cnt;
		seriaNo=cnt;
		System.out.println("인스턴스 변수 초기화용 초기화 블럭2");
	}
	//스태틱멤버를 초기화 하기위한 public static메소드 선언
	//(메서드로 초기화과정을 진행하기때문에 반드시 메소드를 호출해야함)
     public static void setNum(int num) {StaticF.num=num;}
     public static int getNum() {return num;}    
}
public class InitializeBlock {
	public static void main(String[] args) {
		StaticF f=new StaticF();
		System.out.println(StaticF.getNum());
		StaticF.setNum(500);
		System.out.println(StaticF.getNum());

	}

}
