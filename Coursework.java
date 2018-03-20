import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Coursework implements ActionListener
{
	JFrame a = new JFrame();
	JPanel panel = new JPanel();
	JButton[] buttons = new JButton[12];
	private int Xvalue = 0, FinalXValue = 11;
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
	public void actionPerformed(ActionEvent e)
	{
		ImageIcon empty = new ImageIcon("bart0.jpg"); //stores an empty image
		Icon puzzle = new ImageIcon();

	
		if(e.getSource() == buttons[0]){
			Xvalue = 0;
			if (Validation() == true){          // Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 0;
			}
		}
		if(e.getSource() == buttons[1]){
			Xvalue = 1;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 1;
			}
		}
		if(e.getSource() == buttons[2]){
			Xvalue = 2;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 2;
			}
		}
		if(e.getSource() == buttons[3]){
			Xvalue = 3;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 3;
			}
		}
		if(e.getSource() == buttons[4]){
			Xvalue = 4;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 4;
			}
		}
		if(e.getSource() == buttons[5]){
			Xvalue = 5;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 5;
			}
		}
		if(e.getSource() == buttons[6]){
			Xvalue = 6;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 6;
			}
		}
		if(e.getSource() == buttons[7]){
			Xvalue = 7;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 7;
			}
		}
		if(e.getSource() == buttons[8]){
			Xvalue = 8;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 8;
			}
		}
		if(e.getSource() == buttons[9]){
			Xvalue = 9;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 9;
			}
		}
		if(e.getSource() == buttons[10]){
			Xvalue = 10;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 10;
			}
		}
		if(e.getSource() == buttons[11]){
			Xvalue = 11;
			if (Validation() == true){	// Validation makes sure that the button is adjacent to the blank tile
				puzzle = buttons[Xvalue].getIcon(); // Saves imaged of button clicked on
				buttons[Xvalue].setIcon(empty); //Swaps empty image to image clicked on
				buttons[FinalXValue].setIcon(puzzle); //Sets image that was empty to one selected	
				FinalXValue = 11;
			}
		}
	

		

	}
		public boolean Validation()
	{
		if(Xvalue ==0)						// x=blank space. So if the statements of 1 and 4 are true then swap blank tile with images
		{
			if(FinalXValue ==1|| FinalXValue ==4)
				return true;	
		}
	
		else if(Xvalue ==1)
		{
			if(FinalXValue ==0|| FinalXValue ==2|| FinalXValue ==5)
				return true;
		}
		else if (Xvalue ==2)
		{
			if(FinalXValue ==1|| FinalXValue ==3|| FinalXValue ==6)
				return true;

		}
		else if (Xvalue ==3)
		{
			if(FinalXValue ==2|| FinalXValue ==7|| FinalXValue ==6)
				return true;
		}
		else if (Xvalue ==4)
		{
			if(FinalXValue ==0|| FinalXValue ==5|| FinalXValue ==8)
				return true;
		}
		else if (Xvalue ==5)
		{
			if(FinalXValue ==1|| FinalXValue ==4|| FinalXValue ==6|| FinalXValue ==9)
				return true;
		}		
		else if (Xvalue ==6)
		{
			if(FinalXValue ==2|| FinalXValue ==5|| FinalXValue ==7|| FinalXValue ==10)
				return true;
		}		
		else if (Xvalue ==7)
		{
			if(FinalXValue ==3|| FinalXValue ==6|| FinalXValue ==11)
				return true;
		}		
		else if (Xvalue ==8)		
		{	
			if(FinalXValue ==4|| FinalXValue ==9)
				return true;
		}		
		else if (Xvalue ==9)
		{
			if(FinalXValue ==8|| FinalXValue ==5|| FinalXValue ==10)
				return true;
		}		
		else if (Xvalue ==10)
		{
			if(FinalXValue ==9|| FinalXValue ==6|| FinalXValue ==11)
				return true;
		}		
		else if (Xvalue ==11)
		{
			if(FinalXValue ==6|| FinalXValue ==7|| FinalXValue ==10)
				return true;
	
		}
		
		return false;
		
	}	
}


		
