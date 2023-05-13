/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class inLabAssignment3 extends JFrame implements ActionListener{
    
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;
    
    private JButton ba,bb,bc,bd,be,bf,bg,blet,bspace,bdot,bclr,benter;
    private JTextField bar;
    private JTextArea area;
    private JPanel middle, bottom;
    
    
    public inLabAssignment3(){
        super("Keyboard");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new BorderLayout(5,20));
        
	middle = new JPanel();
	middle.setLayout(new GridLayout(2,4));
	
	bottom = new JPanel();
	bottom.setLayout(new FlowLayout());

	add(middle, BorderLayout.CENTER);
	add(bottom, BorderLayout.SOUTH);
	
	bar = new JTextField(20);
	add(bar, BorderLayout.NORTH);

	ba = new JButton("A");
	ba.addActionListener(this);

	bb = new JButton("B");
	bb.addActionListener(this);

	bc = new JButton("C");
	bc.addActionListener(this);

	bd = new JButton("D");
	bd.addActionListener(this);

	be = new JButton("E");
	be.addActionListener(this);

	bf = new JButton("F");
	bf.addActionListener(this);

	bg = new JButton("G");
	bg.addActionListener(this);

	blet = new JButton("Numer of letters");
	blet.addActionListener(this);

	middle.add(ba);
	middle.add(bb);
	middle.add(bc);
	middle.add(bd);
	middle.add(be);
	middle.add(bf);
	middle.add(bg);
	middle.add(blet);
       
       	bspace = new JButton("Space");
	bspace.addActionListener(this);

       	bdot = new JButton(".");
	bdot.addActionListener(this);

	bclr = new JButton("Clear");
	bclr.addActionListener(this);
	
	benter = new JButton("Enter");
	benter.addActionListener(this);
	
	area = new JTextArea(15,30);

	bottom.add(bspace);
	bottom.add(bdot);
	bottom.add(bclr);
	bottom.add(benter);
	bottom.add(area);

    	bottom.setVisible(true);
       	middle.setVisible(true); 
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
	if (s.equals("Enter")){
		if (!bar.getText().equals("")){
			area.setText(String.format("%s%s",area.getText(),bar.getText()));
			bar.setText("");
		}
	}else if (s.equals("Clear"))
			bar.setText(""); 
	else if (s.equals("Space"))
			bar.setText(String.format("%s ",bar.getText())); 
	else if (s.equals("Numer of letters"))
			area.setText(String.format("%s\nNumber of letters in sentence in the sentence: %d\n",area.getText(), bar.getText().length()));
	else
			bar.setText(String.format("%s%s",bar.getText(),s)); 
        
    }
    
    public static void main(String[] args){
        new inLabAssignment3();
    }
}
