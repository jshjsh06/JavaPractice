package practice_interface;

public class Practice_Interface_InheritanceInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; // InterfaceA는 InterfaceC의 부모클래스이므로 impl를 감쌀 수 있다.
		ia.methodA();
		// ia.methodB() 는 당연히 실행할 수 없다.
		System.out.println("-------");
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println("-------");
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		// InterfaceC는 InterfaceA와 InterfaceB를 상속하므로 모두 사용 가능
	}

}

class ImplementationC implements InterfaceC {
	// InterfaceC는 InterfaceA와 InterfaceB를 상속받으므로 A, B, C 모든 추상함수를 재정의해줘야한다.
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("ImplementationC - methodA() 실행");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("ImplementationC - methodB() 실행");
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("ImplementationC - methodC() 실행");
	}
	
}