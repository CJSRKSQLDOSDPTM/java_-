package chapter04;

import java.util.Scanner;

public class PR05_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1. 연습문제 1
		int num1, num2;
		String op;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("숫자 1 :");
		num1 = kbd.nextInt();
		System.out.println("숫자 2 :");
		num2 = kbd.nextInt();
		System.out.println("연산의 종류 :");
		op = kbd.next();
		
		switch(op) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
			break;
		}
		System.out.println("terminated!!");
	}

}
