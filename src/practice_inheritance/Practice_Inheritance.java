package practice_inheritance;

public class Practice_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbcellphone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbcellphone.model);
		System.out.println("���� : " + dmbcellphone.color);
		
		// DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmbcellphone.channel);
		
		// CellPhone���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbcellphone.powerOn();
		dmbcellphone.powerOff();
		dmbcellphone.sendVoice("hihi");
		dmbcellphone.receiveVoice("��2, ��  ������");
		dmbcellphone.hangUp();
		
		// DmbCellPhone�� �޼ҵ� ȣ��
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(11);
		dmbcellphone.turnOffDmb();

	}

}

class CellPhone {
	String model;
	String color;
	
	void powerOn() { System.out.println("������ �մϴ�.");}
	void powerOff() { System.out.println("������ ���ϴ�.");}
	void bell() { System.out.println("���� �︳�ϴ�.");}
	void sendVoice(String message) { System.out.println("�ڱ�: " + message);}
	void receiveVoice(String message) { System.out.println("����: " + message);}
	void hangUp() { System.out.println("��ȭ�� �����ϴ�.");}
}

class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}	
}