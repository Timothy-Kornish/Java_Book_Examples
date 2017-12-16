import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListPanel extends JPanel{

	private JLabel label;
	private JList list;
	
	public ListPanel(JLabel imageLabel)
	{
		label = imageLabel;
		
		String[] fileNames ={"./src/unnamed.png",
							 "./src/jacksons_chameleon.jpg",
							 "./src/giraffe_tattoo.jpg",
							 "./src/dog.jpg",
							 "./src/king.jpg",
							 "./src/smiley-icon.png",
							 "./src/touan.jpg",
							 "./src/Globe_2.jpg"};
		
		list = new JList(fileNames);
		list.addListSelectionListener(new ListListener());
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(list);
		setBackground(Color.white);
		setPreferredSize(new Dimension(800,800));

	}
	
	private class ListListener implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent event)
		{
			if(list.isSelectionEmpty()){
				label.setIcon(null);
			}
			else{
				String fileName = (String)list.getSelectedValue();
				ImageIcon image = new ImageIcon(fileName);
				label.setIcon(image);
			}
		}
	}
}
