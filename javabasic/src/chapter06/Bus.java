package chapter06;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void takeOn(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void takeOff() {
		this.passengerCount--;
	}
	
	public void showInfo() {
		System.out.println(busNumber +"번 버스 손님은" 
	                       + passengerCount + "명이고, 수입은"+ money + "원입니다.");
	}
}
