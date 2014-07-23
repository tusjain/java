package vehicle;

abstract public class PetrolCar extends Car implements Carburator{
	void consumeFuel(){
		System.out.println("PetrolCar is consuming fuel");
	}
}
