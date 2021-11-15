<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
Connection con = null;
PreparedStatement pstmt = null;
String driver = "oracle.jdbc.driver.OracleDriver";
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String uid = "scott";
String pass = "tiger";
String sql = "insert into mem(id, name, pwd, phone) values(?,?,?,?)";

String name = request.getParameter("name");
String userid = request.getParameter("userid");
String pwd = request.getParameter("pwd");
String phone = request.getParameter("phone");

try{
	Class.forName(driver);
	con = DriverManager.getConnection(url, uid, pass);
	
	pstmt = con.prepareStatement(sql);
	pstmt.setString(1, userid);
	pstmt.setString(2, name);
	pstmt.setString(3, pwd);
	pstmt.setString(4, phone);
	
	pstmt.executeUpdate();
} catch( Exception e){
	e.printStackTrace();
} finally{
	try {
		if (pstmt != null) pstmt.close();
		if (con != null)	con.close();
	} catch (Exception e) {	e.printStackTrace();	}
}

response.sendRedirect("MemberMGR.jsp");
//MemberMGR.jsp로 이동 
%>




