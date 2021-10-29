<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--02-081..-->
<!-- 폼을 통하지 않고 페이지 이동시에 자료를 전달할 수 있는 객체 : Forward -->
<!-- request 객체는 Attribute라는 저장소가 있다
전달할 데이터를 Attribute에다가 각 자료의 이름을 같이 저장하고, forward(이동)하면
목적지에 해당 데이터가 같이 이동함
  
Attribute 라는 저장소에 name 이라는
이름으로 "홍길동"을 저장해두고 083_ForwaedResult.jsp로 이동(forward)
083_ForwaedResult.jsp 에서는 이전 페이지에서 보내준 request와 response를 아용해서
저장해둔 name 값을 꺼내 사용할수가 있다
저장 메서드:setAttribute() 추출메서드:getAttribute()
  
 파리미터 저장
request.setAttribute("name", "홍길동");
 포워드를 위한 객체 생성 및 이동 페이지 설정
RequestDispatcher dp=request.getRequestDispatcher("083_ForwardResult.jsp");
 현재의 request와 response를 갖고 목적지로 이동
dp.forward(request, response);
 현재 페이지의 request객체의 수명은 forward로 전달될 다음 페이지까지
 보통파라미터를 통해서 정보를 전달하고 request.getParmeter()를 사용하여 전달된값을
 추출하여 사용하지만, 위의 RequestDispatcher 는 전달인수대신 request 내부의
 Attribute 를 사용하여 전달인자를 저장하고, 수명을 다할지 모를 이전페이지의 request 와
 response 를 전달인수로 전달하여 forward 라는 명령으로 페이지를 이동한 다음
 이동한 페이지에서 Attribute 를 사용하게 함 -->

<!--Attribute 에 저장형식은 모든 클래스의 부모 클래스인 Object 형태로 저장되므로, 
다시 값을 추출할때 강제 캐스팅이 필요함
forward 방식으로 이동된 페이지는 한글에 대한 인코딩 작업이 필요가 없다-->

<!--02-091..-->
<!--각 객체의 수명
pageContext : 현재페이지까지
    request : 다음 페이지까지 - forward 에 의해 연장될 수 있음
    session : 브라우져가 닫힐때까지
application : 서버가 꺼지거나 리셋될때까지-->

<!--02-101..-->

<!-- 프로그래밍 명령등의 로직과 알고리즘이 공개되는것이 부담스럽거나, 자료이동을
감추고 싶다면 위와 같은 서블릿에 그 동작을 일임하듯 이름 불러 사용 
Forward_useServlet : 서블릿의 이름-->

<!-- 사용할 서블릿의 위치는 파일들이 저장되는 최상단 위치이기때문에 현재 페이지에서의 
상대 위치는 ( ../ )로 연결하여 지정 
                   action="../Forward_useServlet"-->

</body>
</html>