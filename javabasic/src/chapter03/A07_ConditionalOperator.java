/*
 * A07_ConditionalOperator
 * 조건연산자
 * 조건식?결과1:결과2;  조건식이 참이면 결과1 조건식이 거짓이면 결과2가 선택됨. 
 */
// 부, 모  의 나이를 입력받아 나이 많으신 분이 누구인지 출력하세요.
package chapter03;

import java.util.Scanner;

public class A07_ConditionalOperator {

	public static void main(String[] args) {
		// 필요한 변수 선언
		Scanner kbd = new Scanner(System.in);
		int fatherAge, motherAge;
		String elder;
		
		// 입력
		System.out.println("아버지의 나이 : ");
		fatherAge = kbd.nextInt();
		System.out.println("어머니의 나이 : ");
		motherAge = kbd.nextInt();
		
		// 처리
		elder = (fatherAge > motherAge  )? "아버지" : "어머니";

		// 출력
		System.out.println(elder + "께서 나이가 많으세요.");
		
	}

}
