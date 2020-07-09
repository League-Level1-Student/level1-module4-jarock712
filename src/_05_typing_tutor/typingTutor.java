package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		typingTutor tt = new typingTutor();
		tt.typingGame();
	}
	public void typingGame() {
		label.setText(String.valueOf(letter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(label.CENTER);
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setTitle("Type or Die");
		frame.setVisible(true);
		frame.pack();
	}
	char letter = generateRandomLetter();
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("You typed " + arg0.getKeyChar());
		if (arg0.getKeyChar() == letter) {
			System.out.println("Correct!");
			panel.setBackground(Color.green);
		}else {
			panel.setBackground(Color.red);
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		letter = generateRandomLetter();
		label.setText(String.valueOf(letter));
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
