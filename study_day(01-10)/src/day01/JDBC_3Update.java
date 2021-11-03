package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_3Update {                                 //update:수정

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";		
		Connection con =null; //연결을 위한..
		PreparedStatement pstmt=null; //실행을 위한..

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, "scott", "tiger"); //driver,id,pw 직접입력
			//System.out.println("연결성공");
            Scanner sc=new Scanner(System.in); //입력할꺼니깐 스캐너 만들어줌
			
			System.out.print("수정할 회원의 번호를 입력하세요:");
			String num=sc.nextLine();
			
			System.out.print("수정할 항목을 선택하세요. 1.이메일 2.전화번호");
			String input=sc.nextLine();
			
			String sql=""; //string을 이용해 sql변수만듦
			switch(input) { //switch이용 1번이면 2번이면
			case "1":
			System.out.print("수정할 이메일을 입력하세요");
			String email=sc.nextLine();                       //sql: update-set (수정)
			sql="update customer set email=? where num=?";    //update 테이블명 set 필드명(이메일)이냐 where 필드명(num)이냐
			pstmt=con.prepareStatement(sql);   //sql장착한 con을 pstmt로 전달             
			pstmt.setString(1, email);
			pstmt.setInt(2,Integer.parseInt(num)); //num은 전화번호를 뜻하는게 아니고 수정할 번호가 1번이냐 아님 다른번호냐를 뜻하는 num임
			break;
			case "2":
				System.out.print("수정할 전화번호 입력하세요");
				String tel=sc.nextLine();
				sql="update customer set tel=? where num=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, tel);
				pstmt.setInt(2,Integer.parseInt(num));
				break;
			}
		int result=pstmt.executeUpdate();         //executeUpdate: sql명령이 정상 동작1, 실패 0
		if(result==1)System.out.println("수정성공");
		else System.out.println("수정실패");
	
				
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (SQLException e) {e.printStackTrace();
		} try {	
			if(con!=null) con.close();
			if(pstmt!=null)pstmt.close();			
		} catch (SQLException e) {e.printStackTrace();}
						
	}

}
