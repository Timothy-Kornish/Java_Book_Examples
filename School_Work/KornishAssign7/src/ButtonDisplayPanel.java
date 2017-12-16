import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class ButtonDisplayPanel extends JPanel{
	
	private int count;
	private JButton push;
	private JLabel label;
	
	public ButtonDisplayPanel(){
		
		count =0;
		
		push = new JButton("Push Me!");
		push.addActionListener(new ButtonListener());
		
		label = new JLabel("Pushes: "+count);
		
		add(push);
		add(label);
		
		setPreferredSize(new Dimension(300,40));
		setBackground(Color.cyan);
		
	}
	private class ButtonListener implements ActionListener 
	{
		
		public void actionPerformed(ActionEvent event)
		{
			Random rand = new Random();
			count=rand.nextInt(100)+1;
			label.setText("Number: " +count);
			
		}
	}

}
