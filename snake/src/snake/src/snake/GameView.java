package snake.src.snake;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

public class GameView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon bg;
	JLabel label;
	
	ImageIcon sti ;
	JButton start;
	
	public GameView() {
		init();
		setBounds(600,150,600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	void init() {
		setLayout(null);	
		
		bg = new ImageIcon("mainbg.png");
		label = new JLabel(bg);
		add(label);
		label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		
		sti = new ImageIcon("start.png");
		start = new JButton(sti);
		add(start);
		start.setBounds(200, 400,200, 100);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				setVisible(false);
				WindowMenu win = new WindowMenu("贪吃蛇");  //新建一个窗口
				SnakeGameView game = new SnakeGameView();//新建一个有画布的容器
				win.add(game);
				game.requestFocus(); //给该窗口获得屏幕焦点。
				
			}
		});
		
		validate();
	}
}
	