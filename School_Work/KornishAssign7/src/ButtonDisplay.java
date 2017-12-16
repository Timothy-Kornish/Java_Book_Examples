import javax.swing.JFrame;
public class ButtonDisplay {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Random Number Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new ButtonDisplayPanel());
		frame.pack();
		frame.setVisible(true);

	}

}
