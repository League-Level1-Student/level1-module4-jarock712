package _11_whack_a_mole;

import javafx.application.Application;
import javafx.stage.Stage;

public class runner extends Application {
public static void main(String[] args) {
	Application.launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	WhackAMole mole = new WhackAMole();
	mole.run();
}
}
