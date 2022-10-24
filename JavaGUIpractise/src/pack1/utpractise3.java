package pack1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class utpractise3 {

	public static void main(String[] args) {
		
		JLabel label = new JLabel();
		label.setText("Hello");
		label.setIcon(new ImageIcon("hoolilogo.png"));
		//label.setHorizontalAlignment(JLabel.RIGHT);
		//label.setVerticalAlignment(JLabel.BOTTOM);
		label.setBounds(6, 80, 100, 100); //will place the coordinates relative to the container that its in (JFrame, JPanel, etc)
		//There is no need of lines 16 and 17 when we are using no layout - useful in case of BorderLayout
		
		JPanel grayPanel = new JPanel();
		grayPanel.setBackground(Color.GRAY);
		grayPanel.setBounds(10, 10, 250, 250);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(260, 10, 250, 250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(10, 260, 1200, 250);
		
		MyFrame f = new MyFrame();
		f.setLayout(null);
		f.setSize(750, 750);
		f.add(grayPanel);
		grayPanel.add(label);
		f.add(redPanel);
		f.add(greenPanel);
		//greenPanel.add(label); //Won't be visible in the grayPanel and will be now added to the greenPanel 
		
	}

}
