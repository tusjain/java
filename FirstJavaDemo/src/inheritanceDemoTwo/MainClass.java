package inheritanceDemoTwo;

import inheritanceDemo.Car;
import inheritanceDemo.PetrolCar;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.run();
		
		PetrolCar pCar = new PetrolCar();
		pCar.run();
		//pCar.engine= null;
		pCar.getWheel();

	}

}
