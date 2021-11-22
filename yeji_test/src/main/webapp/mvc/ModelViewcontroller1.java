package yeji_test;
public class ModelViewcontroller1 {
/*
 mvc 패턴구현 : 소프트웨어 디자인 패턴으로 비즈니스 처리 로직과
              사용자 인터페이스를 구분하여 개발하기 위해 사용 스프링도 mvc패턴 기반인 프레임워크
 m model (dao) : 데이터 관리, 비즈니스로직을 처리하는 구간 /사용자의 요청이 들어오면 단순히 그에 맞는
                 로직처리만 수행/데이터가 어디에 사용되는지, 사용자들에게 어떻게 표현하는지 관심x 
 v view  (jsp) : 사용자 인터페이스가 표현되는 구간/ 모델로부터 전달받은 데이터를 사용자에게 보여줌 어떤 데이터가 넘어왔는지 관심x 
               사용자에게 보여지는 화면을 구성하는 단위기때문에 다수의 view존재함
 c controller (서블릿) : model과 view는 서로 통신이 될수 없기 때문에 그 둘의 연결을 위한 역할
                      view를 통해 사용자의 요청이 들어오면 controller에 알려주고 controller는 해당요청을 model에 알려 비즈니스로직 처리
 
 이렇게 사용자는 요청한 데이터로 구성된 화면을 제공받을수있다 
 
 mvc패턴은 model과 view의 의존관계로 인한 한계가 존재한다 
 
 순서
 1 클라이언트->서블릿:브라우저에서 mem.do로 요청
 2 서블릿->dao:membercontroller서블릿이 요청받고 memberdao의 listmembers()메서드 호출
 3 dao->db:memberdao의 listmembers()메서드에서 sql문으로 회원정보를 조회
 4 db->vo->서블릿:조회된 정보를 membervo에 설정하여 반환
 5 서블릿->jsp:membercontroller가 받은 정보를 listmembers.jsp로 전송
 6 jsp->클라이언트:listmembers.jsp가 결과를 클라이언트의 화면에 출력
 컨트롤러역할을 하는 서블릿인 membercontroller클래스에서 memberdao객체를 초기화하고 그의
 listmembers()메서드를 호출하여 회원정보를 arraylist로 반환받는다
  */
}
