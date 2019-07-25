/*
 * CustomerVIP는 Customer 클래스를 상속한다(확장하여 만든다).
 * VIP손님은 기존 손님이 가진 속성 외에
 * 담당상담원아이디, 할인율 필드를 추가로 가지며
 * 물건을 구입할 때 물건가는 할인율만큼을 DC받은 가격을 지불한다. 
 */
package chapter08;

public class CustomerVIP extends Customer {
	int agentID;
	double saleRatio;
	
	public CustomerVIP(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("CustomerVIP 생성자 호출!!");
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
