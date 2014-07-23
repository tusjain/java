public  class Box {
	double width=0.0;
	double height;
	double depth;
	static String material = "foam";
	
	// sets dimensions of the box
	void setDim(double w, double h, double d){
		width = w; 
		height = h; 
		depth = d;
		}
	 double volume() {
		return width * height * depth; }
	 
	 double volume(double d, double h, double w) {
		return d*h*w; }
	 
	 double volume(double d, double h, double w, double q) {
			return d*h*w; }
	 
	 double volume(float d, double h, double w) {
			return d*h*w; }
	 
	 static float volume(float d, int h, double w) {
			return 6; }
	 
	 double surfaceArea(double d, double h, double w){
		 
		 return 2*(d*h + h*w + w*d);
	 }
	
	Box(){
		// code here
		}
	
	Box(double width, double height, double depth ){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	Box(double width,  double depth ){
		this.width = width;
		
		this.depth = depth;
	}
}//end of class
