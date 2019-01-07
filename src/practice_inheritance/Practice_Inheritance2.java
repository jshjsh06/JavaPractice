package practice_inheritance;

public class Practice_Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People("a", "11");
		Student student = new Student("a","11",11);
		System.out.println(people.areaCircle(1));
		System.out.println(student.areaCircle(1));
	}
}

class People{
	String name;
	String ssn;
	
	People(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
	double areaCircle(double r) {
		System.out.println("People 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
	
}

class Student extends People {
	int studentNo;
	
	Student(String name, String ssn, int studentNo) {
		// 부모의 생성자가 2개의 매개변수를 받으므로 반드시 이를 맞춰줘야한다.
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	// 재정의하기
	@Override
	double areaCircle(double r) {
		System.out.println("Student 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	void missParent() {
		//재정의 하지않은 부모 함수 불러오기
		super.areaCircle(1);
	}
}
