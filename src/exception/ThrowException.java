package exception;

public class ThrowException {

	public static void main(String[] args) {
		// �޼ҵ带 ȣ���� ������ ���ܸ� ���ѱ� �� �ִ�.
		// throws Ű���尡 �پ��ִ� �޼ҵ�� �ݵ�� try ��� ������ ȣ��Ǿ�� �Ѵ�.
		// �׸��� catch ��Ͽ��� ���Ѱ� ���� ���ܸ� ó���ؾ��Ѵ�.
		try {
			findClass();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		
	}
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");	
	}
	
}
