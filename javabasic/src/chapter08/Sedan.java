package chapter08;

public class Sedan extends Car {
	// 생성자 호출 관계 확인
	// 디폴트 생성자 default constructor
	public Sedan() {
		System.out.println("Sedan 클래스 생성자 호출!!");
	}
	
	// 생성자 오버로딩 - 다형성
	public Sedan(String name) {
		super("여기요~~~");
		System.out.println("Sedan 클래스 생성자 호출 with " + name);
	}
}
