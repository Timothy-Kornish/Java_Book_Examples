import java.awt.*;
import javax.swing.*;

public class PickImage {

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Pick Image");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel imageLabel = new JLabel();
		JPanel imagePanel = new JPanel();
		
		imagePanel.add(imageLabel);
		imagePanel.setBackground(Color.white);
		
		ListPanel imageList = new ListPanel(imageLabel);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, imageList,imagePanel);
		
		splitPane.setOneTouchExpandable(true);
		
		frame.getContentPane().add(splitPane);
		frame.pack();
		frame.setVisible(true);
	}
}
