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
 * It allows the user to change and get the colors of pixels and upload a new
 * image and get that image.
 * 
 * @author Mira Shlimenzon, Sarah Sabaa (image upload and scaling)
 * @version 3.0 on 5/19
 */

public class Photograph {

	private BufferedImage image;
	private Pixel pixels;
	private int width;
	private int height;
	public int margin = 50;
	private final int MAX_WIDTH = 320;
	private final int MAX_HEIGHT = 640;
	protected Pixel[][] grid;

	/**
	 * Initializes a Photograph with a certain image and a 2D grid array for Pixels
	 * in the photograph. If image chosen is null, then the 2D Pixel grid is null.
	 * Sets width and height. If image is too big, will scale the image down.
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
	 * Paints the image onto the DrawingSurface at coordinates (50,50) with either
	 * the image's real width and height or a scaled version of the image
	 * 
	 * @param g Graphics object to draw with
	 */
	public void paint(Graphics g, ImageObserver io) {
		if (image != null) {
			//does not use the modified grid
			g.drawImage(image, margin, margin, this.width, this.height, io);
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
	 * Sets a new image for the Photograph, sets width and height, and creates 2D
	 * grid of Pixels with the image's width and height
	 * 
	 * @param img BufferedImage that will be the new image
	 */
	public void setImage(BufferedImage img) {
		this.image = img;
		this.width = image.getWidth();
		this.height = image.getHeight();
		scale();
		grid = new Pixel[height][width];
		setsColorForPixels();
	}

	/**
	 * Fills the 2D Array of Pixels with pixels of their designated color
	 */
	public void setsColorForPixels() {
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					grid[i][j] = new Pixel(new Color(image.getRGB(i, j)));
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
		System.out.println("x: " + x + " y: " + y);
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

}
