public class BoxDemo {

	public static void main(String args[]) {
			Box mybox1 = new Box();
			Box mybox2 = new Box();
			Box myBox3 = new Box(2, 7, 9);
			mybox1.setDim(10,20,15);
			mybox2.setDim(3,6,9);
			
			//mybox1.height = 10;
			//mybox1.color = "GREY";
			mybox1.changeTexture("Rough");
			
			
			/*
			System.out.println("Volume is :" + mybox1.volume());
			System.out.println("Volume is :" + mybox2.volume());
			
			
			System.out.println("volume of box without dimension" + mybox1.volume());
			System.out.println("volume of box with dimension" + mybox1.volume(12, 12, 12));
			*/
			//System.out.println(" material of Box1 is : "+ mybox1.material);
			//System.out.println(" material of Box2 is : "+ mybox2.material);
			
			System.out.println(" material of Box is : "+ Box.material);
			
			Box.material = "steel";
			
			System.out.println(" material of Box1 is : "+ mybox1.material);
			System.out.println(" material of Box2 is : "+ mybox2.material);
			
			System.out.println(" material of Box is : "+ Box.material);
			
			mybox1.material= "Copper";
			
			System.out.println("myBox2 is " + mybox2.material);
			
			//mybox1.finalize();
			
			
		}//end of main
	}// end of class	
