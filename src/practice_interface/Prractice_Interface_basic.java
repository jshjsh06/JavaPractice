package practice_interface;

public class Prractice_Interface_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		
		// �������̽��� ������ó�� ������ �����ϴ�
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc = new Radio();		
		rc.turnOn();
		rc.turnOff();
		
		// ���� �ٷ� Ŭ������ ����ص� �ȴ�.
		Television television = new Television();
		television.turnOn();
		television.turnOff();
		
		// ����Ʈ �޼ҵ� ���
		// RemoteControl.setMute(true); �̷��� �ٷ� ȣ���� ���� �ʴ´�. ���� �޼ҵ尡 �ƴϹǷ�
		rc.setMute(true); // �������� �� �ִ� �翬��.
		
		// ���� �޼ҵ� ���
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
		System.out.println("TV�� �մϴ�.");		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ���ϴ�.");		
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
		System.out.println("���� TV ���� : " + volume);
	}
}

class Radio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio�� �մϴ�.");		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio�� ���ϴ�.");		
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
		System.out.println("���� Radio ���� : " + volume);
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