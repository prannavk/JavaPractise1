package newwindowopenspackage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow1 {
	JFrame jframe = new JFrame();
	JLabel lbl = new JLabel(" HELLO! ");
	NewWindow1(){
		lbl.setBounds(100, 100, 200, 200);
		lbl.setHorizontalTextPosition(JLabel.CENTER);
		lbl.setVerticalTextPosition(JLabel.BOTTOM);
		ImageIcon ic = new ImageIcon("owl.png");
		lbl.setIcon(ic);
		lbl.setIconTextGap(4);
		lbl.setBackground(Color.BLACK);
		lbl.setOpaque(true);
		lbl.setForeground(Color.WHITE);
		lbl.setVerticalAlignment(JLabel.CENTER);
		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
		
		jframe.add(lbl);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.getContentPane().setBackground(Color.DARK_GRAY);
		jframe.setSize(400, 400);
		jframe.setResizable(false);
		jframe.setLayout(null);
		jframe.setVisible(true);
	}
}
