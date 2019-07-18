/*
 * 반복문 중 가장 많이 사용하는 반복문
 * 주로 조건이 횟수인 경우에 사용
 * 초기화식, 조건식, 증감식을 한번에 작성한다.
 * 
 * for(초기화식;조건식;증감식){
 *    반복 수행할 문장
 * }
 * 
 * 그외 추가 설명 및 예제
 * - for 루프를 이용한 문자(알파벳, 한글) 출력하기
 * - 무한 루프
 * - for 루프에서 다중 변수 선언하기
 * - 다중 for 루프
 * - continue, break
 */
package chapter04;

public class A08_ForStmt {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==8) break;
			if((i % 2) == 0) continue;
			System.out.println(i);
		}
		System.out.println("terminated ");
	}
}
