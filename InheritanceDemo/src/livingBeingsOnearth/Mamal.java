package livingBeingsOnearth;

public class Mamal extends LivingBeing{
	int numberOfBackbones;
	
	public void giveBirth(){
		System.out.println("Mamals give live baby birth");
	}
	
	public void walk(){
		System.out.println("Mamals is walking");
	}
	
	protected void fly(){
		System.out.println("Mamals is flying");
	}
	
	void test(){
		this.fly();
	}
	
	public Mamal(){
		System.out.println(" In default constructor of Mamal");
	}
	
	public Mamal(int numberOfBackbones){
		this.numberOfBackbones = numberOfBackbones;
		System.out.println(" In non default constructor of Mamal");
	}

}
