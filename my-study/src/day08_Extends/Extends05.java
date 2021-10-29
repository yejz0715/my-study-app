package day08_Extends;
/*
 object클래스 
  사용자정의 클래스를 생성하면서 extends(상속)을 구현하지않으면 자동으로 java.lang.OBject클래스를 상속
  object클래스는 java에서 모든 클래스들의 최상위 부모클래스이다
 */
class UserClass /*extends Object*/{	
}

public class Extends05 {
	public static void main(String[] args) {
		UserClass obj = new UserClass();
		System.out.println(obj.getClass());
//getClass: 해당 객체의 클래스이름을 리턴해주는 메서드:class days15.UserClass
		System.out.println(obj.hashCode());
//hashCode:해당 객체의 해시코드값(고유값)을 리턴해주는 메서드(JVM에 의해서 관리되고 있는 번호):305808283	
		System.out.println(obj.toString());
//toString: 해당 객체의 정보를 문자열로 리턴해주는 메서드:days15.UserClass@123a439b
		//객체클래스명+'@'+해시코드값(16진수)
		System.out.println(obj); //System.out.println(obj.toString());와 같음
	}
}
//Object클래스의 equals: 객체간의 비교를 위해서 사용되는 메소드
//Object가 상속한 메서드들 중 toString광 함께 가장 많이 오버라딩 되는 메서드
