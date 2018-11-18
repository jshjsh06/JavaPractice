package nested_class_interface;

public class InstanceMemberClass_StaticMemberClass_LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 인스턴스 멤버 클래스 B를 생성하려면 A를 생성하고 B를 생성해야한다.
		A a = new A();
		A.B b = a.new B();
		b.field = 3;
		b.method1();
		
		// 정적 멤버 클래스 D를 생성하기 위해서는 C를 생성할 필요 없다.
		C.D d = new C.D();
		d.field = 3;
		d.method1();
		// 아래처럼 부를 수 있다.
		d.field2 = 4;
		d.method2();
		C.D.field2 = 4;
		C.D.method2();

	}

}

// 1. 인스턴스 멤버 클래스, 2. 정적 멤버 클래스, 3. 로컬 클래스

// 1. 인스턴스 멤버 클래스
// static 키워드 없이 선언된 클래스이다. 인스턴스 멤버 클래스틑 인스턴스 필드와 메소드만 선언이 가능하다.
// 정적 필드와 메소드는 선언할 수 없다.
class A {
	class B{
		B() {}
		int field;
		// static int field2; 사용 불가능!
		void method1() {}
		// static void method2() {} 사용 불가능!
	}
}

// 2. 정적 멤버 클래스
// static 키워드로 선언되 ㄴ클래스. 정적 멤버 클래스는 모든 종류의 필드와 메소드를 선언할 수 있다.

class C {
	static class D {
		D() {} // 생성자
		int field; // 인스턴스 필드
		static int field2; // 정적 필드
		void method1() {} // 인스턴스 메소드
		static void method2() {} // 정적 메소드
	}
	
	// 3. 로컬 클래스
	// 중첩 클래스는 메소드 내에서도 선언할 수 있따. 이것을 로컬 클래스라고 한다.
	// 로컬 클래스는 public, private와 같은 접근 제한자 및 static을 붙일 수 없다. => 로컬 클래스는 메소드 내부에서만 사용되므로 접근을 제한할 필요가 없기 때문
	// 로컬 클래스 내부에는 인스턴스 필드와 메소드만 선언이 가능하고 정적(static)은 선언할 수 없다.
	

	void method() {
		class E {
			E() {} // 생성자
			int field; // 인스턴스 필드
			// static int field2 는 사용 불가능
			void method1() {} // 인스턴스 메소드
			// static void method2() {} 정적 메소드 사용 불가능
		}
		// 로컬 클래스는 이렇게 메소드 내에서 호출하게 된다. 
		E e = new E ();
		e.field = 3;
		e.method1();
	}
	
	// 3. 로컬 클래스 ++
	// 로컬 클래스는 주로 스레드 객체를 만들 때 사용한다.
	void method2() {
		class F extends Thread {}
		F thread = new F();
		thread.start();
	}
}
