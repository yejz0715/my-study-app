package day06_java;

public class Method_2 {

	public static void main(String[] args) {
		System.out.println("두개의 정수중 큰값 :" + max(11,33));
		System.out.println("두개의 실수중 큰값 :" + max(12.8,12.5));
	}

	public static double max(double c, double d) { //실수중 큰값
		double maxValue=(c>d)? c:d; //c가d보다 크다면 c 아니면 d
		return maxValue;
	}

	public static int max(int a, int b) {   //정수중 큰값
		int maxValue=(a>b)? a:b; //a가b보다 크면 a다 그렇지않으면 b다
		return maxValue;
	}
}
/* 메소드 오버로딩
 메소드의 이름은 같고, 매개변수의 타입,개수,순서가 다르면 서로 다른메소드로 인지
 전달인수,매개변수 의 자료형,순서 서로 달라도 가능
 */

 /* 전달인수의 갯수가 일정치 않아 오버로딩으로 해결할수없을때 매개변수(int ...a)사용
    같은형의 개수가 정해지지 않은 전달인수와 다른 자료형의 전달인수가 동시에 
    동시에 전달되어야한다면 반드시 ...으로 처리할 데이터들보다 왼쪽에 전달되게 위치시킨다
    참조변수 a를 이름으로한 배열이 생성됨
    int maxValue=a[0];
    for(int i=0; i<a.length; i++)
    if(maxValue<a[i])maxValue=a[i]
    return maxValue;
    
    
*/