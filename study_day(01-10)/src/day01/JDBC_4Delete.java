package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_4Delete {                         //delete:삭제

	public static void main(String[] args) {		
		Connection con =null;  //연결
		PreparedStatement pstmt=null; //실행

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			//System.out.println("연결성공");
			
            Scanner sc=new Scanner(System.in); //입력위한 스캐너
			
			System.out.print("삭제할 번호를 선택하세요:");
			int num=sc.nextInt();
			String sql="delete from customer where num=?"; //sql문 제작 delete from 테이블명 where 숫자?
			pstmt=con.prepareStatement(sql); //sql장착한 con을 pstmt에 전달함
			pstmt.setInt(1, num);             //번호입력하면			
			int result=pstmt.executeUpdate(); //삭제실행
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (SQLException e) {e.printStackTrace();
		} try {	
			if(con!=null) con.close();
			if(pstmt!=null)pstmt.close();			
		} catch (SQLException e) {e.printStackTrace();}
						
	}

}
