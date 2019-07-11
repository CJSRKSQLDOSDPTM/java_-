/*
프로그래밍 연습문제
연습 1. 이름과 생년을 입력받아 나이를 계산하여 
            다음 형태로 출력하는 프로그램을 작성하시오.
     
      홍길동님, 나이는 30세입니다.
*/      
      
package chapter2;

import java.util.Scanner;

public class Ex01_ComputeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 필요한 변수 선언
		Scanner sc = new Scanner(System.in);
		String name ;
		int age, birthYear;

		// 키보드를 통한 입력
		System.out.println("이름을 입력해 주세요.");
		name = sc.next();
		System.out.println("생년을 입력해주세요.");
		birthYear = sc.nextInt();

		// 나이 계산
		age = 2019 - birthYear;
		
		// 화면상에 출력
		System.out.println(name + "님의 나이는 " + age + "세 입니다.");

	}

}
