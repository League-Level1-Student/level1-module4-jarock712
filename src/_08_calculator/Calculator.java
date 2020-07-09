package _08_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JTextField text = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JLabel label = new JLabel();
	public void runner() {
		panel.add(label);
		add.setText("add");
		add.addMouseListener(this);
		panel.add(add);
		subtract.setText("subtract");
		subtract.addMouseListener(this);
		panel.add(subtract);
		multiply.setText("multiply");
		multiply.addMouseListener(this);
		panel.add(multiply);
		divide.setText("divide");
		divide.addMouseListener(this);
		panel.add(divide);
		panel.add(text);
		panel.add(text2);
		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Calculator");
		frame.pack();
}
	double add(double num, double num2) {
		num+=num2;
		return num;
	}
	double subtract(double num, double num2) {
		num-=num2;
		return num;
	}
	double multiply(double num, double num2) {
		num*=num2;
		return num;
	}
	double divide(double num, double num2) {
		num/=num2;
		return num;
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
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		double result = 0.0;
		double number1 = Double.parseDouble(text.getText());
		double number2 = Double.parseDouble(text2.getText());
		if (arg0.getSource() == add) {
			result = add(number1, number2);
		}else if(arg0.getSource() == subtract){
			result = subtract(number1, number2);
		}else if(arg0.getSource() == multiply){
			result = multiply(number1, number2);
		}else {
			result = divide(number1, number2);
		}
		label.setText(String.valueOf(result));
		frame.pack();
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
