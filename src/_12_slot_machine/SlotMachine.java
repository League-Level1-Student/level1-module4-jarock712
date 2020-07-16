package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JLabel fruity;

public void run() throws MalformedURLException {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	frame.setSize(500, 500);
	spin.setText("SPIN");
	spin.addActionListener(this);
	String cherry = "cherry.jpg";
	String grape = "grape.jpg";
	String orange = "orange.jpg";
	fruity = createLabelImage(cherry);
	frame.add(panel);
	panel.add(spin);
	panel.add(fruity);
	frame.setVisible(true);
}

private JLabel createLabelImage(String fileName) throws MalformedURLException{
    java.net.URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon();
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}