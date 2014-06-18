package pac1.pac2;

public class Box {
	
	public double width=0.0;
	public double height;
	public double depth;
	public static String color;
	 // sets dimensions of the box
	void setDim(double w, double h, double d){
		width = w; 
		height = h; 
		depth = d;
		}
	void setDim(){
		width = 20; 
		height = 30; 
		depth = 21;
	}
	
	double  setDim(double w, float h){
		width = w; 
		height = h; 
		depth = 45;
		return 200;
		}
	
	
	
	 double volume() {
		return width * height * depth; }
	
	public  Box(){
		
		}
	
	Box(double width, double height, double depth ){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

}
