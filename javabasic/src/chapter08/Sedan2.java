package chapter08;

public class Sedan2 extends Car2 {
	int passengerCount;
	
	public void takeOn() {
		passengerCount++;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(passengerCount);
	}
}
