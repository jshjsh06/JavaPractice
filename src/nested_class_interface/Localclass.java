package nested_class_interface;

// 로컬  클래스 내부에서 바깥 클래스의 필드나 메소드를 제한이 없다. 단 로컬 클래스에서 사용된 매개 변수와 로컬 변수는 모두 "final" 특성을 갖는다.
public class Localclass {
	//자바 7 이전
	public void method1(final int arg) { //자바 7이전에는 final을 일일히 붙여줘야한다. 
		final int localVariable = 1; // final을 붙여줘야한다.
		//arg = 100; final int arg이므로 어떠한 값을 넣어줄 수 없다.
		//localVariable = 100; 이 역시 가능하지 않다.
		class Inner {
			public void method() {
				int result = arg + localVariable; // final 끼리의 합이므로 가능하다.
			}
		}
	}
	
	// 자바 8 이후
	public void method2(int arg) { //자바 8 이후부터는 final을 붙이지 않아도 컴파일 과정에서 알아서 final을 붙여준다.
		int localVariable = 1;
		//arg = 100; Inner class를 생성하지 않았을 때에는 인스턴스 변수로 취급되어 에러가 뜨지 않지만 class Inner 코딩 후에는 에러가 뜬다.
		//localVariable = 100; Inner class를 생성하지 않았을 때에는 인스턴스 변수로 취급되어 에러가 뜨지 않지만 class Inner 코딩 후에는 에러가 뜬다.
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
