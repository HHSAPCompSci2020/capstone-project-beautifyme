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

	public Photograph edit(int x, int y) {
		x=x-photo.margin;
		y=y-photo.margin;
		int red = 0;
		int blue = 0;
		int green = 0;
		int count = 0;
		
		for (int i = y - 50; i < y + 50; i++) {
			if (i > photo.margin && i < photo.getHeight()) {
				for (int j = x - 10; j < x + 10; j++) {
					if (j > photo.margin && j < photo.getWidth()) {
						Color color = photo.getColor(j, i);
						red = red + color.getRed();
						green = green + color.getGreen();
						blue = blue + color.getBlue();
						count++;

					}
				}
			}
		}
		
		if (count > 0) {
			Color c = new Color(red / count, green / count, blue / count);
			System.out.println(c.toString());
			photo.setColor(x, y, new Color(red / count, green / count, blue / count));
		}
		System.out.println(photo.getColor(x,y));
		return photo;

	}

}
