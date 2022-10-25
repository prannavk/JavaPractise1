package pack1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ytpractise5 {
	//A BorderLayout is used within a container to place components in 1 of the 5 major areas:
	//NORTH, SOUTH, WEST, EAST , CENTER
	//All the extra space is placed in the center area.
	//You can use the North Border for some sort of Title
	//You can use the WEST and EAST border for some sidebar or navigation bar
	//SOUTH for footer
	//CENTER for content
	public static void main(String[] args) {
		JFrame jame = new JFrame();
		jame.setTitle("BorderLayout Color Box");
		jame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jame.setSize(500,500);
//		jame.setResizable(true);
//		jame.setVisible(true);
//		jame.getContentPane().setBackground(Color.WHITE);
		//If we want to set up a container with a borderlayout, we type in:
		//jame.setLayout(new BorderLayout());
		
		//If you need to add margins between components, you can just pass them in when you create a new BorderLayout.
		jame.setLayout(new BorderLayout(10, 10));
		
		//Each Panel can act as a container with its own layout manager
		//and they use "Flow LayoutManager" by default
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p1.setBackground(Color.CYAN);
		p2.setBackground(Color.RED);
		p3.setBackground(Color.YELLOW);
		p4.setBackground(Color.MAGENTA);
		p5.setBackground(Color.GREEN);
		
		p1.setPreferredSize(new Dimension(100, 100));
		p2.setPreferredSize(new Dimension(100, 100));
		p3.setPreferredSize(new Dimension(100, 100));
		p4.setPreferredSize(new Dimension(100, 100));
		p5.setPreferredSize(new Dimension(100, 100));
		
		//Following will be the sub-Panels in the center panel
		JPanel p6 = new JPanel();
		JPanel p7 = new JPanel();
		JPanel p8 = new JPanel();
		JPanel p9 = new JPanel();
		JPanel p0 = new JPanel();
		
		p6.setBackground(Color.BLACK);
		p7.setBackground(Color.WHITE);
		p8.setBackground(Color.BLUE);
		p9.setBackground(Color.DARK_GRAY);
		p0.setBackground(Color.LIGHT_GRAY);
		
		p1.setLayout(new BorderLayout());
		p1.add(p6, BorderLayout.NORTH);
		p1.add(p7, BorderLayout.SOUTH);
		p1.add(p8, BorderLayout.EAST);
		p1.add(p9, BorderLayout.WEST);
		//p1.add(p0, BorderLayout.CENTER);
		
		p6.setPreferredSize(new Dimension(50, 50));
		p7.setPreferredSize(new Dimension(50, 50));
		p8.setPreferredSize(new Dimension(50, 50));
		p9.setPreferredSize(new Dimension(50, 50));
		p0.setPreferredSize(new Dimension(50, 50));
		
		//----------------------------------------------------
		
		jame.add(p2, BorderLayout.NORTH);
		jame.add(p3, BorderLayout.SOUTH);
		jame.add(p1, BorderLayout.CENTER);
		jame.add(p4, BorderLayout.EAST);
		jame.add(p5, BorderLayout.WEST);
		
		jame.setResizable(true);
		jame.setVisible(true);
		jame.getContentPane().setBackground(Color.WHITE);
		
		
		
		
	}
}
