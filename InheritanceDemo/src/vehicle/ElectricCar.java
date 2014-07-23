package vehicle;

abstract public class ElectricCar extends Car{
	
	/*void consumeFuel(){
		System.out.println("ElectricCar is consuming fuel");
	}*/
	
	void forwardMove(){
		System.out.println("Electric Car is moving forward");
	}
	
	void backwardMove(){
		System.out.println("Electric Car is moving backward");
	}
}
