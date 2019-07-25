/*
 * Customer, CustomerVIP 클래스를 이용한 override 테스트용 클래스
 */
package chapter08;

import java.util.ArrayList;

public class CustomerOvrTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// ArrayList<E> 배열명 = new ArrayList<E>();
		
		Customer customerLee = new Customer(1001, "이순신");
		Customer customerShin = new Customer(1002, "신사임당");
		Customer customerHong = new CustomerGold(1003, "홍길동");
		Customer customerYoul = new CustomerGold(1004, "이율곡");
		Customer customerKim = new CustomerVIP(1005, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("====== 고객 정보 출력 =====");
		for(Customer c : customerList) {
			c.showCustomerInfo();  // 가상메서드
		}//end of for
		
		System.out.println("==== 할인율과 보너스 포인트 계산 ====");
		int price = 10000;
		for(Customer c: customerList) {
			int cost = c.calcPrice(price);
			System.out.println(c.getCustomerName() + "님이 " 
					+ cost + "원 지불하셨습니다.");
			System.out.println(c.getCustomerName() + "님의 현재 보너스 포인트는 " 
					+ c.bonusPoint + "점입니다.");
		}// end of for(c:customerList
	}// end of main
}//end of class
