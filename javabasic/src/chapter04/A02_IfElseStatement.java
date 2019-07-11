/*
 * A02_IfElseStatement.java
 * if ~ else 문
 * if(조건) {
 *   조건이 참일 때 실행하는 문장;
 * } else {
 *   조건이 거짓일 때 실행하는 문장;
 * }
 * 조건과 상관없이 실애하는 문장;
 */
package chapter04;

public class A02_IfElseStatement {

	public static void main(String[] args) {
		if (10 > 5) {
			System.out.println("조건이 참일 때 실행하는 문장");
		} else {
			System.out.println("조건이 거짓일 때 실행하는 문장");
		}
		System.out.println("조건과 상관없이 실행하는 문장");
	}

}
