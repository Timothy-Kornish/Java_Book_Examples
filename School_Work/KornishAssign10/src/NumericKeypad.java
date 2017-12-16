import javax.swing.*;

public class NumericKeypad {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Numeric Keypad");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new NumericKeypadPanel());
		frame.pack();
		frame.setVisible(true);

	}

}
