package chapter08;

public class CustomerGold extends Customer{
	double saleRatio;
	
	CustomerGold(int customerID, String customerName){
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
}
