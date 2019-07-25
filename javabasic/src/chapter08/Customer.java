/*
 * 상속과 오버라딩을 이해하고 연습하는 클래스 예제.
 * Customer 클래스를 상속받아 CusomerVIP 클래스를 설계 구현한다.
 * 
 */
package chapter08;

public class Customer {
	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		System.out.println("Customer 생성자 호출!!");
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
}
