package pack;

import pac1.pac2.Box;

public class Execution {

	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		
		Box.color = "black";
		
		System.out.println("color of box1  : " + myBox1.color);
		System.out.println("color of box2  : " + myBox2.color);
		System.out.println("color of Box  : " + Box.color);
		
		myBox1.color = "white";
		
		System.out.println("color of box1  : " + myBox1.color);
		System.out.println("color of box2  : " + myBox2.color);
		System.out.println("color of Box  : " + Box.color);
		

	}

}
