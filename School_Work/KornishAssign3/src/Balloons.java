import javax.swing.JApplet;
import java.awt.*;

public class Balloons extends JApplet{
	
	public void paint(Graphics page) {
		setBackground(Color.white);
		
		final int MID =20;
		final int TOP =10;
		final int Bottom = 30;
		//balloon1
		page.setColor(Color.blue);
		page.fillOval(40, 40, 20, 30);
		
		//balloon 2
		page.setColor(Color.red);
		page.fillOval(60, 40, 20, 30);
		
		//balloon 3
		page.setColor(Color.green);
		page.fillOval(80, 40, 20,30);
		
		//balloon 4
		page.setColor(Color.cyan);
		page.fillOval(20, 40,20, 30);
		
		//balloon 5 
		page.setColor(Color.pink);
		page.fillOval(30, 25, 20, 30);
		
		//balloon 6
		page.setColor(Color.gray);
		page.fillOval(50, 25, 20, 30);
		
		//balloon 7
		page.setColor(Color.magenta);
		page.fillOval(70, 25, 20, 30);
		
		//strings
		page.setColor(Color.black);
		
		page.drawLine(30, 70, 60, 180); //balloon 4 string
		page.drawLine(50, 70, 60, 180); //balloon 1 string
		page.drawLine(70, 70, 60, 180); //balloon 2 string
		page.drawLine(90, 70, 60, 180); //balloon 3 string
		page.drawLine(40, 55, 60, 180); //balloon 5 string
		page.drawLine(60, 55, 60, 180); //balloon 6 string
		page.drawLine(80, 55, 60, 180); //balloon 7 string
		
		page.drawString("BALLOONS!", 30, 200);
		
	}

}
