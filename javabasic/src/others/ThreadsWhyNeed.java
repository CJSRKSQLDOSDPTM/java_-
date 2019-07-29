/*
 * Thread를 왜 필요로 하는가?를 보여주기 위한 예제
 * 멀티태스킹을 위한 기본 도구로서의 의미를 설명...
 * 그러면 멀티태스킹은? 하나의 응용프로그램이 여러개의 작업task을 처리하는 것.
 * 스레드는 프로그램 소스코드를 이동하면서 실행되는 하나의 제어 단위
 * 자바스레드는.. JVM에 의해 스케줄링이 이루어지는 실행단위의 코드 블럭
 * 
 */
package others;

public class ThreadsWhyNeed {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long sum = 0;
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			sum+=i;
		}
		System.out.println("합계 : " + sum);
		long end = System.currentTimeMillis();
		System.out.println("연산시간 : " + (end-start) + "ms");
	}
}
