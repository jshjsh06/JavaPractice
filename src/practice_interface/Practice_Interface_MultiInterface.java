package practice_interface;

public class Practice_Interface_MultiInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// 다중인터페이스를 구현하는 것은 어렵지 않다. implements에 인터페이스를 모두 입력하고, override 하면 끝!
class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "를 겁색합니다.");		
	}

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