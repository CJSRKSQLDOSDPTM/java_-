/*
 * abstract class의 의미를 이해하고 추상클래스를 정의/사용할 수 있다.
 * 이해를 돕기 위한 설명 단계. 
 * 1. 추상메서드의 의미를 이해시킨다. body의 유무와 추상메서드 여부!! 
 * 2. 추상메서드임을 표시하기 위한 키워드 abtract
 * 3. 추상메서드가 단 하나라도 포함되면 추상 클래스가 됨!!
 */
package chapter09;

public abstract class Computer {
	public abstract void display();  // body 없는 메서드
	public abstract void typing();   // body 없는 메서드
	public void turnOn() {  // body 있는 메서드
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {  // body 있는 메서드
		System.out.println("전원을 끕니다.");
	}
}