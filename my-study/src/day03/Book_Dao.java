package day03;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//Dao:Database Access Object :db에 접근하는 객체(데이터조회, 조작등의 기능을 전담하도록 만든 오브젝트)

public class Book_Dao {
	//자바에서 데이터베이스 연결을 위한 구성요소들과 객체
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";	
	 Connection con = null;    //데이터베이스와 연결
    PreparedStatement pstmt = null; //con에 sql 실행
	ResultSet rs = null; 	   //sql 실행결과를 저장

	public  Connection getConnection() {  //데이터베이스 연결
		Connection con=null;
		try {
		  Class.forName(driver);
		  con = DriverManager.getConnection(url, "scott", "tiger");
		  //연결드라이버메니저가 데이터베이스 연결하고, 연결해준 인스턴스를 con에 저장
		    } catch (ClassNotFoundException e) {e.printStackTrace();//예외-오류
			} catch (SQLException e) {e.printStackTrace(); }	  //예외-오류
		return con;
	}	
	public void close() {              //데이터베이스 연결끊기
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch (SQLException e) { e.printStackTrace();	}			
	}
	
	public ArrayList<Book_Dto> selectAll() {
		//데이터베이스에서 booklist테이블 조회후 리터		
		//무엇이든 담을수 있는 ArrayList인데 아래는 Book_Dto객체만 담을수 있는 제네릭문법을 사용하였습니다
		ArrayList<Book_Dto> list= new ArrayList<Book_Dto>();		
		String sql="Select * from booklist order by booknum desc";
	//sql명령을 사용하기 위해 string변수 sql에 sql명령 전달
		con=getConnection();		
		try {		
		pstmt=con.prepareStatement(sql);
	//sql을 장착한 con을 pstmt에 전달	
		rs=pstmt.executeQuery();//데이터베이스에 대해 직접 sql쿼리에 저장
	//pstmt에 담겨진 sql명령을 실행하고 rs에 저장	
		while(rs.next()){ //데이터가 없는곳에서 시작해서 첫번째레코드로 이동하는 메소드:rs.next()
			int booknum=rs.getInt("booknum");
			          //넘버형 필드값 추출
			String subject=rs.getString("subject");
			int makeyear=rs.getInt("makeyear");
			int inprice=rs.getInt("inprice");
			int rentprice=rs.getInt("rentprice");
			String grade=rs.getString("grade");
			
			Book_Dto bdto=new Book_Dto(); //각 레코드가 이 객체에 담겨짐
			bdto.setBooknum(booknum);
			bdto.setSubject(subject);
			bdto.setMakeyear(makeyear);
			bdto.setInprice(inprice);
			bdto.setRentprice(rentprice);
			bdto.setGrade(grade); 
			
			//반복이 실행될때마다 new Book_Dto() 로 만들어진 객체가 add되므로 각 레코드들이 담기는것과
			//같은 효과를 볼수있습니다
			list.add(bdto);	 //레코드가 담겨있는 dbto를 list에 장착
		}

		}catch (SQLException e) {e.printStackTrace();    } 
	close();	
	return list;
}
			
	public int insert( Book_Dto bdto ) {
		 int result=0; //레코드 추가 성공 실패를 저장할 변수		 
		 String sql="insert into booklist values(book_seq.nextVal, ?, ?, ?, ?, ?)";	
		//sql명령을 사용하기 위해 string변수-sql에 sql명령 전달
		 con=getConnection();
		 try {				
				pstmt=con.prepareStatement(sql);
				//sql장착한 con이 pstmt에 전달
				pstmt.setString(1, bdto.getSubject());
				pstmt.setInt(2, bdto.getMakeyear());
				pstmt.setInt(3, bdto.getInprice());
				pstmt.setInt(4, bdto.getRentprice());
				pstmt.setString(5, bdto.getGrade());
				result=pstmt.executeUpdate();	//레코드추가-성공,실패를 저장할 변수에 전달		 
			} catch (SQLException e) {e.printStackTrace();  }	
			close();			
		return result;
	
	}
	public void delete(String num) {
		con=getConnection();
		String sql="delete from booklist where booknum=?";
		try {
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(num));
		pstmt.executeUpdate();
		}catch(SQLException e) {e.printStackTrace();
		}
		close();
		
	}
	public Book_Dto getDto(String booknum) {
		Book_Dto bdto=null;
		con=getConnection();
		String sql="select*from booklist where booknum=?";
		
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, booknum);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				bdto=new Book_Dto();
				bdto.setBooknum(rs.getInt("booknum"));
				bdto.setSubject(rs.getString("subject"));
				bdto.setMakeyear(rs.getInt("makeyear"));
				bdto.setInprice(rs.getInt("inprice"));
				bdto.setRentprice(rs.getInt("rentprice"));
				bdto.setGrade(rs.getString("grade"));
			}
			
			}catch(SQLException e) {e.printStackTrace();
			}
		close();
		return bdto;		
	}
	
	public void update(Book_Dto newDto) {
		con=getConnection();
		String sql="update booklist set subject=?, makeyear=?,  "
				+"inprice=?, rentprice=?, grade=? where booknum=?";
		try {
			pstmt=con.prepareStatement(sql);			
			pstmt.setString(1, newDto.getSubject()); //newDto:수정한 항목들 저장
			pstmt.setInt(2, newDto.getMakeyear());
			pstmt.setInt(3, newDto.getInprice());
			pstmt.setInt(4, newDto.getRentprice());
			pstmt.setString(5, newDto.getGrade());
			pstmt.setInt(6, newDto.getBooknum());	
			pstmt.executeUpdate();
		} catch (SQLException e1) {e1.printStackTrace();  }	
		close();			
		
	}
	
	
	
}