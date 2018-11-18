package practice_inheritance;

public class Practice_Inheritance5_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		// ������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("---------");
		
		// �޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	// static�� �ٿ����ϴ� ������ main�޼ҵ尡 static���� ����Ǿ��� ������ static�� ���밡���ϴ�.
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}

abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound(); // �߻�޼ҵ�� {}�� �ʿ����.
}

class Dog extends Animal {
	Dog() {
		this.kind = "������";
	}
	
	@Override // �θ�Ŭ������ �߻�޼ҵ带 ���������� ������ ������ ��.
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	Cat() {
		this.kind = "������";
	}
	
	@Override // �θ�Ŭ������ �߻�޼ҵ带 ���������� ������ ������ ��.
	public void sound() {
		System.out.println("�߿�");
	}
}