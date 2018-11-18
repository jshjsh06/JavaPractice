package practice_interface;

public class Practice_Interface_Lambda {

	public static void main(String[] args) {
		// UI 프로그래밍에서 이벤트를 처리하기 위해, 임시 작업 스레드를 만들기 위해 익명 구현 객체를 활용한다.		
		RemoteControl rc = new RemoteControl() {
			// 추상함수들은 반드시 재정의 해줘야한다.
			public void turnOn() {}
			public void turnOff() {}
			public void setVolume(int volume) {}
		};
		
		RemoteControl rc2 = new RemoteControl() {
			// 오른쪽 클릭 - source - override 누르면 편행
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}
