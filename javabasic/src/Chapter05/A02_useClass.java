/*
 * 클래스의 생성자constructor
 * 
 */
package Chapter05;

public class A02_useClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		Student st2 = new Student("홍길동");
		Student st3 = new Student(1, "박문수", 4, "컴퓨터과", "청원구");
		st1.study();
		st2.study();
		st3.study();
		st3.showInfo();
	}

}
