package vehicle;

public class CamryLE extends Camry{
	int seat = 4;
	String seatCovering ="Cloth";
	void stop(){
		System.out.println("This is Camry LE or SE  stop - not using ABS");
	}
	
	public void consumeFuel(){
		System.out.println(" I am testing super");
		super.consumeFuel();
		System.out.println("Camry LE is consuming fuel");
	}
	
	CamryLE(String seatCovering){
		this.seatCovering = seatCovering;
	}
	
	CamryLE(){
		System.out.println("Default constructor in Camry LE");
		
	}
}