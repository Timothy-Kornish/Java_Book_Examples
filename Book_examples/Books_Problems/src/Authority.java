import java.awt.*;
import javax.swing.*;

public class Authority {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Authority");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel primary = new JPanel();
		primary.setBackground(Color.yellow);
		primary.setPreferredSize(new Dimension(500,250 ));
		
		JLabel label1 = new JLabel("Question Authority");
		JLabel label2 = new JLabel("But raise your hands first");
		
		primary.add(label1);
		primary.add(label2);
		
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}

}
