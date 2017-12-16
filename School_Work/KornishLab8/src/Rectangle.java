import java.awt.Color;
import java.awt.Graphics;

public class Rectangle {

		private int width, height, x,y;
		private Color color;
		
		public Rectangle(int width1, int height1,Color shade, int xLocation,int yLocation){
			width =width1;
			height = height1;
			x=xLocation;
			y=yLocation;
			color =shade;
			}
		
		public void draw(Graphics page){
			page.setColor(color);
			page.fillRect(x, y, width, height);
			
		}
		// set methods
		public void setHeight(int size){
			height =size;
		}
		public void setWidth(int size){
			width = size;
		}
		public void setColor(Color shade){
			color=shade;
		}
		public void setY(int varY){
			y=varY;
		}
		public void setX(int varX){
			x=varX;
		}
		
		// get methods
		public int getHeight(){
			return height;
		}
		public int getWidth(){
			return width;
		}
		public Color getColor(){
			return color;
		}
		public int getX(){
			return x;
		}
		public int getY(){
			return y;
		}
}
