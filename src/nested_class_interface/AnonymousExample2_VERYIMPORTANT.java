package nested_class_interface;

public class AnonymousExample2_VERYIMPORTANT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous2 anony = new Anonymous2();
		//익명 객체 필드 사용
		anony.field.turnOn();
		anony.field.turnOff();
		
		//익명 객체 로컬 변수 사용
		//★★ method1() 함수 내에 turnOff 함수 실행을 코딩하지 않으면 turnOff는 실행될 수 없다.
		anony.method1();
		
		//★★★★★익명 객체 매개값 사용
		anony.method2(
			new RemoteControl() {

				@Override
				public void turnOn() {
					// TODO Auto-generated method stub
					System.out.println("SmartTV를 켭니다.");
				}

				@Override
				public void turnOff() {
					// TODO Auto-generated method stub
					System.out.println("SmartTV를 끕니다.");
				}				
			}
		);
	}
}
// 이번 예제는 클래스(익명 자식 객체)가 아닌 인터페이스를 사용한 익명 구현 객체이다.

interface RemoteControl {
	public void turnOn();
	public void turnOff();
}

class Anonymous2 {
	// 필드 초기값으로 대입
	// RemoteControl은 인터페이스인데 new RemoteControl()처럼 생성자를 만들어서 객체를 만드는 것처럼 보인다.
	// 하지만 이는 익명구현객체 이므로 가능하다.
	// 즉, RemoteControl field = new RemoteControl(); 처럼 끝을 내면 오류가 난다. 당연히 인터페이스에 생성자는 없으므로
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("TV를 켭니다.");
			
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("TV를 끕니다.");
		}		
	};
	
	void method1() {
		//로컬 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Audio를 끕니다.");
			}			
		};
		//로컬 변수 사용
		localVar.turnOn();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}