package snake.src.snake;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class SnakeNode {  //�ɲ�ͬ�ĵ�������������
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
	    	
	   public void move(int direction,Food food,Timer time) {//���������ƶ��ķ���
	        this.firstX = this.snakebody.get(0).getX();//��ȡ�ߵ�һ�����x����
	        this.firstY = this.snakebody.get(0).getY();//��ȡ�ߵ�һ�����y����
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
	             	this.dead("��Ե��Լ���~~~~~",time);
	             }
	             if(firstX < 1 || firstX > 22  || firstY < 4 || firstY > 24 ) {
	                 this.dead("��ײǽ��~~~~~",time);
	             }
	       
	        for(int x = this.snakebody.size() - 1; x >0; x--) {
	        	this.snakebody.get(x).setX(this.snakebody.get(x-1).getX());
	        	this.snakebody.get(x).setY(this.snakebody.get(x-1).getY());
	          }
	        this.snakebody.get(0).setX(firstX);
	        this.snakebody.get(0).setY(firstY);	        
	    }
	   
	   public void dead(String s,Timer time)  {        
 		  String str = s +"\n" +"������Ϸ����";
 		  time.stop();
 		  JOptionPane.showMessageDialog(null,str);  
 		  new ReStart();
        }




	
}
