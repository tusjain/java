package pac1.pac2.pac3;

public class Box {
	double width=0.0;
	double height;
	double depth;
	 // sets dimensions of the box
	void setDim(double w, double h, double d){
		width = w; 
		height = h; 
		depth = d;
		}
	 double volume() {
		return width * height * depth; }
	
	Box(){
		
		}
	
	Box(double width, double height, double depth ){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

}
