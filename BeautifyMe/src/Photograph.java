import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Color;
/**
 * This class represents a Photograph.
 * It draws the image to the position of (100,100) with a size of 640x320. 
 * It allows the user to change and get the colors of pixels and upload a new image and get that image.
 * @author Mira Shlimenzon and Sarah
 * @version 1.0 on 5/6
 * @since 1.0 
 */
public class Photograph extends Canvas {
	//FIELDS
	private BufferedImage image;
	private Pixel pixels;
	private int width;
	private int height;
	private int margin = 50;
	private final int MAX_WIDTH = WIDTH - 2 * margin;
	private final int MAX_HEIGHT = HEIGHT - 2 * margin;
	
	/**
	 *Initializes a Photograph with a certain image
	 *Sets width and height
	 *Creates Pixels for the Photograph
	 *@param image BufferedImage that makes up the Photograph
	 */
	public Photograph(BufferedImage img){
		this.image = img;
		if (image !=null) {
			this.width = image.getWidth();
			this.height = image.getHeight();
			scale();
		}
		pixels = new Pixel(this);
	}
	
	/**
	 *Paints the image onto the DrawingSurface at (100,100) with dimension 640x320
	 *Potentially be able to change topX and topY coordinate and dimensions
	 *@param g Graphics object to draw
	 */
	public void paint(Graphics g) {
		if (image != null) {
			g.drawImage(image, margin, margin, this.width, this.height, this);
			//maybe can change 640 to height and 320 to height 
			//change 100 to 100 to topX and topY
		}
	}
	
	private void scale() {
		while (width > MAX_WIDTH || height > MAX_HEIGHT) {
			width = (int) ((double)width * 0.99);
			height = (int) ((double)height * 0.99);
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	/**
	 *Sets a new image for the Photograph
	 *@param image a Image that will be the new image
	 */
	public void setImage(BufferedImage img) {
		this.image = img;
		this.width = image.getWidth();
		this.height = image.getHeight();
		System.out.println(width);
		scale();
	}
	
	/**
	 *Gets the image being used as the Photograph
	 *@return image the BufferedImage being used to draw Photograph 
	 */
	public Image getImage() {
		return image;
	}
	
	/**
	 *Gets the color at the pixel location(x,y)
	 *@param x X-coordinate of pixel location
	 *@param y Y-coordinate of pixel location
	 *@return Color color of the pixel at the location (x,y)  
	 */
	public Color getColor(int x, int y) {
		return pixels.getColor(x,y);
	}
	
	/**
	 *Sets a new Color at the pixel location(x,y) 
	 *@param x X-coordinate of pixel location
	 *@param y Y-coordinate of pixel location
	 *@param c New color to be sent at this location 
	 */
	public void setColor(int x, int y, Color c) {
		pixels.setColor(x,y,c);
	}
	
}
