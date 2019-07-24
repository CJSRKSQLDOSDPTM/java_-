package chapter07;

public class TwoDimension {

	public static void main(String[] args) {
		// 2차원 배열 선언
		//int[][] arry = new int[2][3];
		int[][] arry = {{1,2,3}, {4,5,6}};
		
		for(int i=0;i<arry.length;i++) {
			for(int j=0;j<arry[i].length;j++) {
				System.out.printf("%3d", arry[i][j]);
			}// inner loop by j
			System.out.println();
		}// outer loop by i
		System.out.println("2차원배열의 개념 확인!!");
	}
}
