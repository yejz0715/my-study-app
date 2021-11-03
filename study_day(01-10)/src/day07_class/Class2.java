package day07_class;
/*접근지정자(public, private,protected)
클래스의 멤버필드/메서드는 접근지정자에 의해 외부에서의 접근을 제어할수있다
private : 자기자신의 클래스의 멤버메서드만 접근가능  
public : 기본지정, 클래스 외부접근에 제한이 없다(멤버필드의 값이 외부에의해 강제로 수정될수도있다) 
protected: child class 에서만 자유롭게 접근이 가능. 
default : 접근 지정자를 지정하지 않으면 자동으로 갖게되는 접근지정자이며, 같은 패키지내에서 자유롭게 접근 가능
*/

class Account{ //클래스생성 
	/*정보은닉
	클래스내부에 선언된 멤버필드는 직접적으로 접근 및 수정해선 안된다
	그래서 클래스내부 모든 멤버필드는 private로 선언, 멤버필드를 제어할수있는
	메서드는 public으로 선언
	*/
	private double balance;
	
	public void initBanance(int i) {// 검증 절차를 거쳐서 값이 대입될 수 있다
		balance=i;
	}
	public void display() {
		System.out.printf("현재 잔액은 %.2f 원 입니다.\n", balance);
	}// 잔고 확인 기능s
	public void withraw(int money) { // 출금 기능
		balance -= money;//(balance=balance-money)
	}	
	public void deposit(int money) { // 입금 기능
		balance += money; //(balance=balance+money)
	}
}
//void 메서드의 return은 반환 될 값없이 사용되며, 메서드를 현위치에서 종료하는 명령
public class Class2 {
	public static void main(String[] args) {
		Account a = new Account();//레퍼런스변수+객체생성
		// a.balance = 50000; //  에러
		// System.out.printf("현재 잔액은 %.2f 원 입니다.\n", a.balance); //에러
		a.initBanance(100000);
		a.display();
		a.withraw(5000);  		a.display(); //출금
		a.deposit(20000); 		a.display(); // 입금
	}
}

