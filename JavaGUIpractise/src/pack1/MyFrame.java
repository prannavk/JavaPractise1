package pack1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1160202625421331505L;
	
	MyFrame(){
		this.setTitle("HELLOW WORLD!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//exit out of the application -> JFrame.EXIT_ON_CLOSE
		//do nothing, still be visible when we hit the window x button -> JFrame.DO_NOTHING_ON_CLOSE
		this.setSize(500,500); //sets the x and y dimension sizes of the window
		this.setResizable(true);//We can no longer resize the window even if we tried
		this.setVisible(true); //makes the this visible

		//Setting the icon of the window
		ImageIcon imageicon = new ImageIcon("bioniceyelogo.png"); //create an imageicon object
		this.setIconImage(imageicon.getImage()); //will change the icon of the this

		//changing the background color
		this.getContentPane().setBackground(new Color(0xcc53ed));
		//to specify color in hexadecimal, pass : new Color(0xcc53ed) 255, 219, 77)
		
	}

}
