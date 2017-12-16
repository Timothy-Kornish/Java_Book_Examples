import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuoteOptionsPanel extends JPanel{

	private JLabel quote;
	private JRadioButton comedy, philosiphy, carpentry;
	private String comedyQuote, philosiphyQuote, carpentryQuote;
	
	public QuoteOptionsPanel(){
		
		comedyQuote ="Take my wife, please.";
		philosiphyQuote ="I think, therfeore I am.";
		carpentryQuote = "Measure twice, cut once.";
		
		quote = new JLabel(comedyQuote);
		quote.setFont(new Font("Helvetica", Font.BOLD, 24));
		
		comedy = new JRadioButton("Comedy", true);
		comedy.setBackground(Color.green);
		
		philosiphy = new JRadioButton("Philosiphy");
		philosiphy.setBackground(Color.green);
		
		carpentry = new JRadioButton("Carpentry");
		carpentry.setBackground(Color.green);
		
		ButtonGroup group = new ButtonGroup();
		group.add(comedy);
		group.add(philosiphy);
		group.add(carpentry);
		
		QuoteListener listener = new QuoteListener();
		comedy.addActionListener(listener);
		philosiphy.addActionListener(listener);
		carpentry.addActionListener(listener);
		
		add(quote);
		add(comedy);
		add(philosiphy);
		add(carpentry);
		
		setBackground(Color.green);
		setPreferredSize(new Dimension(300,100));
		
	}
		
	private class QuoteListener implements ActionListener 
	{
		
		public void actionPerformed(ActionEvent event)
		{
			Object source = event.getSource();
			if(source ==comedy)
			{
				quote.setText(comedyQuote);
			}
			else{
				if(source ==philosiphy)
				{
				quote.setText(philosiphyQuote);	
				}
				else
				{
					quote.setText(carpentryQuote);
				}
			}
		}
	}
				
	
	
	
}
