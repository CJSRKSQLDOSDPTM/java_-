/*
 * 스레드의 주요 메서드
 * run() : 스레드의 실질적인 코드 블럭
 * setDaemon() : 메인 스레드가 종료되었을 때 자동 종료되도록 설정
 * start() : 해당 스레드의 시작
 * sleep(long) : 주어진 밀리초 동안 스레드 작동 일시 정지
 * interrupt() : 스레드 강제 종료
 * isAlive() : 스레드가 살아있는지 확인
 * join() :  이 스레드가 종료될 때 까지 기다린 후에 실행
 * yield() : 실행을 중단하고 다른 스레드에게 cpu 자원을 양보
 */
package others;

public class ThreadsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<100;i++) {
				Threadm th = new Threadm(i);
				th.start();
				//th.join();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Threadm extends Thread {
	private int x;
	public Threadm(int x) {
		this.x = x;
	}
	@Override
	public void run() {
		System.out.println(x + "번째 스레드 실행!!");
	}
}