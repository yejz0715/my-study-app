package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class JDBC_2Insert {                                     //insert:추가

	public static void main(String[] args) {
//		String url="jdbc:oracle:thin:@localhost:1521:xe";
//		String driver="oracle.jdbc.driver.OracleDriver";
//		String id="scott";
//		String pw="tiger";
		
		Connection con =null;         //연결
		PreparedStatement pstmt=null; //실행
		//insert 명령의 경우 결과값이 따로 없어서 ResultSet (저장)은 사용하지 않습니다
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//driver 직접입력
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");//(url,id,pq) 직접입력
			//System.out.println("연결성공");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("저장할 번호를 입력하세요:");
			String num=sc.nextLine();
			System.out.print("이름를 입력하세요:");
			String name=sc.nextLine();
			System.out.print("이메일를 입력하세요:");
			String email=sc.nextLine();
			System.out.print("전화번호를 입력하세요:");
			String tel=sc.nextLine();
			
			//추가:insert into customer values(5, '김하나', 'abc6@abc.com', '010-6234-6234')
			//sql: insert-into
		    //옛날방식
			/*String sql="insert into customer values( " +num+ ","
					+"'" + name+ "',"
					+"'" + email+ "',"
					+"'"+tel+"')"; */
			
//요즘방식 //insert into CUSTOMER(테이블명) values(1, '홍길동', 'abc1@abc.com', '010-1234-5234');	
		String sql="insert into customer values(?,?,?,?)";  
	//spl명령을 사용하기 위해 변수 String.	
		//SQL명령을 먼저 장착하고
		pstmt=con.prepareStatement(sql); //sql을 장착한 con을 pstmt에 전달
		//?의 순서 맞춰서 해당 데이터를 세팅
		pstmt.setInt(1, Integer.parseInt(num)); //Integer:정수 /parseInt:문자열을 숫자로 변환해준다
		pstmt.setString(2, name);
		pstmt.setString(3, email);
		pstmt.setString(4, tel);
		
		//SQL select 명령만 excuteQuery 를 사용하고, 나머지는 extcuteUpdate 메서드를 사용합니다
		//extcuteUpdate의 결과는 sql명령이 정상 동작했을때 1, 실패했을때 0 이 리턴됨
		
		int result=pstmt.executeUpdate();  //레코드 추가 성공 실패를 저장할 변수
		if(result==1)System.out.println("레코드 추가 성공");
		else System.out.println("레코드 추가 실패");
		
		} catch (ClassNotFoundException e) {e.printStackTrace();
		}catch (SQLException e) {e.printStackTrace();
		}
	
		try {	
			if(con!=null) con.close();
			if(pstmt!=null)pstmt.close();
			
		} catch (SQLException e) {e.printStackTrace();}
	}

}
