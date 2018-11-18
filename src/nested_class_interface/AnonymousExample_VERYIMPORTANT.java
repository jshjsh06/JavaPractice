package nested_class_interface;

public class AnonymousExample_VERYIMPORTANT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		
		// 익명 객체 필드 사용
		anony.field.wake();
		
		// 익명 객체 로컬 변수 사용
		anony.method1();
		
		// ★★★★★익명 객체 매개값 사용
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}	
		);
	}

}
class Person {
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}

// 익명 객체는 이름이 없는 객체로 단독으로 생성할 수 없고 클래스를 상속하거나 인터페이스를 구현해야만 생성할 수 있다.
// 주로 UI 이벤트 처리 및 스레드 객체를 간편하게 생성할 목적으로 활용

class Anonymous {
	// 클래스 내부에서 바로 선언 (필드 초기값으로 대입)
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	// 클래스 내부 메소드에서 선언(로컬 변수값으로 대입)
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");				
			}			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		// 로컬 변수를 여기서 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}





