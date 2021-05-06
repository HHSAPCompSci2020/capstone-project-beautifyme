import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;

public class Photograph extends Canvas {
	Pixel pixels;
	int width;
	int height;
	BufferedImage image;
	
	public Photograph(BufferedImage image){
		this.image = image;
		this.width = image.getWidth();
		this.height = image.getHeight();
		/*
		try {
			File input = new File(image); 
			this.image = ImageIO.read(input); 
			this.width = image.getWidth();
			this.height = image.getHeight();
		}
		catch (Exception e) {
		} */
		pixels = new Pixel(this);
	}
	public void paint(Graphics g) {
		if (image != null) {
			g.drawImage(image, 100, 100, 640, 320, this);
		}
	}

	public void setImage(BufferedImage img) {
		this.image = image;
	}

	public BufferedImage getImage() {
		return image;
	}

	public Color getColor(int x, int y) {
		return pixels.getColor(x,y);
	}
	
	public void setColor(int x, int y, Color c) {
		return pixels.setColor(x,y,c);
	}
	
}
