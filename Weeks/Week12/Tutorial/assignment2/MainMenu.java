import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class MainMenu extends JFrame {
	private JMenuBar menuBar;
	private JMenu fileMenu, editMenu;
	private JMenuItem exitItem, cutItem, copyItem, pasteItem, selectAllItem;

	private JTextArea textInput;

	MainMenu(){
		super("Document");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu  = new JMenu("Edit");

		exitItem = new JMenuItem("Exit");cutItem = new JMenuItem("Cut");copyItem = new JMenuItem("Copy");
		pasteItem = new JMenuItem("Paste");selectAllItem = new JMenuItem("Select All");
		
		menuBar.add(fileMenu);
		fileMenu.add(editMenu);
		fileMenu.add(exitItem);

		editMenu.add(cutItem);
		editMenu.add(copyItem);
		editMenu.add(pasteItem);
		editMenu.add(selectAllItem);

		setJMenuBar(menuBar);

		textInput = new JTextArea(30,30);
		add(textInput,BorderLayout.CENTER);

		menuBar.setVisible(true);
		setVisible(true);
	}

	public static void main(String[] args){
		new MainMenu();
	}
} 
