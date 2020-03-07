package snake.src.snake;

import java.awt.*;

import java.awt.event.*;
import javax.swing.ImageIcon;

import javax.swing.*;
public class SnakeGameView extends JPanel implements KeyListener{
	  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ImageIcon backg;
	SnakeNode snake;
	Food food;
    int direction1 = 1;
    int direction2 = 1 ;
    
    Timer time ;
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        backg = new ImageIcon("bg.jpg");
        backg.paintIcon(this, g, 0, 60);
        g.setColor(food.getColor());
        g.fillOval(food.getX()*20, food.getY()*20, 20, 20);
        g.setColor(food.getColor());
        g.drawRect(0, 0, 30*30,30*27);   
        for(int x = 0; x < snake.snakebody.size(); x++) {
            g.setColor(snake.snakebody.get(x).getColor());
            g.fillOval(snake.snakebody.get(x).getX()*20, snake.snakebody.get(x).getY()*20, 20, 20);
        } 
        g.setColor(Color.red);
        g.setFont(new Font("����",Font.PLAIN,30));
        g.drawString("Score:"+(snake.snakebody.size()-3), 250, 40);
        g.drawString("�ո����ͣ", 50, 40);
    }
   
    
    
    public SnakeGameView() {
    time = new Timer(400,new ThingsListener());
    
    food = new Food();
    
    snake=new SnakeNode();
    snake.snakebody.add(new Node(10,15,Color.RED));
    snake.snakebody.add(new Node(10,16,Color.BLUE));
    snake.snakebody.add(new Node(10,17,Color.BLUE));
    time.start();
    food.createFood(snake);
    this.addKeyListener(new KeyAdapter() {//��׽���̵İ����¼�
        public void keyPressed(KeyEvent e) {
            
            switch(e.getKeyCode()) {
                case KeyEvent.VK_UP://�������ϣ�����1
                    direction2 = 1;
                    break;
                case KeyEvent.VK_DOWN://�������£�����-1
                    direction2 = -1;
                    break;
                case KeyEvent.VK_LEFT://�������󣬷���2
                    direction2 = 2;
                    break;
                case KeyEvent.VK_RIGHT://�������ң�����-2
                    direction2 = -2;
                    break;
                case KeyEvent.VK_SPACE:
                	time.stop();
                	new Keep(time);
                	break;
                default:
                    break;
            }
            if(direction2 + direction1 !=0) {//���ܷ����˶�
                direction1 = direction2;
                snake.move(direction2,food,time);
                repaint();
            }
        }
    });
 
    }

    class ThingsListener implements ActionListener {//����һ���������¼�
        public void actionPerformed(
        		ActionEvent e) {
                snake.move(direction1,food,time);
                repaint();
        }
    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

