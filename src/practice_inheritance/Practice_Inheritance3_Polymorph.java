package practice_inheritance;

public class Practice_Inheritance3_Polymorph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child;
		// Parent parent = new Child();
		parent.method1();
		parent.method2();
//		parent.method3(); // ȣ��Ұ���
		//�ڡڡڡڡ� �θ�� �ڽ��� ����Ȱ� �ڽĸ��� ������. ������ �θ� ���� �� �������� �ڽ��� �켱�Ѵ�!
		// ��������ȯ���� �����ų���� �ִ�.
		Child child2 = (Child) parent;
		child2.method3();
		
		// boolean result = ����(��ü) instanceof ����(Ÿ��)
		// parent instanceof Child => Parent �Ű������� �����ϴ� ��ü�� Child�ΰ� �� �Ǵ� 
		// �Ǵ� Child Ÿ������ ��ȯ�� �������� Ȯ���Ѵ�. ��� ���� ��
	}

}

class Parent {
	public void method1() {
		System.out.println("Parent-Method1()");
	}
	
	public void method2() {
		System.out.println("Parent-Method2()");
	}
}

class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-Method2()");
	}
	
	public void method3() {
		System.out.println("Child-Method3()");
	}
}