package snake.src.snake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Keep extends JFrame implements ActionListener{
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		ImageIcon bg;
		JLabel label;
		
		ImageIcon kp;
		JButton keep;
		
		ImageIcon ba;
		JButton back;
		
	    public Keep(Timer time) {
		    initre(time);
		    setBounds(600,150,600,600);
		    setVisible(true);	  
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    }
	   	void initre(Timer time){
	   		setLayout(null);
	   		
			bg = new ImageIcon("keepbg.png");
			label = new JLabel(bg);
	   		add(label);
			label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
		
			kp = new ImageIcon("rebutton.png");
			keep = new JButton(kp);
			
		    add(keep);
		    keep.setBounds(210, 290,160, 55);
		keep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				time.restart();
				setVisible(false);
			}
		});
		
		ba = new ImageIcon("backbutton.png");
		back = new JButton(ba);
		add(back);
		back.setBounds(220, 400,140, 55);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new GameView();
			}
		});
		
	   	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
