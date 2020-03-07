package snake.src.snake;

import java.awt.event.*;
import javax.swing.*;

public class ReStart extends JFrame implements ActionListener{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ImageIcon bg;
	JLabel label;
	ImageIcon rest;
	JButton restart;
	ImageIcon bac;
	JButton back;
	    public ReStart() {
		    initre();
		    setBounds(600,150,600,600);
		    setVisible(true);	  
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    }
	   	void initre(){
	   		setLayout(null);
	   		bg = new ImageIcon("overbg.png");
	   		label = new JLabel(bg);
			add(label);
			label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());

			
			rest = new ImageIcon("rebutton.png");
			restart = new JButton(rest);
			add(restart);
			restart.setBounds(180, 320,230, 50);
			restart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					setVisible(false);
					WindowMenu win = new WindowMenu("贪吃蛇");
					SnakeGameView game = new SnakeGameView();
					win.add(game);
					game.requestFocus(); //给该窗口获得屏幕焦点。
				
				}
			});
			bac = new ImageIcon("backbutton.png");
			back = new JButton(bac);
			add(back);
			back.setBounds(180, 400,230, 50);
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					setVisible(false);
					new GameView();
				}
			});
		
	   		}
	   		@Override
	   	public void actionPerformed(ActionEvent e) {
	   			// TODO Auto-generated method stub
			
	   		}
	   	
	}