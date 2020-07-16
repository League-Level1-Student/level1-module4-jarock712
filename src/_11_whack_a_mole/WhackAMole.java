package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame("Whack A Mole");
	JButton button = new JButton("GO!");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton mole1 = new JButton();
	JButton mole2 = new JButton();
	JButton mole3 = new JButton();
	JButton mole4 = new JButton();
	JButton mole5 = new JButton();
	JButton mole6 = new JButton();
	JButton mole7 = new JButton();
	JButton mole8 = new JButton();
	JButton mole9 = new JButton();
	JButton mole10 = new JButton();
	JButton mole11 = new JButton();
	JButton mole12 = new JButton();
	JButton mole13 = new JButton();
	JButton mole14 = new JButton();
	JButton mole15 = new JButton();
	
public void run() {
	button.addActionListener(this);
	mole1.addActionListener(this);
	mole2.addActionListener(this);
	mole3.addActionListener(this);
	mole4.addActionListener(this);
	mole5.addActionListener(this);
	mole6.addActionListener(this);
	mole7.addActionListener(this);
	mole8.addActionListener(this);
	mole9.addActionListener(this);
	mole10.addActionListener(this);
	mole11.addActionListener(this);
	mole12.addActionListener(this);
	mole13.addActionListener(this);
	mole14.addActionListener(this);
	mole15.addActionListener(this);
	panel.add(mole1);
	panel.add(mole2);
	panel.add(mole3);
	panel.add(mole4);
	panel.add(mole5);
	panel.add(mole6);
	panel.add(mole7);
	panel.add(mole8);
	panel.add(mole9);
	panel.add(mole10);
	panel.add(mole11);
	panel.add(mole12);
	panel.add(mole13);
	panel.add(mole14);
	panel.add(mole15);
	label.setText("MOLE");
	panel.add(button);
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(150, 300);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
