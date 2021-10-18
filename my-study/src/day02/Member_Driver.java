package day02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Member_Driver {

	public static void main(String[] args) throws ParseException {
		while(true) { 
			Scanner sc=new Scanner(System.in);
			System.out.println("\n---메뉴 선택---");
			System.out.printf("1.데이터추가");  System.out.printf("2.데이터열람");
			System.out.printf("3.데이터수정");  System.out.printf("4.데이터삭제");
			System.out.println("5.프로그램 종료");  System.out.print(">>메뉴선택:");
			String choice=sc.nextLine();	
			if(choice.equals("5")) break;  //5번 누르면 종료 다른번호누르면 계속 반복		
			switch(choice) {
			case "1": insert();         break;			
			case "2": select();			break;			
			case "3": update();         break;			
			case "4": delete();         break;			
		    default:  System.out.println("잘못입력했습니다.");			
			}
		}
	      System.out.println("프로그램종료");
	 }
	//1Dto부터 제작, Select의 명령에 따라 Dao도 제작
    private static void select() {
		Member_Dao mdao=new Member_Dao();
		//ArrayList<Member_Dto> list=new ArrayList<Member_Dto>();
		//list=mdao.select();
		
		//ArratList<Member_Dto> list=null;
		//list=mdao.select();
		
		ArrayList<Member_Dto> list=mdao.select();
		System.out.println("번호\t 이름\t\t전화\t 생일\t\t 포인트\t\t나이\t성별 \t가입일");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		for(Member_Dto dto : list) {
			System.out.printf("%d\t%s \t %s \t %s \t %6d \t %3d \t %s \t %s\n",
					dto.getMembernum(), dto.getName(), dto.getPhone(),
					dto.getBirth(), dto.getBpoint(), dto.getAge(), dto.getGender(),
					dto.getJoindate() );
		}	
	}

	private static void insert() {
		Member_Dao mdao=new Member_Dao();
		Scanner sc=new Scanner(System.in);
		Member_Dto mdto=new Member_Dto();
		
		//회원번호는 Sequence를 이용
		//이름 입력
		System.out.print("이름을 입력하세요");
		mdto.setName( sc.nextLine());
		//전화번호 입력
		System.out.print("전화번호를 입력하세요");
		mdto.setPhone( sc.nextLine());
		//생일 입력- java.utile.Date()형식의 입력후 java.sql.Date()로 변환이 필요
		//java.util.Date()의 입력을 위해서 SimpleDateFormat의 parse루틴이 필요
		System.out.print("생일을 입력하세요(YYYY-MM-DD) : ");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d=null;
		while(true) {
		try {
			//문자로 입력받은 날짜데이터를 날짜데이터로 변환->날짜변수에 저장
			d=sdf.parse(sc.nextLine());
			break;
		}catch(ParseException e) {
			System.out.print("날짜를 입력예로 맞춰 다시 입력하세요(입력예:2015-12-31)");
			e.printStackTrace();
		}		
	 }
    //java.util.Date을 java.sql.Date로 변환
	//d.getTime()을 java.sql.Date의 생성자의 전달인수로 넣습니다.
	java.sql.Date birth=new java.sql.Date(d.getTime());
	mdto.setBirth(birth);
	
	//나이는 입력받지않고 계산
	Calendar c = Calendar.getInstance();
	Calendar today = Calendar.getInstance();
	c.setTime(d);
	int age=today.get(Calendar.YEAR)-c.get(Calendar.YEAR)+1;
	mdto.setAge(age); 
	
	//성별입력
	System.out.print("성별을 입력하세요(M/F) :  ");
	mdto.setGender( sc.nextLine());
	
	int result=mdao.insert(mdto);
	if(result==1)System.out.println("레코드 추가 성공");
	else System.out.println("레코드 추가 실패");
}

private static void update() throws ParseException {
	//필요한 객체들 생성 newDto,mdao
	Member_Dto newDto=new Member_Dto();
	Scanner sc=new Scanner(System.in);
	Member_Dao mdao=new Member_Dao(); 
	
	//회원번호입력
	String membernum;//입력받은 membernum
	while(true) {
		System.out.printf("수정할 회원번호를 입력하세요");
		membernum=sc.nextLine();
		if(membernum.equals("") ) System.out.println("회원번호 입력은 필수입니다");
		else break;
	}
	//회원번호로 회원조회->oldDto에 저장
	Member_Dto oldDto=mdao.getMember(Integer.parseInt(membernum));	//String으로전달 
	//조회결과가 없으면 메서드 종료
	if(oldDto==null) {
		System.out.println("해당 회원이 없습니다 ");
		return;
	}
	//조회결과가 있으면 newDto에 회원번호 저장
	newDto.setMembernum(Integer.parseInt(membernum));
	//이름입력
	System.out.printf("성명을 제목을 입력하세요:");
	String name=sc.nextLine();
	if(name.equals("") ) newDto.setName(oldDto.getName() );
	else newDto.setName(name);
	//전화번호입력
	System.out.printf("전화번호를 입력하세요:");
	String phone=sc.nextLine();
	if(name.equals("") ) newDto.setPhone(oldDto.getPhone() );
	else newDto.setPhone(phone);
	
	//생일입력-나이자동계산수정
	System.out.print("생일을 입력하세요(YYYY-MM-DD) : ");
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	String b=sc.nextLine();
	if(b.equals("")) {
		newDto.setBirth(oldDto.getBirth() );
		newDto.setAge(oldDto.getAge() );
 }else {
	 java.util.Date d=sdf.parse(b);
	 java.sql.Date birth = new java.sql.Date(d.getTime());
	 newDto.setBirth(birth); 
	 Calendar c=Calendar.getInstance();
	 Calendar today=Calendar.getInstance();
	 c.setTime(d);  //c.setTime( birth );  Date 자료를 Calendar  자료로 변환
	 int age = today.get(Calendar.YEAR)-c.get(Calendar.YEAR)+1;
	 newDto.setAge(age);	
 }
   //나이는 입력받지않고 계산

   //성별입력
System.out.print("성별을 입력하세요: ");
String gender=sc.nextLine();
if(gender.equals("")) newDto.setGender(oldDto.getGender() );
else newDto.setGender(gender);

  //bpoint입력
System.out.print("포인트를 입력하세요: ");
String bpoint=sc.nextLine();
if(bpoint.equals("")) newDto.setBpoint(oldDto.getBpoint());
else newDto.setBpoint(Integer.parseInt(bpoint));
	//모든 항목은 입력된 값이 있을떄만 수정하며, 필드값 입력중 입력된 값이 없으면(엔터만 입력)
	//이전값(oldDto)을 유지

 newDto.setJoindate(oldDto.getJoindate() );
 mdao.update(newDto);
}
private static void delete() {
	Member_Dao mdao=new Member_Dao();
	Scanner sc=new Scanner(System.in);
	System.out.println("삭제할 번호를 입력하세요");
	String num=sc.nextLine();
	mdao.delete(num);
}

}

