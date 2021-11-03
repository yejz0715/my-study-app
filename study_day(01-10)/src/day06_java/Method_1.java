package day06_java;
import java.util.Scanner;
public class Method_1 {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double ave;
		kor=myInput(1); //1점수입력  myInput:메소드, 1: 전달인수
		eng=myInput(2);
		mat=myInput(3); 
		tot=sum(kor,eng,mat); //2총점계산
		ave=avg(kor,eng,mat);//3평균계산
		prn(tot,ave);//4 2-3출력
	}
	
	public static void prn(int tot, double ave) {
		System.out.printf("총점: %d, 평균: %2f", tot,ave);		
	}

	public static double avg(int kor, int eng, int mat) {
		int total=sum(kor,eng,mat);
		return total/3.0;
	}
	
	public static int sum(int kor, int eng, int mat) {//총점계산		
		return kor+eng+mat;
	}

	public static int myInput(int n) { //점수입력받음
	if(n==1)System.out.printf("국어점수: ");
	else if(n==2)System.out.printf("영어점수: ");
	else System.out.printf("수학점수: ");
	Scanner sc=new Scanner(System.in);	
	return sc.nextInt();
	}
}
/*
함수의 용도 전달인수 및 리턴값 유무파악
myInput메소드는 점수를 입력이라는 안내와 정수를 입력받아 입력받은 정수를 리턴해준다
메서드의 호출 kor=myInput(1); 이렇게 나타냈는데
'kor= ' 는 리턴값이 있다는 뜻이므로 메서드생성할때 
private static int myInput(int n){.... 이렇게 내용을 바꿔줌  
 'kor= '없다면 리턴값x- void나옴
 private static void myInt(int n){.....
 
 kor=myInput(1); 여기에서 1은 전달인수가 있다는 뜻으로 
 1을 받아줄 변수 선언
 private static void myInt(int n)';' 생략
 변수의 자료형은 괄호인에 전달되는 자료형과 일치
  
 */
