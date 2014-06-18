
public class Wheel {
	
	int diameter;
	boolean tubeless;
	boolean turn(){
		System.out.println("It is fun to turn");
		return true;
	}
	
	Wheel (int diameter, boolean tubeless){
		this.diameter = diameter;
		this.tubeless = tubeless;
	}

}
