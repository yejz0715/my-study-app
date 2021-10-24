package day07_class;


	class Cclass{         //클래스생성
		private int age; //클래스의 멤버필드는 private로 
	
		//1 생성자는 메소드이므로 매개변수사용할수있다
	    //  생성자의 매개변수를 활용하는 경우 각각의 객체마다 서로 다른값을 가질수있음
	Cclass(int age){  //생성자 Cclass, 매개변수 age  (생성자는 메소드이다)
		this.age=age;  //this:멤버변수를 식별하는 식별자
	  }
	//5 생성자메서드 오버로딩을 통해 없어진 디폴트생성자 문제를 해결할 수 있다
	    Cclass(){this.age=40;}  //오버로딩:메소드 이름은 같고, 매개변수의 타입,갯수,순서가 달라 다른 메소드로 인지
	    public int getAge() {return age;}
	    public void setAge(int age) {this.age=age;}
	
	}
	
	public class Constructor2 {
	public static void main(String[] args) {
 //2 생성자에 전달인수를 만들고 다른값을 전달하여, 객체마다 멤버변수의 초기값을 달리하여 시작할수있음		
		Cclass c1=new Cclass(20);
		Cclass c2=new Cclass(30); 
		
 //3 클래스내부에 매개변수를 갖든 안갖든 생성자가 꺼내어지고 정의가되면
 //	 숨어있던 디폴트 생성자는 꺼내어져서 정의된 생성자로 대체되고 없어진다
 //4 디폴트생성자가 없어졌으므로 아래는 에러		
       Cclass c3=new Cclass();
 //6 디폴트생성자가 생겼으므로 다시 정상 실행됨       
		
	}

}
