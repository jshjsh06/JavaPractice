package nested_class_interface;

public class InstanceMemberClass_StaticMemberClass_LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ν��Ͻ� ��� Ŭ���� B�� �����Ϸ��� A�� �����ϰ� B�� �����ؾ��Ѵ�.
		A a = new A();
		A.B b = a.new B();
		b.field = 3;
		b.method1();
		
		// ���� ��� Ŭ���� D�� �����ϱ� ���ؼ��� C�� ������ �ʿ� ����.
		C.D d = new C.D();
		d.field = 3;
		d.method1();
		// �Ʒ�ó�� �θ� �� �ִ�.
		d.field2 = 4;
		d.method2();
		C.D.field2 = 4;
		C.D.method2();

	}

}

// 1. �ν��Ͻ� ��� Ŭ����, 2. ���� ��� Ŭ����, 3. ���� Ŭ����

// 1. �ν��Ͻ� ��� Ŭ����
// static Ű���� ���� ����� Ŭ�����̴�. �ν��Ͻ� ��� Ŭ�����z �ν��Ͻ� �ʵ�� �޼ҵ常 ������ �����ϴ�.
// ���� �ʵ�� �޼ҵ�� ������ �� ����.
class A {
	class B{
		B() {}
		int field;
		// static int field2; ��� �Ұ���!
		void method1() {}
		// static void method2() {} ��� �Ұ���!
	}
}

// 2. ���� ��� Ŭ����
// static Ű����� ����� ��Ŭ����. ���� ��� Ŭ������ ��� ������ �ʵ�� �޼ҵ带 ������ �� �ִ�.

class C {
	static class D {
		D() {} // ������
		int field; // �ν��Ͻ� �ʵ�
		static int field2; // ���� �ʵ�
		void method1() {} // �ν��Ͻ� �޼ҵ�
		static void method2() {} // ���� �޼ҵ�
	}
	
	// 3. ���� Ŭ����
	// ��ø Ŭ������ �޼ҵ� �������� ������ �� �ֵ�. �̰��� ���� Ŭ������� �Ѵ�.
	// ���� Ŭ������ public, private�� ���� ���� ������ �� static�� ���� �� ����. => ���� Ŭ������ �޼ҵ� ���ο����� ���ǹǷ� ������ ������ �ʿ䰡 ���� ����
	// ���� Ŭ���� ���ο��� �ν��Ͻ� �ʵ�� �޼ҵ常 ������ �����ϰ� ����(static)�� ������ �� ����.
	

	void method() {
		class E {
			E() {} // ������
			int field; // �ν��Ͻ� �ʵ�
			// static int field2 �� ��� �Ұ���
			void method1() {} // �ν��Ͻ� �޼ҵ�
			// static void method2() {} ���� �޼ҵ� ��� �Ұ���
		}
		// ���� Ŭ������ �̷��� �޼ҵ� ������ ȣ���ϰ� �ȴ�. 
		E e = new E ();
		e.field = 3;
		e.method1();
	}
	
	// 3. ���� Ŭ���� ++
	// ���� Ŭ������ �ַ� ������ ��ü�� ���� �� ����Ѵ�.
	void method2() {
		class F extends Thread {}
		F thread = new F();
		thread.start();
	}
}
