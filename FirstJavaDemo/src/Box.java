public  class Box {
	public double width=0.0;
	private double height;
	double depth;
	final String color = "Blue";
	static String material = "foam";
	String texture = "Smooth";
	
	// sets dimensions of the box
	public void setDim(double width, double h, double d){
		this.width = width; 
		height = h; 
		depth = d;
		}
	void setWidth(double w){
		width = w;
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
	
	public Box(){
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
	
	/*void changeColor(){
		color = "RED";
	}*/
	
	final void changeTexture(String texture){
		this.texture = texture;
	}
	
	void changeTexture(){
		this.texture = "Rough";
	}
	
	protected void finalize(){	
		System.out.println(" I am in finalize");
	} 
}