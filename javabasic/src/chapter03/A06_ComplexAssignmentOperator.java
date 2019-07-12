/*
 * A06_ComplexAssignmentOperator
 * 복합 대입연산자
 * += : 두 항의 값을 더해서 왼쪽 항에 대입
 * -= : 
 * *= : 
 * /= :
 * %= : 
 * <<= :
 * >>= :
 * >>>= :
 * &= :
 * |= :
 * ^= :
 */
package chapter03;

public class A06_ComplexAssignmentOperator {

	public static void main(String[] args) {
		int num1=10, num2=20;
//		num1 += 5;  
		num1 = num1 + 5;
//		num2 -= 5;	
		num2 = num2 - 5;
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
