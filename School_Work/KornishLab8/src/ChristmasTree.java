import javax.swing.*;

public class ChristmasTree {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Christmas Tree");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new ChristmasTreePanel());
		
		frame.pack();
		frame.setVisible(true);

	}

}
