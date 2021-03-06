import java.awt.*;

import javax.swing.*;

public class LabelDemo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Label Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("./src/king.jpg");//drag and drop gif into src folder under default packages
		JLabel label1, label2, label3;
		
		label1 = new JLabel("Lion Left", icon, SwingConstants.CENTER);
		
		label2 = new JLabel("Lion Right", icon,SwingConstants.CENTER);
		label2.setHorizontalTextPosition(SwingConstants.LEFT);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		
		label3 = new JLabel("Lion Above", icon, SwingConstants.CENTER);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.cyan);
		panel.setPreferredSize(new Dimension(200,350));
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
