import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Color;

/**
 * This class represents a Photograph. It draws the image to the position of
 * (50,50). If the height and width is too large, it will scale the image down.
 * It allows the user to change and get the colors of pixels and upload a new image and get that image.
 * 
<<<<<<< Updated upstream
 * @author Mira Shlimenzon, Sarah Sabaa (image upload and scaling), Game of Life Code (Mira wrote)
 * @version 2.0 on 5/13
=======
 * @author Mira Shlimenzon and Sarah Sabaa
 * @version 1.0 on 5/6
>>>>>>> Stashed changes
 * @since 1.0
 */
public class Photograph extends Canvas {
	// FIELDS
	private BufferedImage image;
	private Pixel pixels;
	private int width;
	private int height;
	public int margin = 50;
	private final int MAX_WIDTH = 320;
	private final int MAX_HEIGHT = 640;
	protected Pixel[][] grid;

	/**
	 * Initializes a Photograph with a certain image and a 2D array for pixels in the photograph
	 * Sets width and height 
	 * If image is too big, will scale the image down 
	 * 
	 * @param img BufferedImage that makes up the Photograph
	 */
	public Photograph(BufferedImage img) {
		this.image = img;
		if (image != null) {
			this.width = image.getWidth();
			this.height = image.getHeight();
			scale();
			grid = new Pixel[height][width];
		} else
			grid = null;
	}

	/**
	 * Paints the image onto the DrawingSurface at coordinates (50,50) with 
	 * either the image's real width and height or a scaled version of the image
	 * 
	 * @param g Graphics object to draw with
	 */
	public void paint(Graphics g) {
		if (image != null) {
			g.drawImage(image, margin, margin, this.width, this.height, this);
		}
	}

	/**
	 * Scales the image down so to not go over the max width and height 
	 */
	private void scale() {
		while (width > MAX_WIDTH || height > MAX_HEIGHT) {
			width = (int) ((double) width * 0.99);
			height = (int) ((double) height * 0.99);
		}
	}

	/**
	 * Gets the width of the image 
	 * 
	 * @return width Width of the image 
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Gets the height of the image 
	 * 
	 * @return height Height of the image 
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Sets a new image for the Photograph, sets width and height, and creates 2D grid of Pixels
	 * 
	 * @param img a Image that will be the new image
	 */
	public void setImage(BufferedImage img) {
		this.image = img;
		this.width = image.getWidth();
		this.height = image.getHeight();
		scale();
		grid = new Pixel[height][width];
	}

	/**
	 * Fills the 2D Array of Pixels with pixels of their designated color 
	 */
	public void setsColorForPixels() {
		if (image != null) {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					grid[j][i] = new Pixel(new Color(image.getRGB(j, i)));
				}
			}
		}

	}

	/**
	 * Gets the image being used as the Photograph
	 * 
	 * @return image the BufferedImage being used to draw Photograph
	 */
	public BufferedImage getImage() {
		return image;
	}

	/**
	 * Gets the color at the pixel location(x,y) in the grid
	 * 
	 * @param x X-coordinate of pixel location
	 * @param y Y-coordinate of pixel location
	 * @return Color color of the pixel at the location (x,y)
	 */
	public Color getColor(int x, int y) {
		return grid[y][x].getColor();
	}

	/**
	 * Sets a new Color at the pixel location(x,y) in the grid
	 * 
	 * @param x X-coordinate of pixel location
	 * @param y Y-coordinate of pixel location
	 * @param c New color to be sent at this location
	 */
	public void setColor(int x, int y, Color c) {
		grid[y][x].setColor(c);
	}

	/**
	 * Gets the pixel at the pixel location of(x,y)
	 * 
	 * @param x X-coordinate of pixel location
	 * @param y Y-coordinate of pixel location
	 * @return Pixel pixel at coordinates (x,y)
	 */
	public Pixel getPixel(int x, int y) {
		return grid[y][x];
	}

	/**
	 * (Graphical UI) Determines which element of the grid matches with a particular
	 * pixel coordinate. This supports interaction with the grid using mouse clicks
	 * in the window.
	 * 
	 * @param p      A Point object containing a graphical pixel coordinate.
	 * @param x      The x pixel coordinate of the upper left corner of the grid
	 *               drawing.
	 * @param y      The y pixel coordinate of the upper left corner of the grid
	 *               drawing.
	 * @param width  The pixel width of the grid drawing.
	 * @param height The pixel height of the grid drawing.
	 * @return A Point object representing a coordinate within the grid, or null if
	 *         the pixel coordinate falls completely outside of the grid.
	 */
	public Point clickToIndex(Point p, float x, float y, float width, float height) {
		Point coordinates = null;
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				float rectWidth = width / grid[0].length;
				float rectX = x + (rectWidth * col);
				float rectHeight = height / grid.length;
				float rectY = y + (rectHeight * row);

				if (rectX + rectWidth > p.x && p.x > rectX && rectY + rectHeight > p.y && p.y > rectY)
					coordinates = new Point(col, row);
			}
		}
		return coordinates;
	}

}
