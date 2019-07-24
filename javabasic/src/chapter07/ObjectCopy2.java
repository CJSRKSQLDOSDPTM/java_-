package chapter07;

public class ObjectCopy2 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		
		// 배열 복사
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		// 복사된 사본 확인
		for(int i=0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		// 원본의 값을 변경
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");

		// 원본의 값을 확인
		System.out.println("원본 배열 1");
		bookArray1[0].showBookInfo();
		
		// 사본의 값을 확인
		System.out.println("사본 배열 1");
		bookArray2[0].showBookInfo();
		
	}

}
