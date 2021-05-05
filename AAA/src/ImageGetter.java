import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

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