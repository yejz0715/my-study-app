package day09_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class List_Dao {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	    Connection con = null;  
	    PreparedStatement pstmt = null; 
		ResultSet rs = null; 
		
		public  Connection getConnection() {
			Connection con=null;
			try {
			  Class.forName(driver);
			  con = DriverManager.getConnection(url, "scott", "tiger");
			    } catch (ClassNotFoundException e) {e.printStackTrace();
				} catch (SQLException e) {e.printStackTrace(); }	
			return con;
		}	
		public void close() {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			}catch (SQLException e) {e.printStackTrace();
		 }	
	   }
		public ArrayList<List_Dto> select() {
			ArrayList<List_Dto>list=new ArrayList<List_Dto>();
			con=getConnection();
			String sql="select * from List";
			
			try {
				pstmt=con.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					List_Dto ldto=new List_Dto();
					ldto.setName(rs.getString("name"));
					ldto.setAge(rs.getInt("age"));
					ldto.setPhone(rs.getString("phone"));
				}
			}catch(SQLException e) {e.printStackTrace();   
			} 
			close();
			return list;
		}
		public int insert(List_Dto ldto) {
			int result=0;
			String sql="insert into List value(?,?,?)";
			con=getConnection();
			try{
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, ldto.getName());
				pstmt.setInt(2, ldto.getAge());
				pstmt.setString(3, ldto.getPhone());
				result=pstmt.executeUpdate();
			}catch (SQLException e) {e.printStackTrace();  }	
			close();			
		return result;
		}
		




}
