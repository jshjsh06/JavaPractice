package practice_inheritance;

public class Practice_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbcellphone = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmbcellphone.model);
		System.out.println("색상 : " + dmbcellphone.color);
		
		// DmbCellPhone의 필드
		System.out.println("채널 : " + dmbcellphone.channel);
		
		// CellPhone으로부터 상속받은 메소드 호출
		dmbcellphone.powerOn();
		dmbcellphone.powerOff();
		dmbcellphone.sendVoice("hihi");
		dmbcellphone.receiveVoice("ㅎ2, 난  ㅎㄱㄷ");
		dmbcellphone.hangUp();
		
		// DmbCellPhone의 메소드 호출
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(11);
		dmbcellphone.turnOffDmb();

	}

}

class CellPhone {
	String model;
	String color;
	
	void powerOn() { System.out.println("전원을 켭니다.");}
	void powerOff() { System.out.println("전원을 끕니다.");}
	void bell() { System.out.println("벨이 울립니다.");}
	void sendVoice(String message) { System.out.println("자기: " + message);}
	void receiveVoice(String message) { System.out.println("상대방: " + message);}
	void hangUp() { System.out.println("전화를 끊습니다.");}
}

class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}	
}