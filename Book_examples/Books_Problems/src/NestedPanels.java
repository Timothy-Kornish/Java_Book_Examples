import java.awt.*;
import javax.swing.*;

public class NestedPanels {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// set up first subpanel
		
		JPanel subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(150,100));
		subPanel1.setBackground(Color.green);
		JLabel label1 = new JLabel("one");
		subPanel1.add(label1);
		
		// set up second subpanel
		
		JPanel subPanel2 = new JPanel();
		subPanel2.setPreferredSize(new Dimension(150,100));
		subPanel2.setBackground(Color.red);
		JLabel label2 = new JLabel("two");
		JLabel label3 = new JLabel("Labelllled");
		subPanel2.add(label2);
		subPanel2.add(label3);
		
		
		// set up primary panel;
		
		JPanel primary = new JPanel();
		primary.setBackground(Color.blue);
		primary.add(subPanel1);
		primary.add(subPanel2);
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}

}
