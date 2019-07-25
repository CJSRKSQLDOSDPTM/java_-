/*
 * Customer, CustomerVIP 클래스를 이용한 override 테스트용 클래스
 */
package chapter08;

public class CustomerOvrTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(1001, "이순신");
		customerLee.bonusPoint = 1000;
		
		CustomerVIP customerKim = new CustomerVIP(1002, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 "
				+ customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 "
				+ customerLee.calcPrice(price) + "원입니다.");
	}

}
