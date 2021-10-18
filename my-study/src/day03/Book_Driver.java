package day03;

import java.util.ArrayList;
import java.util.Scanner;

public class Book_Driver {

	public static void main(String[] args) {
	
		while(true) {                          //while문으로 메뉴만들기
		Scanner sc=new Scanner(System.in);
		System.out.println("\n---메뉴 선택---");
		System.out.printf("1.데이터추가");
		System.out.printf("2.데이터열람");
		System.out.printf("3.데이터수정");
		System.out.printf("4.데이터삭제");
		System.out.println("5.프로그램 종료");
		System.out.print(">>메뉴선택:");
		String choice=sc.nextLine();	//equals():객체끼리 내용을 비교할수있는 메소드
		if(choice.equals("5")) break;  //5번 누르면 종료 다른번호누르면 계속 반복		
		switch(choice) {                      //switch로 번호를 선택할 수 있게 만듦
		case "1":		
			      insert();         break;			
		case "2":
			     select();			break;			
		case "3":
			    update();           break;			
		case "4":
			delete();               break;			
	    default:      //   //case1~4번이아니면./ 생략가능 
	    	System.out.println("잘못입력했습니다.");			
		}
	}
      System.out.println("프로그램종료");
}
	private static void update() {
		Book_Dao bdao=new Book_Dao();
		Scanner sc=new Scanner(System.in);
		//수정할 도서번호를 입력받습니다
		String booknum;
		while(true) {
			System.out.println("수정할 도서번호를 입력하세요(필수):");
			booknum=sc.nextLine();
			if(!booknum.equals(""))break;
			else System.out.println("도서번호 입력은 필수입니다");
//if( booknum.equals("") ) System.out.println("도서번호 입력은 필수 입니다"); 
//			else break;	 이렇게도 가능		
		}	
		//입력받은 도서번호로 도서를 조회해서 oldDto객체에 저장해둡니다. 원본데이터의 로딩
		Book_Dto oldDto=bdao.getDto(booknum);
		
		//입력받은 도서번호가 Booklist에 없다면(이말은 위에서 리턴 받은 oldDto 가 null),
		//조회한 도서번호에 해당도서가 없습니다. 라고 출력하고 실행종료
		if(oldDto==null) {
			System.out.println("입력하신 도서번호로 조회된 도서가 없습니다");
		return;
		}
		Book_Dto newDto=new Book_Dto();
		//dao의 update메서드에 전달할(수정할 내용이 담길)객체에 입력받은 도서번호를 저장합니다
		newDto.setBooknum(Integer.parseInt(booknum));
		
		
		//수정할 항목들을 하나하나 전부 다 입력받고 newDto에 저장합니다.	
		//다만 입력받은 내용이 없다면(빈칸이라면, 엔터만 눌렀다면)
		//새로 고쳐질 데이터가 저장될 객체에 원본데이터로 해당필드를 대체합니다
		//도서제목
		System.out.printf("수정할 도서의 제목을 입력하세요:");
		String subject=sc.nextLine();
		if(subject.equals("")) newDto.setSubject(oldDto.getSubject() );
		else newDto.setSubject(subject);
		//출판년도
        System.out.printf("수정할 도서의 제작년도를 입력하세요:");
        String makeyear=sc.nextLine();
		if(makeyear.equals("")) newDto.setMakeyear(oldDto.getMakeyear());
		else newDto.setMakeyear(Integer.parseInt(makeyear));
		//입고가격
		 System.out.printf("수정할 도서의 입고가격을 입력하세요:");
	        String inprice=sc.nextLine();
			if(inprice.equals("")) newDto.setInprice(oldDto.getInprice());
			else newDto.setInprice(Integer.parseInt(inprice));
			//대여가격
			 System.out.printf("수정할 도서의 대여가격을 입력하세요:");
		        String outprice=sc.nextLine();
				if(outprice.equals("")) newDto.setRentprice(oldDto.getRentprice());
				else newDto.setRentprice(Integer.parseInt(outprice));
				//등급
				 System.out.printf("수정할 도서의 등급을 입력하세요:");
			        String grade=sc.nextLine();
					if(grade.equals("")) newDto.setGrade(oldDto.getGrade());
					else newDto.setGrade(grade);
		
		//그리고 bdao.update(newDto); 를 실행해서 수정합니다
		bdao.update(newDto);
		
	}
	private static void delete() {
		Book_Dao bdao = new Book_Dao();
		//삭제할 번호를 입력받고, 그 번호를 전달인수로 해서 dao에 delete()메서드를 호출합니다
		Scanner sc=new Scanner(System.in);
		System.out.print("삭제할 도서번호를 입력하세요");
		String num=sc.nextLine();
		bdao.delete(num);
	}
	
	private static void select() {    //1select 조회
		Book_Dao bdao=new Book_Dao();
		//데이터 열람명령이 입력되면, Book_Dao 클래스의 객체를 만들고, 그안의 멤버메서드 중
		//데이터를 모두 조회해서 리턴해줄수 있는 메서드호출-리턴된 결과를(list) 화면에 출력
		ArrayList<Book_Dto> list = bdao.selectAll();
		//리턴된 list로 화면에 출력
		System.out.println("도서번호 \t 출판번호\t입고가격\t대여가격\t등급\t\t제목");
		System.out.println("------------------------------------------------------------");
		for(Book_Dto dto: list) { // list 에 있는 Book_Dto 객체가 dto 변수에 하나씩 담기며 반복실행
		//dto.getBooknum():도서번호
			System.out.printf("%d\t %d \t %d \t %d \t %s \t %s\n",
			dto.getBooknum(), dto.getMakeyear(), dto.getInprice(),
			dto.getRentprice(), dto.getGrade(), dto.getSubject());		}
	}

	private static void insert() {    //2insert 추가
		Scanner sc= new Scanner(System.in); //입력할 스캐너
		Book_Dao bdao=new Book_Dao();   
		
		Book_Dto bdto=new Book_Dto();	
		System.out.print("제목을 입력하세요");
		String subject=sc.nextLine();
		bdto.setSubject(subject);		
		System.out.print("출판년도를 입력하세요");
		//String makeyear=sc.nextLine();
		bdto.setMakeyear(Integer.parseInt(sc.nextLine() ));	//Integer.parseInt():문자열을 숫자로 변환
		System.out.print("입고가격을 입력하세요");
		bdto.setInprice(Integer.parseInt(sc.nextLine() ));	
		System.out.print("대여가격을 입력하세요");
		bdto.setRentprice(Integer.parseInt(sc.nextLine() ) );	
		System.out.print("등급을 입력하세요(all, 13, 18):");
		bdto.setGrade(sc.nextLine() );			
	   int result=bdao.insert(bdto);	   
	   if(result==1 )System.out.println("레코드 추가 성공");
	   else System.out.println("레코드 추가 실패");		
	}
}
