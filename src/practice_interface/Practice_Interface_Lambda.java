package practice_interface;

public class Practice_Interface_Lambda {

	public static void main(String[] args) {
		// UI ���α׷��ֿ��� �̺�Ʈ�� ó���ϱ� ����, �ӽ� �۾� �����带 ����� ���� �͸� ���� ��ü�� Ȱ���Ѵ�.		
		RemoteControl rc = new RemoteControl() {
			// �߻��Լ����� �ݵ�� ������ ������Ѵ�.
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
		
		RemoteControl rc2 = new RemoteControl() {
			// ������ Ŭ�� - source - override ������ ����
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
			
		};
	}
}
