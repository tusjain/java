public class MainClass {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.lightCounts = 5;
		
		Car myCar2 = new Car(10);
		myCar.drive();
		Car.changeGear();
		myCar.changeGear();
	
		System.out.println(" lets found out the dorrs in car:  " + Car.doors);
		System.out.println(" lets found out the dorrs in car:  " + myCar.doors);
		System.out.println(" lets found out the dorrs in car:  " + myCar2.doors);
		
		Car.doors = 10;
		System.out.println(" lets found out the dorrs in car:  " + Car.doors);
		System.out.println(" lets found out the dorrs in car:  " + myCar.doors);
		System.out.println(" lets found out the dorrs in car:  " + myCar2.doors);
		
	}
	
	public void nonStaticMethod(){
		Car.changeGear();
	}
	
	

}
