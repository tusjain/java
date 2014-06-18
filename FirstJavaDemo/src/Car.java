
public class Car {
	
	Wheel wheel1;
	Wheel wheel2;
	Wheel wheel3;
	Wheel wheel4;
	
	 int lightCounts;
	
	static int doors = 4;
	
	void drive(){
		
		System.out.println("I am driving");
	}
	
	 static void changeGear(){
		System.out.println(" I am constant across objects beacuse I belong to class not object");
	}
	
	Car(){
		wheel1 = new Wheel(20, true);
		wheel2 = new Wheel(20, true);
		wheel3 = new Wheel(20, true);
		wheel4 = new Wheel(20, true);
		lightCounts=4;
		System.out.println("created car with default constructor");
	}
	/*
	void Car(){
		
	}
	*/
	Car(int lights){
		wheel1 = new Wheel(15, true);
		wheel2 = new Wheel(15, true);
		wheel3 = new Wheel(15, false);
		wheel4 = new Wheel(15, false);
		lightCounts=lights;
		System.out.println("created car with constructor where I can choose lights");
	}
}