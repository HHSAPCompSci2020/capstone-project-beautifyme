import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * This class represents a MagicWand that can edit pixels.
 * 
 * @author Mana Nagampalli
 * @version 3.0 on 5/33
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

/// EDIT THE JAVADOC of this method
	/**
	 * 
	 * This method edits a pixel rgb value by giving it the average rgb value around
	 * the 20 pixel radius and assigning it to a 5 pixel radius around the given x and y pixel coordinates 
	 * 
	 * @param x represents the x pixel coordinate
	 * @param y represents the y pixel coordinate This method edits a pixel's rgb
	 *          value by giving it the average rgb value around
	 * 
	 * @param x X-coordinate of pixel
	 * @param y Y-coordinate of pixel
	 * 
	 *@return photo New edited photograph
	 */

	public Photograph edit(int x, int y) {
		int red = 0;
		int blue = 0;
		int green = 0;
		int count = 0;

		for (int i = y - 20; i < y + 20; i++) {
			for (int j = x - 20; j < x + 20; j++) {
				if (i >= 0 && i < photo.getHeight() && j >= 0 && j < photo.getWidth()) {
					Color color = photo.getColor(j, i);
					red += color.getRed();
					green += color.getGreen();
					blue += color.getBlue();
					count++;
				}
			}
		}

		if (count > 0) {
			for (int i = y - 5; i < y + 5; i++) {
				for (int j = x - 5; j < x + 5; j++) {
					if (i >= 0 && i < photo.getHeight() && j >= 0 && j < photo.getWidth()) {
						photo.setColor(j, i, new Color(red / count, green / count, blue / count));
					}
				}
			}
		}

		return photo;

	}
}
