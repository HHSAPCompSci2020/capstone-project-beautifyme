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
		x = x - 50;
		y = y - 50;
		int red = 0;
		int green = 0;
		int blue = 0;
		int count=0;

		for (int i = x - 7; i < x + 7; i++) {
			if (x - 7 > 50 || x + 7 < 320) {
				for (int j = y - 7; j < y + 7; j++) {
					if (y - 7 > 50 || y + 7 < 640) {
						if (i == x || j == y) {
							red = 0;
							green = 0;
							blue = 0;
						}

						Color color = photo.getColor(i, j);
						red = red + color.getRed();
						green = green + color.getGreen();
						blue = blue + color.getBlue();
						count++;
					}
				}
			}
		}
		photo.setColor(x, y, new Color(red / count, green / count, blue / count));
	}

}
