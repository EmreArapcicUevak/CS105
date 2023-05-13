import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Counter extends JFrame implements ActionListener {
	public static final int WIDTH = 500, HEIGHT = 300;
	private JPanel mainPanel;
	private JTextField counterOut;
	private JButton countButton, clearButton;

	private int count = 0;

	Counter(){
		setTitle("counter");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(mainPanel,BorderLayout.NORTH);
		mainPanel.add(new JLabel("Counter Status"));
		
		counterOut = new JTextField("0", 20);
		counterOut.setEditable(false);
		mainPanel.add(counterOut);

		countButton = new JButton("Count");
		clearButton = new JButton("Clear");

		countButton.addActionListener(this);
		clearButton.addActionListener(this);

		mainPanel.add(countButton);
		mainPanel.add(clearButton);

		setVisible(true);
		mainPanel.setVisible(true);
	}

	private void updateCount(){
		counterOut.setText(Integer.toString(count));
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("Clear"))
			count = 0;
		else
			count += 1;
		updateCount();
	}

	public static void main(String[] args){
		Counter e = new Counter();
	}
}
