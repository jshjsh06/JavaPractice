package practice_inheritance;

public class Practice_Inheritance3_Polymorph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child;
		// Parent parent = new Child();
		parent.method1();
		parent.method2();
//		parent.method3(); // 호출불가능
		//★★★★★ 부모는 자식을 끌어안고 자식만을 생각함. 하지만 부모가 가진 것 내에서만 자식을 우선한다!
		// 강제형변환으로 실행시킬수는 있다.
		Child child2 = (Child) parent;
		child2.method3();
		
		// boolean result = 좌항(객체) instanceof 우항(타입)
		// parent instanceof Child => Parent 매개변수가 참조하는 객체가 Child인가 를 판단 
		// 또는 Child 타입으로 변환이 가능한지 확인한다. 라고 봐도 됨
	}

}

class Parent {
	public void method1() {
		System.out.println("Parent-Method1()");
	}
	
	public void method2() {
		System.out.println("Parent-Method2()");
	}
}

class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-Method2()");
	}
	
	public void method3() {
		System.out.println("Child-Method3()");
	}
}