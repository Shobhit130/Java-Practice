package abstract_classes_practice;

public class fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c[] = new Car[2];
		c[0] = new Car("Honda City","UP85AQ8129",21,"White");
		c[1] = new Car("Ford Eco Sport","UP85AF9098",24,"White");
		for(int i=0;i<c.length;i++) {
			c[i].show();
		}
		System.out.println("The cars with mileage > 23 are:");
		for(Car m:c) {
			m.find();
		}
	}

}
class Vehicle{
	String vehicle_name;
	String vehicle_number;
	public Vehicle(String vehicle_name,String vehicle_number) {
		this.vehicle_name = vehicle_name;
		this.vehicle_number = vehicle_number;
	}
	public void show() {
		System.out.println("Vehicle Name: "+vehicle_name);
		System.out.println("Vehicle Number: "+vehicle_number);
	}
}
class Car extends Vehicle{
	int mileage;
	String colour;
	public Car(String vehicle_name,String vehicle_number,int mileage,String colour) {
		super(vehicle_name,vehicle_number);
		this.mileage = mileage;
		this.colour = colour;
	}
	public void show() {
		System.out.println("Mileage: "+mileage);
		System.out.println("Colour: "+colour);
		super.show();
	}
	public void find() {
		if(mileage>23) {
			show();
		}
	}
}
class Truck extends Vehicle{
	int no_tires;
	int capacity;
	public Truck(String vehicle_name,String vehicle_number,int no_tires,int capacity) {
		super(vehicle_name,vehicle_number);
		this.capacity = capacity;
		this.no_tires = no_tires;
	}
	public void show() {
		System.out.println("Number of tires: "+no_tires);
		System.out.println("Capacity: "+capacity);
		super.show();
	}
}