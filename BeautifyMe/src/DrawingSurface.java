/**
 * This class represents a DrawingSurface that contains the Photograph and buttons.
 * @author Sarah Sabaa
 * @version 1.0 on 5/6
 * @since 1.0 
 */

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class DrawingSurface implements ActionListener {
	public final int WIDTH = 800;
	public final int HEIGHT = 800;
	private JFrame fr = new JFrame("Image loading"); //somehow put the Jframe in main! 
	private Label Label1 = new Label("Choose your image");
	private Button Button1 = new Button("select");
	private BufferedImage Image1;
	private Photograph Canvas1;
	private FileDialog fd = new FileDialog(fr, "Open", FileDialog.LOAD);

	/**
	 *Initializes a Drawing Surface with a 500 by 500 size and creates a button and an image
	 */
	public DrawingSurface() {
		fr.setSize(WIDTH, HEIGHT);
		fr.setLocation(50, 50);
		fr.setBackground(Color.lightGray);
		fr.setLayout(new FlowLayout());
		fr.add(Label1);
		fr.add(Button1);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Button1.addActionListener(this);
		Canvas1 = new Photograph(null);
		Canvas1.setSize(WIDTH, HEIGHT);
		fr.add(Canvas1);
		fr.show();
	}
	
	/**
	 *Loads an image to the Drawing Surface
	 */
	public void imageload() {
	
		fd.show();
		if (fd.getFile() == null) {
			Label1.setText("You have not selected");
		} else{
			String d = (fd.getDirectory() + fd.getFile());
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image1 = toolkit.getImage(d);
			//ImageIO.read() - need to get a File from fd s
			Canvas1.setImage(Image1);
			Canvas1.repaint();
		}
	}
	
	/**
	 *Loads the image when the button is pushed 
	 *@param event An event that has happened when the button is pressed  
	 */
	public void actionPerformed(ActionEvent event) {
		Button b = (Button) event.getSource();
		if (b == Button1) {
			imageload();
		}
	}
}
