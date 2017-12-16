import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class OffCenterPanel extends JPanel{

	private final int WIDTH=300, HEIGHT =300;
	
	private DecimalFormat fmt;
	private Point current;
	private int centerX,centerY;
	private double length;
	
	public OffCenterPanel(){
		addMouseListener(new OffCenterListener());
		centerX =WIDTH/2;
		centerY=HEIGHT/2;
		
		fmt = new DecimalFormat("0.##");
		
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setBackground(Color.yellow);
		
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		
		page.setColor(Color.black);
		page.drawOval(centerX-3, centerY-3, 6, 6);
		
		if(current !=null){
			page.drawLine(current.x, current.y, centerX, centerY);
			page.drawString("Distance from center: " +fmt.format(length),10,15);
		}
	}
	
	private class OffCenterListener extends MouseAdapter{
		public void mouseClicked(MouseEvent event){
			current =event.getPoint();
			length =Math.sqrt(Math.pow((current.x-centerX), 2) +Math.pow((current.y-centerY),2));
			
			repaint();
		}
	}
}
