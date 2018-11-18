package nested_class_interface;

public class NestedInterface_VERYIMPORTANT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button btn = new Button();
		
//		btn.touch(); �ڸ� ǥ���� �Ʒ� �������� ����ϴ� ���� ���⼭ �߻��̵ȴ�.
		// �Ʒ�ó�� CallListeneró�� ������ ������ �ʰ� btn.touch(); �� ����ϸ� NullPointException ������ �߻��Ѵ�.
		// ������ ������ ������ �ʰ� �ٷ� ����� �ع����� ������ ���.
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		CallListener call = new CallListener(); // ��ó�� �������̽��� ��ӹ޴� Ŭ���� ��ü�� ���� �ٷ� ����� �� �ִ�.
		call.onClick();
		// ������ �̷��� ������� �ʰ� Button�̶�� Ŭ���� �ϳ��� �������� �����ϱ� ���� �̷��� ������� �ʴ� ��.
	}
}
// ��ø �������̽��� Ŭ������ ����� ����� �������̽���. Ư�� UI ���α׷��ֿ��� �̺�Ʈ�� ó���� �������� ���� Ȱ���Ѵ�.
/*
class A {
	Interface I {
		void method();
	}
}
*/

class Button {
	OnClickListener listener; // �������̽� Ÿ�� �ʵ��̴�.
	
	void setOnClickListener(OnClickListener listener) { // setter �޼ҵ��̴�.
		this.listener = listener; // �Ű� ������ �������̴�.
		// RemoteControl rc = new Television(); �� �ǵ��� ���� OnClickListener �������̽��� ��ӹ޴� � �ڽ��� �ҷ����°�
	}

	
	//listener.onClick(); ��
//	this.listener.onClick();
	void touch() {
		listener.onClick(); // listener �������̽��� �����Ǿ��ִ� onClick() �޼ҵ带 ȣ���Ѵ�. 
		// ����Ʈ �Ǵ� ���� �޼ҵ��� ������ ����(�ٷ� �Լ��� �ҷ������ϱ�) �ߴµ� �׷��� �ʴ�.
		// �� �Լ� �ۿ����� ������ �ȵǴµ� �Լ� �ȿ����� ������ �Ǵ� ������ ����..?
		// �ذ�!!! onClickListenr listener = new onClickListener() ó�� ��ü�� �������� �ʾ����ϱ� �ۿ����� ����� �ȵǴ°�
		// ������ new OnClickListener()�� ���� �ʴ´�! �ֳ��� �������̽��ϱ�!
		// touch() ���ο��� ������ �Ǵ� ���� �Լ��� ���� listener�� ���ǵ� ������ �̵��ϴϱ� �������ִ°���
	}
	
	interface OnClickListener { // Ŭ���� �ȿ��� �������̽��� ������. ��ø �������̽���
		void onClick();
	}
}

class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
}

class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("�޼����� �����ϴ�.");
	}
}
