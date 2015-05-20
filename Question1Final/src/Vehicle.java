
abstract public class Vehicle implements VehicleInterface{
	protected String Name;
	protected String Color;
	protected double Weight;
	protected Person Owner;
	
	
	
	public String getName() {
		return this.Name;
	}



	public void setName(String name) {
		this.Name = name;
	}



	public String getColor() {
		return this.Color;
	}



	public void setColor(String color) {
		this.Color = color;
	}



	public double getWeight() {
		return this.Weight;
	}



	public void setWeight(double weight) {
		this.Weight = weight;
	}



	public Person getOwner() {
		return this.Owner;
	}



	public void setOwner(Person owner) {
		this.Owner = owner;
	}



	public void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}
	
	

}
