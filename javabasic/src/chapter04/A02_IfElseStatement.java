/*
 * A02_IfElseStatement.java
 * if ~ else 문
 * if(조건) {
 *   조건이 참일 때 실행하는 문장;
 * } else {
 *   조건이 거짓일 때 실행하는 문장;
 * }
 * 조건과 상관없이 실애하는 문장;
 */
package chapter04;

import java.util.Scanner;

public class A02_IfElseStatement {

	public static void main(String[] args) {
/*		if (10 > 5) {
			System.out.println("조건이 참일 때 실행하는 문장");
		} else {
			System.out.println("조건이 거짓일 때 실행하는 문장");
		}
		System.out.println("조건과 상관없이 실행하는 문장");
	}*/
	// 키보드로 부터 숫자를 입력받아 홀수 짝수를 판단하여 출력하세요.
	// 필요한 변수 선언
	Scanner kbd = new Scanner(System.in);
	int number;
	
	System.out.println("숫자 : ");
	number = kbd.nextInt();
	
	if((number % 2)==1) {
		System.out.println("홀수");
	}else {
		System.out.println("짝수");
	}
		
	}
}
