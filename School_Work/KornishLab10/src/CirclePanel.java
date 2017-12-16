import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class CirclePanel extends JPanel{

	private final int NUM_CIRCLES =100;
	private final int MIN_DIAMETER =5;
	private final int MAX_DIAMETER =30;
	private final int MAX_COLORVALUE =256;
	private final int MAX_X = 370;
	private final int MAX_Y =170;
	
	private Random gen;
	
	public CirclePanel(){
		gen = new Random();
		setBackground(Color.black);
		setPreferredSize(new Dimension(400,200));
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		
		int x, y, diameter;
		
		for (int count =0; count <NUM_CIRCLES; count++){
			x = gen.nextInt(MAX_X)+1;
			y = gen.nextInt(MAX_Y)+1;
			
			diameter = gen.nextInt(MAX_DIAMETER)+1;
			int color1 = gen.nextInt(MAX_COLORVALUE);
			int color2 = gen.nextInt(MAX_COLORVALUE);
			int color3 = gen.nextInt(MAX_COLORVALUE);
			
			if (diameter <= MIN_DIAMETER){
				page.setColor(new Color(color1,color2,color3));
				page.fillOval(x,y,diameter, diameter);
			} else if (diameter > MIN_DIAMETER && diameter <= (MAX_DIAMETER-10)){
				page.setColor(new Color(color1,color2,color3));
				page.fillOval(x,y,diameter, diameter);
			}
			
			else{
				page.setColor(new Color(color1,color2,color3));
				page.fillOval(x, y, diameter, diameter);
			}
		}
	}
}
