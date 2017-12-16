import javax.swing.*;

public class OffCenter {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Off Center");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new OffCenterPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
