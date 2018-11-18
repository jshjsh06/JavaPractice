package nested_class_interface;

public class AnonymousExample2_VERYIMPORTANT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous2 anony = new Anonymous2();
		//�͸� ��ü �ʵ� ���
		anony.field.turnOn();
		anony.field.turnOff();
		
		//�͸� ��ü ���� ���� ���
		//�ڡ� method1() �Լ� ���� turnOff �Լ� ������ �ڵ����� ������ turnOff�� ����� �� ����.
		anony.method1();
		
		//�ڡڡڡڡ��͸� ��ü �Ű��� ���
		anony.method2(
			new RemoteControl() {

				@Override
				public void turnOn() {
					// TODO Auto-generated method stub
					System.out.println("SmartTV�� �մϴ�.");
				}

				@Override
				public void turnOff() {
					// TODO Auto-generated method stub
					System.out.println("SmartTV�� ���ϴ�.");
				}				
			}
		);
	}
}
// �̹� ������ Ŭ����(�͸� �ڽ� ��ü)�� �ƴ� �������̽��� ����� �͸� ���� ��ü�̴�.

interface RemoteControl {
	public void turnOn();
	public void turnOff();
}

class Anonymous2 {
	// �ʵ� �ʱⰪ���� ����
	// RemoteControl�� �������̽��ε� new RemoteControl()ó�� �����ڸ� ���� ��ü�� ����� ��ó�� ���δ�.
	// ������ �̴� �͸�����ü �̹Ƿ� �����ϴ�.
	// ��, RemoteControl field = new RemoteControl(); ó�� ���� ���� ������ ����. �翬�� �������̽��� �����ڴ� �����Ƿ�
	RemoteControl field = new RemoteControl() {

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
	};
	
	void method1() {
		//���� ���������� ����
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Audio�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Audio�� ���ϴ�.");
			}			
		};
		//���� ���� ���
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}