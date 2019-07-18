/*
 * 클래스의 생성자constructor
 * 
 */
package Chapter05;

public class A02_useClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student st1 = new Student();
		// st1.setname("오중세");
		//st1.id = 1;
		//st1.address = "청주시 청원구";
		// System.out.println(st1.getname());
		//System.out.println(st1.id);
		//System.out.println(st1.address);
		
		InfoHiding info = new InfoHiding();
		//info.id = 1;
		//System.out.println(info.id);
		info.setId(1);
		System.out.println(info.getId());
	}

}
