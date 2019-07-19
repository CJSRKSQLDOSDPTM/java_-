package chapter07;

public class ArrayTest {
	// 배열 선언
	// 자료형[]    배열이름 = new  자료형[개수];
	// 자료형    배열이름[] = new  자료형[개수]; 
	
    public static void main(String[] args) {
    	// int[] studentIDs = new int[10];
    	int studentIDs[] = new int[] {10,9,8,7,6,5,4,3,2,1};
    	
//    	for(int i=0, num=10;i<10;i++,num--) {
//    		studentIDs[i] = num;
//    	}
    			
    	for(int i=0;i<studentIDs.length;i++) {
    	   System.out.printf("%3d",studentIDs[i]);
    	}
    }
	
}
