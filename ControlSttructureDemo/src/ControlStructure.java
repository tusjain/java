public class ControlStructure {
	boolean isRainingLight = false;
	boolean isRainingHeavy;
	int count = 0;
	int j =1;
	void myIfMethod(){
		if(isRainingLight){
			System.out.println(" I should carry umbrella");
			}
		else if(isRainingHeavy){
			System.out.println(" I should carry umbrella");
		}
		else{
			System.out.println(" It is not raining");
			}
	}
	
	void myForMethod(){
		//intilaiser,condition,increment
		for (int i=0; i< 3; i++){
			System.out.println("In for loop");
			
		}
	}
	
	void myWhileMethod(){
		while (count <= 3) { 
			count ++;
			System.out.println("In while");
		}
	}
	
	void myDoWhileMethod(){
		do {
			System.out.println("In do");
			count ++;
			} 
		while (count <=3);
	}
	
	void mySwitchMethod(){
		switch(j){
			case 1:
				System.out.println("in case1");
				break;
			case 2:
				System.out.println("in case 2");
				break;
			//default:
				//System.out.println("in default");
		}
	}
	

}