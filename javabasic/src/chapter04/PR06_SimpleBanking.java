/*
 * 입금, 출금, 잔고조회 등의 간단한 은행업무를 수행할 수 있는 프로그램을 작성하시오.
 * 단, 입금, 출근, 잔고조회, 종료 등 업무는 텍스트 메뉴를 이용해 선택하고 종료를 
 * 선택하기 전까지 프로그램은 무한 반복한다.
 * PSEUDO CODE
 * 1. 필요로 하는 변수 선언
 * 2. 작업번호가 4가 아닌 동안 반복
 *   2.1 선택 메뉴 디스플레이
 *   2.2 작업 종류 입력
 *   2.3 작업 종류에 따라
 *       2.3.1 입금의 경우 : 
 *             입금액을 입력받는다.
 *             입금액을 잔고에 누계한다.
 *       2.3.2 출금의 경우 :
 *             출금액을 입력받는다.
 *             출금액이 잔고보다 작으면 잔고에서 차감하고 크면 잔고부족 메시지를 출력한다.
 *       2.3.3 잔고조회의 경우:
 *             잔고액을 출력한다.
 * 3. 프로그램 종료
 */
package chapter04;

import java.util.Scanner;

public class PR06_SimpleBanking {

	public static void main(String[] args) {
		// 1. 필요한 변수 선언
		int jobNumber=0, balance=0, workMoney=0;
		Scanner kbd = new Scanner(System.in);
		
		// 2. 작업번호가 4가 아닌동안 무한반복
		do {
			// 2.1 선택메뉴 디스플레이
			System.out.println("1.입금  2.출금  3.잔고조회  4.종료");
			// 2.2 작업종류 입력
			System.out.println("선택>>");
			jobNumber = kbd.nextInt();
			// 2.3 작업종류에 따라
			switch(jobNumber) {
			case 1://입금의 경우
				System.out.println("입금액>>");
				workMoney = kbd.nextInt();
				balance += workMoney;
				break;
			case 2:// 출금의 경우
				System.out.println("출금액>>");
				workMoney = kbd.nextInt();
				if(workMoney <= balance) balance -= workMoney;
				else System.out.println("잔고가 부족합니다.");
				break;
			case 3:// 잔고조회의 경우
				System.out.println("현재 잔고 >>" + balance);
				break;
			case 4:
				break;
			default:
				System.out.println("선택을 다시해 주세요.");
			}// end of switch
			
		}while(jobNumber != 4);

		// 3. 프로그램 종료
		System.out.println("프로그램을 종료합니다.");
	}// end of main
}// end of class
