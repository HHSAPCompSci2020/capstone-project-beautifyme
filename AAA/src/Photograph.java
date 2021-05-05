
public class Photograph {
	Pixel pixels;
	int width;
	int height;
	BufferedImage image;
	
	public Photograph(BufferedImage image){
		try {
			File input = new File(image); 
			this.image = ImageIO.read(input); 
			this.width = image.getWidth();
			this.height = image.getHeight();
		}
		catch (Exception e) {
		}
		pixels = new Pixel(this);
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
