package day03;
//Dto:Data Transfer Object 다른말로 JAVA Bean
//dto에 데이터를 저장
public class Book_Dto {  
	private int booknum;
	private String subject;
	private int makeyear;
	private int inprice;
	private int rentprice;
	private String grade;

	//객체지향 프로그래밍에서 객체 데이터를 외부에서 읽고 변경시 객체의 무결성이 깨질수 있기 때문에
	//객체 외부에서 직접적으로 접근하는 것을 먹는다 ex)자동차속도 음수x-외부에서 음수로 설정하면 객체 무결성이 깨짐
	//따라서 객체 지향 프로그래밍에서는 메소드를 통해 데이터를 변경하는 방법을 선호

	//데이터는 외부에서 접근하지 않도록 막고, 메소드는 공개해서 
	//외부에서 메소드를 통해 데이터에 접근하도록 유도한다 이 역할을 메소드 Setter

	//외부에서 객체의 데이터를 읽을때 메소드를 사용하는건 메소드 Getter
	//(객체 외부에서 객체 필드값을 사용하기 부적절한 경우 메소드로 필드값을 가공 후, 외부로 전달)
	
	// 마우스 오른쪽 버튼 -> Source -> Generate Getters and Setters 
    // Select All 클릭 -> Generate 클릭	
	
	
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMakeyear() {
		return makeyear;
	}
	public void setMakeyear(int makeyear) {
		this.makeyear = makeyear;
	}
	public int getInprice() {
		return inprice;
	}
	public void setInprice(int inprice) {
		this.inprice = inprice;
	}
	public int getRentprice() {
		return rentprice;
	}
	public void setRentprice(int rentprice) {
		this.rentprice = rentprice;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}

