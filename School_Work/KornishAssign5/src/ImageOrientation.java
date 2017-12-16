import javax.swing.*;
import java.awt.*;

public class ImageOrientation {

	public static void main(String[] args){
		
	JFrame frame = new JFrame("Image Orientation");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	ImageIcon icon1 = new ImageIcon("./src/king.jpg");
	ImageIcon icon2 = new ImageIcon("./src/giraffe_tattoo.jpg");
	ImageIcon icon3 = new ImageIcon("./src/jacksons_chameleon.jpg");
	ImageIcon icon4 = new ImageIcon("./src/dog.jpg");

	JLabel label1,label2,label3,label4;
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
			
	
	label1 = new JLabel("Lion",icon1,SwingConstants.LEFT);
	label1.setHorizontalTextPosition(SwingConstants.LEFT);
	label1.setVerticalTextPosition(SwingConstants.CENTER);
	
	
	label2 = new JLabel("Giraffe", icon2, SwingConstants.CENTER);
	label2.setHorizontalTextPosition(SwingConstants.LEFT);
	label2.setVerticalTextPosition(SwingConstants.CENTER);
	
	
	label3 = new JLabel("Chameleon", icon3,SwingConstants.CENTER);
	label3.setHorizontalTextPosition(SwingConstants.LEFT);
	label3.setVerticalTextPosition(SwingConstants.CENTER);
	
	
	label4 = new JLabel("Dog",icon4,SwingConstants.CENTER);
	label4.setHorizontalTextPosition(SwingConstants.LEFT);
	label4.setVerticalTextPosition(SwingConstants.CENTER);
	
	
	panel1.setBackground(Color.cyan);
	panel1.setSize(new Dimension(400,200));
	panel1.add(label1);
	panel1.add(label2);
	
	panel2.setBackground(Color.blue);
	panel2.setPreferredSize(new Dimension(300,350));
	panel2.add(label3);
	panel2.add(label4);
	
	panel3.setBackground(Color.yellow);
	panel3.setPreferredSize(new Dimension (400,550));
	panel3.add(panel1);
	panel3.add(panel2);
	
	frame.getContentPane().add(panel3);
	frame.pack();
	frame.setVisible(true);
	
	
	
	}
}
