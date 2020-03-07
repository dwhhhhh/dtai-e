package snake.src.snake;

import java.awt.Color;
 

public class Node {
	   int x;  
	   int y;
	   Color color;
	   public Node() {}
	   public Node(int x, int y, Color color) {
		   this.x = x;
		   this.y = y;
		   this.color = color;
	}
	   public int getX() {
	       return x;
	       }
	   public void setX(int x) {
	       this.x = x;
	       }
	   public int getY() {
	       return y;
	       }
	   public void setY(int y) {
	       this.y = y;
	       }
	   public Color getColor() {
	       return color;
	       }
	   public void setColor(Color color) {
	       this.color = color;
	       }
	
}
