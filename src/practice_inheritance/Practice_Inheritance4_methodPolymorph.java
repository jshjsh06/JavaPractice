package practice_inheritance;

public class Practice_Inheritance4_methodPolymorph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);
	}

}

class Vehicle {
	void run() {
		System.out.println("������ �޸��ϴ�");
	}
}

class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("������ �޷���");
	}
}

class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("taxi�� �޷���");
	}
}