package practice_interface;

public class Practice_Interface_MultiInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// �����������̽��� �����ϴ� ���� ����� �ʴ�. implements�� �������̽��� ��� �Է��ϰ�, override �ϸ� ��!
class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "�� �̻��մϴ�.");		
	}

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