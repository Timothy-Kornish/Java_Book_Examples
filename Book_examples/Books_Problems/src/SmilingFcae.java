import javax.swing.JFrame;

public class SmilingFcae {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Smiling Faces");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SmilingFacePanel pane1 = new SmilingFacePanel();
		
		frame.getContentPane().add(pane1);
		frame.pack();
		frame.setVisible(true);

	}

}
