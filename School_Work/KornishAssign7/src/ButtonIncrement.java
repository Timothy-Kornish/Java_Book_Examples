import javax.swing.JFrame;
public class ButtonIncrement {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Button Increment Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new ButtonIncrementPanel());
		frame.pack();
		frame.setVisible(true);

	}

}
