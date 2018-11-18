package practice_inheritance;

public class Practice_Inheritance5_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("---------");
		
		// 변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("---------");
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	// static을 붙여야하는 이유는 main메소드가 static으로 선언되었기 때문에 static만 수용가능하다.
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}

abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // 추상메소드는 {}가 필요없다.
}

class Dog extends Animal {
	Dog() {
		this.kind = "포유류";
	}
	
	@Override // 부모클래스의 추상메소드를 재정의하지 않으면 오류가 남.
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	Cat() {
		this.kind = "포유류";
	}
	
	@Override // 부모클래스의 추상메소드를 재정의하지 않으면 오류가 남.
	public void sound() {
		System.out.println("야옹");
	}
}