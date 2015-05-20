


public class Car extends Vehicle implements VehicleInterface{
	private int NumberOfDoors;
	
	public Car(String name, String color, double weight, Person owner, int numberOfDoors){
		this.Name = name;
		this.Color = color;
		this.Owner = owner;
		this.NumberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return this.NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.NumberOfDoors = numberOfDoors;
	}
	
	
}
