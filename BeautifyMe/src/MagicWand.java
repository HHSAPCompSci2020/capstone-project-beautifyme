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

	public Photograph edit(int x, int y) {
		int red = 0;
		int blue = 0;
		int green = 0;
		int count = 0;
		System.out.println(x + " " + y);
		System.out.println(photo.getColor(x, y));
		for (int i = y - 3; i < y + 3; i++) {
			if (i >= 0 && i < photo.getHeight()) {
				for (int j = x - 3; j < x + 3; j++) {
					if (j >= 0 && j < photo.getWidth()) {
						Color color = photo.getColor(j, i);
						red += color.getRed();
						green += color.getGreen();
						blue += color.getBlue();
						count++;
					}
				}
			}
		}

		if (count > 0) {
			for (int i = -2; i < 2; i++) {
					for (int j = x - 2; j < x + 2; j++) {
						if (x + i >= 0 && x + i < photo.getHeight() && j >= 0 && j < photo.getWidth()) {
							//photo.setColor(x + i, y + i, new Color(red / count, green / count, blue / count));
							photo.setColor(x+i, y+i, new Color(0,0,0));
						}
				}
			}
		}
		return photo;

	}
}
