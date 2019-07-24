/*
 * 메서드 오버라이드 사용 예
 * 
 * 오버라이드의 의미를 파악했다면....
 * 왜 굳이 @Override 라는 annotation을 적을까? 안적으면 안될까?
 */
package chapter08;

public class ExOverride {

	public static void main(String[] args) {
		Student orgStudent = new Student();
		StudentElement eleStudent = new StudentElement();
		StudentMiddle midStudent = new StudentMiddle();
		
		orgStudent.study();
		eleStudent.study();
		midStudent.study();
	}
}