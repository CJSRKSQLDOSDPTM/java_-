/*
 * A01_ArithmaticOperator.java
 * 1. 산술연산자 종류
 * + : 두 합을 더한다.
 * - : 앞에 있는 항에서 뒤에 있는 항을 뺀다.
 * * : 두 항을 곱한다.
 *  / : 앞에 있는 항을 뒤에 있는 항으로 나누어 몫을 구한다.
 *  % : 앞에 있는 항을 뒤에 있는 항으로 나누어 나머지를 구한다.
 *  
 *  2. 우선순위 
 *  일반 수학의 산술 연산과 같다. 
 *  즉  *, /,%   >  +, -
 */

//산술 연산자를 사용하여 수학, 영어 점수의 합계와 평균을 구하는 프로그램의 예제.
package chapter03;

import java.util.Scanner;

public class A01_ArithmaticOperator {

	public static void main(String[] args) {
		// 필요한 변수를 선언한다. 
		// 이름, 국어, 수학, 영어, 총점, 평균을 위한 변수
		Scanner kbd = new Scanner(System.in);
		int kor, math, eng, tot;
		double avg;
		String name;
		
		// 입력받는다.
		System.out.println("이름 : ");
		name = kbd.next();
		System.out.println("국어 : ");
		kor = kbd.nextInt();
		System.out.println("수학 : ");
		math = kbd.nextInt();
		System.out.println("영어 : ");
		eng = kbd.nextInt();
		
		// 총점을 계산한다.
		tot = kor + eng + math;
		
		// 평균을 계산한다.
		avg = (double) tot / 3;
		
		// 계산된 총점과 평균을 출력한다.
		System.out.println(tot + " , " + avg);
	}// end of main()
}// end of class
