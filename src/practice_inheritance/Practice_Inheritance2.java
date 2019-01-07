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
		System.out.println("People ��ü�� areaCircle() ����");
		return 3.14159 * r * r;
	}
	
	
}

class Student extends People {
	int studentNo;
	
	Student(String name, String ssn, int studentNo) {
		// �θ��� �����ڰ� 2���� �Ű������� �����Ƿ� �ݵ�� �̸� ��������Ѵ�.
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	// �������ϱ�
	@Override
	double areaCircle(double r) {
		System.out.println("Student ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}
	
	void missParent() {
		//������ �������� �θ� �Լ� �ҷ�����
		super.areaCircle(1);
	}
}
