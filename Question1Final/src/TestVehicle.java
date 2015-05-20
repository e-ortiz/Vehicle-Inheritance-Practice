import java.util.UUID;


public class TestVehicle {
	
	public static void main(String[] args) {
		Person p = new Person("p", "body", new UUID (10, 10));
		Car c = new Car("c", "red", 1200, p, 4);
		Truck t = new Truck("c", "blue", 4000, p, 6);
		
		Person b = new Person("b", "bro", new UUID (10, 10));
		
		MotorCycle m = new MotorCycle("m", "black", 400, b, false);
		t.transferOwnership(b);
	}
	
}
