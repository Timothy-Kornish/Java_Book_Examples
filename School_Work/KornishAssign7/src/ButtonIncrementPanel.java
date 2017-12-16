import java.awt.*;

import java.awt.event.*;
import javax.swing.*;


public class ButtonIncrementPanel extends JPanel{

	private int count;
	private JButton pushUp, pushDown;
	private JLabel label;
	
	public ButtonIncrementPanel(){
		
		count =50;
		
		pushUp = new JButton("Increment");
		pushUp.addActionListener(new ButtonListenerUp());
		
		pushDown = new JButton("Decrement");
		pushDown.addActionListener(new ButtonListenerDown());
		
		label = new JLabel("Count: "+count);
		
		add(pushUp);
		add(pushDown);
		add(label);
		
		setPreferredSize(new Dimension(500,40));
		setBackground(Color.cyan);
		
	}
	private class ButtonListenerUp implements ActionListener 
	{
		
		public void actionPerformed(ActionEvent event)
		{
			count++;
			label.setText("Count: " +count);
			
		}
		
	}
	private class ButtonListenerDown implements ActionListener 
	{
		
		public void actionPerformed(ActionEvent event)
		{
			count--;
			label.setText("Count: " +count);
			
		}
		
	}
}
