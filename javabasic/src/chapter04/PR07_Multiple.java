/*
 * 사용자가 단을 입력하면 해당 단의 구구단을 출력하는 프로그램을 작성하시오.
 * 단, 0을 입력하면 프로그램을 종료하시오.
 * PSEUDO CODE
 * 1. 필요변수 선언 
 * 2. 단이 0이 아닌동안 반복
 *    2.1 단 입력 요구 메시지 출력
 *    2.2 단 입력 받기
 *    2.3 곱하는 수가 10보다 작은 동안 반복
 *         2.3.1 단 * 곱하는 수 출력
 * 3. 프로그램 종료
 */
package chapter04;

import java.util.Scanner;

public class PR07_Multiple {

	public static void main(String[] args) {
		// 필요 변수 선언
		int dan=1;
		Scanner kbd = new Scanner(System.in);
		
		while(dan != 0) {
			System.out.println("몇 단?? >>");
			dan = kbd.nextInt();
			if(dan==0)break;
			for(int times=1; times<=9;times++) {
				System.out.println(dan + "*" + times + "=" + (dan*times));
			}// end of for
		}// end of while
		
		System.out.println("프로그램 종료");
	}

}
