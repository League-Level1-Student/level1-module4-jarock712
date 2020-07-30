package _11_whack_a_mole;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.media.jfxmedia.AudioClip;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class WhackAMole implements ActionListener {
	Date date = new Date();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton[] button = new JButton[50];
	JLabel label = new JLabel();
	Random ran = new Random();
	
	int score = 0;
	int miss = 0;
	int num = ran.nextInt(button.length);
public void run() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setTitle("Whack A Mole");
	frame.add(panel);
	for (int i = 0; i < button.length; i++) {
		button[i] = new JButton();
		button[i].setPreferredSize(new Dimension(100, 25));
		button[i].addActionListener(this);
	}
	button[num].setText("Mole");
	for (int i = 0; i < button.length; i++) {
		panel.add(button[i]);
	}
	frame.setSize(500,500);
	label.setText("Score: " + score );
	JOptionPane.showMessageDialog(null, "Hit all the moles you can!");
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	Object buttonClicked = arg0.getSource();
	if (buttonClicked == button[num]) {
		sound();
		score++;
		label.setText("Score: " + score);
	} else if (buttonClicked != button[num]){
		score--;
		miss++;
		JOptionPane.showMessageDialog(null, "You missed! 3 of those you lose!");
		label.setText("Score: " + score);
	}
	if (score == 10) {
		speak("You win!");
		endGame(date, miss);
		frame.dispose();
	}
	if(miss == 3) {
		speak("You lose!");
		frame.dispose();
	}
	button[num].setText(null);
	ran = new Random();
	num = ran.nextInt(button.length);
	button[num].setText("Mole");
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
public void sound() {
	String bip = "ding-sound-effect_2.mp3";
	Media hit = new Media(new File(bip).toURI().toString());
	MediaPlayer mediaPlayer = new MediaPlayer(hit);
	mediaPlayer.play();
}
}