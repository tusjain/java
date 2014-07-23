package vehicle;

public class Camry extends PetrolCar {
	//final int wheels = 4;
	
	Wheel wheel[] = new Wheel[4];
	
	String logo="CAMRY";
	int seats;
	void airConditioning(){
		System.out.println("Camry is doing air conditioning");
	}
	void transmission(){
		System.out.println("This is Camry Transmission");
	}
	
	void forwardMove(){
		System.out.println(" cmary is moving forward");
	}
	
	void backwardMove(){
		System.out.println(" cmary is moving backward");
	}
	
	public void mixing(){
		System.out.println(" Camry hs computer added mixixg of petrol and air");
	}
	
	public void consumeFuel(){
		System.out.println("Fuel consumption in Camry");
	}
	
	Camry(){
		
		System.out.println("This is default constructor in Camry");
	}

}
