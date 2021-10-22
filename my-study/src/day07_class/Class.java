package day07_class;
/*
  클래스(class)
  :프로그램으로 처리하고자하는 대상을 자료화하여 하나의 자료형으로 정의(속성/기능)한 사용자 정의자료형
  :개발자가 필요에 의해 정의한 자료형  
 */  

 class First{ //class 클래스명
 //멤버필드                      속성(멤버필드,멤버변수, 필드):클래스에 속한 정보들(변수)
	 int 변수1;    //정수형       속성은 변수로 생성하며 클래스의 멤버필드라고도 함
	 int n1;
	 double n2; //실수형             
	 String n3; //문자형
	 int[] n4=new int[5]; //배열  
 //멤버메서드
	 public void method1() {}
	 public static void method2() {}
   }
 public class Class {	
	 public static void main(String[] args) {		
		First a1; //클래스의 변수선언-생성된 변수는 레퍼런스(참조)변수이다
           //new명령을 이용하여 Heap영역에 클래스가 정의된 크기만큼 공간을 확보한 후 a1에 저장
		a1=new First(); //레퍼런스변수와 new에 의해 만들어진 공간이 합쳐지면 이를 객체라 부름
		                //위와 같이 공같이 할당되면 이제 클래스의 변수1,n1-4 변수 사용가능
	    First a2; //객체가 두개만들어지면 a1,a2에도 클래스의 변수들 사용가능
	              //구분하기위해 a1.n1/ a2.n4 로 사용
	    
	 System.out.println(a1.n1); //0 
	 a1.n1=20;
	 System.out.println(a1.n1); //20
	 }

}
