<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       
<%--02-3:import는 이렇게 사용  --%>
<%@ page import="java.util.Date" %> 
<%@page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!--02-2-->
<%--선언부영역:head안에 <%! %>로 표시/ 변수선언, 메서드정의(static으로 선언하지 않아도 됨)
      실행영역:body안에 <% %>로 표시--%>
<%!//변수선언                  //선언:declare
String str="안녕하세요";
int a=5, b=-5;

//메서드정의
public int abs(int n){
	if(n<0)n=-n; //n=-1*n /음수x
   return n;
}
%> 
<!--02-4-->
<%!
int global_cnt=0;
%>     
</head>
<body>
<%//jsp실행부시작
 int c=10;
 c++; a++;
 out.print(str+"<br>");
 out.print(a+"의 절대값:"+abs(a)+"<br>");
%>
<!--3-->
<%Calendar date=Calendar.getInstance(); //getInstance():싱글턴패턴,하나의 인스턴스를 공유해서 사용
SimpleDateFormat today=new SimpleDateFormat("yyyy년 MM월 dd일");////날짜를 원하는 포맷으로 파싱시켜주는 역할 
SimpleDateFormat now=new SimpleDateFormat("hh시 mm분 ss초");
%>
오늘은
<%
Date d=date.getTime(); //1970년부터 현재까지의 시간을 밀리초 단위로 환산한 값을 숫자로 반환해주는 메소드
out.print(today.format(d));
%>
입니다
지금 시각은 <%out.print(now.format(date.getTime()));%>
<br><br>
<%=str %><br>
<%=a %>의 절대값:<%=abs(a) %><br>

<!--4-->
<%
int local_cnt=0;
%>
<h1>local_cnt:<%=++local_cnt %></h1>
<h1>global_cnt:<%=++global_cnt %></h1>
<!--선언부에 선언된 변수는 전역변수와 같이 사용되어 ,jsp페이지 어디서나 사용가능,값도 유지
    또한 페이지 새로고침해도, 이전 값이 유지되는 특성이 있으며 서버가 재설정되거나 브라우져가 닫힐때까지 값이 유지되는 특성이다-->

<!--02-071...-->
<!-- 로그인 폼 제작시 action 란에 서블릿과 데이터 베이스를 이용한 로그인을 할때는 서블릿이름을 써서 이동하게 한다-->
<!-- jsp 문법으로 페이지 이동: response.sendRedirect(); -->

<!--02-061,062,063-->
<!--include 될 파일의 내용은 대상 파일에 html head tittle body 등이 있는 상태에
    중간 삽입 형태로 들어가는 것이므로 내용만 기술하여 파일을 구성한다-->

<!--02-5-->
<!--Request:주로 서버에서 정보를 요청할때 사용하는 객체,
객체의 각 정보들을 이용하여 사이트에 유용한 설정 및 실행에 이용함-->

<!--02-1-->
<!--out.print(): ' System.out.print() '와 비슷한 웹페이지 출력하는 메서드-->
</body>
</html>