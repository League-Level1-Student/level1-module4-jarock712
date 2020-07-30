package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	JButton button = new JButton();
	Random ran1 = new Random();
	int r1;
	Random ran2 = new Random();
	int r2;
	Random ran3 = new Random();
	int r3;

public void run() throws MalformedURLException {
	frame.add(panel);
	frame.setVisible(true);
	panel.add(button);
	button.addActionListener(this);
	button.setText("Spin!");
	frame.pack();
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
	panel.remove(label1);
	r1 = ran1.nextInt(3);
	System.out.println(ran1);
	panel.remove(label2);
	r2 = ran2.nextInt(3);
	System.out.println(ran2);
	panel.remove(label3);
	r3 = ran3.nextInt(3);
	System.out.println(ran3);
	
	if (r1 == 0) {
		try {
			label1 = createLabelImage("cherry.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label1);
	}else if(r1 == 1){
		try {
			label1 = createLabelImage("grape.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label1);
	}else if(r1 == 2) {
		try {
			label1 = createLabelImage("orange.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label1);
	}
	if (r2 == 0) {
		try {
			label2 = createLabelImage("cherry.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label2);
	}else if(r2 == 1){
		try {
			label2 = createLabelImage("grape.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label2);
	}else if(r2 == 2) {
		try {
			label2 = createLabelImage("orange.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label2);
	}
	if (r3 == 0) {
		try {
			label3 = createLabelImage("cherry.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label3);
	}else if(r3 == 1){
		try {
			label3 = createLabelImage("grape.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label3);
	}else if(r3 == 2) {
		try {
			label3 = createLabelImage("orange.jpg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
		panel.add(label3);
	}
	frame.add(panel);
	frame.pack();
	if(r1 == r2 && r2 == r3) {
		JOptionPane.showMessageDialog(null, "You win!");
	}
}
}