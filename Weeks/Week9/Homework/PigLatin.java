import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class PigLatin implements ActionListener {
	public final static int WIDTH = 500, HEIGHT = 600; 
	private JFrame mainFrame;
	private JPanel mainPanel;
	private JTextArea inputTextArea, outputTextArea;
	private JButton clearButton, translateButton;
	private Scanner inputScanner;

	public PigLatin(){
		mainFrame = new JFrame("Human to PigLatin translator");
		mainFrame.setSize(WIDTH, HEIGHT);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

		mainFrame.add(mainPanel);

		inputTextArea = new JTextArea(15,40); // 15 rows 40 collumns
		inputTextArea.setLineWrap(true);
		mainPanel.add(inputTextArea);
	
		translateButton = new JButton();
		translateButton.setText("Translate");
		translateButton.setActionCommand("translate");
		translateButton.setFocusable(false);
		translateButton.addActionListener(this);
		mainPanel.add(translateButton);

		clearButton = new JButton();
		clearButton.setText("Clear");
		clearButton.setActionCommand("clear");
		clearButton.setFocusable(false);
		clearButton.addActionListener(this);
		mainPanel.add(clearButton);

		outputTextArea = new JTextArea(15,40); // 15 rows 40 collumns
		outputTextArea.setLineWrap(true);
		outputTextArea.setEditable(false);
		mainPanel.add(outputTextArea);

		mainPanel.setVisible(true);
		mainFrame.setVisible(true);
	}

	private boolean isVowel(char c){return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'w';}

	private void translate(){
		String inputText = this.inputTextArea.getText(), resultText = "";	
		Scanner in = new Scanner(inputText);

		while (in.hasNext()){
			String temp = in.next();
			
			if (isVowel(temp.toLowerCase().charAt(0)))
				resultText = String.format("%s %s", resultText, String.format("%sway", temp));
			else
				resultText = String.format("%s %s", resultText, String.format("%s%cay", temp.substring(1),temp.charAt(0)));
		}

		outputTextArea.setText(resultText);

	}

	private void clear(){
		inputTextArea.setText("");
		outputTextArea.setText("");
	}

	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("translate"))
			translate();
		else
			clear();
	}

	public static void main(String[] args){
		PigLatin e = new PigLatin();
	}
};
