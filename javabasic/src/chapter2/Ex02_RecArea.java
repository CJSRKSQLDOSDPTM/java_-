/*
프로그래밍 연습문제
사각형의 가로, 세로 길이를 입력받아 면적을 구하는 프로그램을 작성하시오
*/
package chapter2;

import java.util.Scanner;

public class Ex02_RecArea {

	public static void main(String[] args) {
		// 필요한 변수 선언
		Scanner sc = new Scanner(System.in);
		double width, height;
		double recArea;
		
		// 입력을 요구하는 메시지 출력
		System.out.println("가로의 길이를 입력하세요");
		width = sc.nextDouble();
		System.out.println("세로의 길이를 입력하세요");
		height = sc.nextDouble();
		
		// 입력받은 가로, 세로길이를 이용하여 면적 계산
		recArea = width * height;
		
		// 계산된 결과를 출력
		System.out.println("4각형의 면적 : " + recArea);
	}// end of main()
}// end of Class
