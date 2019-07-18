/*
 * 문제 : 시작하는 숫자와 끝나는 숫자를 입력받아 
 *      시작하는 숫자부터 끝나는 숫자까지의 합계를 구하시오.
 *      
 * PSEUDO CODE
 * 1. 필요한 변수 선언 num, beginNum, endNum, sum=0
 * 2. beginNum과 endNum을 입력받는다.
 * 3. num = beginNum으로 세트한다.
 * 4. num가 endNum보다 작거나 같으면 반복
 *    3.1 sum += num;
 *    3.2 num++;
 * 5. 합계를 출력한다.
 */
package chapter04;

import java.util.Scanner;

public class PR04_IntervalSum {

	public static void main(String[] args) {
		int num, beginNum, endNum, sum=0;
		Scanner kbd = new Scanner(System.in);
		System.out.println("시작 수:");
		beginNum = kbd.nextInt();
		System.out.println("끝 수:");
		endNum = kbd.nextInt();
		num = beginNum;
		while(num <= endNum) {
			//sum += num;
			// 공배수를 찾아서 출력
			if(((num % 3) == 0) || ((num % 5) == 0))System.out.println(num);
			num++;
		}
//		System.out.println(beginNum + " ~ " + endNum + " SUM : " + sum);
	}

}
