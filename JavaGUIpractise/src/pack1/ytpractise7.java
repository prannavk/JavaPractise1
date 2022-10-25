package pack1;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ytpractise7 {

	public static void main(String[] args) {
		/*
		 * Layout Manager = Defines the natural layout for the components within a
		 * container GridLayout = - Places components in a grid of cells.(in a number of
		 * rows and columns) - Each component takes all the available space within its
		 * cell, and each cell is the same size.
		 */

		JFrame jame = new JFrame();
		jame.setTitle("Flow Layout demonstration");
		jame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jame.setSize(700, 500);
		jame.setResizable(true);
		jame.getContentPane().setBackground(Color.WHITE);

		jame.setLayout(new GridLayout(3, 3, 10, 10));
		// Here 3, 3 are no. of rows and no. of columns and 10, 10, are the row gap
		// (Horizontal Margin) in
		// pixels and the (Vertical Margin) column gap in pixels

		/*
		 * Note: If we add 10 buttons in a 3,3 style GridLayout, it will
		 * output us 3 rows with 4 columns, with th3 3rd columns having
		 * only 2 buttons 9th and the 10th one (will create a new columns for us).
		 * It tries to make it as evenly balanced as possible.		
		*/

		// jame.setLayout(new GridLayout(9,1));
		// To stack the buttons vertically
		// jame.setLayout(new GridLayout());
		// Get arranged in a row with 1 column for each component that we have, by
		// default

		// Adding anonymous buttons to the frame
		jame.add(new JButton("J1"));
		jame.add(new JButton("J2"));
		jame.add(new JButton("J3"));
		jame.add(new JButton("J4"));
		jame.add(new JButton("J5"));
		jame.add(new JButton("J6"));
		jame.add(new JButton("J7"));
		jame.add(new JButton("J8"));
		jame.add(new JButton("J9"));

		// By default its BorderLayout, in which components like to take up up as much
		// room as possible.

		jame.setVisible(true);

	}

}
