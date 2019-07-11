/*
 * 상수 : 프로그램에서 변하지 않는 수. 항상 변하지 않는 값.
 * 자바에서는 final이라는 키워드를 사용해서 선언한다.
 * 
 * 리터럴 : 프로그램에서 사용하는 모든 숫자, 문자, 
 *       논리값을 일컫는 말
 *   보통은 대입 연산자의 오른쪽에 쓰여지는 값을 이야기 함.
 *   'A' 10, 3.141592 ..... 
 * 
 */

package chapter2;

import java.util.Scanner;

public class A05_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int MAX_NUM = 1000;
		final double PI = 3.141592;
		
//		System.out.println(MAX_NUM);
//		System.out.println(PI);
//		
//		System.out.println(1+MAX_NUM);
		
		// 키보드 입력을 받기 위해 스캐너 객체 sc를 생성
		Scanner sc = new Scanner(System.in);
//		System.out.println("반지름을 입력해주세요 : ");
//		double r = sc.nextDouble();
//		double circleArea = r * r * PI;
//		System.out.println((int)circleArea);
		// 명시적 형변환 explicit type conversion
		
		// 문자열을 취급하기 위한 데이터 타입
		String name = "Hong GilDong";
		System.out.println(name);
		System.out.println("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.println(name);
		
	}

}
