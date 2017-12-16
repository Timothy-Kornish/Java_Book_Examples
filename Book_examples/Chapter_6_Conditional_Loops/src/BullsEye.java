import javax.swing.JFrame;

public class BullsEye {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Bulls Eye");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BullsEyePanel panel = new BullsEyePanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
