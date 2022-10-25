package pack1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ytpractise6 {

	public static void main(String[] args) {
		// The FlowLayout places components in a row, sized at their preferred size.
		// If the Horizontal space in the container is too small, the FlowLayout class
		// uses the next available row

		JFrame jame = new JFrame();
		jame.setTitle("Flow Layout demonstration");
		jame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jame.setSize(700, 500);
		jame.setResizable(true);
		jame.getContentPane().setBackground(Color.WHITE);

		// By default frames use a borderlayout, so this time we HAVE to set it with a
		// flow layout
		jame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

		// jame.setLayout(new FlowLayout(FlowLayout.LEADING));
		// Components will be placed from the lefthandside, if resized from the right,
		// the shifted components start appearing from the lefthandside starting
		// jame.setLayout(new FlowLayout(FlowLayout.TRAILING));
		// Components will be placed from the righthandside, if resized from the left,
		// the shifted components start appearing from the righthandside starting

		// Lets add the buttons to a panel and the panel to the frame

		JPanel pnl = new JPanel();
		pnl.setBackground(Color.LIGHT_GRAY);
		pnl.setBorder(BorderFactory.createLineBorder(Color.BLACK, 6));
		pnl.setPreferredSize(new Dimension(120, 400));
		pnl.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		pnl.add(new JButton("A"));
		pnl.add(new JButton("B"));
		pnl.add(new JButton("C"));
		pnl.add(new JButton("D"));
		pnl.add(new JButton("E"));
		pnl.add(new JButton("F"));
		pnl.add(new JButton("G"));
		pnl.add(new JButton("H"));
		pnl.add(new JButton("I"));
		pnl.add(new JButton("J"));

		// In FlowLayout, if components run out of room within the first row, the
		// components
		// will pushed down to the next row - (can be seen while resizing the window).
		
		jame.add(pnl);
		jame.setVisible(true);

	}

}
