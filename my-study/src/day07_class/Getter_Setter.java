package day07_class;
/*
 멤버메서드의 주된 목적은 멤버변수의 값을 세팅하거나, 얻어오는것이다.
 때문에 멤버메서드의 별도의 사유가 없어도 멤버변수에 따라 필요한만큼 만들고 시작하는 경우가 많다
 두개의 메서드 setter, getter  
 */

class GetSetTest{
	private int num; //클래스의 멤버필드는 private으로
	private double dou;
	private String str;
	
 //멤버변수가 만들어지면 그변수에 값을 세팅할 수 있는 메서드와 값을 얻어낼 수 있는 메서드 생성
 //getter, setter 자동생성
 //마우스 우클릭 -> Source-> Generate Getters and Setters 선택->select all-> generate	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDou() {
		return dou;
	}
	public void setDou(double dou) {
		this.dou = dou;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
}
 public class Getter_Setter {
	public static void main(String[] args) {
	  GetSetTest gs=new GetSetTest(); //레퍼런스변수 + 객체생성	
      gs.setNum(12345);
      int n=gs.getNum();
      System.out.println("멤버변수 num의 값은 " + n + " 입니다");
	}
}
