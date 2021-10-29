package day09_JDBC;

import java.util.ArrayList;
import java.util.Scanner;


public class List_Driver {

	public static void main(String[] args) {
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("\n---메뉴 선택---");
			System.out.printf("1.데이터추가");  System.out.printf("2.데이터열람");
			System.out.printf("3.데이터수정");  System.out.printf("4.데이터삭제");
			System.out.println("5.프로그램 종료");  System.out.print(">>메뉴선택:");
		    String choice=sc.nextLine();
		    if(choice.equals("5")) break;
		    switch (choice) {
			case "1": insert(); break;
			case "2": select(); break;
			case "3": update(); break;
			case "4": delete(); break;
			default:System.out.println("잘못입력했습니다");				
			}
		    System.out.println("프로그램종료");
		}

		
	}

	private static void select() {
		List_Dao ldao=new List_Dao();		
		ArrayList<List_Dto>list=ldao.select();
		System.out.println("\t 이름\t\t나이\t 전화번호");
		System.out.println("----------------------------------------------------");	
	for(List_Dto dto:list) {
		System.out.printf("%s\t%d\t%s",
				dto.getName(), dto.getAge(), dto.getPhone() );		
	  }	
	}

	private static void insert() {
		List_Dao ldao=new List_Dao();
		Scanner sc=new Scanner(System.in);
		List_Dto ldto=new List_Dto();
		
		System.out.print("이름을 입력하세요");
		ldto.setName( sc.nextLine());
		
		System.out.print("나이를 입력하세요");
		ldto.setAge( sc.nextInt());
		
		System.out.print("전화번호를 입력하세요");
		ldto.setPhone( sc.nextLine());
		
		int result=ldao.insert(ldto);
		if(result==1 )System.out.println("레코드 추가 성공");
		   else System.out.println("레코드 추가 실패");	
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void delete() {
		// TODO Auto-generated method stub
		
	}

	

}
