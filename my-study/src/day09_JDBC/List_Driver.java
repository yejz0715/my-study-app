package day09_JDBC;

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
		// TODO Auto-generated method stub
		
	}

	private static void insert() {
		// TODO Auto-generated method stub
		
	}

	private static void update() {
		// TODO Auto-generated method stub
		
	}

	private static void delete() {
		// TODO Auto-generated method stub
		
	}

	

}
