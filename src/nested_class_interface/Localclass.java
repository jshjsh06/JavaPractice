package nested_class_interface;

// ����  Ŭ���� ���ο��� �ٱ� Ŭ������ �ʵ峪 �޼ҵ带 ������ ����. �� ���� Ŭ�������� ���� �Ű� ������ ���� ������ ��� "final" Ư���� ���´�.
public class Localclass {
	//�ڹ� 7 ����
	public void method1(final int arg) { //�ڹ� 7�������� final�� ������ �ٿ�����Ѵ�. 
		final int localVariable = 1; // final�� �ٿ�����Ѵ�.
		//arg = 100; final int arg�̹Ƿ� ��� ���� �־��� �� ����.
		//localVariable = 100; �� ���� �������� �ʴ�.
		class Inner {
			public void method() {
				int result = arg + localVariable; // final ������ ���̹Ƿ� �����ϴ�.
			}
		}
	}
	
	// �ڹ� 8 ����
	public void method2(int arg) { //�ڹ� 8 ���ĺ��ʹ� final�� ������ �ʾƵ� ������ �������� �˾Ƽ� final�� �ٿ��ش�.
		int localVariable = 1;
		//arg = 100; Inner class�� �������� �ʾ��� ������ �ν��Ͻ� ������ ��޵Ǿ� ������ ���� ������ class Inner �ڵ� �Ŀ��� ������ ���.
		//localVariable = 100; Inner class�� �������� �ʾ��� ������ �ν��Ͻ� ������ ��޵Ǿ� ������ ���� ������ class Inner �ڵ� �Ŀ��� ������ ���.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
