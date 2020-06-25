package _01_nasty_surprise;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements MouseListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	JLabel labelOne = new JLabel();
	JLabel labelTwo = new JLabel();
public void setup() {
	labelOne.setText("Trick");
	trick.addMouseListener(this);
	trick.add(labelOne);
	panel.add(trick);
	labelTwo.setText("Treat");
	treat.addMouseListener(this);
	treat.add(labelTwo);
	panel.add(treat);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == treat) {
		showPictureFromTheInternet("https://www.google.com/search?q=cute+dog+jpeg&rlz=1C1CHBF_enUS906US906&sxsrf=ALeKk03w6p9_oi8RAPjeIqOoXsopV_5nAQ:1593124447109&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjwv4KGg57qAhXTi54KHfaKBw4Q_AUoAXoECBIQAw&biw=929&bih=851#imgrc=z6vGpq_xpKMDXM");
	}else {
		showPictureFromTheInternet("https://www.google.com/search?q=scary+image+jpeg&rlz=1C1CHBF_enUS906US906&sxsrf=ALeKk03dn17Lync1R529pbwvhCbz0MCHug:1593124627197&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjOoPLbg57qAhWTvJ4KHVdWA3wQ_AUoAXoECAsQAw&biw=929&bih=851#imgrc=qN4_EjZwmOU4WM");
	}
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
