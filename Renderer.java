package flappyBird;

import javax.swing.JPanel;
import java.awt.Graphics;

public class Renderer extends JPanel {

	private static final long SericalVersionUID = 1L;
	
	@Override 
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//Pass through graphics
		FlappyBird.flappyBird.repaint(g);
		
	}
	
	
}
