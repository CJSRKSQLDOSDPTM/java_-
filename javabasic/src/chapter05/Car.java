package chapter05;

public class Car {
	// member 변수, field, 속성
	private String color="흰색";
	private String engine="가솔린";
	private String inner="가죽";
	private int speed=0;
	
	// 다형성 - 
	public Car(){    
		// 기본 생성자
		this("검정색", "디젤", "패브릭");
	}
	public Car(String color, String engine, String inner) {
		// 컬러값을 받는 생성자
		this.color = color;
		this.engine = engine;
		this.inner = inner;
	}
	
	Car returnItself() {
		return this;   // 이 클래스로 부터 생성된 객체의 시작 주소값을 리턴한다.
	}
	

	// member method, 메서드
	// 가속 메서드
	public void upSpeed(int value){
		if(speed + value >= 300 )speed = 300;
		else speed = speed + value;
	}// end of upSpeed()
	
	// 감속 메서드
	public void downSpeed(int value) {
		if(speed - value <= 0 )speed = 0;
		else speed = speed - value;
	}
	
	public void showInfo() {
		System.out.println("컬러 : " + color + ", 현재 속도는 " + speed);
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the engine
	 */
	public String getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(String engine) {
		this.engine = engine;
	}
	/**
	 * @return the inner
	 */
	public String getInner() {
		return inner;
	}
	/**
	 * @param inner the inner to set
	 */
	public void setInner(String inner) {
		this.inner = inner;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}// end of class Car