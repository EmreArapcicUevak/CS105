import javax.swing.*;
import java.util.*;
import java.awt.*;

public class JSwing {
	public static final int WIDTH = 500, HEIGHT = 300;

	private JButton button;
	private JFrame frame;

	public void colorButton(){
		button = new JButton("Click to change color to white");
		button.setBackground(Color.PINK);
		button.addActionListener(new buttonAction(Color.RED, frame));
		frame.add(button);
	}

	JSwing(){
		frame = new JFrame("New Window");
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		colorButton();
	}

};
