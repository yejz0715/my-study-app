
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--01-1-->
<!--jsp:서버에서 계산하거나 처리할 명령을 써서 실행시키고, 그 결과가 웹페이지에 표시된다-->
<!--HTML페이지 구성중 JSP컨텐츠가 중간에 나와야한다면 필요한곳에 JSP명령을 쓴다-->
<%-- HTML문법사이에 JSP문법이 껴들어 코딩될때 <%JSP명령 %>사용  --> --%> <%-- 주석은 이렇게--%> 
<%-- 웹페이지에 출력되려면 <%= %>쓰고 변수명이나 출력할내용을 쓴다 --%>
<h1>현재시간:<%=new java.util.Date() %></h1>
<!--화면에 ->현재시간:Wed Oct 20 00:13:57 KST 2021  -->
  
<!--클라이언트의 요청을 받으면 해당파일(~.jsp)이 클라이언트로 전송되어 웹브라우저에 표시되게되는데 
그전에 jsp명령은 이미 실행되어서 결과만 html태그와 같이 파일로 저장되어 서버에 보관됨  -->

<!--01-2-->
<%
int sum=0;
  for(int i=1; i<=100; i++){
  sum+=i; }  
%>     <!--jsp 명령이 다 끝나고  -->
<h2><%=sum %></h2><!--html요소가 나옴 전체의 합, 하나만나옴 :5050 -->

<%
  sum=0;
  for(int i=1; i<=100; i++){
  sum+=i;
%>
<h3><%=sum %></h3> <!--jsp명령사이에 html 요소-->
<%
}/* jsp명령사이에 html요소가 중간에 껴들어서 jsp영역을 끝내고 해당내용을 기술하고 
	다시 jsp시작 그래서 답에 1~5050까지 나옴 1,3,6,10,15,21...5050 */
%>

<!--01-3-->
<!--하나의 작업(회원가입,로그인..)을 구성하기위해 입력란,선택란들은 작업단위별로 from태그안에 넣어서 사용 -->
<from name="reg_frm" action="03_Action_to.jsp" method="post">
<!--name:스크립트에서 다른것과 구분하여 명령하기 위한 이름 사용
  action:입력란,선택란에 입력하고 선택한 내용이 파일로 전달된다
  method:전달방식 get:일반전송, post:비공개전송(주소는 똑같이 나오고 선택,입력한 내용이 get은 나오지만 post엔 안나옴)-->

<!--label:인터페이스(UL)요소의 라벨을 정의할때 사용  -->
<label for="id">아이디</label><span style="color:red";>*</span> 
<input type="text" id="id" name="id" value="">
<!--텍스트타입/id,nama=id/빈칸으로 표시됨  -->
<label for="pwd">비밀번호</label><span style="color:red";>*</span> 
<input type="password" id="pwd" name="pwd" value="">
<input type="submit" value="회원가입">
<!--form태그안에 submit버튼을 이용하는것이 아니라
필요에 따라 일반버튼으로 이동할때, 이동주소에 전달값을 붙여 이동
링크될 주소-http://주소/경로/파일이름.jsp?전달name1=전달값1&전달name2=전달값2... -->
<%
  String id=request.getParameter("id"); //request:html 폼 요소의 선택값등 사용자 입력정보를 읽으려함
  String pwd=request.getParameter("pwd");//pwd와 같은 매개변수의 값을 가져옴
%>
아이디:<%=id %>
비밀번호:<%=pwd %>
<!--request객체:웹 브라우저의 요청 정보를 저장하고 있는 객체 
request.getParameter("name"); :결과값의 id을 얻어옴  -->

<!--01-4-->
  <!--getParameterValues:이름이 item인 모든 파라미터의 값을 배열로 구함/ 존재하지 않을 경우 null을 리턴-->
<% String items[] = request.getParameterValues("item");
if(items == null){ %>	
<h3>선택할 항목이 없습니다</h3>

<% }else{ %>
<h3>선택한 항목입니다</h3>

<% for(String it=items) {%>
   <%=it %>&nbsp;&nbsp;
<%
    }
}  
%>

<!--01-6-->
<table cellspacing="1" bgcolor="black" width="500">
<!-- 테이블 셀간의 간격:1 /배경색:검정 / 너비:500 -->
<%for(int i=1; i<=5; i++){ %>     <!--i는 1부터 5까지 하나씩 증가  -->
   <tr bgcolor="white" height="80"> <!--tr:table row:테이블 가로줄은 화이트, 높이80  -->
   
   <%for(int j=1; j<=5; j++){ %>  <!--j는 1부터 5까지 하나씩 증가  -->
    <td><%=i %>행<%=j %>열</td>  <!--td:table data:테이블 셀(칸)에 입력 i는 행, j는 열 -->
    <%} %>
    </tr>
    <%} %>

</table>
</body>
</html>