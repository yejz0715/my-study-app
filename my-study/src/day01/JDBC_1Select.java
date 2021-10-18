package day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_1Select {                                          //select:검색

	public static void main(String[] args) {
	 // 자바에서 지원하는 데이터베이스연결을 위한 구성요소들과 객체를 세팅
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		String id="scott";
		String pw="tiger";
		
		Connection con =null; //Connection:연결을 위한 객체
		PreparedStatement pstmt=null;//PreparedStatement:con에 SQL 실행해주는 객체
		ResultSet rs=null; //ResultSet:sql 실행결과를 저장하는 객체
		
		try {
			Class.forName(driver);		
				con=DriverManager.getConnection(url, id, pw);
			//연결드라이버메니저가 데이터베이스 연결을 하고 연결인스턴스를 con에 전달	
				//System.out.println("성공");
				
				//데이터베이스 연결후에는 SQL명령을 사용하기 위해 String변수에 SQL명령을 준비합니다
				//데이터베이스에 제공되어질 명령이므로 String형으로 준비합니다
				String sql="select*from customer";
				
				//SQL문을 장착한 con을 pstmt에 전달합니다
				pstmt=con.prepareStatement(sql); 
				
				//pstmt=con.prepareStatement("select*from customer");
				
				//pstmt에 담겨진 SQL명령 실행하고 그 결과를 rs에 저장합니다
				rs=pstmt.executeQuery(); //executeQuery:데이터베이스에 대해 직접 SQL 쿼리를 실행
				
				System.out.println("번호 \t 이름\t\t이메일\t\t전화번호");
				System.out.println("-------------------------------------------------------------");
				
				//rs.next():최초 실행은 객체의 시작부분(데이터 없는곳)에서 첫번째 레코드로 이동하는 메서드
				//그 다음부터는 다음 레코드로 이동. rs.next()메서드가 실행될때 다음 레코드가 있으면 true, 없으면 false를 리턴
				while(rs.next()) { //결과의 처음부터 끝까지 반복 실행: 레코드 단위로 반복 실행 
					//rs.getInt():number형 필드값을 추출하는 메서드. 괄호안에 필드이름을 정확히 써야합니다.
					//필드명에 오타가 있거나 안맞으면 부적합한 열이름 이라는 에러가 발생합니다
					Integer num= rs.getInt("num"); 
					//rs.getString():varchar2형 필드값을 추출하는 메서드
					//모든 자료형에 대해 get~() 메서드가 모두 존재합니다
					String name=rs.getString("name");
					String email=rs.getString("email");
					String tel=rs.getString("tel");
					System.out.printf(" %d \t %s \t %s \t %s\n", num, name, email,tel);
				}
				
				
				
			} catch (ClassNotFoundException e) {e.printStackTrace();
			}catch (SQLException e) {e.printStackTrace();
			}
		
			try {	
				if(con!=null) con.close();
				if(pstmt!=null)pstmt.close();
				if(rs!=null)rs.close();
			} catch (SQLException e) {e.printStackTrace();
			}
		
		}
		
	}


