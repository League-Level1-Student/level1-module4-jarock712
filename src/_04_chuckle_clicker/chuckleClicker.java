package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();
public static void main(String[] args) {
	chuckleClicker laugh = new chuckleClicker();
	laugh.makeButtons();
}
public void makeButtons(){
	punchline.setText("punchline");
	joke.setText("joke");
	punchline.addActionListener(this);
	joke.addActionListener(this);
	panel.add(joke);
	panel.add(punchline);
	frame.add(panel);
	frame.setVisible(true);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == joke) {
		JOptionPane.showMessageDialog(null, "Why can't you trust atoms?");
	}else {
		JOptionPane.showMessageDialog(null, "They make up everything!");
	}
}
}
