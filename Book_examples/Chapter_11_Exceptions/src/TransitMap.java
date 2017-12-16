import java.awt.*;
import javax.swing.*;

public class TransitMap {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("New York Transit Map");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon image = new ImageIcon("./src/unnamed.png");
		JLabel imageLabel = new JLabel(image);
		
		JScrollPane scroll = new JScrollPane(imageLabel);
		scroll.setPreferredSize(new Dimension(250,200));
		
		frame.getContentPane().add(scroll);
		frame.pack();
		frame.setVisible(true);

	}

}
