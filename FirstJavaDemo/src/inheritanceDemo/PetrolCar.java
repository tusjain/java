package inheritanceDemo;

public class PetrolCar extends Car {
	
	public void getWheel(){
		
		PetrolCar pCar = new PetrolCar();
		pCar.wheel = null;
		
	}
	public void consumeFuel(){
		super.consumeFuel();
		System.out.println("PetrolCar is consuming fuel");
	}
	
	 public PetrolCar(){
		System.out.println("I am making a PetrolCar");
	}

}
