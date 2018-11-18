package practice_interface;

public interface RemoteControl {
	// ��� �ʵ�� ������ public static final�� �ٴ´�. �����ϴ��� �ڵ����� �����Ͽ��� �ٴ´�.
	// ���� ��� �ʵ�� �ݵ�� �ʱⰪ�� �����ؾ��Ѵ�.
	public static final int MAX_MOLUME = 10;
	int MIN_MOLUME = 0;
	
	// �߻� �޼ҵ�� ������ public abstract�� �ٴ´�. �����ϴ��� �ڵ����� �����Ͽ��� �ٴ´�.
	// �߻� �޼ҵ�� {}�� �ʿ����.
	public abstract void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
	// ����Ʈ �޼ҵ�� �ڹ�8���� �߰��Ǿ���.
	// ����Ʈ �޼ҵ�� public Ư���� ���´�. �����ϴ��� �ڵ����� �����Ͽ��� �ٴ´�.
	// ��ü�� ������ �ִ� �ν��Ͻ� �޼ҵ��� �����ؾ��Ѵ�. 
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		}
		else {
			System.out.println("���� �����մϴ�");
		}
	}
	
	// ���� �޼ҵ�� �ڹ�8���� �߰��Ǿ���.
	// ���� �޼ҵ�� public Ư���� ���´�. �����ϴ��� �ڵ����� �����Ͽ��� �ٴ´�.
	// ���� �޼ҵ��̹Ƿ� �������̽��� �ٷ� ȣ���ؼ� �� �� �ִ�. RemoteControl.changebattery() 
	public static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
