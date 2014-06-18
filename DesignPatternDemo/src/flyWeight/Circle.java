package flyWeight;
import java.awt.*; 
import java.util.HashMap; 
import java.awt.Color; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 
class Circle { 
	private Color color; 

	public Circle(Color color) { 
		this.color = color; 
	} 
	public void draw(Graphics g, int x, int y, int r) { 
		g.setColor(color); 
		g.drawOval(x, y, r, r); 
	} 
}	