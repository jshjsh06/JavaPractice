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
		System.out.println("차량이 달립니다");
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
		System.out.println("버스가 달려유");
	}
}

class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("taxi가 달려유");
	}
}