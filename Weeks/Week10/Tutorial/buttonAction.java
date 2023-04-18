import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonAction implements ActionListener {
	
	private Color selectedColor;
	private JFrame selectedFrame;

	buttonAction(Color selectedColor, JFrame selectedFrame){
		this.selectedFrame = selectedFrame;
		this.selectedColor = selectedColor;
	}

	public void actionPerformed(ActionEvent e){
		selectedFrame.setBackground(selectedColor);	
	}
}; 
