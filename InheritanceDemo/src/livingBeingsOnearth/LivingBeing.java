package livingBeingsOnearth;

public class LivingBeing { 
	public String DNA;
	
	public void metabolism(){
		System.out.println(" All living beings have metabolism");
	}
	
	public LivingBeing(String DNA){
		this.DNA = DNA;
		System.out.println(" In non default constructor of LivingBeing");
	}
	
	public LivingBeing(){
		System.out.println(" In default constructor of LivingBeing");
	}

}
