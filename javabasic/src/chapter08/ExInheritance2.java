package chapter08;

public class ExInheritance2 {

	public static void main(String[] args) {
		Sedan2 mysedan = new Sedan2();
		Truck2 mytruck = new Truck2();
		
		mysedan.color = "파랑";
		mysedan.speed = 0;
		mysedan.takeOn();
		mysedan.showInfo();
		
		System.out.println("=====================");
		
		mytruck.color = "빨강";
		mytruck.speed = 0;
		mytruck.takeOn();mytruck.takeOn();mytruck.takeOn();
		mytruck.showInfo();
	}
}
