/*
 * 메서드 오버라이드 설명을 위한 예. Student 클래스를 상속받는 하위 클래스 초등학생
 * 중학생 클래스는 상위 클래스인 Student의 메서드 Study를 상속만 받는 것이 아니라
 * 수정하여 사용하고 있다.
 */
package chapter08;

public class StudentMiddle extends Student {

	@Override
	public void study() {
		System.out.println("중학생이 공부합니다.");
	}
}
