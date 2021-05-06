 /**
 * This class represents the Pixels within a Photograph
 * It allows the user to change and get the colors of each individual pixel.
 * @author Mana Nagampalli, Mira Shlimenzon, and JavaDip (for the try and catch part)
 * @version 1.0 on 5/6
 * @since 1.0 
 */
import java.awt.image.BufferedImage;
import java.awt.Color;

class Pixel {
	private int width;
	private int height;
	Color[][] color;
	
	/**
	 *Initializes the 2D Array of Pixels with the Color of each designated pixel for the Photograph
	 *@param p Photograph that the pixels belong to
	 */
	public Pixel(Photograph p) {
		if(p.getImage() != null)
		 {
			width = p.width;
			height = p.height;
			color  = new Color[width][height];
			BufferedImage image = (BufferedImage) p.getImage();
			for (int i = 0; i < height; i++) {

				for (int j = 0; j < width; j++) {
					color[j][i] = new Color(image.getRGB(j, i));
				}
			}

		} 
	}
	
	/**
	 *Gets the color at the pixel location(x,y)
	 *@param x X-coordinate of pixel location
	 *@param y Y-coordinate of pixel location
	 *@return Color color of the pixel at the location (x,y)  
	 */
	public Color getColor(int x, int y) {
		return color[y][x];
	}
	
	/**
	 *Sets a new Color at the pixel location(x,y) 
	 *@param x X-coordinate of pixel location
	 *@param y Y-coordinate of pixel location
	 *@param c New color to be sent at this location 
	 */
	public void setColor(int x, int y, Color c) {
		color[y][x] = c;
	}
}
