/*
 * 키보드로부터 입력받은 수가 3,4,5의 배수인지 판단하여 출력하는 프로그램을 작성하시오.
 * 그 외의 경우에는 '그 외의 경우입니다'라고 출력하시오.
 */
package chapter04;

import java.util.Scanner;

public class PR02_MultipleNumber {

	public static void main(String[] args) {
		// 필요 변수 선언
		Scanner kbd = new Scanner(System.in);
		int num;
		
		System.out.println("임의 숫자를 입력해 주세요");
		num = kbd.nextInt();
		
	    if(num % 3 == 0)System.out.println("3의 배수입니다."); 
	    else if((num % 4) == 0) System.out.println("4의 배수입니다.");
	    else if((num % 5) == 0) System.out.println("5의 배수입니다.");
	    else System.out.println("3,4,5 이외 숫자의 배수입니다."); 
	}
}