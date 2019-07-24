package chapter08;

public class ExInheritance {

	public static void main(String[] args) {
		// 상속 관계에 있는 클래스들의 생성자 호출 관계를 확인하자.
		Sedan sedan1 = new Sedan();
		System.out.println("=======================");
		Sedan sedan2 = new Sedan("Jungse");
	}

}
