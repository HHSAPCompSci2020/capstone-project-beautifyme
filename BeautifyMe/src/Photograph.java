import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Color;

public class Photograph extends Canvas {
	Pixel pixels;
	int width;
	int height;
	Image image;
	
	public Photograph(BufferedImage image){
		this.image = image;
		if(image !=null) {
		this.width = image.getWidth();
		this.height = image.getHeight();
		}
		pixels = new Pixel(this);
	}
	public void paint(Graphics g) {
		if (image != null) {
			g.drawImage(image, 100, 100, 640, 320, this);
		}
	}

	public void setImage(Image img) {
		this.image = image;
	}

	public Image getImage() {
		return image;
	}

	public Color getColor(int x, int y) {
		return pixels.getColor(x,y);
	}
	
	public void setColor(int x, int y, Color c) {
		pixels.setColor(x,y,c);
	}
	
}
