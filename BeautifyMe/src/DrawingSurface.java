/**
 * This class represents a DrawingSurface that contains the Photograph and buttons.
 * @author Sarah Sabaa
 * @version 1.0 on 5/6
 * @since 1.0 
 */

import java.awt.Button;
import java.awt.Point;
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
import java.io.IOException;

import processing.core.PApplet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DrawingSurface extends PApplet implements ActionListener{
	public final int WIDTH = 800;
	public final int HEIGHT = 800;
	private JFrame fr = new JFrame("Image loading"); //somehow put the Jframe in main! 
	private Label Label1 = new Label("Choose your image");
	private JButton Button1 = new JButton("select");
	private JButton Button2 = new JButton(new ImageIcon("img\\wandcursor.png"));
	private BufferedImage Image1;
	private Photograph Canvas1;
	private FileDialog fd = new FileDialog(fr, "Open", FileDialog.LOAD);
	private Photograph board;
	private MagicWand wand;

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
		fr.add(Button2);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Canvas1 = new Photograph(null);
		Canvas1.setSize(WIDTH, HEIGHT);
		fr.add(Canvas1);
		fr.show();
	}
	
	/**
	 *Loads an image to the Drawing Surface
	 * @throws IOException 
	 */
	public void imageload() throws IOException {
	
		fd.show();
		if (fd.getFile() == null) {
			Label1.setText("You have not selected");
		} else{
			File[] file = fd.getFiles();
			Image1 = ImageIO.read(file[0]);
			Canvas1.setImage(Image1);
			Canvas1.repaint();
		}
	}
	
	/**
	 *When mouse presses within the grid
	 *@param event An event that has happened when the button is pressed  
	 */
	public void mousePressed() {
		
		if (mouseButton == LEFT) { 
			//and you pressed within the photo do all this!!! if not just have normal press
			Point click = new Point(mouseX,mouseY);
			float dimension = height;
			Point cellCoord = board.clickToIndex(click,0,0,dimension,dimension);
			if (cellCoord != null) {
					wand.edit(board.getPixel(cellCoord.x, cellCoord.y));
			}
		} 
	}
	
	/**
	 *Loads the image when the button is pushed 
	 *@param event An event that has happened when the button is pressed  
	 */
	public void actionPerformed(ActionEvent event) {
		JButton b = (JButton) event.getSource();
		if (b == Button1) {
			try {
				imageload();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
