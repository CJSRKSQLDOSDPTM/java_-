/*
 * 07-4 배열 응용 프로그램
 * p226 예제 시나리오, ArrayList를 사용해 학생 성적 출력 프로그램을 구성
 * 학생 두 명을 생성하고 각 학생의 과목별 성적과 총점을 출력해보자.
 */
package chapter07;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================");
		studentKim.showStudentInfo();
	}
}
