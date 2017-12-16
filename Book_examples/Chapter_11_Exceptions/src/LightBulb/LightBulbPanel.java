package LightBulb;

import javax.swing.*;
import java.awt.*;

public class LightBulbPanel extends JPanel{

	private boolean on;
	private ImageIcon lightOn, lightOff;
	private JLabel imageLabel;
	
	public LightBulbPanel(){
		lightOn = new ImageIcon("./src/lightbulb-128.png");
		lightOff = new ImageIcon("./src/lightbulb_off.png");
		
		setBackground(Color.yellow);
		setPreferredSize(new Dimension(300,300));
		
		on = true;
		imageLabel=new JLabel(lightOff);
		add(imageLabel);
	}
	
	public void paintComponent(Graphics page){
		super.paintComponent(page);
		if(on){
			imageLabel.setIcon(lightOn);
		}
		else{
			imageLabel.setIcon(lightOff);
		}
	}
	public void setOn(boolean lightBulbOn){
		on=lightBulbOn;
	}
}
