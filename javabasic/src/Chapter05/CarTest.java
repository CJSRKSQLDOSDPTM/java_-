package Chapter05;

public class CarTest {

	public static void main(String[] args) {
		Car jungseCar = new Car();
        System.out.println(jungseCar);
		
        Car c = jungseCar.returnItself();
        System.out.println(c);
	}
}
