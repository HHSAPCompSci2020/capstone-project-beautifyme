
/**
 * This class represents a DrawingSurface that contains the Photograph and buttons.
 * @author Sarah Sabaa and Mira Shlimenzon
 * @version 2.0 on 5/13
 * @since 1.0
 */

import java.awt.Button;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawingSurface extends JPanel implements MouseListener, ActionListener {
	public final int WIDTH = 800;
	public final int HEIGHT = 800;
	private JFrame fr = new JFrame("Image loading"); // somehow put the Jframe in main!

	private JLabel Label1 = new JLabel(
			"Choose an image (jpeg or png) from your computer that you would like to edit the blemishes of. Selfies work best!");
	private JButton Button1 = new JButton("select");
	private JButton Button2 = new JButton(new ImageIcon("img/magicbutton.png"));
	private BufferedImage Image1;
	private FileDialog fd;
	private MagicWand wand;

	private BufferedImage wandCursor;
	private Photograph photograph;

	/**
	 * Initializes a Drawing Surface with a 500 by 500 size and creates buttons and
	 * an image
	 */
	public DrawingSurface() {
		super();
		fr.setSize(WIDTH, HEIGHT);
		fr.setLocation(0, 0);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.add(this);

		this.setBackground(Color.lightGray);
		this.setLayout(new FlowLayout());
		this.add(Label1);
		this.add(Button1);
		this.add(Button2);

		Button1.addActionListener(this);
		Button2.addActionListener(this);

		fd = new FileDialog(fr, "Open", FileDialog.LOAD);

		try {
			wandCursor = ImageIO.read(new File("img/wandcursor.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		photograph = new Photograph(null);

		fr.setVisible(true);
		fr.setResizable(true);
		fr.addMouseListener(this);
	}

	/**
	 * Loads an image to the Drawing Surface
	 * 
	 * @throws IOException
	 */
	public void imageload() throws IOException {

		fd.setVisible(true);
		File[] file = fd.getFiles();
		Image1 = ImageIO.read(file[0]);
		photograph.setImage(Image1);
		repaint();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		photograph.paint(g, this);
	}

	/**
	 * Mouse is pressed within the grid, and the user can edit the pixel that the
	 * mouse is pressing on
	 *
	 */
	public void mousePressed(MouseEvent e) {
		

		wand.edit(e.getX(), e.getY());
	}

	/**
	 * Loads the image when the upload button is pushed Changes the cursor when the
	 * magic wand button is pushed
	 * 
	 * @param event Event that has happened when the button is pressed
	 */
	public void actionPerformed(ActionEvent event) {
		JButton b = (JButton) event.getSource();
		if (b == Button1) {
			try {
				imageload();
				Label1.setText(
						"You have selected an image to edit. Start by pressing on the magic wand button to start editing the blemishes in your photo.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (b == Button2) {
			Label1.setText(
					"Using the magic wand tool, press on the area of the face where you would like to edit your blemish.");
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Cursor c = toolkit.createCustomCursor(wandCursor, new Point(16, 16), "img");
			setCursor(c);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
