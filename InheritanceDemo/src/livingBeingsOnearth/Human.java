package livingBeingsOnearth;

public class Human extends Mamal{
	int numberOfHands = 2;
	int numberOfLegs = 2;
	
	public void doMath(){
		System.out.println("Human is doing math");
	}
	
	public void walk(){
		System.out.println("HUman is walking");
	}
	
	void test(){
		fly();
	}
	
    public Human (){
    	System.out.println(" In default constructor of Human ");
    	
    }
    
    public Human(int numberOfHands1, int numberOfLegs){
    	numberOfHands= numberOfHands1;
    	this.numberOfLegs = numberOfLegs;
    	System.out.println(" In no default constructor of Human ");
    }

}
