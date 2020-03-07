package snake.src.snake;

import java.awt.Color;
import java.util.Random;

public class Food extends Node{
	public Food() {}
	public  Food(int x, int y, Color color) {
	   this.x = x;
	   this.y = y;
	   this.color = color;
	} 
       public void createFood(SnakeNode snake) {
    	   
    	   x = new Random().nextInt(20)+2;
	    	y = new Random().nextInt(18)+5;
	    	for(int i = 0; i < snake.snakebody.size(); i++) {
	    		if(snake.snakebody.get(i).getX() == x && snake.snakebody.get(i).getY() == y)
	    			{
	    		    createFood(snake);
	    		    break;
	    		    }
	    		
	    	this.setX(x);
	        this.setY(y);
	        this.setColor(Color.white);
	        
	    }
       }
}
