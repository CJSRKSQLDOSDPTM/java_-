package Chapter06;

public class Subway {
	String LineNumber;
	int passengerCount;
	int money;
	
	public Subway(String LineNumber) {
		this.LineNumber = LineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(LineNumber +"호선 지하철 손님은" 
	                       + passengerCount + "명이고, 수입은"+ money + "원입니다.");
	}
}
