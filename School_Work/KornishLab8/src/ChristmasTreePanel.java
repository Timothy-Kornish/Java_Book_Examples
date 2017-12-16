import javax.swing.*;
import java.awt.*;

public class ChristmasTreePanel extends JPanel{

	private Circle circle1,circle2,circle3,circle4,circle5,circle6;
	private Rectangle rect1,rect2,rect3,rect4,rect5,rect6;
	
	public ChristmasTreePanel(){
		
		setPreferredSize(new Dimension(500,500));
		setBackground(Color.black);
		
		circle1 = new Circle(20,Color.green,250,300);
		circle2 = new Circle(25,Color.red, 220,320);
		circle3 = new Circle(22,Color.blue, 270,330);
		circle4 = new Circle(25, Color.pink, 260, 350);
		circle5 = new Circle(30, Color.cyan, 200,390);
		circle6 = new Circle(30, Color.gray, 300,385);
		
		rect1 = new Rectangle(50,10,Color.orange,150,440);
		rect2 = new Rectangle(70,20,Color.green, 200,430);
		rect3 = new Rectangle(40,50, Color.red, 220,400);
		rect4 = new Rectangle(50,50, Color.yellow,260,400);
		rect5 = new Rectangle(80,40,Color.cyan,280,410);
		rect6 = new Rectangle(30,70,Color.magenta,310,380);
	}
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		
		page.setColor(Color.green);
		page.drawLine(250,250,150,450);
		page.drawLine(250, 250, 350, 450);
		
		rect1.draw(page);
		rect2.draw(page);
		rect3.draw(page);
		rect4.draw(page);
		rect5.draw(page);
		rect6.draw(page);
		
		circle1.draw(page);
		circle2.draw(page);
		circle3.draw(page);
		circle4.draw(page);
		circle5.draw(page);
		circle6.draw(page);
		
		page.setColor(Color.white);
		page.drawString("Merry Christmas!", 200, 200);
		
		
		
		
		
		
		
		
		
		
	}

}
