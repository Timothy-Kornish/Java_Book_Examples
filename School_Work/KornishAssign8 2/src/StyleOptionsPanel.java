import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {

	private JLabel saying, inputLabel;
	private JCheckBox bold, italic;
	private JTextField textSize;
	public int text1, style1;
	
	public StyleOptionsPanel()
	{
		
		saying = new JLabel("Say it with style!");
		saying.setFont(new Font("Helvetic", Font.PLAIN, 36));
		
		bold = new JCheckBox("Bold");
		bold.setBackground(Color.cyan);
		
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.cyan);
		
		StyleListener listener = new StyleListener();
		
		bold.addItemListener(listener);
		italic.addItemListener(listener);
		
		textSize = new JTextField(5);
		textSize.addActionListener(new TextListener());
		
		inputLabel = new JLabel("\nEnter text size: ");
		
		add(saying);
		add(bold);
		add(italic);
		add(inputLabel);
		add(textSize);
		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(300,200));
		
	}
	
	private class StyleListener implements ItemListener
	{	
		public void itemStateChanged(ItemEvent event)
		{
			int style = Font.PLAIN;
				
			if(bold.isSelected()){
				style = Font.BOLD;
			}
			if(italic.isSelected()){
				style+= Font.ITALIC;
			}
			style1=style;
			saying.setFont(new Font("Helvetica", style1, text1));
		}
	}
	
	private class TextListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
			int newTextSize;
			String text = textSize.getText();
			newTextSize =Integer.parseInt(text);
			text1=newTextSize;
			
			saying.setFont(new Font("Helvetic", style1, text1));
		}
	}
		
}
	
	

