package snake.src.snake;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class SnakeNode {  //由不同的点来建立起蛇身
	   int firstX;
	   int firstY;
	   ArrayList<Node> snakebody = new ArrayList<Node>();
	   public SnakeNode() {}
	   public void eatFood(Food food) {	    	
	        if(firstX == food.getX() && firstY == food.getY()) {	       	   
	        this.snakebody.add(new Food());
	        food.createFood(this);
	        }
	        }
	    	
	   public void move(int direction,Food food,Timer time) {//定义蛇身移动的方法
	        this.firstX = this.snakebody.get(0).getX();//获取蛇第一个点的x坐标
	        this.firstY = this.snakebody.get(0).getY();//获取蛇第一个点的y坐标
	        switch(direction) {
	            case 1:
	                firstY--;
	                break;
	            case -1:
	                firstY++;
	                break;
	            case 2:
	                firstX--;
	                break;
	            case -2:
	                firstX++;
	                break;
	            default:
	                break;
	        }
	        
	        this.eatFood(food);
	        for(int i = 0; i < this.snakebody.size(); i++) {
	             	
	             if(firstX == this.snakebody.get(i).getX() && firstY ==  this.snakebody.get(i).getY())
	             	this.dead("你吃到自己啦~~~~~",time);
	             }
	             if(firstX < 1 || firstX > 22  || firstY < 4 || firstY > 24 ) {
	                 this.dead("你撞墙啦~~~~~",time);
	             }
	       
	        for(int x = this.snakebody.size() - 1; x >0; x--) {
	        	this.snakebody.get(x).setX(this.snakebody.get(x-1).getX());
	        	this.snakebody.get(x).setY(this.snakebody.get(x-1).getY());
	          }
	        this.snakebody.get(0).setX(firstX);
	        this.snakebody.get(0).setY(firstY);	        
	    }
	   
	   public void dead(String s,Timer time)  {        
 		  String str = s +"\n" +"所以游戏结束";
 		  time.stop();
 		  JOptionPane.showMessageDialog(null,str);  
 		  new ReStart();
        }




	
}
