import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class toDo implements ActionListener{
	public final static int WIDTH = 500, HEIGHT = 600;
	private JFrame mainFrame;
	private JPanel toDoListPanel, utilityPanel;
	private JTextArea toDoList;
	private JTextField toDoItem;
	private JButton addButton, clearButton, deleteButton;

	public toDo(){
		mainFrame = new JFrame("To do list");
		mainFrame.setSize(WIDTH, HEIGHT);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		toDoListPanel = new JPanel(new FlowLayout());
		utilityPanel = new JPanel(new FlowLayout());

		toDoList = new JTextArea(15,40);
		toDoList.setLineWrap(true);
		toDoList.setEditable(false);

		mainFrame.add(toDoListPanel, BorderLayout.NORTH);
		mainFrame.add(utilityPanel, BorderLayout.SOUTH);

		toDoListPanel.add(new JLabel("To Do List:"));
		toDoListPanel.add(toDoList);

		toDoItem = new JTextField(40);
		addButton = new JButton("Add");
		clearButton = new JButton("Clear");
		deleteButton = new JButton("Delete to do list");

		clearButton.addActionListener(this);
		addButton.addActionListener(this);
		deleteButton.addActionListener(this);

		utilityPanel.add(new JLabel("Enter to do item!"));
		utilityPanel.add(toDoItem);
		utilityPanel.add(addButton);
		utilityPanel.add(clearButton);
		utilityPanel.add(deleteButton);

		mainFrame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		String text = e.getActionCommand(), toDoListText = toDoList.getText(), toDoText = toDoItem.getText();

		if (text.equals("Add") && !toDoText.equals("")){
			if (toDoListText.equals(""))
				toDoList.setText(String.format("%s",toDoItem.getText()));
			else
				toDoList.setText(String.format("%s\n%s",toDoList.getText(),toDoItem.getText()));
			toDoItem.setText("");
		}else if(text.equals("Clear")){
			toDoItem.setText("");
		} else {
			toDoList.setText("");
		}
	}
	public static void main(String[] args){
		toDo e = new toDo();
	}
};
