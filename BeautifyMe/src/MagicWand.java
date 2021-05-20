import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * This class represents a MagicWand that can edit pixels.
 * 
 * @author Mana Nagampalli
 * @version 2.0 on 5/13
 * @since 1.0
 */
public class MagicWand {
	private Photograph photo;

	/**
	 * Initializes a MagicWand for a photograph
	 * 
	 * @param photo Photograph that the user uploaded
	 */
	public MagicWand(Photograph photo) {
		this.photo = photo;

	}

	/**
	 * 
	 * This method edits a pixel rgb value by giving it the average rgb value around
	 * the pixel
	 * 
	 * @param x represents the x pixel coordinate
	 * @param y represents the y pixel coordinate This method edits a pixel's rgb
	 *          value by giving it the average rgb value around
	 * 
	 * @param x X-coordinate of pixel
	 * @param y Y-coordinate of pixel
	 */

	public void edit(int x, int y) {
		int red = 0;
		int green = 0;
		int blue = 0;
		int count = 0;

		for (int i = x - 7; i < x + 7; i++) {
			if (i > 50 && i < 320) {
				for (int j = y - 7; j < y + 7; j++) {
					if (j > 50 && j < 640) {
						if (i != x || j != y) {

							Color color = photo.getColor(i, j);
							red = red + color.getRed();
							green = green + color.getGreen();
							blue = blue + color.getBlue();
							count++;
						}
					}
				}
			}
		}
		System.out.println("red: " + red / count + "green: " + green / count + "blue: " + blue / count + "x: " + x + "y: " + y);
		photo.setColor(x, y, new Color(red / count, green / count, blue / count));
		

	}

}
