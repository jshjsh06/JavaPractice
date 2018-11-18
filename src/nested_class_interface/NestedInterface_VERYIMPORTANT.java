package nested_class_interface;

public class NestedInterface_VERYIMPORTANT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button btn = new Button();
		
//		btn.touch(); ★를 표시한 아래 문제에서 우려하던 일이 여기서 발생이된다.
		// 아래처럼 CallListener처럼 재정의 해주지 않고 btn.touch(); 을 사용하면 NullPointException 에러가 발생한다.
		// 하지만 재정의 해주지 않고 바로 사용을 해버리면 에러가 뜬다.
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		CallListener call = new CallListener(); // 이처럼 인터페이스를 상속받는 클래스 객체를 만들어서 바로 사용할 수 있다.
		call.onClick();
		// 하지만 이렇게 사용하지 않고 Button이라는 클래스 하나로 다형성을 구현하기 위해 이렇게 사용하지 않는 것.
	}
}
// 중첩 인터페이스는 클래스의 멤버로 선언된 인터페이스다. 특히 UI 프로그래밍에서 이벤트를 처리할 목적으로 많이 활용한다.
/*
class A {
	Interface I {
		void method();
	}
}
*/

class Button {
	OnClickListener listener; // 인터페이스 타입 필드이다.
	
	void setOnClickListener(OnClickListener listener) { // setter 메소드이다.
		this.listener = listener; // 매개 변수의 다형성이다.
		// RemoteControl rc = new Television(); 이 되듯이 받은 OnClickListener 인터페이스를 상속받는 어떤 자식을 불러오는것
	}

	
	//listener.onClick(); ★
//	this.listener.onClick();
	void touch() {
		listener.onClick(); // listener 인터페이스에 구현되어있는 onClick() 메소드를 호출한다. 
		// 디폴트 또는 정적 메소드일 것으로 예상(바로 함수가 불러와지니깐) 했는데 그렇지 않다.
		// ★ 함수 밖에서는 실행이 안되는데 함수 안에서는 실행이 되는 이유가 뭐지..?
		// 해결!!! onClickListenr listener = new onClickListener() 처럼 객체를 생성하지 않았으니깐 밖에서는 사용이 안되는것
		// 하지만 new OnClickListener()은 되지 않는다! 왜나면 인터페이스니깐!
		// touch() 내부에서 실행이 되는 것은 함수를 따라 listener가 정의된 곳으로 이동하니깐 열려져있는것임
	}
	
	interface OnClickListener { // 클래스 안에서 인터페이스를 선언함. 중첩 인터페이스임
		void onClick();
	}
}

class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}

class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
