package nested_class_interface;

public class AnonymousExample_VERYIMPORTANT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		
		// �͸� ��ü �ʵ� ���
		anony.field.wake();
		
		// �͸� ��ü ���� ���� ���
		anony.method1();
		
		// �ڡڡڡڡ��͸� ��ü �Ű��� ���
		anony.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}
				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}
			}	
		);
	}

}
class Person {
	void wake() {
		System.out.println("7�ÿ� �Ͼ�ϴ�.");
	}
}

// �͸� ��ü�� �̸��� ���� ��ü�� �ܵ����� ������ �� ���� Ŭ������ ����ϰų� �������̽��� �����ؾ߸� ������ �� �ִ�.
// �ַ� UI �̺�Ʈ ó�� �� ������ ��ü�� �����ϰ� ������ �������� Ȱ��

class Anonymous {
	// Ŭ���� ���ο��� �ٷ� ���� (�ʵ� �ʱⰪ���� ����)
	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	
	// Ŭ���� ���� �޼ҵ忡�� ����(���� ���������� ����)
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");				
			}			
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		// ���� ������ ���⼭ ���
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}





