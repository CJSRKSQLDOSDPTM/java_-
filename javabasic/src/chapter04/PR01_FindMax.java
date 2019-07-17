/*
 * 입력 받은 세개의 숫자 중에서 최대값을 찾아 출력하는 프로그램을 작성하시오.
 *  
 */
package chapter04;

import java.util.Scanner;

public class PR01_FindMax {

	public static void main(String[] args) {
		// 필요한 변수 선언
		int num1, num2, num3;
		int max;
		Scanner kbd = new Scanner(System.in);
		
		// 숫자 입력 메시지 출력하기
		System.out.println("숫자 1: ");
		num1 = kbd.nextInt();
		System.out.println("숫자 2: ");
		num2 = kbd.nextInt();
		System.out.println("숫자 3: ");
		num3 = kbd.nextInt();
		
		// 최대값 찾기
		max = num1;
		if(num2 > max) max = num2;
		if(num3 > max) max = num3;
		
		// 최대값 출력하기
		System.out.println("가장 큰 수는 " + max);
	}

}
