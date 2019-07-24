package chapter08;

public class Truck2 extends Car2 {
	int loadCount;
	
	public void takeOn() {
		loadCount++;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(loadCount);
	}
}
