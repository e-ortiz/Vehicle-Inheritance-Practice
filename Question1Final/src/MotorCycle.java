
public class MotorCycle extends Vehicle implements VehicleInterface{
	private Boolean hasSideCar;
	
	public MotorCycle(String name, String color, double weight, Person owner, Boolean hasSideCar){
		this.Name = name;
		this.Color = color;
		this.Owner = owner;
		this.hasSideCar = hasSideCar; 
	}
	
	public Boolean getHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(Boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	
	
}
