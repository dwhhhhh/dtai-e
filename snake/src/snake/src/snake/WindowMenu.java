package snake.src.snake;

import javax.swing.JFrame;

public class WindowMenu extends JFrame{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   public WindowMenu(String s) {
		   setTitle(s);
		   setBounds(600,150,490,550);
		   setVisible(true);	  	   
		   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   }
}

