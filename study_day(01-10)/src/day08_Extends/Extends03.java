package day08_Extends;

class SuperD{   //부모클래스
	public SuperD() {  //전달인수 없는 디폴트 생성자
		this(1);
		System.out.println("SuperD()"); //4
	}
	public SuperD(int arg) {  //정수값을 매개변수로 갖는 생성자
		this(1.1);
		System.out.println("SuperD(int)"); //3
	}
	public SuperD(double arg) {  //실수값을 매개변수로 갖는 생성자
		this("");
		System.out.println("SuperD(double)"); //2
	}	
		public SuperD(String arg) {  //문자열 자료를 매개변수로 갖는 생성자
			System.out.println("SuperD(String)"); //출력1
  }
}
class SubD extends SuperD{
	public SubD() {
		this(1);
		System.out.println("SuperD()");//8
	}
	public SubD(int art) {
		this(1.1);
		System.out.println("SuperD(int)");//7
    }
	public SubD(double art) {
		this("");
		System.out.println("SuperD(double)");//6
	}	
		public SubD(String art) {
			//super();
			System.out.println("SuperD(String)"); //5
	}
}		
public class Extends03 {
	public static void main(String[] args) {
		//SuperD d = new SuperD();
        SubD d = new SubD();

	}

}
