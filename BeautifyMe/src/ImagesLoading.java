import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class imageLoad extends Canvas {
	Image img;

	public imageLoad(Image img) {
		this.img = img;
	}

	public void paint(Graphics g) {
		if (img != null) {
			g.drawImage(img, 0, 0, this);
		}
	}

	public void setImage(Image img) {
		this.img = img;
	}
}

public class ImagesLoading implements ActionListener {
	
	JFrame fr = new JFrame("Image loading");
	Label Label1 = new Label("Choose your image");
	Button Button1 = new Button("select");
	Image Image1;
	imageLoad Canvas1;
	FileDialog fd = new FileDialog(fr, "Open", FileDialog.LOAD);

	void initialize() {
		fr.setSize(500, 500);
		fr.setLocation(200, 200);
		fr.setBackground(Color.lightGray);
		fr.setLayout(new FlowLayout());
		fr.add(Label1);
		fr.add(Button1);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Button1.addActionListener(this);
		Canvas1 = new imageLoad(null);
		Canvas1.setSize(1000, 1000);
		fr.add(Canvas1);
		fr.show();
	}

	void imageload() {
		fd.show();
		if (fd.getFile() == null) {
			Label1.setText("You have not select");
		} else {
			String d = (fd.getDirectory() + fd.getFile());
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			Image1 = toolkit.getImage(d);
			Canvas1.setImage(Image1);
			Canvas1.repaint();
		}
	}

	public void actionPerformed(ActionEvent event) {
		Button b = (Button) event.getSource();
		if (b == Button1) {
			imageload();
		}
	}

}
