package inheritanceDemoTwo;

import inheritanceDemo.PetrolCar;

public class Camry extends PetrolCar{
	
	public void accessEngine(){
		Camry  camry = new Camry();
		//camry.engine = null;
		camry.wheel = null;
		
	}
	public void consumeFuel(){
		System.out.println("Camry  is consuming fuel");
	}
	
	public Camry(){
		System.out.println("I am making a Camry");
	}

}
