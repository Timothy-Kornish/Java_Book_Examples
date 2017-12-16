import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DirectionPanel extends JPanel{

		private final int WIDTH =800, HEIGHT =800;
		private final int JUMP =10;
		
		private final int IMAGE_SIZE =31;
		
		private ImageIcon up, down, right, left,currentImage;
		private int x, y;
		
		public DirectionPanel(){
			addKeyListener(new DirectionListener());
			x=WIDTH/2;
			y=HEIGHT/2;
			
			up = new ImageIcon("./src/arrowUp.png");
			down = new ImageIcon("./src/arrowDown.png");
			left = new ImageIcon("./src/arrowLeft.png");
			right = new ImageIcon("./src/arrowRight.png");
			
			currentImage = right;
			
			setBackground(Color.black);
			setPreferredSize(new Dimension(WIDTH, HEIGHT));
			setFocusable(true);
		}
		
		public void paintComponent(Graphics page){
			super.paintComponent(page);
			currentImage.paintIcon(this, page, x, y);
		}
		private class DirectionListener implements KeyListener{
			
			public void keyPressed(KeyEvent event){
				switch (event.getKeyCode()){
				case KeyEvent.VK_UP:
					currentImage=up;
					y-=JUMP;
					break;
				case KeyEvent.VK_DOWN:
					currentImage=down;
					y+=JUMP;
					break;
				case KeyEvent.VK_LEFT:
					currentImage=left;
					x-=JUMP;
					break;
				case KeyEvent.VK_RIGHT:
					currentImage=right;
					x+=JUMP;
					break;
				}
				repaint();
			}
			public void keyTyped(KeyEvent event){}
			public void keyReleased(KeyEvent event){}
		}
}
