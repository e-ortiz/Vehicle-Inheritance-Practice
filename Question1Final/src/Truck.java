
public class Truck extends Vehicle implements VehicleInterface{
	private int NumberOfAxles;
	
	public Truck(String name, String color, double weight, Person owner, int numberOfAxles){
		this.Name = name;
		this.Color = color;
		this.Owner = owner;
		this.NumberOfAxles = numberOfAxles;
	}
	

	public int getNumberOfAxles() {
		return NumberOfAxles;
	}

	public void setNumberOfAxles(int numberOfAxles) {
		this.NumberOfAxles = numberOfAxles;
	}


	@Override
	public String toString() {
		return "Truck [NumberOfAxles=" + NumberOfAxles + ", Name=" + Name
				+ ", Color=" + Color + ", Weight=" + Weight + ", Owner="
				+ Owner + ", getNumberOfAxles()=" + getNumberOfAxles()
				+ ", getName()=" + getName() + ", getColor()=" + getColor()
				+ ", getWeight()=" + getWeight() + ", getOwner()=" + getOwner()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
