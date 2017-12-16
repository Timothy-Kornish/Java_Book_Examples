import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class BoxesPanel extends JPanel {

	private final int NUM_BOXES =50, THICKNESS =5, MAX_SIDE =50;
	private final int MAX_X = 350, MAX_Y =250;
	private Random gen;
	
	public BoxesPanel(){
		gen = new Random();
		setBackground(Color.black);
		setPreferredSize(new Dimension(400,300));
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		
		int x, y, width, height;
		
		for (int count =0; count <NUM_BOXES; count++){
			x = gen.nextInt(MAX_X)+1;
			y = gen.nextInt(MAX_Y)+1;
			
			width = gen.nextInt(MAX_SIDE)+1;
			height = gen.nextInt(MAX_SIDE)+1;
			
			if (width <= THICKNESS){
				page.setColor(Color.yellow);
				page.fillRect(x,y,width, height);
			}
			else if (height <= THICKNESS){
				page.setColor(Color.green);
				page.fillRect(x, y, width, height);
				
			}
			else{
				page.setColor(Color.white);
				page.drawRect(x, y, width, height);
			}
		}
	}
}
