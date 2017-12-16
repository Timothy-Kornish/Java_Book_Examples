import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KochSnowFlakes extends JApplet implements ActionListener {
	
	private final int APPLET_WIDTH =800;
	private final int APPLET_HEIGHT=880;
	
	private final int MIN=1, MAX=13;
	
	private JButton increase, decrease;
	private JLabel titleLabel, orderLabel;
	private KochPanel drawing;
	private JPanel appletPanel, tools;
	private int order1 =1;
	
	public void init(){
		tools = new JPanel();
		tools.setLayout(new BoxLayout(tools, BoxLayout.X_AXIS));
		tools.setBackground(Color.yellow);
		tools.setOpaque(true);
		
		titleLabel = new JLabel("The Koch Snowflake");
		titleLabel.setForeground(Color.black);
		
		increase = new JButton("up");
		//increase.setPressedIcon(new ImageIcon("./src/upArrow.png"));
		increase.setMargin(new Insets(0,0,0,0));
		increase.addActionListener(this);
		
		
		
		decrease = new JButton("down");
		//decrease.setPressedIcon(new ImageIcon("./src/arrow-down.png"));
		decrease.setMargin(new Insets(0,0,0,0));
		decrease.addActionListener(this);
		
		orderLabel = new JLabel("Order: "+order1);
		orderLabel.setForeground(Color.black);
		
		tools.add(titleLabel);
		tools.add(Box.createHorizontalStrut(20));
		tools.add(decrease);
		tools.add(increase);
		tools.add(Box.createHorizontalStrut(20));
		tools.add(orderLabel);
		
		drawing = new KochPanel(order1);
		
		appletPanel = new JPanel();
		appletPanel.add(tools);
		appletPanel.add(drawing);
		
		getContentPane().add(appletPanel);
		setSize(APPLET_WIDTH,APPLET_HEIGHT);
	}
	
	public void actionPerformed(ActionEvent event){
		int order = drawing.getOrder();
		
		if(event.getSource()==increase){
			order++;
		}
		else{
			order--;
		}
		
		if(order>=MIN && order<=MAX){
			orderLabel.setText("Order: "+order);
			drawing.setOrder(order);
			repaint();
		}
	}
}
