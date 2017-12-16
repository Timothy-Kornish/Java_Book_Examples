import java.awt.*;
import javax.swing.JApplet;

public class TiledPictures extends JApplet{

	private final int APPLET_WIDTH =320;
	private final int APPLET_HEIGHT =320;
	private final int MIN=20;
	
	private Image world, everest, goat;
	
	public void init(){
		world = getImage(getDocumentBase(), "./src/world.png");
		everest = getImage(getDocumentBase(), "./src/everest.png");
		goat = getImage(getDocumentBase(), "./src/goat-3-icon.png");
		
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
	}
	
	public void drawPictures(int size, Graphics page){
		page.drawImage(everest, 0, size/2, size/2, size/2, this);
		page.drawImage(goat, size/2, 0, size/2, size/2, this);
		page.drawImage(world, size/2, size/2, size/2, size/2, this);
		
		if(size>MIN){
			drawPictures(size/2,page);
		}
	}
	public void paint(Graphics page){
		drawPictures(APPLET_WIDTH, page);
	}
}
