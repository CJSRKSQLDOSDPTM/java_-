/*
 * A03_IfElseIfElse.java
 * if~else if~else 문
 * if(조건식1){
 * 	 조건식1일 참일 때 실행하는 문장;
 * }else if(조건식2) {
 *   조건식2가 참일 때 실행하는 문장;
 * }else if(조건식n) {
 *   조건식n가 참일 때 싫애하는 문장;
 * }else {
 *   위의 조건이 모두 해당하지 않을 때 수행할 문장
 * }
 */
package chapter04;

public class A03_IfElseIfElse {

	public static void main(String[] args) {

		// 점수에 따른 성적 등급 결정의 예
		/*
		 * if(10<5) { System.out.println("첫번째 조건이 참일 때"); }else if(5<3) {
		 * System.out.println("두번째 조건이 참일 때"); }else {
		 * System.out.println("위의 모든 조건이 거짓일 때"); }
		 * 
		 * System.out.println("무조건 실행되는 문장");
		 */
		// 연령에 따른 공원 입장료 계산의 예
		// 필요 변수 선언
		int age = 10;
		int money;
		
		// 조건에 따른 입장료 계산
		if(age <= 10) {
			money = 1000;
		}else if(age <= 20 ) {
			money = 2000;
		}else {
			money = 3000;
		}
		
		// 계산된 결과 출력
		System.out.println(age + "세 입장료 : " + money);
		
	}

}
