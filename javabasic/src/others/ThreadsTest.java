package others;

public class ThreadsTest {

	public static void main(String[] args) {
		try {
			int threadcnt = 4;
			long start = System.currentTimeMillis();
			ThreadMy.sum = 0;
			int target = Integer.MAX_VALUE;
			ThreadMy[] threads = new ThreadMy[threadcnt];
			for(int i=0;i<threads.length;i++) {
				threads[i] = new ThreadMy(i * (target/threadcnt), 
						                  (i+1)*(target/threadcnt)-1);
				threads[i].start();
			}
			for(int i=0;i<threads.length;i++) {
				threads[i].join();
			}
			long end = System.currentTimeMillis();
			System.out.println("합계 : " + ThreadMy.sum);
			System.out.println("연산시간 : "  + (end-start) + "ms");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
