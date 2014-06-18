package proxy;
abstract class Graphic { 
	public abstract void load(); 
	public abstract void draw(); 
} 
class Image extends Graphic{ 
	public void load() { 

	} 
	public void draw() { 

	} 

} 
class ImgProxy extends Graphic { 
	public void load() { 
		//if(image == null) { 
		//	image = new Image(filename); 
		//} 

	}
		public void draw() { 

		} 

	} 
