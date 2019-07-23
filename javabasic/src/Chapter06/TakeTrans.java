package Chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Bus bus100 = new Bus(100);
		Subway subwayGreen = new Subway("2호선");
		
		studentJames.takeOnBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		studentTomas.takeOnBus(bus100);
		studentTomas.showInfo();
		bus100.showInfo();
		
		studentJames.takeOffBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		studentJames.takeSubway(subwayGreen);
		studentJames.showInfo();
		subwayGreen.showInfo();
	}

}
