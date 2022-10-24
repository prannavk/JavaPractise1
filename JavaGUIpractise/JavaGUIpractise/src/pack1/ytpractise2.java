package pack1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class ytpractise2 {

	public static void main(String[] args) {
		JLabel label = new JLabel(); //create a label
		label.setText("Hey Man!"); //set text of label
		//Can also do it as: JLabel label = new JLabel("Hello World!");
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
		//Border bord = BorderFactory.createBevelBorder(6);
		
		ImageIcon imageicon = new ImageIcon("basedniqqa.jpg"); //create an imageicon object
		label.setIcon(imageicon);
		label.setHorizontalTextPosition(JLabel.CENTER);
		//This will set the text Left, Centered or on the right of the image
		label.setVerticalTextPosition(JLabel.BOTTOM);
		// This will set the text the text Top or Bottom of the Image
		
		//To change the font and font color of the text
		label.setForeground(new Color(0xcb56ed));
		label.setFont(new Font("Consolas", Font.BOLD
				,50));
		//we can adjust how far away our text is from our image
		label.setIconTextGap(50);
		label.setBackground(Color.BLUE);
		//But to display the background we need 2 setOpaque to true
		label.setOpaque(true);
		//To set the border object we created
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		//set Vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);
		//set Horizontal position of icon+text within label
		//This will now set the image and text to the center of our Label
		//even if we were to resize our frame
		
		//label.setBounds(100, 100, 200, 200);
		//once set, don't change, even if we resize the window
		//it will stay in the same place and with the same size when we resize
		//will set x and y position within frame as well as dimensions
		
		
		
		
		JFrame mframe = new JFrame();
		mframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mframe.setSize(400, 400);
		mframe.setVisible(true);
		mframe.add(label);
		/*
		 * For learning purpose, we set our layout manager (default is border layout) to
		 * null and set the things inside manually.
		 */
		//mframe.setLayout(null);
		
		mframe.pack();
		//This will resize the size of the frame to accommodate all the components that you have
		//The size of the frame will adjust to fit all of the components that you have.
		//You can use setResizable(false) if you don't want people to resize the JFrame
		//If you're using the pack method, make sure you add all your components before using it, or else it would not work
		
		
		
		
	}

}
