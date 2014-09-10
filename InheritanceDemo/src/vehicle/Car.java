package vehicle;

 abstract public class Car {
//abstract public class Car implements Vechical{
	Wheel wheel[];
	
	abstract void forwardMove();
	
	/*void move(){
		System.out.println(" Car is moving");
	}*/
	
	void stop(){
		System.out.println("Car is stopped");
	}
	
	abstract void consumeFuel();
	
/*	void consumeFuel(){
		System.out.println(" Car is consuming fuel");
	}
*/

	
	Car(){
		System.out.println("This is Car's default constructor");
	}
}
