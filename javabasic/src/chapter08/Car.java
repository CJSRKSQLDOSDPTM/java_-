package chapter08;

public class Car {
	// 생성자 호출 관계 확인
	// 디폴트 생성자 default constructor
	public Car() {
		System.out.println("Car클래스 생성자 호출!!");
	}
	// 생성자 오버로딩 - 다형성
	public Car(String name) {
		System.out.println("Car 클래스 생성자 호출 with " + name);
	}
}
