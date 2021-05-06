/**
 * This class represents a Photograph.
 * It draws the image to the position of (100,100) with a size of 640x320. 
 * It allows the user to change and get the colors of pixels and upload a new image and get that image.
 * @author Mira Shlimenzon(overall class) and Sarah (paint method)
 * @version 1.0 on 5/6
 * @since 1.0 
 */

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

public class Photograph extends Canvas {
	
	//FIELDS
	Pixel pixels;
	int width;
	int height;
	BufferedImage image;
	int topX;
	int topY;

	/**
	 *Initializes a Photograph with a certain image
	 *Sets width and height
	 *Creates Pixels for the Photograph
	 *@param image BufferedImage that makes up the Photograph
	 */
	public Photograph(BufferedImage image){
		this.image = image;
		this.width = image.getWidth();
		this.height = image.getHeight();
		pixels = new Pixel(this);
	}
	
	/**
	 *Paints the image onto the DrawingSurface at (100,100) with dimension 640x320
	 *Potentially be able to change topX and topY coordinate and dimensions
	 *@param g Graphics object to draw
	 */
	public void paint(Graphics g) {
		if (image != null) {
			g.drawImage(image, 100, 100, 640, 320, this);
			//maybe can change 640 to height and 320 to height 
			//change 100 to 100 to topX and topY
		}
	}
	
	/**
	 *Sets a new image for the Photograph
	 *@param image a BufferedImage
	 */
	public void setImage(BufferedImage img) {
		this.image = image;
	}
	
	/**
	 *Gets the image being used as the Photograph
	 *@return image the BufferedImage being used to draw Photograph 
	 */
	public BufferedImage getImage() {
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
