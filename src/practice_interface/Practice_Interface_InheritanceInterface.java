package practice_interface;

public class Practice_Interface_InheritanceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; // InterfaceA�� InterfaceC�� �θ�Ŭ�����̹Ƿ� impl�� ���� �� �ִ�.
		ia.methodA();
		// ia.methodB() �� �翬�� ������ �� ����.
		System.out.println("-------");
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println("-------");
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		// InterfaceC�� InterfaceA�� InterfaceB�� ����ϹǷ� ��� ��� ����
	}

}

class ImplementationC implements InterfaceC {
	// InterfaceC�� InterfaceA�� InterfaceB�� ��ӹ����Ƿ� A, B, C ��� �߻��Լ��� ������������Ѵ�.
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("ImplementationC - methodA() ����");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("ImplementationC - methodB() ����");
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("ImplementationC - methodC() ����");
	}
	
}