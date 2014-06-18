package inheritanceDemo;

public class Car {
	public double length;
	public double height;
	public double width;
	public double weight;
	
	Engine engine;
	protected Wheel wheel;
	
	public void run(){
		System.out.println("Car is running");
	}
	public void consumeFuel(){
		System.out.println("car is consuming fuel");
	}
	
	public Car(){
		System.out.println("I am making a Car");
	}

}
