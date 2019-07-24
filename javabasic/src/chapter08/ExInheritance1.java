package chapter08;

public class ExInheritance1 {

	public static void main(String[] args) {
		Sedan1 mysedan = new Sedan1();
		
		mysedan.setSpeed(100);
		//System.out.println(mysedan.speed);
		mysedan.setColor("파랑");
		System.out.println(mysedan.getColor());
	}
}
