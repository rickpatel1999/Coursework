import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class coursework implements ActionListener
{
	JFrame a = new JFrame();
	JPanel panel = new JPanel();
	JButton[] buttons = new JButton[12];
	public coursework()
	{
	
		
		a.setTitle("Swingin' Simpson");
		a.setSize(444,363);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

		//Creating Grid
		GridLayout grid = new GridLayout(3,4);
		panel .setLayout(grid);
		a.add(panel);
		
		//Loading the Images
		ImageIcon imageOne = new ImageIcon("bart1.jpg");
		ImageIcon imageTwo = new ImageIcon("bart2.jpg");
		ImageIcon imageThree = new ImageIcon("bart3.jpg");
		ImageIcon imageFour = new ImageIcon("bart4.jpg");
		ImageIcon imageFive = new ImageIcon("bart5.jpg");
		ImageIcon imageSix = new ImageIcon("bart6.jpg");
		ImageIcon imageSeven = new ImageIcon("bart7.jpg");
		ImageIcon imageEight = new ImageIcon("bart8.jpg");
		ImageIcon imageNine = new ImageIcon("bart9.jpg");
		ImageIcon imageTen = new ImageIcon("bart10.jpg");
		ImageIcon imageEleven = new ImageIcon("bart11.jpg");
		ImageIcon imageTwelve = new ImageIcon("bart0.jpg");
		
	
	
		buttons[0] = new JButton(imageOne);
		buttons[1] = new JButton(imageTwo);
		buttons[2] = new JButton(imageThree);
		buttons[3] = new JButton(imageFour);
		buttons[4] = new JButton(imageFive);
		buttons[5] = new JButton(imageSix);
		buttons[6] = new JButton(imageSeven);
		buttons[7] = new JButton(imageEight);
		buttons[8] = new JButton(imageNine);
		buttons[9] = new JButton(imageTen);
		buttons[10] = new JButton(imageEleven);
		buttons[11] = new JButton(imageTwelve);

		int i;
		
		for (i=0; i< 12; i++){
			panel.add(buttons[i]);
		}
		for(i=0; i<12; i++){
			buttons[i].addActionListener(this);
		}
		a.setVisible(true);
	
	}
