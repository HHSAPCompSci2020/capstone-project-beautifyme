import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

//wait what if we combined photograph and imageGetter into one 
//class since Image getter is pretty much creating the image just like Photograph is

public class ImageGetter extends Canvas {
	Image img;

	public ImageGetter(Image img) {
		this.img = img;
	}

	public void paint(Graphics g) {
		if (img != null) {
			g.drawImage(img, 100, 100, 640, 320, this);
		}
	}

	public void setImage(Image img) {
		this.img = img;
	}
}