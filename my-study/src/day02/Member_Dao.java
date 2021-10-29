package day02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Member_Dao {
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
	public ArrayList<Member_Dto> select() {
		ArrayList<Member_Dto> list=new ArrayList<Member_Dto>();
		con = getConnection();
		
		String sql="select* from memberlist";
		
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				Member_Dto mdto =new Member_Dto();
				mdto.setMembernum(rs.getInt("membernum"));
				mdto.setName(rs.getString("name"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setBirth(rs.getDate("birth"));
				mdto.setBpoint(rs.getInt("bpoint"));
				mdto.setJoindate(rs.getDate("joindate"));
				mdto.setGender(rs.getString("gender"));
				mdto.setAge(rs.getInt("age"));				
				list.add(mdto);	
			}			
		} catch(SQLException e) {e.printStackTrace();   
		} 
		close();
		return list;
	}
	public int insert(Member_Dto mdto) {
		int result=0;
		con= getConnection();
		String sql="insert into memberlist(membernum, name, phone, birth, gender, age)"
				+"values(member_seq.nextVal, ? , ? , ? , ? , ? )";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getPhone());
			pstmt.setDate(3, mdto.getBirth());
			pstmt.setString(4, mdto.getGender());
			pstmt.setInt(5, mdto.getAge());
			
			result=pstmt.executeUpdate();			
		}catch (SQLException e) {e.printStackTrace();
		}	
	close();
	return result;
	}
	public Member_Dto getMember(int membernum) {
		Member_Dto mdto=null;
		con = getConnection();
		String sql="select*from memberlist where membernum=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, membernum);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				mdto=new Member_Dto();
				mdto.setMembernum(rs.getInt("membernum"));
				mdto.setName(rs.getString("name"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setBirth(rs.getDate("birth"));
				mdto.setBpoint(rs.getInt("bpoint"));
				mdto.setJoindate(rs.getDate("joindate"));
				mdto.setGender(rs.getString("gender"));
				mdto.setAge(rs.getInt("age"));
			}
		}catch (SQLException e) {e.printStackTrace();
		}
		close();
		return mdto;
	}
	public int update(Member_Dto newDto) {
		
		int result=0;
		con= getConnection();
		String sql="update  memberlist set name=?, phone=?, birth=?, bpoint=?, "
				+"joindate=?, gender=?, age=? where membernum=?";				
		try {
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, newDto.getName());
			pstmt.setString(2, newDto.getPhone());
			pstmt.setDate(3, newDto.getBirth());
			pstmt.setInt(4, newDto.getBpoint());
			pstmt.setDate(5, newDto.getJoindate());
			pstmt.setString(6, newDto.getGender());
			pstmt.setInt(7, newDto.getAge());
			pstmt.setInt(8, newDto.getMembernum());
			
			result=pstmt.executeUpdate();			
		}catch (SQLException e) {e.printStackTrace();
		}	
	close();
	return result;
	}
	public void delete(String num) {
		con=getConnection();
		String sql="delete from memberlist where membernum=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(num));
			pstmt.executeUpdate();
			}catch(SQLException e) {e.printStackTrace();
			}
			close();
			
	}
}