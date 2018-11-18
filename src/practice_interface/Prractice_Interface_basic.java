package practice_interface;

public class Prractice_Interface_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		
		// 인터페이스도 다형성처럼 구현이 가능하다
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc = new Radio();		
		rc.turnOn();
		rc.turnOff();
		
		// 물론 바로 클래스로 사용해도 된다.
		Television television = new Television();
		television.turnOn();
		television.turnOff();
		
		// 디폴트 메소드 사용
		// RemoteControl.setMute(true); 이렇게 바로 호출이 되지 않는다. 정적 메소드가 아니므로
		rc.setMute(true); // 재정의할 수 있다 당연히.
		
		// 정적 메소드 사용
		RemoteControl.changeBattery();
	}
	InterfaceA a;
//	a.methodA();
	void method() {
		a.methodA();
	}
}

class Television implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_MOLUME) {
			this.volume = RemoteControl.MAX_MOLUME;
		}
		else if(volume<RemoteControl.MIN_MOLUME) {
			this.volume = RemoteControl.MIN_MOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}
}

class Radio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 켭니다.");		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio를 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_MOLUME) {
			this.volume = RemoteControl.MAX_MOLUME;
		}
		else if(volume<RemoteControl.MIN_MOLUME) {
			this.volume = RemoteControl.MIN_MOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Radio 볼륨 : " + volume);
	}	
}

abstract class Television2 implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
	}
	
}