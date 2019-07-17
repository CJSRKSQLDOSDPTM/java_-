/*
 * 프로그램 작성 전, 처리과정 표현 방법
 * 1. 순서도
 * 2. 의사코드(Pseudo Code) : 일상의 언어를 빌려 처리 과정을 순서대로 기술하는 것.
 */
package chapter04;

import java.util.Scanner;

public class PR03_SwitchExercise {

	public static void main(String[] args) {
		// 1. 필요한 변수를 선언한다. 생년, 나이
		int birthYear, age;
		Scanner kbd = new Scanner(System.in);
		
		// 2.생년을 입력하라는 메시지를 출력하고 입력받는다.
		System.out.println("생년은? ");
		birthYear = kbd.nextInt();
		
		// 3. 나이를 계산한다.
		age = 2019 - birthYear;
		
		// 4. 계산된 나이를 10으로 나눈 몫이
		switch (age / 10) {
		//    4.1 0, 1인 경우에는 미성년이라 출력한다.
		case 0: case 1:
			System.out.println("미성년입니다.");
			break;
		//    4.2 2, 3인 경우에는 청년이라 출력한다.
		case 2: case 3:
			System.out.println("청년입니다.");
			break;
		//    4.3 4, 5인경우에는 중장년이라 출력한다.
		case 4: case 5:
			System.out.println("중장년입니다.");
			break;
		//    4.4 그 외의 경우에는 노년이라 출력한다.
		default:
			System.out.println("노년입니다.");
		}// end of switch

	}

}
