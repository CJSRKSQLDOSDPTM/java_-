package others;

public class ThreadMy extends Thread {
		public static long sum;
		private int start;
		private int end;
		
		public ThreadMy(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			long temp = 0;
			for(int i = start; i <= end; i++) {
				temp += i;
			}
			sum += temp;
		}
		
}
