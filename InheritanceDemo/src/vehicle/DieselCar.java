package vehicle;

public class DieselCar extends Car{
	void consumeFuel(){
		System.out.println("DieselCar is consuming fuel");
	}
	
	void forwardMove(){
		System.out.println("Diesel Car is moving forward");
	}
	
	void backwardMove(){
		System.out.println("Diesel Car is moving backward");
	}
}
