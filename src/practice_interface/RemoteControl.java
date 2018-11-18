package practice_interface;

public interface RemoteControl {
	// 상수 필드는 무조건 public static final이 붙는다. 생략하더라도 자동으로 컴파일에서 붙는다.
	// 또한 상수 필드는 반드시 초기값을 대입해야한다.
	public static final int MAX_MOLUME = 10;
	int MIN_MOLUME = 0;
	
	// 추상 메소드는 무조건 public abstract가 붙는다. 생략하더라도 자동으로 컴파일에서 붙는다.
	// 추상 메소드는 {}가 필요없다.
	public abstract void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드는 자바8에서 추가되었다.
	// 디폴트 메소드는 public 특성을 갖는다. 생략하더라도 자동으로 컴파일에서 붙는다.
	// 객체가 가지고 있는 인스턴스 메소드라고 생각해야한다. 
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		}
		else {
			System.out.println("무음 해제합니다");
		}
	}
	
	// 정적 메소드는 자바8에서 추가되었다.
	// 정적 메소드는 public 특성을 갖는다. 생략하더라도 자동으로 컴파일에서 붙는다.
	// 정적 메소드이므로 인터페이스를 바로 호출해서 쓸 수 있다. RemoteControl.changebattery() 
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
